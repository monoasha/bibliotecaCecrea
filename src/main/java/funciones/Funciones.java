package funciones;

import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;
import dto.FormularioRequest;
import dto.ResumenFicha;
import tablas.Cargo;
import tablas.Curso;
import tablas.Discapacidad;
import tablas.Establecimiento;
import tablas.Genero;
import tablas.Nacionalidad;
import tablas.Parentezco;
import tablas.PuebloOriginario;
import com.mysql.jdbc.StringUtils;
import dto.ResumenPrestamo;
import dto.UserLogin;
import interfaz.User;
import interfaz.Admin;
import interfaz.Mensaje;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tablas.FichaInscripcion;
import tablas.ComponenteProgramatico;
import tablas.Solicitante;
import tablas.Libro;

public class Funciones {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String usuario = "root";
    private static final String contra = "";
    private static final String url = "jdbc:mysql://localhost/biblioteca?useSSL=false";

    public static void conectarBD() {
        try {
            System.out.println("Conectando con la base de datos");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, contra);
            if (conn == null) {
                throw new Exception("Error");
            }
            System.out.println("Conexion a la base exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos, error " + e);
            e.printStackTrace();
            new Mensaje("Error al conectar con la base de datos").setVisible(true);
        }
    }

    public static boolean validarLogin(String nombre, String password) {

        obtenerCantidadFichas();

        if (StringUtils.isNullOrEmpty(nombre) || StringUtils.isNullOrEmpty(password)) {
            JOptionPane.showMessageDialog(null, "Porfavor ingrese los datos solicitados");
        } else {

            try {

                Statement stmt = conn.createStatement();
                ResultSet rs;
                String sql = "SELECT u.idusuario, u.nombre, u.rutusuario, u.contacto, c.nombrecargo "
                        + "FROM usuario u "
                        + "JOIN cargo c ON c.idcargo = u.cargo_idcargo "
                        + "WHERE u.nombre='" + nombre + "' AND u.contraseña=md5('" + password + "')";
                rs = stmt.executeQuery(sql);
                if (rs.next()) {
                    UserLogin userLogin = new UserLogin(
                            rs.getLong("idusuario"),
                            rs.getString("nombre"),
                            rs.getString("contacto"),
                            rs.getString("rutusuario"),
                            rs.getString("nombrecargo")
                    );
                    if (userLogin.getCargo().equals(CARGO_USER)) {
                        new User(userLogin).setVisible(true);
                        return true;
                    } else if (userLogin.getCargo().equals(CARGO_ADMIN)) {
                        new Admin(userLogin).setVisible(true);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no posee rol necesario para hacer login");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encuentra el usuario o la contraseña es incorrecta");
                }
            } catch (SQLException e) {
                System.out.println("Error inesperado en la consulta de usuario, error: " + e);
            }
        }
        return false;

    }

    public static void agregarLibro(String nombre, String autor, String categoria) {
        try {
            String sql = "INSERT into libro VALUES(null,'" + nombre + "','" + autor + "',CURRENT_DATE,'" + categoria + "')";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado el libro");
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
        }
    }

    public static void agregarSolicitante(String nombre, String apellidoPAT, String apellidomat, String rut, Date date, String direccion, String telefono, String apoderado) {
        try {
            rut = limpiarRut(rut);
            String sql = "INSERT into solicitante VALUES(null,'" + nombre + "','" + apellidoPAT + "','" + apellidomat + "','" + rut + "','" + date + "','" + direccion + "','" + apoderado + "','" + telefono + "')";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado al solicitante");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se ha agregado el solicitante");
            System.out.println("Error en la conexión" + e);
        }
    }

    public static void insertarPrestamo(Libro l, Solicitante s, Date fechaDevolucion, String observaciones) {
        try {
            String sql = "INSERT INTO biblioteca.prestamo (idlibros, idSolicitantes, fechasolicitud, fechadevolucion, observaciones) VALUES(" + l.getId() + ", " + s.getId() + ", current_date(), '" + fechaDevolucion + "', '" + observaciones + "');";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha ingresado el Préstamo");
            restarDisponibilidad(l);

        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
            JOptionPane.showMessageDialog(null, "No Se ha ingresado el préstamo");
        }
    }

    public static void restarDisponibilidad(Libro l) {
        try {
            String sql = "update libro l set l.disponibilidad = (l.disponibilidad - 1) where l.idlibros = " + l.getId();
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error inesperado al actualizar la disponibilidad del libro: " + l.getNombre() + ", Error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al actualizar disponibilidad del libro");

        }
    }

    public static void sumarDisponibilidad(Libro l) {
        try {
            String sql = "update libro l set l.disponibilidad = (l.disponibilidad + 1) where l.idlibros = " + l.getId();
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();

        } catch (Exception e) {
            System.out.println("Error inesperado al actualizar la disponibilidad del libro: " + l.getNombre() + ", Error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al actualizar disponibilidad del libro");

        }
    }

    public static ArrayList<Libro> buscarLibro(String nombrelibro) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "SELECT l.idlibros, l.nombre, l.autor,l.fechaingreso ,l.categoria ,l.disponibilidad FROM libro l WHERE l.nombre  LIKE '%" + nombrelibro + "%'";

            rs = stmt.executeQuery(sql);

            ArrayList<Libro> libros = new ArrayList<>();
            Libro lib = null;
            while (rs.next()) {
                lib = new Libro();
                lib.setId(rs.getLong("idlibros"));
                lib.setNombre(rs.getString("nombre"));
                lib.setAutor(rs.getString("autor"));
                lib.setFechadeingreso(rs.getString("fechaingreso"));
                lib.setCategoria(rs.getString("categoria"));
                lib.setDisponibilidad(rs.getInt("Disponibilidad"));
                libros.add(lib);
            }
            return libros;
        } catch (SQLException e) {
            System.out.println("Error en la busqueda de libros " + e);
        }
        return null;
    }

    public static ArrayList<Libro> buscarLibroDisponibles(String nombrelibro) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "select * from biblioteca.libro l where l.disponibilidad > 0";

            rs = stmt.executeQuery(sql);

            ArrayList<Libro> libros = new ArrayList<>();
            Libro lib = null;
            while (rs.next()) {
                lib = new Libro();
                lib.setId(rs.getLong("idlibros"));
                lib.setNombre(rs.getString("nombre"));
                lib.setAutor(rs.getString("autor"));
                lib.setFechadeingreso(rs.getString("fechaingreso"));
                lib.setCategoria(rs.getString("categoria"));
                lib.setDisponibilidad(rs.getInt("Disponibilidad"));
                libros.add(lib);
            }
            return libros;
        } catch (SQLException e) {
            System.out.println("Error en la busqueda de libros " + e);
        }
        return null;
    }

    public static void registrarUsuarios(String name, String rut, String contacto, String contraseña) {
        try {
            rut = limpiarRut(rut);
            String sql = "INSERT into usuario VALUES(null,'" + name + "','" + rut + "','" + contacto + "','" + (contraseña) + ")";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            new Mensaje("Datos Ingresados correctamente ").setVisible(true);
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
        }
    }

    public static ArrayList<Nacionalidad> llenarComboNacionalidad() {
        ArrayList<Nacionalidad> lista = new ArrayList<Nacionalidad>();
        String q = "SELECT * FROM nacionalidad";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                lista.add(
                        new Nacionalidad(resultado.getLong("idNacionalidad"), resultado.getString("Nombrenacionalidad"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de nacionalidades, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de nacionalidades").setVisible(true);
        }
        return lista;
    }

    public static ArrayList<Curso> llenarComboCurso() {
        ArrayList<Curso> enlista = new ArrayList<Curso>();
        String q = "SELECT * FROM curso";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlista.add(
                        new Curso(resultado.getLong("idcurso"), resultado.getString("cursonombre"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de cursos, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de cursos").setVisible(true);
        }
        return enlista;
    }

    public static ArrayList<PuebloOriginario> llenarComboPueblosOriginarios() {
        ArrayList<PuebloOriginario> enlista = new ArrayList<PuebloOriginario>();
        String q = "SELECT * FROM pueblosoriginarios";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlista.add(new PuebloOriginario(resultado.getLong("idPueblosOriginarios"), resultado.getString("PueblosOriginariosnombre"))
                );
            }
        } catch (Exception e) {
            System.out.println("Error rellenar datos de pueblos Originarios, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de Pueblos Originarios").setVisible(true);
        }
        return enlista;
    }

    public static ArrayList<Discapacidad> llenarComboDiscapacidad() {
        ArrayList<Discapacidad> enlistadoo = new ArrayList<Discapacidad>();
        String q = "SELECT * FROM tipodediscapacidad";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlistadoo.add(
                        new Discapacidad(resultado.getLong("idtipodediscapacidad"), resultado.getString("tipodediscapacidadnombre"))
                );
            }
        } catch (Exception e) {
            System.out.println("Error rellenar datos de tipo de discapacidad, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de tipo de discapacidad").setVisible(true);
        }
        return enlistadoo;
    }

    public static ArrayList<Establecimiento> llenarComboEstablecimiento() {
        ArrayList<Establecimiento> enlistad = new ArrayList<Establecimiento>();
        String q = "SELECT * FROM tipodeestablecimiento";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlistad.add(
                        new Establecimiento(resultado.getLong("idTipodeestablecimiento"), resultado.getString("TipodeEstablecimientonombre"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de tipo de establecimiento, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de tipo de establecimiento").setVisible(true);
        }
        return enlistad;
    }

    public static ArrayList<Parentezco> llenarComboParentezco() {
        ArrayList<Parentezco> enlistad = new ArrayList<Parentezco>();
        String q = "SELECT * FROM parentezco";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlistad.add(
                        new Parentezco(resultado.getLong("idParentezco"), resultado.getString("Parentezconombre"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de tipo de parentezco, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de tipo de parentezco").setVisible(true);
        }
        return enlistad;
    }

    public static ArrayList<Genero> llenarComboGenero() {
        ArrayList<Genero> enlistad = new ArrayList<>();
        String q = "SELECT * FROM género";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlistad.add(
                        new Genero(resultado.getLong("idGénero"), resultado.getString("Géneronom"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de tipo de genero, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de tipo de genero").setVisible(true);
        }
        return enlistad;
    }

    public static ArrayList<Cargo> llenarComboCargo() {
        ArrayList<Cargo> enlista = new ArrayList<Cargo>();
        String q = "SELECT * FROM cargo";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlista.add(
                        new Cargo(resultado.getLong("idcargo"), resultado.getString("nombrecargo"))
                );
            }

        } catch (Exception e) {
            System.out.println("Error rellenar datos de cargo, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de cargo").setVisible(true);
        }
        return enlista;
    }

    public static String validarFormularioParticipante(FormularioRequest formulario) {

        String mensajesError = "";
        if (StringUtils.isNullOrEmpty(formulario.getNombreparticipante())) {
            mensajesError += "<html> El apellido paterno no puede estar vacio <br> <br> <html>";
        }
        if (!validarRut(formulario.getRutParticipante())) {
            mensajesError += "<html>El rut del participante es invalido <br> <br> <html> ";
        }

        if (StringUtils.isNullOrEmpty(formulario.getApellidoPaternoParticipante())) {
            mensajesError += "<html>El apellido paterno no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getApellidoMaternoParticipante())) {
            mensajesError += "<html>El apellido materno no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getApellidoMaternoResponsable())) {
            mensajesError += "<html>El apellido materno del responsable no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getApellidoPaternoResponsable())) {
            mensajesError += "<html>El apellido paterno del responsable no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getDomicilioResponsable())) {
            mensajesError += "<html>La direccion del responsable  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getDomicilioParticipante())) {
            mensajesError += "<html>El domicilio  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getEmailResponsable())) {
            mensajesError += "<html>El e-mail del responsable no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoResponsable())) {
            mensajesError += "<html>El teléfono del responsable no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoParticipante())) {
            mensajesError += "<html>El telefono del ´participante no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoRetiro1())) {
            mensajesError += "<html>El teléfono  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoRetiro2())) {
            mensajesError += "<html>El telefono  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getNombreResponsable())) {
            mensajesError += "<html>El nombre del responsable no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getNombreRetiro1())) {
            mensajesError += "<html>El nombre de quien retira no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getNombreRetiro2())) {
            mensajesError += "<html>El nombre de quien retira no puede estar vacio <br> <br> <html> ";
        }
        return mensajesError;

    }

    public static boolean validarRut(String rut) {

        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

    public static void insertarFormulario(FormularioRequest request) {
        try {
            String sql = "INSERT INTO fichainscripcion VALUES "
                    + "(null," //idFichainscripcion
                    + "'" + request.getNombreparticipante() + "'," //nombreparticipante
                    + "'" + request.getApellidoPaternoParticipante()+ "',"//apellidopatpar
                    + "'" + request.getApellidoMaternoParticipante()+ "',"//apellidomaternopar
                    + "'" + request.getRutParticipante()+ "',"//runparticipante
                    + request.getNacionalidadParticipante()+ ","//Nacionalidad_idNacionalidad
                    + request.getCursoParticipante()+ ","//curso_idcurso
                    + request.getParentezcoResponsable()+ ","//Parentezco_idParentezco
                    + request.getPueblosoriginarios() + ","//PueblosOriginarios_idPueblosOriginarios //PROBLEMA
                    + request.getGeneroParticipante() + ","//Género_idGénero
                    + request.getTipoestablecimiento() + ","//Tipodeestablecimiento_idTipodeestablecimiento
                    + request.getTipoDiscapacidadParticipante()+ ","//tipodediscapacidad_idtipodediscapacidad
                    + "'" + request.getFonoParticipante()+ "',"//fonoparticipante
                    + "'" + request.getDomicilioParticipante()+ "',"//domicilioparticipante
                    + "'" + request.getNombreResponsable()+ "',"//nombreadultoresponsable
                    + "'" + request.getApellidoPaternoResponsable()+ "',"//apellidopaternoadultoresp
                    + "'" + request.getApellidoMaternoResponsable()+ "',"//apellidomaternoadultoresp
                    + "'" + request.getDomicilioResponsable()+ "',"//direccionadultiresp
                    + "'" + request.getFonoResponsable()+ "',"//fonoadultoresp
                    + "'" + request.getEmailResponsable()+ "',"//emailadultoresp
                    + "'" + request.getNombreRetiro1()+ "',"//nombrerespretirar1
                    + "'" + request.getNombreRetiro2() + "',"//nombrerespretirar2
                    + "'" + request.getRutRetiro1()+ "',"//runrespretirar1
                    + "'" + request.getRutRetiro2() + "',"//runrespretirar2
                    + "'" + request.getFonoRetiro1()+ "',"//fonorespretirar1
                    + "'" + request.getFonoRetiro2() + "',"//fonorespretirar2
                    + request.getTipoDiscapacidadParticipante()+ ","//discapacidad
                    + request.getPueblosoriginarios()+ ","//pueblo originario
                    + request.getAcuerdoUsoImagen()+ "," // acuerdo_uso_imagen
                    + "'" + new Date(request.getFechaNacimientoParticipante().getTime()) + "')"; // Fecha nacimiento

            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado el participante");
        } catch (SQLException e) {
            System.out.println("Error inesperado al insertar el participante, error: " + e);
            JOptionPane.showMessageDialog(null, "Error al crear el participante");
        }
    }

    public static void eliminarficha(String nombre) {
        try {
            String sql = "DELETE FROM fichainscripcion"
                    + "WHERE runparticipante LIKE '%" + nombre + "%'";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
            JOptionPane.showMessageDialog(null, "Se ha eliminado la ficha");
        }
    }

    public static List<ResumenFicha> buscarficha(String rut) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "SELECT fichainscripcion.idFichainscripcion,fichainscripcion.nombreparticipante,fichainscripcion.apellidopatpar,fichainscripcion.apellidomaternopar,fichainscripcion.runparticipante\n"
                    + "FROM fichainscripcion\n"
                    + "WHERE fichainscripcion.runparticipante   LIKE '%" + rut + "%'";

            rs = stmt.executeQuery(sql);

            List<ResumenFicha> fichas = new ArrayList<>();
            while (rs.next()) {
                fichas.add(new ResumenFicha(
                        rs.getLong("idFichainscripcion"),
                        rs.getString("nombreparticipante"),
                        rs.getString("apellidopatpar"),
                        rs.getString("apellidomaternopar"),
                        rs.getString("runparticipante")
                ));
            }
            return fichas;
        } catch (SQLException e) {
            System.out.println("Error inesperado en la busqueda de fichas, error " + e);
        }
        return null;
    }

    public static void registrardevolucion(ResumenPrestamo prestamo) {
        try {
            String sql = "UPDATE biblioteca.prestamo "
                    + "set vigente=0 "
                    + "WHERE idprestamo=" + prestamo.getIdPrestamo();
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha realizado la devolución");
            sumarDisponibilidad(Libro.builder().id(prestamo.getIdLibro()).build());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al registrar la devolución");
            System.out.println("Error inesperado en la devolucion, Error " + e);
        }
    }

    public static List<Solicitante> buscarSolicitantes() {
        try {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "select * from solicitante s";
            ResultSet rs = stmt.executeQuery(sql);
            List<Solicitante> solicitantes = new ArrayList<>();
            while (rs.next()) {
                solicitantes.add(
                        Solicitante.builder()
                                //Si se necesitan otros datos se agregan a aca en el builder
                                .id((rs.getLong("idSolicitantes")))
                                .nombres(rs.getString("nombres"))
                                .Apellidopaterno(rs.getString("apellido paterno"))
                                .Apellidomaterno(rs.getString("apellido materno"))
                                .direccion(rs.getString("direccion"))
                                .telefono(rs.getString("telefono"))
                                .rut(rs.getString("rut"))
                                .build());
            }
            return solicitantes;
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar los solicitantes, error " + e);
        }
        return null;
    }

    public static Solicitante consultarSolicitantePorRut(String rut) {
        try {
            rut = limpiarRut(rut);
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "select * from solicitante s where s.rut like '%" + rut + "%'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                return Solicitante.builder()
                        //Si se necesitan otros datos se agregan a aca en el builder
                        .id((rs.getLong("idSolicitantes")))
                        .nombres(rs.getString("nombres"))
                        .Apellidopaterno(rs.getString("apellido paterno"))
                        .Apellidomaterno(rs.getString("apellido materno"))
                        .direccion(rs.getString("direccion"))
                        .telefono(rs.getString("telefono"))
                        .rut(rs.getString("rut"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar los solicitantes, error " + e);
        }
        JOptionPane.showMessageDialog(null, "Error al buscar solicitante");
        return null;
    }

    public static List<ResumenPrestamo> buscarPrestamosVigentes(Solicitante s) {
        try {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "select p.idSolicitantes, p.idlibros, p.idprestamo, p.fechasolicitud, p.fechadevolucion, l.nombre "
                    + "from biblioteca.prestamo p "
                    + "join biblioteca.solicitante s on s.idSolicitantes = p.idSolicitantes "
                    + "join biblioteca.libro l on l.idlibros = p.idlibros "
                    + "where p.idSolicitantes = " + s.getId() + " and p.vigente = 1";
            ResultSet rs = stmt.executeQuery(sql);
            List<ResumenPrestamo> resumenPrestamos = new ArrayList<>();
            while (rs.next()) {
                resumenPrestamos.add(
                        ResumenPrestamo.builder()
                                .idPrestamo(rs.getLong("idprestamo"))
                                .idSolicitante(rs.getLong("idSolicitantes"))
                                .idLibro(rs.getLong("idlibros"))
                                .fechaSolicitud(rs.getDate("fechasolicitud"))
                                .fechaDevolucion(rs.getDate("fechadevolucion"))
                                .nombreLibro(rs.getString("nombre"))
                                .build());
            }
            return resumenPrestamos;
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar los prestamos, error " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar prestamos");

        }
        return null;
    }

    private static String limpiarRut(String rut) {
        return rut.replace(".", "").replace("-", "").toLowerCase();
    }

    public static FichaInscripcion buscarFichaPorId(Long id) {
        try {
            Statement stmt;
            stmt = conn.createStatement();
            String sql = "SELECT * FROM biblioteca.fichainscripcion fi where fi.idFichainscripcion = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                return FichaInscripcion.builder()
                        .id(id)
                        .nombreparticipante(rs.getString("nombreparticipante"))
                        .apelldpaternopart(rs.getString("apellidopatpar"))
                        .apelldmaternopart(rs.getString("apellidomaternopar"))
                        .run(rs.getString("runparticipante"))
                        .domicilio(rs.getString("domicilioparticipante"))
                        .fonoparticipante(rs.getString("fonoparticipante"))
                        .nombreadresp(rs.getString("nombreadultoresponsable"))
                        .apellpatadresp(rs.getString("apellidopaternoadultoresp"))
                        .apellmatadresp(rs.getString("apellidomaternoadultoresp"))
                        .diradresp(rs.getString("direccionadultiresp"))
                        .fonoadresp(rs.getString("fonoadultoresp"))
                        .emailadresp(rs.getString("emailadultoresp"))
                        .nombretiro1(rs.getString("nombrerespretirar1"))
                        .nombretiro2(rs.getString("nombrerespretirar2"))
                        .runretiro1(rs.getString("runrespretirar1"))
                        .runretiro2(rs.getString("runrespretirar2"))
                        .fonoretiro1(rs.getString("fonorespretirar1"))
                        .fonoretiro2(rs.getString("fonorespretirar2"))
                        .generootro(null)
                        .fechanacparticipante(rs.getDate("fecha_nacimiento"))
                        .genero(rs.getLong("Género_idGénero"))
                        .nacionalidad1(rs.getLong("Nacionalidad_idNacionalidad"))
                        .acuerdoUsoImagen(rs.getBoolean("acuerdo_uso_imagen"))
                        .pueblosoriginarios(rs.getLong("PueblosOriginarios_idPueblosOriginarios"))
                        .tipoestablecimiento(rs.getLong("Tipodeestablecimiento_idTipodeestablecimiento"))
                        .curso(rs.getLong("curso_idcurso"))
                        .tipodediscapacidad(rs.getLong("tipodediscapacidad_idtipodediscapacidad"))
                        .parentezco(rs.getLong("Parentezco_idParentezco"))
                        .esdiscapacitado(rs.getBoolean("esdiscapacitado"))
                        .esdepueblooriginario(rs.getBoolean("espuebloindigena"))
                        .build();
            }
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar ficha de inscripcion " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar ficha de inscripcion");
        }
        return null;
    }

    public static void actualizarParticipante(Long id, FormularioRequest request) {
        try {
            String sql = "UPDATE biblioteca.fichainscripcion"
                    + " SET nombreparticipante='" + request.getNombreparticipante() + "',"
                    + " apellidopatpar='" + request.getApellidoPaternoParticipante()+ "',"
                    + " apellidomaternopar='" + request.getApellidoMaternoParticipante()+ "',"
                    + " runparticipante='" + request.getRutParticipante() + "',"
                    + " Nacionalidad_idNacionalidad=" + request.getNacionalidadParticipante()+ ","
                    + " curso_idcurso=" + request.getCursoParticipante() + ","
                    + " Parentezco_idParentezco=" + request.getParentezcoResponsable() + ","
                    + " PueblosOriginarios_idPueblosOriginarios=" + request.getPueblosoriginarios() + ","
                    + " Género_idGénero=" + request.getGeneroParticipante() + ","
                    + " Tipodeestablecimiento_idTipodeestablecimiento=" + request.getTipoestablecimiento() + ","
                    + " tipodediscapacidad_idtipodediscapacidad=" + request.getTipoDiscapacidadParticipante()+ ","
                    + " fonoparticipante='" + request.getFonoParticipante()+ "',"
                    + " domicilioparticipante='" + request.getDomicilioParticipante()+ "',"
                    + " nombreadultoresponsable='" + request.getNombreResponsable()+ "',"
                    + " apellidopaternoadultoresp='" + request.getApellidoPaternoResponsable()+ "',"
                    + " apellidomaternoadultoresp='" + request.getApellidoMaternoResponsable()+ "',"
                    + " direccionadultiresp='" + request.getDomicilioResponsable()+ "',"
                    + " fonoadultoresp='" + request.getFonoResponsable()+ "',"
                    + " emailadultoresp='" + request.getEmailResponsable()+ "',"
                    + " nombrerespretirar1='" + request.getNombreRetiro1() + "',"
                    + " nombrerespretirar2='" + request.getNombreRetiro2()+ "',"
                    + " runrespretirar1='" + request.getRutRetiro1() + "',"
                    + " runrespretirar2='" + request.getRutRetiro2()+ "',"
                    + " fonorespretirar1='" + request.getFonoRetiro1() + "',"
                    + " fonorespretirar2='" + request.getFonoRetiro2()+ "',"
                    + " esdiscapacitado=" + request.getEsDiscapacitado()+ ","
                    + " espuebloindigena=" + request.getEsDePuebloOriginario()+ ","
                    + " acuerdo_uso_imagen=" + request.getAcuerdoUsoImagen()+ ","
                    + " fecha_nacimiento='" + new Date(request.getFechaNacimientoParticipante().getTime()) + "'"
                    + " WHERE idFichainscripcion=" + id + ";";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha actualizado el participante");
        } catch (SQLException e) {
            System.out.println("Error al actualizar participante, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al actualizar el participante");
        }
    }

    public static void eliminarparticipante(Long id) {
        try {
            String sql = "DELETE from biblioteca.fichainscripcion"
                    + " WHERE idFichainscripcion=" + id + ";";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el participante");
        } catch (SQLException e) {
            System.out.println("Error al eliminar participante, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al eliminar el participante");
        }
    }

    public static void agregarlaboexp(String nombre, String facilitador, String tipo, String mes) {
        try {
            String sql = "INSERT into Componenteprogramaticos VALUES(null,'" + nombre + "','" + facilitador + "','" + tipo + "','" + mes + "',YEAR(CURDATE()))";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado " + tipo);
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
        }
    }

    public static ArrayList<ComponenteProgramatico> buscarLab(String nombrelab) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "select * from biblioteca.componenteprogramaticos c where c.nombrecomponente  LIKE '%" + nombrelab + "%' ";

            rs = stmt.executeQuery(sql);

            ArrayList<ComponenteProgramatico> laboratorios = new ArrayList<>();
            ComponenteProgramatico labexp = null;
            while (rs.next()) {
                labexp = new ComponenteProgramatico();
                labexp.setId(rs.getLong("idComponenteprogramaticos"));
                labexp.setNombre(rs.getString("nombrecomponente"));
                labexp.setNombrefacilitador(rs.getString("nombrefacilitador"));
                labexp.setTipo(rs.getString("tipo"));
                labexp.setMes(rs.getString("mes"));

                laboratorios.add(labexp);
            }
            return laboratorios;
        } catch (SQLException e) {
            System.out.println("Error en la busqueda de libros " + e);
        }
        return null;
    }

    public static void eliminarlabexp(Long id) {
        try {
            String sql = "DELETE from biblioteca.componenteprogramaticos"
                    + " WHERE idComponenteprogramaticos=" + id + ";";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el laboratorio");
        } catch (SQLException e) {
            System.out.println("Error al eliminar laboratorio, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al eliminar el laboratorio");
        }
    }

    public static Long obtenerCantidadFichas() {
        try {
            String sql = "SELECT COUNT(1) from biblioteca.fichainscripcion";
            PreparedStatement pps = conn.prepareStatement(sql);
            ResultSet rs = pps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la cantidad de fichas, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al consultar cantidad de fichas");
        }
        return null;
    }

    public static Long obtenerCantidadPrestamo() {
        try {
            String sql = "SELECT COUNT(1) from biblioteca.prestamo";
            PreparedStatement pps = conn.prepareStatement(sql);
            ResultSet rs = pps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la cantidad de préstamos, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al consultar cantidad de préstamos");
        }
        return null;
    }

    public static Long obtenerCantidadDevolucionPrestamo() {
        try {
            String sql = "SELECT COUNT(1) from biblioteca.devolucion";
            PreparedStatement pps = conn.prepareStatement(sql);
            ResultSet rs = pps.executeQuery();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar la cantidad de préstamos, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al consultar cantidad de préstamos");
        }
        return null;
    }

    public static List<ComponenteProgramatico> consultarComponentesProgramaticos() {
        try {
            String sql = "SELECT * from biblioteca.componenteprogramaticos";
            PreparedStatement pps = conn.prepareStatement(sql);
            ResultSet rs = pps.executeQuery();
            List<ComponenteProgramatico> componentesProgramaticos = new ArrayList();
            while (rs.next()) {
                componentesProgramaticos.add(ComponenteProgramatico.builder()
                        .id(rs.getLong("idComponenteprogramaticos"))
                        .nombre(rs.getString("nombrecomponente"))
                        .nombrefacilitador(rs.getString("nombrefacilitador"))
                        .tipo(rs.getString("tipo"))
                        .mes(rs.getString("mes"))
                        .anio(rs.getInt("anio"))
                        .build());
            }
            return componentesProgramaticos;
        } catch (SQLException e) {
            System.out.println("Error al consultar la cantidad de laboratorios y experiencias, error: " + e);
            JOptionPane.showMessageDialog(null, "Error inesperado al consultar cantidad de laboratorios y experiencias");
        }
        return null;
    }
    public static List<ResumenFicha> buscarfichaanuales(String año) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "SELECT fichainscripcion.idFichainscripcion,fichainscripcion.nombreparticipante,fichainscripcion.apellidopatpar,fichainscripcion.apellidomaternopar,fichainscripcion.runparticipante\n"
                    + "FROM fichainscripcion\n"
                    + "WHERE fichainscripcion.runparticipante   LIKE '%" + año + "%'";

            rs = stmt.executeQuery(sql);

            List<ResumenFicha> fichas = new ArrayList<>();
            while (rs.next()) {
                fichas.add(new ResumenFicha(
                        rs.getLong("idFichainscripcion"),
                        rs.getString("nombreparticipante"),
                        rs.getString("apellidopatpar"),
                        rs.getString("apellidomaternopar"),
                        rs.getString("runparticipante")
                ));
            }
            return fichas;
        } catch (SQLException e) {
            System.out.println("Error inesperado en la busqueda de fichas, error " + e);
        }
        return null;
    }
}
