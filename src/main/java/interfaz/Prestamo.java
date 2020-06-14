package interfaz;

import dto.UserLogin;
import funciones.Funciones;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import tablas.Libro;
import tablas.Solicitante;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

/**
 *
 * @author Sofia
 */
public class Prestamo extends javax.swing.JPanel {

    
    private UserLogin userLogin;
    
    public Prestamo(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
        user.setText(this.userLogin.getNombre());

        for (Libro l : Funciones.buscarLibroDisponibles(null)) {
            combonombrelibro.addItem(l);
        }

        for (Solicitante s : Funciones.buscarSolicitantes()) {
            combonombresolicitante.addItem(s);
        }
    }
private void limpiarcajas() {
        
       observaciones.setText(null);
       combonombrelibro.setSelectedIndex(0);
       combonombresolicitante.setSelectedIndex(0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        registrarprestamo = new javax.swing.JButton();
        CERRARSESION = new javax.swing.JButton();
        combonombrelibro = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        combonombresolicitante = new javax.swing.JComboBox<>();
        devolucionprestamo = new com.toedter.calendar.JDateChooser();
        labelDisponibles = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(550, 422));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("PRÉSTAMO DE LIBROS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRE DEL LIBRO :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("NOMBRE SOLICITANTE:");

        registrarprestamo.setText("INGRESAR");
        registrarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarprestamoActionPerformed(evt);
            }
        });

        CERRARSESION.setText("Cerrar");
        CERRARSESION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARSESIONActionPerformed(evt);
            }
        });

        combonombrelibro.setModel(new javax.swing.DefaultComboBoxModel<>());
        combonombrelibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combonombrelibroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("OBSERVACIONES :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("FECHA DE DEVOLUCION :");

        combonombresolicitante.setModel(new javax.swing.DefaultComboBoxModel<>());

        labelDisponibles.setText("Unidades disponibles: ");

        user.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(CERRARSESION, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combonombresolicitante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDisponibles)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(combonombrelibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(observaciones)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registrarprestamo)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(devolucionprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CERRARSESION)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combonombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDisponibles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combonombresolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(devolucionprestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(registrarprestamo)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registrarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarprestamoActionPerformed
        Libro l = (Libro) combonombrelibro.getSelectedItem();
        Solicitante s = (Solicitante) combonombresolicitante.getSelectedItem();
        if (combonombresolicitante.getSelectedItem() != null && combonombresolicitante.getSelectedItem() != null) {
            Funciones.insertarPrestamo(
                    l,
                    s,
                    new java.sql.Date(devolucionprestamo.getDate().getTime()),
                    observaciones.getText());
            CERRARSESIONActionPerformed(null);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos solicitados");

        }
        limpiarcajas();
        combonombrelibro.requestFocus();
    }//GEN-LAST:event_registrarprestamoActionPerformed

    private void CERRARSESIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARSESIONActionPerformed
        Window w = SwingUtilities.getWindowAncestor(Prestamo.this);
        w.setVisible(false);
        if(userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        }               
    }//GEN-LAST:event_CERRARSESIONActionPerformed

    private void combonombrelibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combonombrelibroActionPerformed
        Libro l = (Libro) combonombrelibro.getSelectedItem();
        labelDisponibles.setText("Unidades disponibles: " + l.getDisponibilidad());
    }//GEN-LAST:event_combonombrelibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CERRARSESION;
    private javax.swing.JComboBox<Libro> combonombrelibro;
    private javax.swing.JComboBox<Solicitante> combonombresolicitante;
    private com.toedter.calendar.JDateChooser devolucionprestamo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel labelDisponibles;
    private javax.swing.JTextField observaciones;
    private javax.swing.JButton registrarprestamo;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
