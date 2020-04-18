
package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserLogin {

    private Long id;
    private String nombre;
    private String contacto;
    private String rut;
    private String cargo;

    
}
