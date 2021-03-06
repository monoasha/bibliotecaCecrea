package interfaz;

import dto.UserLogin;
import funciones.Funciones;
import java.awt.Window;
import java.sql.Date;
import javax.swing.SwingUtilities;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

public class IngresoSolicitante extends javax.swing.JPanel {

    private UserLogin userLogin;
    
    public IngresoSolicitante(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        cerraringresosolicitante = new javax.swing.JButton();
        direccionsolicitante = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreapsolicitante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonosolicitante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btningsolicitante = new javax.swing.JToggleButton();
        APELLIDOPAT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NOMBRESOLICITANTE = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rutsolicitante = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        APELLIDOMAT = new javax.swing.JTextField();
        fechanac = new com.toedter.calendar.JDateChooser();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(0, 153, 255));
        setPreferredSize(new java.awt.Dimension(493, 421));

        cerraringresosolicitante.setText("CERRAR");
        cerraringresosolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerraringresosolicitanteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("NOMBRES:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FECHA NAC:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("DIRECCION :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("NOMBRE APODERADO :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("TELEFONO :");

        btningsolicitante.setText("REGISTRAR");
        btningsolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningsolicitanteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText(" FICHA INGRESO SOLICITANTES");

        NOMBRESOLICITANTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRESOLICITANTEActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("RUT:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("APELLIDO MATERNO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerraringresosolicitante))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btningsolicitante))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(telefonosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreapsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(direccionsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(rutsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(APELLIDOMAT)
                                    .addComponent(APELLIDOPAT)
                                    .addComponent(NOMBRESOLICITANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cerraringresosolicitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NOMBRESOLICITANTE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APELLIDOPAT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APELLIDOMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rutsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreapsolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonosolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btningsolicitante)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btningsolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningsolicitanteActionPerformed

        String nombre = NOMBRESOLICITANTE.getText();
        String apellidoPAT = APELLIDOPAT.getText();
        String apellidomat = APELLIDOMAT.getText();
        String rut = rutsolicitante.getText();
        String direccion = direccionsolicitante.getText();
        String telefono = telefonosolicitante.getText();
        String apoderado = nombreapsolicitante.getText();
        Long fecha = fechanac.getDate().getTime();
        
        Funciones.validarRut(rut);
                  
        Funciones.agregarSolicitante(nombre, apellidoPAT, apellidomat, rut, new Date(fecha), direccion, telefono, apoderado);
        limpiarcajas();
        
        NOMBRESOLICITANTE.requestFocus();
    }//GEN-LAST:event_btningsolicitanteActionPerformed

    private void NOMBRESOLICITANTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRESOLICITANTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRESOLICITANTEActionPerformed

    private void cerraringresosolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerraringresosolicitanteActionPerformed
      Window w = SwingUtilities.getWindowAncestor(IngresoSolicitante.this);
       w.setVisible(false);
        if (userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        } 
        
        
    }//GEN-LAST:event_cerraringresosolicitanteActionPerformed
   private void limpiarcajas() {

        NOMBRESOLICITANTE.setText(null);
        APELLIDOPAT.setText(null);
        APELLIDOMAT.setText(null);
        rutsolicitante.setText(null);
        direccionsolicitante.setText(null);
        nombreapsolicitante.setText(null);
        telefonosolicitante.setText(null);
        fechanac.setCalendar(null);
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField APELLIDOMAT;
    private javax.swing.JTextField APELLIDOPAT;
    private javax.swing.JTextField NOMBRESOLICITANTE;
    private javax.swing.JToggleButton btningsolicitante;
    private javax.swing.JButton cerraringresosolicitante;
    private javax.swing.JTextField direccionsolicitante;
    private com.toedter.calendar.JDateChooser fechanac;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField nombreapsolicitante;
    private javax.swing.JTextField rutsolicitante;
    private javax.swing.JTextField telefonosolicitante;
    // End of variables declaration//GEN-END:variables
}
