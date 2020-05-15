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
        CBNAC2.removeAllItems();
        cbrelacion.removeAllItems();
        
        ArrayList<Nacionalidad> lista = Funciones.llenarComboNacionalidad();
        for (int i = 0; i < lista.size(); i++) {
            CBNAC1.addItem(lista.get(i));
            CBNAC2.addItem(lista.get(i));
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
       FichaInscripcion ficha = Funciones.buscarFichaPorId(idFicha);
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
        jLabel10 = new javax.swing.JLabel();
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
        CBNAC2 = new javax.swing.JComboBox<>();
        CERRARFORM = new javax.swing.JButton();
        checkboxPuebloOriginario = new javax.swing.JCheckBox();
        checkboxDiscapacidad = new javax.swing.JCheckBox();
        jDFechanacparticipante = new com.toedter.calendar.JDateChooser();
        botonActualizarParticipante = new javax.swing.JButton();

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

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO MATERNO");

        jLabel3.setText("APELLIDO PATERNO");

        jLabel4.setText("DATOS PERSONALES PARTICIPANTE");

        jLabel5.setText("FECHA NAC");

        jLabel6.setText("RUN");

        jLabel7.setText("GENERO");

        CBESPPO.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBESPPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBESPPOActionPerformed(evt);
            }
        });
        CBESPPO.setEnabled(false);

        jLabel9.setText("NACIONALIDAD 1");

        jLabel10.setText("NACIONALIDAD 2");

        jLabel11.setText("PERTENECE  A PUEBLO ORIGINARIO");

        jLabel12.setText("CUÁL?");

        jLabel14.setText("DOMICILIO");

        jLabel15.setText("FONO");

        jLabel16.setText("DISCAPACIDAD");

        CBCURSO.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel17.setText("CURSO");

        CBNAC1.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBNAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNAC1ActionPerformed(evt);
            }
        });

        jLabel19.setText("TIPO ESTABLECIMIENTO");

        CBESPDISC.setModel(new javax.swing.DefaultComboBoxModel<>());
        CBESPDISC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBESPDISCActionPerformed(evt);
            }
        });
        CBESPDISC.setEnabled(false);

        jLabel20.setText("TIPO DE DISCAPACIDAD");

        jLabel21.setText("NOMBRES");

        jLabel22.setText("APELLIDO MATERNO");

        jLabel23.setText("APELLIDO PATERNO");

        jLabel24.setText("DIRECCION");

        jLabel26.setText("FONO");

        fonoresp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fonorespActionPerformed(evt);
            }
        });

        jLabel27.setText("RELACION");

        jLabel28.setText("E-MAIL");

        jLabel29.setText("DATOS PERSONALES ADULTO AUTORIZADO A RETIRAR");

        jLabel30.setText("NOMBRE");

        jLabel31.setText("RUN");

        jLabel32.setText("FONO");

        jLabel36.setText("DATOS ADULTO RESPONSABLE");

        botonRegistrarParticipante.setText("REGISTRAR PARTICIPANTE");
        botonRegistrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarParticipanteActionPerformed(evt);
            }
        });

        jLabel33.setText("NOMBRE");

        jLabel34.setText("RUN");

        jLabel35.setText("FONO");

        CBGENERO.setModel(new javax.swing.DefaultComboBoxModel<>());

        CBESTABLECIMIENTO.setModel(new javax.swing.DefaultComboBoxModel<>());

        CBNAC2.setModel(new javax.swing.DefaultComboBoxModel<>());

        CERRARFORM.setText("CERRAR FORMULARIO");
        CERRARFORM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CERRARFORMActionPerformed(evt);
            }
        });

        checkboxPuebloOriginario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxPuebloOriginarioActionPerformed(evt);
            }
        });

        checkboxDiscapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxDiscapacidadActionPerformed(evt);
            }
        });

        botonActualizarParticipante.setText("GUARDAR");
        botonActualizarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel21))
                            .addComponent(jLabel36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(28, 28, 28)
                                    .addComponent(dirresp, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fonoresp, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nombadresp, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(respappat, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addGap(34, 34, 34)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apematresp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel27)
                                .addGap(18, 18, 18)
                                .addComponent(cbrelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28)
                                .addGap(18, 18, 18)
                                .addComponent(emailresp, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NOMPARTICIPANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(APELPATPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(APELMATPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Nombreresp1)
                                    .addComponent(runresp1)
                                    .addComponent(fonoresp1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Nombreresp2)
                                            .addComponent(runresp2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fonoresp2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(2, 2, 2)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DOMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(CBGENERO, 0, 154, Short.MAX_VALUE)
                                            .addComponent(jDFechanacparticipante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CBNAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(checkboxPuebloOriginario))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(CBESTABLECIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkboxDiscapacidad)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel12)
                                        .addGap(89, 89, 89))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel17)
                                        .addGap(82, 82, 82)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBESPPO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CBCURSO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addGap(34, 34, 34)
                                .addComponent(CBESPDISC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel15)
                                .addGap(89, 89, 89)
                                .addComponent(FONOPAR))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBNAC2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RUNPAR))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonRegistrarParticipante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CERRARFORM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonActualizarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMPARTICIPANTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APELPATPAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APELMATPAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jDFechanacparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RUNPAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBGENERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(CBNAC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(checkboxPuebloOriginario))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOMPAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(CBESTABLECIMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBNAC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(CBESPPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FONOPAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CBCURSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(1, 1, 1)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(checkboxDiscapacidad))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(CBESPDISC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombadresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respappat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apematresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(dirresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fonoresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(cbrelacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(emailresp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(Nombreresp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(runresp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(fonoresp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(Nombreresp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(runresp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(fonoresp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarParticipante)
                    .addComponent(CERRARFORM)
                    .addComponent(botonActualizarParticipante))
                .addContainerGap())
        );

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
        CBNAC2.setSelectedIndex(0);
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
        CBNAC2.setSelectedIndex(0);
        setSelectedRelacion(cbrelacion, ficha.getNacionalidad1());
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
    private javax.swing.JComboBox<Nacionalidad> CBNAC2;
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField nombadresp;
    private javax.swing.JTextField respappat;
    private javax.swing.JTextField runresp1;
    private javax.swing.JTextField runresp2;
    // End of variables declaration//GEN-END:variables

    private FormularioRequest generarRequest() {
        FormularioRequest formularioRequest = new FormularioRequest();
        formularioRequest.setNombreparticipante(NOMPARTICIPANTE.getText());
        formularioRequest.setApelldpaternopart(APELPATPAR.getText());
        formularioRequest.setApelldmaternopart(APELMATPAR.getText());
        formularioRequest.setDomicilio(DOMPAR.getText());
        formularioRequest.setFonoparticipante(FONOPAR.getText());
        formularioRequest.setNombretiro1(Nombreresp1.getText());
        formularioRequest.setNombretiro2(Nombreresp2.getText());
        formularioRequest.setRun(RUNPAR.getText());
        formularioRequest.setApellmatadresp(apematresp.getText());
        formularioRequest.setDiradresp(dirresp.getText());
        formularioRequest.setFonoretiro1(fonoresp1.getText());
        formularioRequest.setFonoretiro2(fonoresp2.getText());
        formularioRequest.setNombreadresp(nombadresp.getText());
        formularioRequest.setApellpatadresp(respappat.getText());
        formularioRequest.setRunretiro1(runresp1.getText());
        formularioRequest.setRunretiro2(runresp2.getText());
        Genero genero = (Genero) CBGENERO.getSelectedItem();
        formularioRequest.setGenero(genero.getId());
        Curso curso = (Curso) CBCURSO.getSelectedItem();
        formularioRequest.setCurso(curso.getId());
        if (checkboxDiscapacidad.isSelected()) {
            Discapacidad discapacidad = (Discapacidad) CBESPDISC.getSelectedItem();
            formularioRequest.setTipodediscapacidad(discapacidad.getId());
        } else {
            formularioRequest.setTipodediscapacidad(null);
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
        formularioRequest.setNacionalidad1(nacionalidad.getId());
        Parentezco parentezco = (Parentezco) cbrelacion.getSelectedItem();
        formularioRequest.setParentezco(parentezco.getId());
        formularioRequest.setEmailadresp(emailresp.getText());
        formularioRequest.setFonoadresp(fonoresp.getText());
        formularioRequest.setEsdiscapacitado(checkboxDiscapacidad.isSelected());
        formularioRequest.setEsdepueblooriginario(checkboxPuebloOriginario.isSelected());
        Nacionalidad nacionalidaddos = (Nacionalidad) CBNAC2.getSelectedItem();
        formularioRequest.setNacionalidad1(nacionalidaddos.getId());
        formularioRequest.setFechanacparticipante(jDFechanacparticipante.getDate());
        return formularioRequest;
    }
}
