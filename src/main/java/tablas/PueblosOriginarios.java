/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author shofy
 */
@Data
@AllArgsConstructor
public class PueblosOriginarios {

    private Long Id;
    private String nombre;

    public String toString() {
        return this.nombre;
    }
}
