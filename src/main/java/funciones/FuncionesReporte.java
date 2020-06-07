package funciones;

import dto.ReporteMensual;
import java.util.List;
import tablas.Prestamo;
import utils.FechaUtils;

public class FuncionesReporte {

    public static ReporteMensual generarDatosReporteMensual(Integer mes, Integer año) {

        List<Prestamo> prestamos = FuncionesPrestamo.listarPrestamosMensuales(mes, año);
        Integer cantidadPrestamos = prestamos.size();
        Long cantidadDevoluciones = prestamos.stream().filter(p -> p.isVigente()).count();
        return ReporteMensual.builder()
                .periodoConsultado(FechaUtils.obtenerNombreMes(mes) + " " + año)
                .cantidadPrestamos(cantidadPrestamos)
                .cantidadDevoluciones(cantidadDevoluciones.intValue())
                .cantidadFichas(FuncionesFichaInscripcion.buscarFichasPorMes(mes, año).size())
                .componentesProgramaticos(FuncionesComponentesProgramaticos.ComponentesProgramaticosPorMes(mes, año))
                .build();
    }
}
