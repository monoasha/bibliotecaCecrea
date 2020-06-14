/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.ResumenPrestamo;
import dto.UserLogin;
import funciones.Funciones;
import funciones.FuncionesFichaInscripcion;
import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import tablas.ComponenteProgramatico;
import tablas.FichaInscripcion;
import tablas.Nacionalidad;
import tablas.Solicitante;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

/**
 *
 * @author Sofia
 */
public class InscripcionLaboratorio extends javax.swing.JPanel {

    /**
     * Creates new form DEVOLUCIONPRESTAMO
     */
    
    private UserLogin userLogin;
    
    public InscripcionLaboratorio(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
        user.setText(this.userLogin.getNombre());
        
         Funciones.cambiarLenguajeBD();
    
         ArrayList<ComponenteProgramatico> list = Funciones.llenarComboComponentesProgramaticos();
        for (int i = 0; i < list.size(); i++) {
            combolaboratorios.addItem(list.get(i));
        }
        
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
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jLabel1 = new javax.swing.JLabel();
        combolaboratorios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnregistrarinscripcionlab = new javax.swing.JButton();
        RUT_INSCRITO = new javax.swing.JTextField();
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
        jLabel4 = new javax.swing.JLabel();
        textFieldEmail = new javax.swing.JTextField();
        labelTelefono1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkboxTieneFicha = new javax.swing.JCheckBox();

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

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(455, 422));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE INSCRIPCIÓN DE ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 12, 331, 21));

        combolaboratorios.setModel(new javax.swing.DefaultComboBoxModel<>());
        add(combolaboratorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 190, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("RUT SOLICITANTE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        btnregistrarinscripcionlab.setText("REGISTRAR");
        btnregistrarinscripcionlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarinscripcionlabActionPerformed(evt);
            }
        });
        add(btnregistrarinscripcionlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 113, -1));

        RUT_INSCRITO.setBackground(new java.awt.Color(204, 204, 0));
        add(RUT_INSCRITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 316, 30));

        busquedadevoluciones.setText("BUSCAR");
        busquedadevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedadevolucionesActionPerformed(evt);
            }
        });
        add(busquedadevoluciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 79, -1));

        labelNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelNombre.setText("NOMBRE:");
        add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        labelRut.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelRut.setText("RUT:");
        add(labelRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        labelDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelDireccion.setText("DIRECCIÓN:");
        add(labelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        labelTelefono.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTelefono.setText("TELÉFONO:");
        add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        textFieldNombre.setEditable(true);
        add(textFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 316, 33));

        textFieldRut.setEditable(true);
        add(textFieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 316, 29));

        textFieldDireccion.setEditable(true);
        add(textFieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 316, 33));

        textFieldTelefono.setEditable(true);
        add(textFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 316, 34));

        botonCerrar.setText("CERRAR");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });
        add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 79, -1));

        user.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 0, 69, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("LABORATORIOS Y EXPERIENCIAS");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 39, -1, -1));

        textFieldEmail.setEditable(true);
        add(textFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 316, 32));

        labelTelefono1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        labelTelefono1.setText("E-MAIL:");
        add(labelTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 333, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("LABORATORIOS : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        checkboxTieneFicha.setEnabled(false);
        add(checkboxTieneFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));
        checkboxTieneFicha.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistrarinscripcionlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarinscripcionlabActionPerformed
       String nombre = textFieldNombre.getText();
       String run = textFieldRut.getText();
       String direccion = textFieldDireccion.getText();
       String telefono = textFieldTelefono.getText();
       String email = textFieldEmail.getText();
        Long lab = ((ComponenteProgramatico) combolaboratorios.getSelectedItem()).getId();
        boolean ficha = checkboxTieneFicha.isSelected();
    
   Funciones.Inscripcionlab(nombre,run,direccion,telefono,email,lab,ficha);
       
    }//GEN-LAST:event_btnregistrarinscripcionlabActionPerformed

    private void busquedadevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedadevolucionesActionPerformed
        String rut = RUT_INSCRITO.getText();
        Funciones.limpiarRut(rut);
        if (Funciones.validarRut(rut)) {
            Optional<FichaInscripcion> ficha = FuncionesFichaInscripcion.buscarFichaPorRut(rut);
            if (ficha.isPresent()) {
                textFieldNombre.setText(ficha.get().getNombreparticipante()+ " " + ficha.get().getApelldpaternopart());
                textFieldRut.setText(ficha.get().getRun());
                textFieldDireccion.setText(ficha.get().getDomicilio());
                textFieldTelefono.setText(ficha.get().getFonoparticipante());
                textFieldEmail.setText(ficha.get().getEmailadresp());
                checkboxTieneFicha.setSelected(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "El NNJ no tiene ficha de inscripción");
                checkboxTieneFicha.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, " Porfavor ingrese un rut válido");
        }

    }//GEN-LAST:event_busquedadevolucionesActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        Window w = SwingUtilities.getWindowAncestor(InscripcionLaboratorio.this);
        w.setVisible(false);
        if (userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        }
    }//GEN-LAST:event_botonCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RUT_INSCRITO;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton btnregistrarinscripcionlab;
    private javax.swing.JButton busquedadevoluciones;
    private javax.swing.JCheckBox checkboxTieneFicha;
    private javax.swing.JComboBox<ComponenteProgramatico> combolaboratorios;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelRut;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelTelefono1;
    private javax.swing.JTextField textFieldDireccion;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNombre;
    private javax.swing.JTextField textFieldRut;
    private javax.swing.JTextField textFieldTelefono;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
