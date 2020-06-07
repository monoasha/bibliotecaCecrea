package utils;

import dto.IntervaloMensual;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FechaUtils {

    public static IntervaloMensual obtenerIntervaloMensual(Integer mes, Integer año) {
        Calendar intervalo = Calendar.getInstance();
        intervalo.set(Calendar.MONTH, mes);
        intervalo.set(Calendar.YEAR, año);
        intervalo.set(Calendar.DAY_OF_MONTH, 1);// This is necessary to get proper results
        intervalo.set(Calendar.DATE, intervalo.getActualMaximum(Calendar.DATE));
        intervalo.getTime();
        Date max = intervalo.getTime();
        intervalo.set(Calendar.DAY_OF_MONTH, 1);
        Date min = intervalo.getTime();
        return IntervaloMensual.builder()
                .primerDiaMes(min)
                .ultimoDiaMes(max)
                .build();
    }

    public static String obtenerNombreMes(Integer mes) {
        Calendar cal = new Calendar.Builder()
                .set(Calendar.MONTH, mes)
                .build();
        return cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
    }
    
    public static Integer obtenerMes() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MONTH);
    }
    
    public static Integer obtenerAño() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.YEAR);
    }
}
