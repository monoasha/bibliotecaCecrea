package tablas;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Genero {
    
    private Long Id;
    private String nombre;

    public String toString() {
        return this.nombre;
    }

}
