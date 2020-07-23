/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import dto.Usuario;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


/**
 *
 * @author shofy
 */
public class FuncionesUsuarios {
     public static Usuario buscarUsuarioPorId(Long id) {
        try {
            List<dto.Usuario> listaUsuario = Funciones.listarUsuario();
            return listaUsuario.stream().filter(f -> Objects.equals(f.getId(), id)).findFirst().get();
        } catch (Exception e) {
            System.out.println("Error inesperado al buscar usuarios por Id Usuarios " + e);
            JOptionPane.showMessageDialog(null, "Error al buscar Usuarios por Id");
        }
        return null;
    }
     
}
