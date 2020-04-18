package funciones;

import dto.FormularioRequest;
import dto.ResumenFicha;
import tablas.Cargo;
import tablas.Curso;
import tablas.Discapacidad;
import tablas.Establecimiento;
import tablas.Genero;
import tablas.Libro;
import tablas.Nacionalidad;
import tablas.Parentezco;
import tablas.PueblosOriginarios;
import com.mysql.jdbc.StringUtils;
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

    public static void validarLogin(String nombre, String password) throws SQLException {

        if (StringUtils.isNullOrEmpty(nombre) || StringUtils.isNullOrEmpty(password)) {
            System.out.println("Ingrese los datos solicitados");
            new Mensaje("Porfavor ingrese los datos solicitados").setVisible(true);
        } else {

            try {

                Statement stmt = conn.createStatement();
                ResultSet rs;
                String sql = "SELECT u.nombre, u.telefono, u.contraseña, c.nombre "
                        + "FROM usuario u "
                        + "JOIN cargo c ON c.id_cargo = u.id_cargo "
                        + "WHERE u.nombre='" + nombre + "' AND u.contraseña=md5('" + password + "')";
                rs = stmt.executeQuery(sql);
                while (rs.next()) {
                    String contacto = rs.getString("contacto");
                    String cargo = rs.getString("c.nombre");
                    String usr = rs.getString("u.nombre");
                    System.out.println(rs.getRow());
                    if (cargo.equals("usuario")) {
                        new User().setVisible(true);
                        System.out.println(cargo);
                    } else if (cargo.equals("admin")) {
                        new Admin().setVisible(true);
                    } else {

                        System.out.println(rs.getRow());
                    }
                }
                PreparedStatement pps = conn.prepareStatement(sql);
                pps.executeUpdate();
            } catch (SQLException e) {
                System.out.println("La conexión no se pudo establecer debido a " + e);
            }
        }
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
            String sql = "INSERT into solicitante VALUES(null,'" + nombre + "','" + apellidoPAT + "','" + apellidomat + "','" + rut + "','" + date + "','" + direccion + "','" + telefono + "','" + apoderado + "')";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Se ha agregado al solicitante");
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "No se ha agregado el solicitante");
            System.out.println("Error en la conexión" + e);
        }
    }

    public static void insertarPrestamo(String nombre, String autor, Date fechadevolucion, String obs, String opcion) {
        try {
            String sql = "INSERT into prestamo VALUES(null,'" + "',CURRENT_DATE,'" + fechadevolucion + "','" + obs + "','" + nombre + "','" + opcion + "')";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha ingresado el Préstamo");;
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
            JOptionPane.showMessageDialog(null, "No Se ha ingresado el préstamo");
        }
    }

public static ArrayList<Libro> buscarLibro(String nombrelibro) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "SELECT l.nombre, l.autor,l.fechaingreso ,l.categoria ,l.disponibilidad FROM libro l WHERE l.nombre  LIKE '%" + nombrelibro + "%'";

            rs = stmt.executeQuery(sql);

            ArrayList<Libro> libros = new ArrayList<>();
            Libro lib = null;
            while (rs.next()) {
                lib = new Libro();
                lib.setNombre(rs.getString("nombre"));
                lib.setautor(rs.getString("autor"));
                lib.setfechadeingreso(rs.getString("fechaingreso"));
                lib.setCategoria(rs.getString("categoria"));
                lib.setdisponibilidad(rs.getBoolean("Disponibilidad"));
                libros.add(lib);
                lib = null;
            }
            return libros;
        } catch (SQLException e) {
            System.out.println("Error en la busqueda de libros " + e);
        }
        return null;
    }

    public static ArrayList<String> llenarComboDevoluciones(String rut) {
        ArrayList<String> lista = new ArrayList<String>();

        String q = "SELECT * FROM devolucion";

        try {
            PreparedStatement stmt = conn.prepareStatement(q);

            ResultSet resultado = stmt.executeQuery(q);
            while (resultado.next()) {
                lista.add(resultado.getString(""));
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar data de devoluciones, error " + e);
            e.printStackTrace();
            new Mensaje("Error al consultar informacion de devoluciones").setVisible(true);
        }
        return lista;
    }

    public static void registrarUsuarios(String name, String rut, String contacto, String contraseña) {
        try {
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

    public static ArrayList<PueblosOriginarios> llenarComboPueblosOriginarios() {
        ArrayList<PueblosOriginarios> enlista = new ArrayList<PueblosOriginarios>();
        String q = "SELECT * FROM pueblosoriginarios";
        try {

            PreparedStatement stmt = conn.prepareStatement(q);
            ResultSet resultado = stmt.executeQuery();

            while (resultado.next()) {
                enlista.add(
                        new PueblosOriginarios(resultado.getLong("idPueblosOriginarios"), resultado.getString("PueblosOriginariosnombre"))
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
        if (!validarRut(formulario.getRun())) {
            mensajesError += "<html>El rut del participante es invalido <br> <br> <html> ";
        }

        if (StringUtils.isNullOrEmpty(formulario.getApelldpaternopart())) {
            mensajesError += "<html>El apellido paterno no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getApelldmaternopart())) {
            mensajesError += "<html>El apellido materno no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getApellmatadresp())) {
            mensajesError += "<html>El apellido materno del responsable no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getApellpatadresp())) {
            mensajesError += "<html>El apellido paterno del responsable no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getDiradresp())) {
            mensajesError += "<html>La direccion del responsable  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getDomicilio())) {
            mensajesError += "<html>El domicilio  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getEmailadresp())) {
            mensajesError += "<html>El e-mail del responsable no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoadresp())) {
            mensajesError += "<html>El teléfono del responsable no puede estar vacio <br> <br> <html>";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoparticipante())) {
            mensajesError += "<html>El telefono del ´participante no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoretiro1())) {
            mensajesError += "<html>El teléfono  no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getFonoretiro2())) {
            mensajesError += "<html>El telefono  no puede estar vacio <br> <br> <html> ";
        }   
        if (StringUtils.isNullOrEmpty(formulario.getNombreadresp())) {
            mensajesError += "<html>El nombre del responsable no puede estar vacio <br> <br> <html> ";

        }
        if (StringUtils.isNullOrEmpty(formulario.getNombretiro1())) {
            mensajesError += "<html>El nombre de quien retira no puede estar vacio <br> <br> <html> ";
        }
        if (StringUtils.isNullOrEmpty(formulario.getNombretiro2())) {
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
                    + "'" + request.getApelldpaternopart() + "',"//apellidopatpar
                    + "'" + request.getApelldmaternopart() + "',"//apellidomaternopar
                    + "'" + request.getRun() + "',"//runparticipante
                    + "'" + request.getNacionalidad1() + "',"//Nacionalidad_idNacionalidad
                    + "'" + request.getCurso() + "',"//curso_idcurso
                    + "'" + request.getParentezco() + "',"//Parentezco_idParentezco
                    + "'" + request.getPueblosoriginarios() + "',"//PueblosOriginarios_idPueblosOriginarios //PROBLEMA
                    + "'" + request.getGenero() + "',"//Género_idGénero
                    + "'" + request.getTipoestablecimiento() + "',"//Tipodeestablecimiento_idTipodeestablecimiento
                    + "'" + request.getTipodediscapacidad() + "',"//tipodediscapacidad_idtipodediscapacidad
                    + "'" + request.getFonoparticipante() + "',"//fonoparticipante
                    + "'" + request.getDomicilio() + "',"//domicilioparticipante
                    + "'" + request.getNombreadresp() + "',"//nombreadultoresponsable
                    + "'" + request.getApellpatadresp() + "',"//apellidopaternoadultoresp
                    + "'" + request.getApellmatadresp() + "',"//apellidomaternoadultoresp
                    + "'" + request.getDiradresp() + "',"//direccionadultiresp
                    + "'" + request.getFonoadresp() + "',"//fonoadultoresp
                    + "'" + request.getEmailadresp() + "',"//emailadultoresp
                    + "'" + request.getNombretiro1() + "',"//nombrerespretirar1
                    + "'" + request.getNombretiro2() + "',"//nombrerespretirar2
                    + "'" + request.getRunretiro1() + "',"//runrespretirar1
                    + "'" + request.getRunretiro2() + "',"//runrespretirar2
                    + "'" + request.getFonoretiro1() + "',"//fonorespretirar1
                    + "'" + request.getFonoretiro2() + "',"//fonorespretirar2
                    + "'" + request.getEsdepueblooriginario() + "',"//discapacidad //problema
                    + "'" + request.getNacionalidad2() + "'," //problema
                    + "'" + request.getFechanacparticipante() + "',"//
                    + "'" + request.getTipodediscapacidad() + "')";

            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha agregado la ficha");
        } catch (SQLException e) {
            System.out.println("Error en la conexión" + e);
            JOptionPane.showMessageDialog(null, "No se ha agregado la ficha");
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
        }
    }

    public static List<ResumenFicha> buscarficha(String nombre) {

        try {
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            String sql = "SELECT fichainscripcion.idFichainscripcion,fichainscripcion.nombreparticipante,fichainscripcion.apellidopatpar,fichainscripcion.apellidomaternopar,fichainscripcion.runparticipante\n"
                    + "FROM fichainscripcion\n"
                    + "WHERE fichainscripcion.nombreparticipante   LIKE '%" + nombre + "%'";

            rs = stmt.executeQuery(sql);

            List<ResumenFicha> fichas = new ArrayList<>();
            while (rs.next()) {
                fichas.add(new ResumenFicha(
                        rs.getLong("idFichainscripcion"),
                        rs.getString("nombreparticipante"),
                        rs.getString("apellidomaternopar"),
                        rs.getString("apellidomaternopar"),
                        rs.getString("runparticipante")
                ));
            }
            return fichas;
        } catch (SQLException e) {
            System.out.println("La conexión no se pudo establecer debido a " + e);
        }
        return null;
    }

    public static void registrardevolucion(String rut, String opcion) {
        try {
            String sql = "INSERT into devolucion VALUES(null,'" + rut + "',CURRENT_DATE,'" + opcion + "')";
            PreparedStatement pps = conn.prepareStatement(sql);
            pps.executeUpdate();
            new Mensaje("Datos Ingresados correctamente ").setVisible(true);
        } catch (SQLException e) {
            new Mensaje("los datos no se pudieron ingresar").setVisible(true);
            System.out.println("Error en la conexión" + e);
        }
    }
}
