/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Usuario {
    
    private Long id;
    private String nombre;
    private String contacto;
    private String contraseña;
    private String Rutusuario;

    

}
