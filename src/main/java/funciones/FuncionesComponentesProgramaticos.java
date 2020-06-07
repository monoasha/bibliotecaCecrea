package funciones;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;
import tablas.ComponenteProgramatico;

public class FuncionesComponentesProgramaticos {

    public static List<ComponenteProgramatico> ComponentesProgramaticosPorMes(Integer mes, Integer año) {
        Calendar cal = new Calendar.Builder()
                .set(Calendar.MONTH, mes)
                .build();
        String nombreMes = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        return Funciones.consultarComponentesProgramaticos()
                .stream()
                .filter(c -> c.getMes().equalsIgnoreCase(nombreMes) && Objects.equals(c.getAnio(), año))
                .collect(Collectors.toList());
    }
}
