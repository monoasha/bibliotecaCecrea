package interfaz;

import dto.ResumenFicha;
import dto.UserLogin;
import funciones.Funciones;
import static funciones.Funciones.consultarfichasencontradas;
import funciones.FuncionesFichaInscripcion;
import funciones.FuncionesPDF;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import tablas.FichaInscripcion;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

/**
 *
 * @author shofy
 */
public class BusquedaFicha extends javax.swing.JPanel {

    private UserLogin userLogin;

    public BusquedaFicha(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreparticipante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaBusquedaFicha = new javax.swing.JTable();
        BUSQ = new javax.swing.JButton();
        cerrarbusq = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGenerarPDF = new javax.swing.JButton();
        labelfichas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("BÚSQUEDA DE FICHA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE PARTICIPANTE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 155, -1));

        nombreparticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreparticipanteActionPerformed(evt);
            }
        });
        add(nombreparticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 81, 375, -1));

        tablaBusquedaFicha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Rut"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBusquedaFicha.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablaBusquedaFicha);
        tablaBusquedaFicha.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablaBusquedaFicha.getColumnModel().getColumnCount() > 0) {
            tablaBusquedaFicha.getColumnModel().getColumn(0).setMinWidth(50);
            tablaBusquedaFicha.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaBusquedaFicha.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaBusquedaFicha.getColumnModel().getColumn(1).setMinWidth(250);
            tablaBusquedaFicha.getColumnModel().getColumn(1).setPreferredWidth(200);
            tablaBusquedaFicha.getColumnModel().getColumn(1).setMaxWidth(500);
            tablaBusquedaFicha.getColumnModel().getColumn(2).setMinWidth(50);
            tablaBusquedaFicha.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaBusquedaFicha.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 680, 300));

        BUSQ.setText("BUSCAR");
        BUSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSQActionPerformed(evt);
            }
        });
        add(BUSQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 78, 129, -1));

        cerrarbusq.setText("CERRAR");
        cerrarbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarbusqActionPerformed(evt);
            }
        });
        add(cerrarbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 130, -1));

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 6, 124, 27));

        botonEditar.setText("Ver/Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });
        add(botonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, -1));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 90, -1));

        botonGenerarPDF.setText("Generar PDF");
        botonGenerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarPDFActionPerformed(evt);
            }
        });
        add(botonGenerarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 110, -1));

        labelfichas.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        add(labelfichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 400, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void BUSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) tablaBusquedaFicha.getModel();
            model.setRowCount(0);
            List<ResumenFicha> fichas = Funciones.buscarficha(nombreparticipante.getText());
            if (fichas.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay fichas");
                return;
            }

            String fila[] = new String[3];
            for (ResumenFicha fr : fichas) {
                fila[0] = fr.getId().toString();
                fila[1] = fr.getNombreparticipante() + " " + fr.getApelldpaternopart() + " " + fr.getApelldmaternopart();
                fila[2] = fr.getRun();
                model.addRow(fila);
            }
           
        } catch (Exception e) {
            System.out.println("Error al cargar tabla con las fichas, error: " + e);
        }
              labelfichas.setText("fichas encontradas: " +consultarfichasencontradas().toString());
    }//GEN-LAST:event_BUSQActionPerformed

    private void cerrarbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarbusqActionPerformed
        Window w = SwingUtilities.getWindowAncestor(BusquedaFicha.this);
        w.setVisible(false);
        if (userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        }
    }//GEN-LAST:event_cerrarbusqActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        Long idFicha = Long.parseLong(tablaBusquedaFicha.getValueAt(tablaBusquedaFicha.getSelectedRow(), 0).toString());
        new FormularioFichaCecrea(idFicha).setVisible(true);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaBusquedaFicha.getModel();
        Long idFicha = Long.parseLong(tablaBusquedaFicha.getValueAt(tablaBusquedaFicha.getSelectedRow(), 0).toString());

        if (idFicha == null) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opción", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
            Funciones.eliminarparticipante(idFicha);

            model.removeRow(tablaBusquedaFicha.getSelectedRow());
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void nombreparticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreparticipanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreparticipanteActionPerformed

    private void botonGenerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarPDFActionPerformed
        // TODO add your handling code here:
        Long idFicha = Long.parseLong(tablaBusquedaFicha.getValueAt(tablaBusquedaFicha.getSelectedRow(), 0).toString());
        FichaInscripcion ficha = FuncionesFichaInscripcion.buscarFichaPorId(idFicha);
        FuncionesPDF.generarPDFFichaCecrea(ficha);
    }//GEN-LAST:event_botonGenerarPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSQ;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGenerarPDF;
    private javax.swing.JButton cerrarbusq;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelfichas;
    private javax.swing.JTextField nombreparticipante;
    private javax.swing.JTable tablaBusquedaFicha;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
