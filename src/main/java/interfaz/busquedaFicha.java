
package interfaz;

import dto.ResumenFicha;
import funciones.Funciones;
import java.awt.Window;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shofy
 */
public class BusquedaFicha extends javax.swing.JPanel {

  
    public BusquedaFicha() {
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
        TABLABUSQUEDAficha = new javax.swing.JTable();
        BUSQ = new javax.swing.JButton();
        cerrarbusq = new javax.swing.JButton();
        eliminarficha = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("BÚSQUEDA DE FICHA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE PARTICIPANTE:");

        TABLABUSQUEDAficha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nom Participante", "ApPaterno", "ApMaterno", "Rut"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(TABLABUSQUEDAficha);

        BUSQ.setText("BUSCAR");
        BUSQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSQActionPerformed(evt);
            }
        });

        cerrarbusq.setText("CERRAR");
        cerrarbusq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarbusqActionPerformed(evt);
            }
        });

        eliminarficha.setText("ELIMINAR");
        eliminarficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarfichaActionPerformed(evt);
            }
        });

        jButton2.setText("MODIFICAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eliminarficha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BUSQ, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(cerrarbusq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreparticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cerrarbusq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUSQ)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarficha)
                        .addContainerGap(190, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BUSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) TABLABUSQUEDAficha.getModel();
            model.setRowCount(0);
            Object fila[] = new Object[6];
            List <ResumenFicha> fichas = Funciones.buscarficha(nombreparticipante.getText());
            if (fichas.isEmpty()) {
               JOptionPane.showInputDialog(null,"No hay fichas");
                return;
            }

            for (ResumenFicha fr : fichas) {
                fila[0] = fr.getId();
                fila[1]=fr.getNombreparticipante();
                fila[2]=fr.getApelldpaternopart();
                fila[3]=fr.getApelldmaternopart();
                fila[4]=fr.getRun();

                model.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println("Error en la busqueda de fichas, error: " + e);
        }

    }//GEN-LAST:event_BUSQActionPerformed

    private void cerrarbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarbusqActionPerformed
        Window w = SwingUtilities.getWindowAncestor(BusquedaFicha.this);
        w.setVisible(false);
        new User().setVisible(true);
    }//GEN-LAST:event_cerrarbusqActionPerformed

    private void eliminarfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarfichaActionPerformed
String nombre=nombreparticipante.getText();
        Funciones.eliminarficha(nombre);
        JOptionPane.showMessageDialog(null,"Se ha eliminado la ficha");
    }//GEN-LAST:event_eliminarfichaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSQ;
    private javax.swing.JTable TABLABUSQUEDAficha;
    private javax.swing.JButton cerrarbusq;
    private javax.swing.JButton eliminarficha;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreparticipante;
    // End of variables declaration//GEN-END:variables
}
