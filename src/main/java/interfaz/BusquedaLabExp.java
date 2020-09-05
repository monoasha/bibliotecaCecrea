package interfaz;

import dto.ResumenFicha;
import dto.UserLogin;
import funciones.Funciones;
import static funciones.Funciones.consultarfichasencontradas;
import static funciones.Funciones.consultarlaboratoriosyexperiencias;
import funciones.FuncionesPDF;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import tablas.FichaInscripcion;
import tablas.ComponenteProgramatico;
import static vo.CargoVO.CARGO_ADMIN;
import static vo.CargoVO.CARGO_USER;

/**
 *
 * @author shofy
 */
public class BusquedaLabExp extends javax.swing.JPanel {

    private UserLogin userLogin;

    public BusquedaLabExp(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrelabexp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablabusquedalab = new javax.swing.JTable();
        BUSQ = new javax.swing.JButton();
        cerrarbusq = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        labelLabyExp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("BÚSQUEDA LABORATORIOS & EXPERIENCIAS:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE DEL LABORATORIO O EXPERIENCIA :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 51, 280, -1));

        nombrelabexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrelabexpActionPerformed(evt);
            }
        });
        add(nombrelabexp, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 81, 375, -1));

        tablabusquedalab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Nombre Facilitador", "tipo", "Mes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablabusquedalab.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tablabusquedalab);
        tablabusquedalab.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tablabusquedalab.getColumnModel().getColumnCount() > 0) {
            tablabusquedalab.getColumnModel().getColumn(0).setMinWidth(55);
            tablabusquedalab.getColumnModel().getColumn(0).setPreferredWidth(20);
            tablabusquedalab.getColumnModel().getColumn(0).setMaxWidth(60);
            tablabusquedalab.getColumnModel().getColumn(1).setMinWidth(200);
            tablabusquedalab.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablabusquedalab.getColumnModel().getColumn(1).setMaxWidth(250);
            tablabusquedalab.getColumnModel().getColumn(2).setMinWidth(60);
            tablabusquedalab.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablabusquedalab.getColumnModel().getColumn(2).setMaxWidth(150);
            tablabusquedalab.getColumnModel().getColumn(3).setMinWidth(100);
            tablabusquedalab.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablabusquedalab.getColumnModel().getColumn(3).setMaxWidth(150);
            tablabusquedalab.getColumnModel().getColumn(4).setMinWidth(100);
            tablabusquedalab.getColumnModel().getColumn(4).setPreferredWidth(80);
            tablabusquedalab.getColumnModel().getColumn(4).setMaxWidth(150);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 730, 299));

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
        add(cerrarbusq, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 130, -1));

        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 6, 124, 27));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, -1));

        labelLabyExp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        add(labelLabyExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BUSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) tablabusquedalab.getModel();
            model.setRowCount(0);
            List<ComponenteProgramatico> labexp = Funciones.buscarLab(nombrelabexp.getText());
            if (labexp.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se han encontrado laboratorios o experiencias");
                return;
            }

            String fila[] = new String[5];
            for (ComponenteProgramatico le : labexp) {
                fila[0] = le.getId().toString();
                fila[1] = le.getNombre();
                fila[2] = le.getNombrefacilitador();
                fila[3]=le.getTipo();
                fila[4]=le.getMes();
                model.addRow(fila);
            }

        } catch (Exception e) {
            System.out.println("Error al cargar tabla con laboratorios o experiencias, error: " + e);
        }
   labelLabyExp.setText(" Total de laboratorios y experiencias ingresadas: " +consultarlaboratoriosyexperiencias().toString());
    }//GEN-LAST:event_BUSQActionPerformed

    private void cerrarbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarbusqActionPerformed
        Window w = SwingUtilities.getWindowAncestor(BusquedaLabExp.this);
        w.setVisible(false);
        if (userLogin.getCargo().equals(CARGO_ADMIN)) {
            new Admin(userLogin).setVisible(true);
        } else if (userLogin.getCargo().equals(CARGO_USER)) {
            new User(userLogin).setVisible(true);
        }
    }//GEN-LAST:event_cerrarbusqActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablabusquedalab.getModel();
        Long idFicha = Long.parseLong(tablabusquedalab.getValueAt(tablabusquedalab.getSelectedRow(), 0).toString());

        if (idFicha == null) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna opción", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro?", "Alerta", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                Funciones.eliminarlabexp(idFicha);
                model.removeRow(tablabusquedalab.getSelectedRow());
            }
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void nombrelabexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrelabexpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrelabexpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSQ;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton cerrarbusq;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLabyExp;
    private javax.swing.JTextField nombrelabexp;
    private javax.swing.JTable tablabusquedalab;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
