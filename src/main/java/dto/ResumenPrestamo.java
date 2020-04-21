package dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class ResumenPrestamo {

    private Long idPrestamo;
    private Long idLibro;
    private String nombreLibro;
    private Long idSolicitante;
    private Date fechaSolicitud;
    private Date fechaDevolucion;
    private boolean vigente;

    public String toString() {
        return this.nombreLibro;
    }

}
