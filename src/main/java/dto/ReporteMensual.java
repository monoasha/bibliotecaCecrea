package dto;

import java.sql.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import tablas.ComponenteProgramatico;

@Data
@AllArgsConstructor
@Builder
public class ReporteMensual {

    private String periodoConsultado;
    private Integer cantidadPrestamos;
    private Integer cantidadDevoluciones;
    private Integer cantidadFichas;
    private List<ComponenteProgramatico> componentesProgramaticos;
    

}
