/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.FormularioRequest;
import tablas.Curso;
import tablas.Discapacidad;
import tablas.Establecimiento;
import tablas.Genero;
import tablas.Nacionalidad;
import tablas.Parentezco;
import tablas.PuebloOriginario;
import com.mysql.jdbc.StringUtils;
import funciones.Funciones;
import funciones.FuncionesFichaInscripcion;
import funciones.FuncionesPDF;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import tablas.FichaInscripcion;

public class FormularioFichaCecrea extends javax.swing.JFrame {
    
    private Long idFicha;

    public FormularioFichaCecrea() {
        initComponents();
        this.setTitle("Formulario de Inscripcion Cecrea La Ligua");
        CBCURSO.removeAllItems();
        CBESPDISC.removeAllItems();
        CBESPPO.removeAllItems();
        CBESTABLECIMIENTO.removeAllItems();
        CBGENERO.removeAllItems();
        CBNAC1.removeAllItems();
        cbrelacion.removeAllItems();
        
        ArrayList<Nacionalidad> lista = Funciones.llenarComboNacionalidad();
        for (int i = 0; i < lista.size(); i++) {
            CBNAC1.addItem(lista.get(i));
        }

        ArrayList<Curso> enlista = Funciones.llenarComboCurso();
        for (int i = 0; i < enlista.size(); i++) {
            CBCURSO.addItem(enlista.get(i));

        }

        ArrayList<PuebloOriginario> enlistado = Funciones.llenarComboPueblosOriginarios();
        for (int i = 0; i < enlistado.size(); i++) {
            CBESPPO.addItem(enlistado.get(i));

        }
        ArrayList<Discapacidad> enlistadoo = Funciones.llenarComboDiscapacidad();
        for (int i = 0; i < enlistadoo.size(); i++) {
            CBESPDISC.addItem(enlistadoo.get(i));

        }
        ArrayList<Establecimiento> enlistad = Funciones.llenarComboEstablecimiento();
        for (int i = 0; i < enlistad.size(); i++) {
            CBESTABLECIMIENTO.addItem(enlistad.get(i));

        }
        ArrayList<Parentezco> listad = Funciones.llenarComboParentezco();
        for (int i = 0; i < listad.size(); i++) {
            cbrelacion.addItem(listad.get(i));

        }
        ArrayList<Genero> listag = Funciones.llenarComboGenero();
        for (int i = 0; i < listag.size(); i++) {
            CBGENERO.addItem(listag.get(i));
        }       
        
        botonActualizarParticipante.setVisible(false);

    }

    FormularioFichaCecrea(Long idFicha) {
        //Esto llama al constructor base, el que no tiene parametro, 
        //esto te permite crear constructores especificos pero aun asi reutilizando la logica de la construccion base y asi no repetir codigo
        this(); 
       FichaInscripcion ficha = FuncionesFichaInscripcion.buscarFichaPorId(idFicha);
       llenarCajas(ficha);
       botonRegistrarParticipante.setVisible(false);
       botonActualizarParticipante.setVisible(true);
       this.idFicha = idFicha;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NOMPARTICIPANTE = new javax.swing.JTextField();
        APELPATPAR = new javax.swing.JTextField();
        APELMATPAR = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CBESPPO = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        RUNPAR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DOMPAR = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        FONOPAR = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        CBCURSO = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        CBNAC1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        CBESPDISC = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        nombadresp = new javax.swing.JTextField();
        respappat = new javax.swing.JTextField();
        apematresp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        dirresp = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fonoresp = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        cbrelacion = new javax.swing.JComboBox<>();
        emailresp = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Nombreresp1 = new javax.swing.JTextField();
        runresp1 = new javax.swing.JTextField();
        fonoresp1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        botonRegistrarParticipante = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Nombreresp2 = new javax.swing.JTextField();
        runresp2 = new javax.swing.JTextField();
        fonoresp2 = new javax.swing.JTextField();
        CBGENERO = new javax.swing.JComboBox<>();
        CBESTABLECIMIENTO = new javax.swing.JComboBox<>();
        CERRARFORM = new javax.swing.JButton();
        checkboxPuebloOriginario = new javax.swing.JCheckBox();
        checkboxDiscapacidad = new javax.swing.JCheckBox();
        jDFechanacparticipante = new com.toedter.calendar.JDateChooser();
        botonActualizarParticipante = new javax.swing.JButton();
        labelAcuerdo = new javax.swing.JLabel();
        checkboxAcuerdo = new javax.swing.JCheckBox();

        jLabel13.setText("jLabel13");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("jLabel16");

        jLabel25.setText("jLabel15");

        jTextField15.setText("jTextField10");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        jCheckBox1.setText("jCheckBox1");

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOMBRE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 73, -1, -1));

        jLabel2.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel3.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DATOS PERSONALES PARTICIPANTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 17, -1, -1));
        getContentPane().add(NOMPARTICIPANTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 91, 199, -1));
        getContentPane().add(APELPATPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 190, -1));
        getContentPane().add(APELMATPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 190, -1));

        jLabel5.setText("FECHA NACIMIENTO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setText("RUN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 34, -1));

        jLabel7.setText("GENERO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        CBESPPO.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBESPPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBESPPOActionPerformed(evt);
            }
        });
        CBESPPO.setEnabled(false);
        getContentPane().add(CBESPPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 191, -1));

        jLabel9.setText("NACIONALIDAD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));
        getContentPane().add(RUNPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 191, -1));

        jLabel11.setText("PERTENECE  A PUEBLO ORIGINARIO");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 250, -1));

        jLabel12.setText("CUÁL?");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel14.setText("DOMICILIO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 22));
        getContentPane().add(DOMPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 236, -1));

        jLabel15.setText("FONO");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));
        getContentPane().add(FONOPAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 191, -1));

        jLabel16.setText("DISCAPACIDAD");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        CBCURSO.setModel(new javax.swing.DefaultComboBoxModel<>());
        getContentPane().add(CBCURSO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 191, -1));

        jLabel17.setText("CURSO");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        CBNAC1.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBNAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNAC1ActionPerformed(evt);
            }
        });
        getContentPane().add(CBNAC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 159, 20));

        jLabel19.setText("TIPO ESTABLECIMIENTO");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        CBESPDISC.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBESPDISC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBESPDISCActionPerformed(evt);
            }
        });
        CBESPDISC.setEnabled(false);
        getContentPane().add(CBESPDISC, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 191, -1));

        jLabel20.setText("TIPO DE DISCAPACIDAD");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 364, 703, 10));

        jLabel21.setText("NOMBRES");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel22.setText("APELLIDO MATERNO");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 127, -1));

        jLabel23.setText("APELLIDO PATERNO");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));
        getContentPane().add(nombadresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 199, -1));
        getContentPane().add(respappat, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 183, -1));
        getContentPane().add(apematresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 189, -1));

        jLabel24.setText("DIRECCION");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));
        getContentPane().add(dirresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 440, 300, -1));

        jLabel26.setText("FONO");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, -1));

        fonoresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonorespActionPerformed(evt);
            }
        });
        getContentPane().add(fonoresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 190, -1));

        jLabel27.setText("RELACION");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        getContentPane().add(cbrelacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 470, 180, 20));
        getContentPane().add(emailresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 280, -1));

        jLabel28.setText("E-MAIL");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 529, 703, 10));

        jLabel29.setText("DATOS PERSONALES ADULTO AUTORIZADO A RETIRAR");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 545, -1, -1));

        jLabel30.setText("NOMBRE");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 580, -1, -1));

        jLabel31.setText("RUN");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 615, -1, -1));

        jLabel32.setText("FONO");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 654, -1, -1));
        getContentPane().add(Nombreresp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 578, 233, -1));
        getContentPane().add(runresp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 615, 233, -1));
        getContentPane().add(fonoresp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 652, 233, -1));

        jLabel36.setText("DATOS ADULTO RESPONSABLE");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, -1, -1));

        botonRegistrarParticipante.setText("REGISTRAR PARTICIPANTE");
        botonRegistrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarParticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));

        jLabel33.setText("NOMBRE");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 580, -1, -1));

        jLabel34.setText("RUN");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 615, -1, -1));

        jLabel35.setText("FONO");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 652, -1, -1));
        getContentPane().add(Nombreresp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 578, 227, -1));
        getContentPane().add(runresp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 615, 227, -1));
        getContentPane().add(fonoresp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 652, 227, -1));

        CBGENERO.setModel(new javax.swing.DefaultComboBoxModel<>());
        getContentPane().add(CBGENERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 154, -1));

        CBESTABLECIMIENTO.setModel(new javax.swing.DefaultComboBoxModel<>());
        getContentPane().add(CBESTABLECIMIENTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 150, -1));

        CERRARFORM.setText("CERRAR FORMULARIO");
        CERRARFORM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARFORMActionPerformed(evt);
            }
        });
        getContentPane().add(CERRARFORM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, -1, -1));

        checkboxPuebloOriginario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxPuebloOriginarioActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxPuebloOriginario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 20, 20));

        checkboxDiscapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDiscapacidadActionPerformed(evt);
            }
        });
        getContentPane().add(checkboxDiscapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));
        getContentPane().add(jDFechanacparticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 154, -1));

        botonActualizarParticipante.setText("GUARDAR");
        botonActualizarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarParticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 165, -1));

        labelAcuerdo.setText("ACUERDA USO DE IMAGEN DEL NNJ");
        getContentPane().add(labelAcuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 250, -1));
        getContentPane().add(checkboxAcuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBESPDISCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBESPDISCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBESPDISCActionPerformed

    private void CBESPPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBESPPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBESPPOActionPerformed

    private void botonRegistrarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarParticipanteActionPerformed

        FormularioRequest formularioRequest = generarRequest();
        
        String errores = Funciones.validarFormularioParticipante(formularioRequest);
        if (!StringUtils.isNullOrEmpty(errores)) {
            JOptionPane.showMessageDialog(null, errores);
            return;
        }
        Funciones.insertarFormulario(formularioRequest);
        
        limpiarcajas();
    }//GEN-LAST:event_botonRegistrarParticipanteActionPerformed

    private void CERRARFORMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CERRARFORMActionPerformed
        dispose();
    }//GEN-LAST:event_CERRARFORMActionPerformed

    private void checkboxDiscapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxDiscapacidadActionPerformed
        if (checkboxDiscapacidad.isSelected()) {
            CBESPDISC.setEnabled(true);
        } else {
            CBESPDISC.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxDiscapacidadActionPerformed

    private void checkboxPuebloOriginarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxPuebloOriginarioActionPerformed
        if (checkboxPuebloOriginario.isSelected()) {
            CBESPPO.setEnabled(true);
        } else {
            CBESPPO.setEnabled(false);
        }
    }//GEN-LAST:event_checkboxPuebloOriginarioActionPerformed

    private void CBNAC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNAC1ActionPerformed

    }//GEN-LAST:event_CBNAC1ActionPerformed

    private void fonorespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fonorespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fonorespActionPerformed

    private void botonActualizarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarParticipanteActionPerformed
        FormularioRequest request = generarRequest();
        String errores = Funciones.validarFormularioParticipante(request);
        if (!StringUtils.isNullOrEmpty(errores)) {
            JOptionPane.showMessageDialog(null, errores);
            return;
        }        
        Funciones.actualizarParticipante(idFicha, request);
    }//GEN-LAST:event_botonActualizarParticipanteActionPerformed
    private void limpiarcajas() {
        APELMATPAR.setText(null);
        APELPATPAR.setText(null);
        DOMPAR.setText(null);
        FONOPAR.setText(null);
        NOMPARTICIPANTE.setText(null);
        Nombreresp1.setText(null);
        Nombreresp2.setText(null);
        RUNPAR.setText(null);
        apematresp.setText(null);
        respappat.setText(null);
        dirresp.setText(null);
        emailresp.setText(null);
        fonoresp.setText(null);
        fonoresp1.setText(null);
        fonoresp2.setText(null);
        nombadresp.setText(null);
        runresp1.setText(null);
        runresp2.setText(null);
        CBCURSO.setSelectedIndex(0);
        CBESPDISC.setSelectedIndex(0);
        CBESPPO.setSelectedIndex(0);
        CBESTABLECIMIENTO.setSelectedIndex(0);
        CBGENERO.setSelectedIndex(0);
        CBNAC1.setSelectedIndex(0);
        checkboxAcuerdo.setSelected(false);
        cbrelacion.setSelectedIndex(0);
    }
    
        private void llenarCajas(FichaInscripcion ficha) {
        APELMATPAR.setText(ficha.getApelldmaternopart());
        APELPATPAR.setText(ficha.getApelldpaternopart());
        DOMPAR.setText(ficha.getDomicilio());
        FONOPAR.setText(ficha.getFonoparticipante());
        NOMPARTICIPANTE.setText(ficha.getNombreparticipante());
        jDFechanacparticipante.setDate(ficha.getFechanacparticipante());
        Nombreresp1.setText(ficha.getNombretiro1());
        Nombreresp2.setText(ficha.getNombretiro2());
        RUNPAR.setText(ficha.getRun());
        apematresp.setText(ficha.getApellmatadresp());
        respappat.setText(ficha.getApellpatadresp());
        dirresp.setText(ficha.getDiradresp());
        emailresp.setText(ficha.getEmailadresp());
        fonoresp.setText(ficha.getFonoadresp());
        fonoresp1.setText(ficha.getFonoretiro1());
        fonoresp2.setText(ficha.getFonoretiro2());
        nombadresp.setText(ficha.getNombreadresp());        
        runresp1.setText(ficha.getRunretiro1());
        runresp2.setText(ficha.getRunretiro2());
        setSelectedCurso(CBCURSO, ficha.getCurso());
        setSelectedDiscapacidad(CBESPDISC, ficha.getTipodediscapacidad());
        setSelectedPuebloOriginario(CBESPPO, ficha.getPueblosoriginarios());
        setSelectedEstablecimiento(CBESTABLECIMIENTO, ficha.getTipoestablecimiento());
        setSelectedGenero(CBGENERO, ficha.getGenero());
        setSelectedNacionalidad(CBNAC1, ficha.getNacionalidad1());
        checkboxAcuerdo.setSelected(ficha.getAcuerdoUsoImagen());
        setSelectedRelacion(cbrelacion, ficha.getParentezco());
    }
        
    private void setSelectedCurso(JComboBox comboBox, Long value) {
        Curso item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Curso)comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }
    
    private void setSelectedDiscapacidad(JComboBox comboBox, Long value) {
        Discapacidad item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Discapacidad)comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }
    
    private void setSelectedPuebloOriginario(JComboBox comboBox, Long value) {
        PuebloOriginario item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (PuebloOriginario)comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }
    
    private void setSelectedEstablecimiento(JComboBox comboBox, Long value) {
        Establecimiento item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Establecimiento)comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }    
    
    private void setSelectedGenero(JComboBox comboBox, Long value) {
        Genero item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Genero) comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }
    
    private void setSelectedNacionalidad(JComboBox comboBox, Long value) {
        Nacionalidad item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Nacionalidad) comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }
    
    private void setSelectedRelacion(JComboBox comboBox, Long value) {
        Parentezco item;
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            item = (Parentezco) comboBox.getItemAt(i);
            if (Objects.equals(item.getId(), value)) {
                comboBox.setSelectedIndex(i);
                return;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELMATPAR;
    private javax.swing.JTextField APELPATPAR;
    private javax.swing.JComboBox<Curso> CBCURSO;
    private javax.swing.JComboBox<Discapacidad> CBESPDISC;
    private javax.swing.JComboBox<tablas.PuebloOriginario> CBESPPO;
    private javax.swing.JComboBox<Establecimiento> CBESTABLECIMIENTO;
    private javax.swing.JComboBox<Genero> CBGENERO;
    private javax.swing.JComboBox<Nacionalidad> CBNAC1;
    private javax.swing.JButton CERRARFORM;
    private javax.swing.JTextField DOMPAR;
    private javax.swing.JTextField FONOPAR;
    private javax.swing.JTextField NOMPARTICIPANTE;
    private javax.swing.JTextField Nombreresp1;
    private javax.swing.JTextField Nombreresp2;
    private javax.swing.JTextField RUNPAR;
    private javax.swing.JTextField apematresp;
    private javax.swing.JButton botonActualizarParticipante;
    private javax.swing.JButton botonRegistrarParticipante;
    private javax.swing.JComboBox<Parentezco> cbrelacion;
    private javax.swing.JCheckBox checkboxAcuerdo;
    private javax.swing.JCheckBox checkboxDiscapacidad;
    private javax.swing.JCheckBox checkboxPuebloOriginario;
    private javax.swing.JTextField dirresp;
    private javax.swing.JTextField emailresp;
    private javax.swing.JTextField fonoresp;
    private javax.swing.JTextField fonoresp1;
    private javax.swing.JTextField fonoresp2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDFechanacparticipante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JLabel labelAcuerdo;
    private javax.swing.JTextField nombadresp;
    private javax.swing.JTextField respappat;
    private javax.swing.JTextField runresp1;
    private javax.swing.JTextField runresp2;
    // End of variables declaration//GEN-END:variables

    private FormularioRequest generarRequest() {
        FormularioRequest formularioRequest = new FormularioRequest();
        formularioRequest.setNombreparticipante(NOMPARTICIPANTE.getText());
        formularioRequest.setApellidoPaternoParticipante(APELPATPAR.getText());
        formularioRequest.setApellidoMaternoParticipante(APELMATPAR.getText());
        formularioRequest.setDomicilioParticipante(DOMPAR.getText());
        formularioRequest.setFonoParticipante(FONOPAR.getText());
        formularioRequest.setNombreRetiro1(Nombreresp1.getText());
        formularioRequest.setNombreRetiro2(Nombreresp2.getText());
        formularioRequest.setRutParticipante(RUNPAR.getText());
        formularioRequest.setApellidoPaternoResponsable(respappat.getText());
        formularioRequest.setApellidoMaternoResponsable(apematresp.getText());
        formularioRequest.setDomicilioResponsable(dirresp.getText());
        formularioRequest.setFonoRetiro1(fonoresp1.getText());
        formularioRequest.setFonoRetiro2(fonoresp2.getText());
        formularioRequest.setNombreResponsable(nombadresp.getText());
        formularioRequest.setRutRetiro1(runresp1.getText());
        formularioRequest.setRutRetiro2(runresp2.getText());
        Genero genero = (Genero) CBGENERO.getSelectedItem();
        formularioRequest.setGeneroParticipante(genero.getId());
        Curso curso = (Curso) CBCURSO.getSelectedItem();
        formularioRequest.setCursoParticipante(curso.getId());
        if (checkboxDiscapacidad.isSelected()) {
            Discapacidad discapacidad = (Discapacidad) CBESPDISC.getSelectedItem();
            formularioRequest.setTipoDiscapacidadParticipante(discapacidad.getId());
        } else {
            formularioRequest.setTipoDiscapacidadParticipante(null);
        }
        if (checkboxPuebloOriginario.isSelected()) {
            PuebloOriginario poriginarios = (PuebloOriginario) CBESPPO.getSelectedItem();
            formularioRequest.setPueblosoriginarios(poriginarios.getId());
        } else {
            formularioRequest.setPueblosoriginarios(null);
        }
        Establecimiento establecimiento = (Establecimiento) CBESTABLECIMIENTO.getSelectedItem();
        formularioRequest.setTipoestablecimiento(establecimiento.getId());
        Nacionalidad nacionalidad = (Nacionalidad) CBNAC1.getSelectedItem();
        formularioRequest.setNacionalidadParticipante(nacionalidad.getId());
        Parentezco parentezco = (Parentezco) cbrelacion.getSelectedItem();
        formularioRequest.setParentezcoResponsable(parentezco.getId());
        formularioRequest.setEmailResponsable(emailresp.getText());
        formularioRequest.setFonoResponsable(fonoresp.getText());
        formularioRequest.setEsDiscapacitado(checkboxDiscapacidad.isSelected());
        formularioRequest.setEsDePuebloOriginario(checkboxPuebloOriginario.isSelected());
        formularioRequest.setAcuerdoUsoImagen(checkboxAcuerdo.isSelected());
        formularioRequest.setFechaNacimientoParticipante(jDFechanacparticipante.getDate());
        return formularioRequest;
    }
}
