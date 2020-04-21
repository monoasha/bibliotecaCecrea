/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.UserLogin;
import funciones.Funciones;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Sofia
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    
    private UserLogin userLogin;
    
    public User(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
        this.setTitle(" Sistema Interno Cecrea La Ligua");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ingresosolicitante = new javax.swing.JMenuItem();
        ingresarlibri = new javax.swing.JMenuItem();
        busquedalibros = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ingresarprestamo = new javax.swing.JMenuItem();
        eliminarprestamo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ingresofichascecrea = new javax.swing.JMenuItem();
        EDITARELIMINARFICHA = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CECREA LA LIGUA- ");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu1.setText("MENU");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        ingresosolicitante.setText("INGRESO SOLICITANTE");
        ingresosolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosolicitanteActionPerformed(evt);
            }
        });
        jMenu1.add(ingresosolicitante);

        ingresarlibri.setText("INGRESO LIBROS");
        ingresarlibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarlibriActionPerformed(evt);
            }
        });
        jMenu1.add(ingresarlibri);

        busquedalibros.setText("BUSQUEDA DE LIBRO");
        busquedalibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedalibrosActionPerformed(evt);
            }
        });
        jMenu1.add(busquedalibros);

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("PRESTAMOS");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ingresarprestamo.setText("INGRESAR PRESTAMO");
        ingresarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(ingresarprestamo);

        eliminarprestamo.setText("DEVOLUCION PRESTAMO");
        eliminarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarprestamo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("FICHAS");
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ingresofichascecrea.setText("INGRESO FICHA CECREA");
        ingresofichascecrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresofichascecreaActionPerformed(evt);
            }
        });
        jMenu3.add(ingresofichascecrea);

        EDITARELIMINARFICHA.setText("EDITAR /ELIMINAR FICHAS");
        EDITARELIMINARFICHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARELIMINARFICHAActionPerformed(evt);
            }
        });
        jMenu3.add(EDITARELIMINARFICHA);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarlibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarlibriActionPerformed
      IngresoLibros il = new IngresoLibros(userLogin);
        il.setSize(600,600);
        il.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(il,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresarlibriActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
    dispose();   
    JOptionPane.showMessageDialog(null, "Haz cerrado sesión . ");
    new LoginBiblioCecrea().setVisible(true);
    
    
    }//GEN-LAST:event_salirActionPerformed

    private void ingresosolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosolicitanteActionPerformed
    IngresoSolicitante iu = new IngresoSolicitante(userLogin);
        iu.setSize(600,600);
        iu.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(iu,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresosolicitanteActionPerformed

    private void busquedalibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedalibrosActionPerformed
        BusquedaLibros bl = new BusquedaLibros(userLogin);
        bl.setSize(600,600);
        bl.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(bl,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_busquedalibrosActionPerformed

    private void ingresarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarprestamoActionPerformed
       Prestamo p = new Prestamo(userLogin);
        this.setSize(620, 650);
        p.setSize(600, 600);
        p.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(p,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresarprestamoActionPerformed

    private void ingresofichascecreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresofichascecreaActionPerformed
      new FormularioFichaCecrea().setVisible(true);
    }//GEN-LAST:event_ingresofichascecreaActionPerformed

    private void eliminarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarprestamoActionPerformed
   DevolucionPrestamo dp = new DevolucionPrestamo();
        dp.setSize(450,300);
        dp.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(dp,BorderLayout.LINE_START);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_eliminarprestamoActionPerformed

    private void EDITARELIMINARFICHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARELIMINARFICHAActionPerformed
        BusquedaFicha bf = new BusquedaFicha(userLogin);
        bf.setSize(700,500);
        bf.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(bf,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_EDITARELIMINARFICHAActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EDITARELIMINARFICHA;
    private javax.swing.JMenuItem busquedalibros;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem eliminarprestamo;
    private javax.swing.JMenuItem ingresarlibri;
    private javax.swing.JMenuItem ingresarprestamo;
    private javax.swing.JMenuItem ingresofichascecrea;
    private javax.swing.JMenuItem ingresosolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
