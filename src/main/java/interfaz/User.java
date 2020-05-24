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
        user.setText(this.userLogin.getNombre());
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
        jMenuItem2 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        LABORATORIOS = new javax.swing.JMenu();
        ingesolaboratorios = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CECREA LA LIGUA- ");

        user.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("bienvenido");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jMenu1.setText("MENU");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        ingresosolicitante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingresosolicitante.setText("INGRESO SOLICITANTE");
        ingresosolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosolicitanteActionPerformed(evt);
            }
        });
        jMenu1.add(ingresosolicitante);

        ingresarlibri.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingresarlibri.setText("INGRESO LIBROS");
        ingresarlibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarlibriActionPerformed(evt);
            }
        });
        jMenu1.add(ingresarlibri);

        busquedalibros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        busquedalibros.setText("BUSQUEDA DE LIBRO");
        busquedalibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedalibrosActionPerformed(evt);
            }
        });
        jMenu1.add(busquedalibros);

        salir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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

        ingresarprestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingresarprestamo.setText("INGRESAR PRESTAMO");
        ingresarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(ingresarprestamo);

        eliminarprestamo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eliminarprestamo.setText("DEVOLUCION PRESTAMO");
        eliminarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarprestamo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("FICHAS");
        jMenu3.setFocusable(false);
        jMenu3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ingresofichascecrea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingresofichascecrea.setText("INGRESO FICHA CECREA");
        ingresofichascecrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresofichascecreaActionPerformed(evt);
            }
        });
        jMenu3.add(ingresofichascecrea);

        EDITARELIMINARFICHA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EDITARELIMINARFICHA.setText("EDITAR /ELIMINAR FICHAS");
        EDITARELIMINARFICHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARELIMINARFICHAActionPerformed(evt);
            }
        });
        jMenu3.add(EDITARELIMINARFICHA);

        jMenuBar1.add(jMenu3);

        LABORATORIOS.setText("LABORATORIOS");
        LABORATORIOS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ingesolaboratorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ingesolaboratorios.setText("INGRESO DE LABORATORIOS");
        ingesolaboratorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingesolaboratoriosActionPerformed(evt);
            }
        });
        LABORATORIOS.add(ingesolaboratorios);

        jMenuItem4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jMenuItem4.setText("BÚSQUEDA DE LABORATORIOS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        LABORATORIOS.add(jMenuItem4);

        jMenuBar1.add(LABORATORIOS);

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
      this.setSize(490  , 400);
        il.setSize(485,331);
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
        this.setSize(590, 570);
        iu.setSize(550,500);
        iu.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(iu,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresosolicitanteActionPerformed

    private void busquedalibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedalibrosActionPerformed
        BusquedaLibros bl = new BusquedaLibros(userLogin);
      this.setSize(600, 600);
      bl.setSize(600, 600);
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
   DevolucionPrestamo dp = new DevolucionPrestamo(userLogin);
        this.setSize(500, 490);
        dp.setSize(460, 432);
        dp.setLocation(5,5);
        contenedor.removeAll();
       contenedor.add(dp,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_eliminarprestamoActionPerformed

    private void EDITARELIMINARFICHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARELIMINARFICHAActionPerformed
        BusquedaFicha bf = new BusquedaFicha(userLogin);
        this.setSize(780, 600);
        bf.setSize(780,600);
        contenedor.removeAll();
       contenedor.add(bf,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_EDITARELIMINARFICHAActionPerformed

    private void ingesolaboratoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingesolaboratoriosActionPerformed
       IngresoLaboratorios IL = new IngresoLaboratorios();
        this.setSize(550, 450);
        IL.setSize(500,400);
        contenedor.removeAll();
       contenedor.add(IL,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingesolaboratoriosActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        BusquedaLabExp labexp = new BusquedaLabExp(userLogin);
        this.setSize(780, 600);
        labexp.setSize(780,600);
        contenedor.removeAll();
       contenedor.add(labexp,BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EDITARELIMINARFICHA;
    private javax.swing.JMenu LABORATORIOS;
    private javax.swing.JMenuItem busquedalibros;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem eliminarprestamo;
    private javax.swing.JMenuItem ingesolaboratorios;
    private javax.swing.JMenuItem ingresarlibri;
    private javax.swing.JMenuItem ingresarprestamo;
    private javax.swing.JMenuItem ingresofichascecrea;
    private javax.swing.JMenuItem ingresosolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem salir;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
