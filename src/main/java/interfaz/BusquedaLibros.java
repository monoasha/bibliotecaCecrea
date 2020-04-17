/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import funciones.Funciones;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Tablas.Libro;
import java.awt.Window;
import javax.swing.SwingUtilities;


/**
 *
 * @author Sofia
 */
public class BusquedaLibros extends javax.swing.JPanel {

    /**
     * Creates new form busquedalibros
     */
    public BusquedaLibros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrelibbusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLABUSQUEDA = new javax.swing.JTable();
        BUSQ = new javax.swing.JButton();
        cerrarbusq = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("BÚSQUEDA DE LIBROS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOMBRE LIBRO:");

        TABLABUSQUEDA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Libro", "Autor", "Fecha de Ingreso", "disponibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TABLABUSQUEDA);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrelibbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cerrarbusq)
                            .addComponent(BUSQ))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cerrarbusq))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUSQ)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombrelibbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BUSQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSQActionPerformed

        try {
            DefaultTableModel model = (DefaultTableModel) TABLABUSQUEDA.getModel();
            model.setRowCount(0);
            Object fila[] = new Object[6];
            ArrayList <Libro> libro= Funciones.buscarLibro(nombrelibbusqueda.getText());
            if (libro.isEmpty()) {
                System.out.println("No hay libros");
                return;
            }

            for (Libro l : libro) {
                fila[0] = l.getNombre();
                fila[1] = l.getautor();
                fila[2] = l.getfechadeingreso();
                fila[3] = l.getCategoria();
                fila[4] = l.getdisponibilidad();
                
                model.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println("Error en la busqueda de libros, error: " + e);
        }
        
    }//GEN-LAST:event_BUSQActionPerformed

    private void cerrarbusqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarbusqActionPerformed
     Window w = SwingUtilities.getWindowAncestor(BusquedaLibros.this);
       w.setVisible(false);
    new User().setVisible(true); 
    }//GEN-LAST:event_cerrarbusqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSQ;
    private javax.swing.JTable TABLABUSQUEDA;
    private javax.swing.JButton cerrarbusq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombrelibbusqueda;
    // End of variables declaration//GEN-END:variables
}
