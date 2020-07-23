
package tablas;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Usuario {
    private Long id;
    private String nombre;
    private String contacto;
    private String contraseña;
    private String rutusuario;
    private Cargo cargo;

}
