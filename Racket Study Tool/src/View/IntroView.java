/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.SimuladorArbolBinario;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Niko
 */
public class IntroView extends javax.swing.JFrame {

    private SimuladorArbolBinario simulador = new SimuladorArbolBinario();

    /**
     * Creates new form Gui
     */
    public IntroView() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/racket-icon.png")).getImage());
        this.inicializar(false);
        PanelFondo F = new PanelFondo();
        this.add(F, BorderLayout.CENTER);
        this.pack();
        
        

    }

    private void inicializar(boolean enable) {
        this.opciones.setEnabled(enable);

        this.cmdBuscar.setEnabled(enable);

        this.botonBorrar.setEnabled(enable);



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        intro5 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        intro6 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        intro7 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        intro8 = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        botonInsertar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox();
        cmdBuscar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCnodos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblChojas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblVmenor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblVmayor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        letsgo = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));
        jPanel6.setMaximumSize(new java.awt.Dimension(1090, 748));
        jPanel6.setMinimumSize(new java.awt.Dimension(1090, 748));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(252, 252, 252));

        intro5.setColumns(20);
        intro5.setRows(5);
        intro5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        intro5.setFocusable(false);
        jScrollPane4.setViewportView(intro5);

        jLabel7.setText("¿Que es Dr.Racket?");
        jLabel7.setFocusable(false);

        jLabel8.setText("¿Que es la programacion funcional?");
        jLabel8.setFocusable(false);

        intro6.setColumns(20);
        intro6.setRows(5);
        intro6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        intro6.setFocusable(false);
        jScrollPane9.setViewportView(intro6);

        jLabel13.setText("Paradigmas de la programacion");
        jLabel13.setFocusable(false);

        intro7.setColumns(20);
        intro7.setRows(5);
        intro7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        intro7.setFocusable(false);
        jScrollPane10.setViewportView(intro7);

        intro8.setColumns(20);
        intro8.setRows(5);
        intro8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane11.setViewportView(intro8);

        jLabel14.setText("Notaciones");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel7);

        jPanel6.add(jScrollPane7);
        jScrollPane7.setBounds(10, 70, 500, 600);

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setLayout(null);

        jLabel9.setText("Ejemplos");
        jLabel9.setFocusable(false);
        jPanel8.add(jLabel9);
        jLabel9.setBounds(12, 15, 81, 19);

        jButton2.setText("ayuda");
        jButton2.setFocusable(false);
        jPanel8.add(jButton2);
        jButton2.setBounds(623, 10, 80, 23);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel3.setFocusable(false);
        jPanel3.setOpaque(false);

        botonInsertar.setBackground(new java.awt.Color(255, 255, 255));
        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.setFocusable(false);
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        opciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RECORRIDO", "InOrden", "PreOrden", "PosOrden", "PorNiveles", "NivelOrdenado" }));
        opciones.setFocusable(false);
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        cmdBuscar.setBackground(new java.awt.Color(255, 255, 255));
        cmdBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdBuscar.setText("Buscar");
        cmdBuscar.setFocusable(false);
        cmdBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBuscarActionPerformed(evt);
            }
        });

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrar.setText("Borrar");
        botonBorrar.setFocusable(false);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(cmdBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(opciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdBuscar)
                    .addComponent(botonBorrar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 350, 670, 109);

        jDesktopPane1.setBackground(new java.awt.Color(255, 0, 0));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDesktopPane1.setForeground(new java.awt.Color(255, 0, 0));
        jDesktopPane1.setFocusable(false);
        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setBackground(new java.awt.Color(252, 252, 252));
        jInternalFrame2.setBorder(null);
        jInternalFrame2.setForeground(new java.awt.Color(255, 0, 0));
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setFocusable(false);
        jInternalFrame2.setVisible(true);

        jLabel10.setText("Tipos de notacion");
        jLabel10.setFocusable(false);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 308, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(-10, -30, 450, 360);

        jPanel2.add(jDesktopPane1);
        jDesktopPane1.setBounds(11, 10, 430, 320);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        jLabel1.setText("Cantidad Nodos");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 11, 76, 14);

        lblCnodos.setEditable(false);
        jPanel4.add(lblCnodos);
        lblCnodos.setBounds(10, 31, 40, 20);

        jLabel2.setText("Cantidad Hojas");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 62, 73, 14);

        lblChojas.setEditable(false);
        jPanel4.add(lblChojas);
        lblChojas.setBounds(10, 87, 40, 20);

        jLabel3.setText("Valor Menor");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 118, 57, 14);

        lblVmenor.setEditable(false);
        jPanel4.add(lblVmenor);
        lblVmenor.setBounds(10, 143, 40, 20);

        jLabel4.setText("Valor Mayor");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 181, 57, 14);

        lblVmayor.setEditable(false);
        jPanel4.add(lblVmayor);
        lblVmayor.setBounds(10, 201, 40, 20);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(687, 26, 0, 0);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setRows(5);
        impresion.setAutoscrolls(false);
        impresion.setFocusable(false);
        jScrollPane1.setViewportView(impresion);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(450, 20, 230, 310);

        jPanel8.add(jPanel2);
        jPanel2.setBounds(20, 90, 690, 460);

        jScrollPane13.setViewportView(jPanel8);

        jPanel6.add(jScrollPane13);
        jScrollPane13.setBounds(510, 70, 730, 600);

        letsgo.setText("Vamos alla");
        letsgo.setFocusable(false);
        letsgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letsgoActionPerformed(evt);
            }
        });
        jPanel6.add(letsgo);
        letsgo.setBounds(530, 700, 150, 23);

        jLabel17.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jLabel17.setFocusable(false);
        jPanel6.add(jLabel17);
        jLabel17.setBounds(410, 670, 580, 30);

        menu.setText("Menu");
        menu.setFocusable(false);
        jPanel6.add(menu);
        menu.setBounds(1160, 690, 73, 23);

        jLabel18.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel18.setText("Introduccion");
        jLabel18.setFocusable(false);
        jPanel6.add(jLabel18);
        jLabel18.setBounds(10, 20, 250, 30);

        jLabel19.setBackground(new java.awt.Color(252, 252, 252));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel6.add(jLabel19);
        jLabel19.setBounds(1080, 0, 160, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1251, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para insertar:"));
            if (this.simulador.insertar(dato)) {
                JOptionPane.showMessageDialog(null, "El dato fue insertado correctamente", " ...", 1);
                this.inicializar(true);

                complementos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        Object opcion = this.opciones.getSelectedItem();
        String recorrido = null;
        if (opcion.equals("InOrden")) {
            recorrido = this.simulador.inOrden();
        }
        if (opcion.equals("PreOrden")) {
            recorrido = this.simulador.preOrden();
        }
        if (opcion.equals("PosOrden")) {
            recorrido = this.simulador.posOrden();
        }
        if (opcion.equals("PorNiveles")) {
            recorrido = this.simulador.imprimirPorNiveles();
        }
        if (opcion.equals("NivelOrdenado")) {
            recorrido = this.simulador.porNivel();
        }
        this.impresion.setText("");
        this.impresion.setText(recorrido);
    }//GEN-LAST:event_opcionesActionPerformed

    private void cmdBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBuscarActionPerformed
        int dato_a_buscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un dato a buscar en el arbol:"));
        String salida = this.simulador.esta(dato_a_buscar);
        this.impresion.setText("");
        this.impresion.setText(salida);
    }//GEN-LAST:event_cmdBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        try {
            int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite dato entero para borrar: "));
            this.impresion.setText(this.simulador.borrar(dato));

            complementos();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void letsgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letsgoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letsgoActionPerformed

    public void complementos(){
        this.repintarArbol();
        this.lblCnodos.setText("");
        this.lblCnodos.setText(this.simulador.CantidadNodos());

        this.lblChojas.setText("");
        this.lblChojas.setText(this.simulador.CantidadHojas());

        this.lblVmenor.setText("");
        this.lblVmenor.setText(this.simulador.menorValor());

        this.lblVmayor.setText("");
        this.lblVmayor.setText(this.simulador.mayorValor());
    }
    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tamaño = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Representación gráfica", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tamaño);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.add(this.simulador.getDibujo(), BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton cmdBuscar;
    public javax.swing.JTextArea impresion;
    public javax.swing.JTextArea intro5;
    public javax.swing.JTextArea intro6;
    public javax.swing.JTextArea intro7;
    public javax.swing.JTextArea intro8;
    public javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField lblChojas;
    private javax.swing.JTextField lblCnodos;
    private javax.swing.JTextField lblVmayor;
    private javax.swing.JTextField lblVmenor;
    public javax.swing.JButton letsgo;
    public javax.swing.JButton menu;
    private javax.swing.JComboBox opciones;
    // End of variables declaration//GEN-END:variables
}
