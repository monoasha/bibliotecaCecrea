/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.ResumenPrestamo;
import dto.UserLogin;
import funciones.Funciones;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import tablas.Solicitante;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

/**
 *
 * @author Sofia
 */
public class DevolucionPrestamo extends javax.swing.JPanel {

    /**
     * Creates new form DEVOLUCIONPRESTAMO
     */
    
    private UserLogin userLogin;
    
    public DevolucionPrestamo(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboPrestamo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnregistrardevolucion = new javax.swing.JButton();
        RUTSOLDEV = new javax.swing.JTextField();
        busquedadevoluciones = new javax.swing.JButton();
        labelNombre = new javax.swing.JLabel();
        labelRut = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        textFieldNombre = new javax.swing.JTextField();
        textFieldRut = new javax.swing.JTextField();
        textFieldDireccion = new javax.swing.JTextField();
        textFieldTelefono = new javax.swing.JTextField();
        botonCerrar = new javax.swing.JButton();
        user = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(455, 422));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE DEVOLUCIONES");

        comboPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("RUT SOLICITANTE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("LIBRO SOLICITADO :");

        btnregistrardevolucion.setText("INGRESAR");
        btnregistrardevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrardevolucionActionPerformed(evt);
            }
        });

        busquedadevoluciones.setText("Buscar");
        busquedadevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedadevolucionesActionPerformed(evt);
            }
        });

        labelNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNombre.setText("Nombre");

        labelRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelRut.setText("Rut");

        labelDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelDireccion.setText("Direccion");

        labelTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTelefono.setText("Telefono");

        textFieldNombre.setEditable(false);

        textFieldRut.setEditable(false);

        textFieldDireccion.setEditable(false);

        textFieldTelefono.setEditable(false);

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelRut)
                                    .addComponent(labelNombre)
                                    .addComponent(labelDireccion)
                                    .addComponent(labelTelefono))))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldRut, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RUTSOLDEV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnregistrardevolucion)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(botonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(busquedadevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCerrar)
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(RUTSOLDEV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busquedadevoluciones))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(textFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRut)
                    .addComponent(textFieldRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(textFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefono)
                    .addComponent(textFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnregistrardevolucion)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrardevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrardevolucionActionPerformed
        ResumenPrestamo prestamo = (ResumenPrestamo) comboPrestamo.getSelectedItem();
        Funciones.registrardevolucion(prestamo);
        botonCerrarActionPerformed(null);
        limpiarcajas();
        RUTSOLDEV.requestFocus();
    }//GEN-LAST:event_btnregistrardevolucionActionPerformed

    private void busquedadevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedadevolucionesActionPerformed
        String rut = RUTSOLDEV.getText();
        if (Funciones.validarRut(rut)) {
            Solicitante s = Funciones.consultarSolicitantePorRut(rut);
            if (s != null) {
                textFieldNombre.setText(s.getNombres() + " " + s.getApellidopaterno());
                textFieldRut.setText(s.getRut());
                textFieldDireccion.setText(s.getDireccion());
                textFieldTelefono.setText(s.getTelefono());
                List<ResumenPrestamo> resumenes = Funciones.buscarPrestamosVigentes(s);
                if (!resumenes.isEmpty()) {
                    for(ResumenPrestamo r : resumenes) {
                        comboPrestamo.addItem(r);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El solicitante no tiene prestamos vigentes");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Solicitante no encontrado");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Porfavor ingrese un rut valido");
        }

    }//GEN-LAST:event_busquedadevolucionesActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        Window w = SwingUtilities.getWindowAncestor(DevolucionPrestamo.this);
        w.setVisible(false);
        if (userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        }
    }//GEN-LAST:event_botonCerrarActionPerformed

 private void limpiarcajas() {
        textFieldTelefono.setText(null);
        textFieldDireccion.setText(null);
        textFieldRut.setText(null);
        textFieldNombre.setText(null);
       RUTSOLDEV.setText(null);
        
        comboPrestamo.setSelectedIndex(0);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RUTSOLDEV;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton btnregistrardevolucion;
    private javax.swing.JButton busquedadevoluciones;
    private javax.swing.JComboBox<ResumenPrestamo> comboPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRut;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldRut;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
