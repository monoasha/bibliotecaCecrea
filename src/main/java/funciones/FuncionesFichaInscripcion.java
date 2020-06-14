package funciones;

import dto.IntervaloMensual;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import tablas.FichaInscripcion;
import utils.FechaUtils;

public class FuncionesFichaInscripcion {

    public static FichaInscripcion buscarFichaPorId(Long id) {
        try {
            List<FichaInscripcion> listaFichas = Funciones.listarFichasInscripcion();
            return listaFichas.stream().filter(f -> Objects.equals(f.getId(), id)).findFirst().get();
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar por Id ficha de inscripcion " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar ficha de inscripcion");
        }
        return null;
    }

        public static Optional<FichaInscripcion> buscarFichaPorRut(String rut) {
        try {
            List<FichaInscripcion> listaFichas = Funciones.listarFichasInscripcion();
            return listaFichas.stream().filter(f -> f.getRun().equalsIgnoreCase(Funciones.limpiarRut(rut))).findFirst();
        } catch (Exception e) {
            System.out.println("Error inesperado al listar ficha de inscripcion " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar ficha de inscripcion");
        }
        return null;
    }

    
    public static List<FichaInscripcion> buscarFichasPorMes(Integer mes, Integer año) {
        try {
            IntervaloMensual intervalo = FechaUtils.obtenerIntervaloMensual(mes, año);
            List<FichaInscripcion> listaFichas = Funciones.listarFichasInscripcion();
            return listaFichas.stream().filter(f -> f.getFechaInscripcion().after(intervalo.getPrimerDiaMes()) && f.getFechaInscripcion().before(intervalo.getUltimoDiaMes())).collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error inesperado al listar ficha de inscripcion " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar ficha de inscripcion");
        }
        return null;
    }

}
