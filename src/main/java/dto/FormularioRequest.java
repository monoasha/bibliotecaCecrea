
package dto;

import java.util.Date;
import lombok.Data;

@Data
public class FormularioRequest {

    private String nombreparticipante;
    private String apellidoPaternoParticipante;
    private String apellidoMaternoParticipante;
    private String rutParticipante;
    private String domicilioParticipante;
    private String fonoParticipante;
    private String nombreResponsable;
    private String apellidoPaternoResponsable;
    private String apellidoMaternoResponsable;
    private String domicilioResponsable;
    private String fonoResponsable;
    private String emailResponsable;
    private String nombreRetiro1;
    private String nombreRetiro2;
    private String rutRetiro1;
    private String rutRetiro2;
    private String fonoRetiro1;
    private String fonoRetiro2;
    private String generoOtroParticipante;
    private Date fechaNacimientoParticipante;
    private Long generoParticipante;
    private Long nacionalidadParticipante;
    private Boolean acuerdoUsoImagen;
    private Long pueblosoriginarios;
    private Long tipoestablecimiento;
    private Long cursoParticipante;
    private Long tipoDiscapacidadParticipante;
    private Long parentezcoResponsable;
    private Boolean esDiscapacitado;
    private Boolean esDePuebloOriginario;
       
}
