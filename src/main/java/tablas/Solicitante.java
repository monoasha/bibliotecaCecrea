/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Solicitante {
    private Long id;
    private String nombres;
    private String Apellidopaterno;
    private String Apellidomaterno;
    private String rut;
    private Date fechanacimiento;
    private String direccion;
    private String apoderado;
    private String contacto;

    public Solicitante(long aLong, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return this.nombres;
    }
    
}
