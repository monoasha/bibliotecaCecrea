/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import dto.UserLogin;
import java.awt.BorderLayout;

/**
 *
 * @author Sofia
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    
    private UserLogin userLogin;
    
    public Admin(UserLogin userLogin) {
        this.userLogin = userLogin;
        initComponents();
        this.setTitle(" Sistema Interno Cecrea La Ligua");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ingresosolicitante = new javax.swing.JMenuItem();
        ingresarlibri = new javax.swing.JMenuItem();
        busquedalibros = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        agregarusuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ingresarprestamo = new javax.swing.JMenuItem();
        devolucionprestamo = new javax.swing.JMenuItem();
        modificareliminarfichas = new javax.swing.JMenu();
        ingresofichas = new javax.swing.JMenuItem();
        eliminareditarfichas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contenedor.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CECREA LA LIGUA- ");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap(393, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenu1.setText("MENU");

        ingresosolicitante.setText("INGRESO SOLICITANTE");
        ingresosolicitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosolicitanteActionPerformed(evt);
            }
        });
        jMenu1.add(ingresosolicitante);

        ingresarlibri.setText("INGRESO LIBROS");
        ingresarlibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarlibriActionPerformed(evt);
            }
        });
        jMenu1.add(ingresarlibri);

        busquedalibros.setText("BUSQUEDA DE LIBRO");
        busquedalibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedalibrosActionPerformed(evt);
            }
        });
        jMenu1.add(busquedalibros);

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("USUARIOS SISTEMA");
        jMenu4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        agregarusuarios.setText("AGREGAR USUARIOS");
        agregarusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarusuariosActionPerformed(evt);
            }
        });
        jMenu4.add(agregarusuarios);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("PRESTAMOS");
        jMenu2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ingresarprestamo.setText("INGRESAR PRESTAMO");
        ingresarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(ingresarprestamo);

        devolucionprestamo.setText("DEVOLUCION PRESTAMO");
        devolucionprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolucionprestamoActionPerformed(evt);
            }
        });
        jMenu2.add(devolucionprestamo);

        jMenuBar1.add(jMenu2);

        modificareliminarfichas.setText("FICHAS");
        modificareliminarfichas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        ingresofichas.setText("INGRESO FICHA CECREA");
        ingresofichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresofichasActionPerformed(evt);
            }
        });
        modificareliminarfichas.add(ingresofichas);

        eliminareditarfichas.setText("MODIFICAR / ELIMINAR FICHAS");
        eliminareditarfichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminareditarfichasActionPerformed(evt);
            }
        });
        modificareliminarfichas.add(eliminareditarfichas);

        jMenuBar1.add(modificareliminarfichas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarlibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarlibriActionPerformed
        IngresoLibros il = new IngresoLibros(userLogin);
        il.setSize(600, 600);
        il.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(il, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresarlibriActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void ingresosolicitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosolicitanteActionPerformed
        IngresoSolicitante iu = new IngresoSolicitante(userLogin);
        iu.setSize(600, 600);
        iu.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(iu, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresosolicitanteActionPerformed

    private void busquedalibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedalibrosActionPerformed
        BusquedaLibros bl = new BusquedaLibros(userLogin);
        bl.setSize(600, 600);
        bl.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(bl, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_busquedalibrosActionPerformed

    private void ingresarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarprestamoActionPerformed
        Prestamo p = new Prestamo(userLogin);
        this.setSize(620, 650);
        p.setSize(600, 600);
        p.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_ingresarprestamoActionPerformed

    private void ingresofichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresofichasActionPerformed
      new FormularioFichaCecrea().setVisible(true);
    }//GEN-LAST:event_ingresofichasActionPerformed

    private void devolucionprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolucionprestamoActionPerformed
        DevolucionPrestamo dp = new DevolucionPrestamo(userLogin);
        dp.setSize(600, 600);
        dp.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(dp, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_devolucionprestamoActionPerformed

    private void agregarusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarusuariosActionPerformed
        AgregarUsuarioCecrea aus = new AgregarUsuarioCecrea();
        aus.setSize(600, 600);
        aus.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(aus, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_agregarusuariosActionPerformed

    private void eliminareditarfichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminareditarfichasActionPerformed
        BusquedaFicha bf = new BusquedaFicha(userLogin);
        bf.setSize(700, 600);
        bf.setLocation(5, 5);
        contenedor.removeAll();
        contenedor.add(bf, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_eliminareditarfichasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarusuarios;
    private javax.swing.JMenuItem busquedalibros;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem devolucionprestamo;
    private javax.swing.JMenuItem eliminareditarfichas;
    private javax.swing.JMenuItem ingresarlibri;
    private javax.swing.JMenuItem ingresarprestamo;
    private javax.swing.JMenuItem ingresofichas;
    private javax.swing.JMenuItem ingresosolicitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu modificareliminarfichas;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
