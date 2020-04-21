/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Prestamo {
    private Long id;
    private String idLibro;
    private String idSolicitante;
    private Date fechaSolicitud;
    private Date fechaDevolucion;
    private String observaciones;
    private boolean vigente;
    
}
