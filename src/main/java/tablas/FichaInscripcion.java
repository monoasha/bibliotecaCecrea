
package tablas;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FichaInscripcion {

    private Long id;
    private String nombreparticipante;
    private String apelldpaternopart;
    private String apelldmaternopart;
    private String run;
    private String domicilio;
    private String fonoparticipante;
    private String nombreadresp;
    private String apellpatadresp;
    private String apellmatadresp;
    private String diradresp;
    private String fonoadresp;
    private String emailadresp;
    private String nombretiro1;
    private String nombretiro2;
    private String runretiro1;
    private String runretiro2;
    private String fonoretiro1;
    private String fonoretiro2;
    private String generootro;
    private Date fechanacparticipante;
    private Long genero;
    private Long nacionalidad1;
    private Boolean acuerdoUsoImagen;
    private Long pueblosoriginarios;
    private Long tipoestablecimiento;
    private Long curso;
    private Long tipodediscapacidad;
    private Long parentezco;
    private Boolean esdiscapacitado;
    private Boolean esdepueblooriginario;
    private Date fechaInscripcion;
       
}
