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
 * @author shofy
 */  
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ComponenteProgramatico {
 
    private Long id;
    private String nombre;
    private String nombrefacilitador;
    private String tipo;
    private String mes;
    private Integer anio;

   
 public String toString() {
        return this.nombre;
    }
    
 
}

