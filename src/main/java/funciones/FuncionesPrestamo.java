package funciones;

import dto.IntervaloMensual;
import java.util.List;
import java.util.stream.Collectors;
import tablas.Prestamo;
import utils.FechaUtils;

public class FuncionesPrestamo {

    public static List<Prestamo> listarPrestamosMensuales(Integer mes, Integer año) {
        IntervaloMensual intervalo = FechaUtils.obtenerIntervaloMensual(mes, año);
        List<Prestamo> prestamos = Funciones.listarPrestamos();
        return prestamos.stream().filter(f -> f.getFechaSolicitud().after(intervalo.getPrimerDiaMes()) && f.getFechaSolicitud().before(intervalo.getUltimoDiaMes())).collect(Collectors.toList());
    }

}
