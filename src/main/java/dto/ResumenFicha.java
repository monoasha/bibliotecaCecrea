
package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResumenFicha {

    private Long id;
    private String nombreparticipante;
    private String apelldpaternopart;
    private String apelldmaternopart;
    private String run;

}
