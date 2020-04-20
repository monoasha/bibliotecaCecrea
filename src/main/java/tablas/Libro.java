/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Sofia
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    private Long id;
    private String nombre;
    private String autor;
    private Boolean disponibilidad;
    private String fechadeingreso;
    private String categoria;

 
 public String toString() {
        return this.nombre;
    }
}
