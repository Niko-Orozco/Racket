/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Niko
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        setResizable(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        introduccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        funciones = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        condicionales = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        expreciones = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        recursividad = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        caracteres = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        cadenas = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        vectores = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        listas_Pares = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        estructuras = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        grafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(237, 236, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Dr. Racket Study Tool");

        jPanel9.setBackground(new java.awt.Color(51, 255, 255));
        jPanel9.setLayout(null);

        introduccion.setText(" Introducción");
        jPanel9.add(introduccion);
        introduccion.setBounds(50, 320, 260, 40);

        jLabel2.setText("aqui la imagen");
        jPanel9.add(jLabel2);
        jLabel2.setBounds(0, 0, 350, 380);

        jPanel10.setBackground(new java.awt.Color(51, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel10.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel10.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel10.setLayout(null);

        funciones.setText("Funciones");
        funciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionesActionPerformed(evt);
            }
        });
        jPanel10.add(funciones);
        funciones.setBounds(50, 320, 260, 40);

        jLabel3.setText("[355, 383]");
        jPanel10.add(jLabel3);
        jLabel3.setBounds(0, 0, 350, 380);

        jPanel12.setBackground(new java.awt.Color(51, 255, 255));
        jPanel12.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel12.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel12.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel12.setLayout(null);

        condicionales.setText("Condicionales");
        jPanel12.add(condicionales);
        condicionales.setBounds(50, 320, 260, 40);

        jLabel5.setText("jLabel2");
        jPanel12.add(jLabel5);
        jLabel5.setBounds(0, 0, 350, 380);

        jPanel13.setBackground(new java.awt.Color(51, 255, 255));
        jPanel13.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel13.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel13.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel13.setLayout(null);

        expreciones.setText("Expreciones Matematicas");
        jPanel13.add(expreciones);
        expreciones.setBounds(50, 320, 260, 40);

        jLabel6.setText("jLabel2");
        jPanel13.add(jLabel6);
        jLabel6.setBounds(0, 0, 350, 380);

        jPanel14.setBackground(new java.awt.Color(51, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel14.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel14.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel14.setLayout(null);

        jLabel7.setText("jLabel2");
        jPanel14.add(jLabel7);
        jLabel7.setBounds(0, 0, 350, 380);

        recursividad.setText("Recursividad");
        recursividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursividadActionPerformed(evt);
            }
        });
        jPanel14.add(recursividad);
        recursividad.setBounds(50, 320, 260, 40);

        jPanel15.setBackground(new java.awt.Color(51, 255, 255));
        jPanel15.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel15.setMinimumSize(new java.awt.Dimension(355, 383));

        jLabel8.setText("tampoco");

        caracteres.setText("Caracteres y Documentacion");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(caracteres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel16.setBackground(new java.awt.Color(51, 255, 255));
        jPanel16.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel16.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel16.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel16.setRequestFocusEnabled(false);
        jPanel16.setVerifyInputWhenFocusTarget(false);
        jPanel16.setLayout(null);

        cadenas.setText("Cadenas/Strings");
        jPanel16.add(cadenas);
        cadenas.setBounds(50, 310, 260, 40);

        jLabel9.setText("jLabel2");
        jPanel16.add(jLabel9);
        jLabel9.setBounds(0, 0, 350, 380);

        jPanel17.setBackground(new java.awt.Color(51, 255, 255));
        jPanel17.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel17.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel17.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel17.setLayout(null);

        vectores.setText("Vectores");
        vectores.setMaximumSize(new java.awt.Dimension(103, 29));
        vectores.setMinimumSize(new java.awt.Dimension(103, 29));
        vectores.setPreferredSize(new java.awt.Dimension(103, 29));
        vectores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vectoresActionPerformed(evt);
            }
        });
        jPanel17.add(vectores);
        vectores.setBounds(50, 310, 260, 40);

        jLabel10.setText("jLabel2");
        jPanel17.add(jLabel10);
        jLabel10.setBounds(0, 0, 350, 380);

        jPanel18.setBackground(new java.awt.Color(51, 255, 255));
        jPanel18.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel18.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel18.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel18.setLayout(null);

        listas_Pares.setBackground(new java.awt.Color(255, 255, 255));
        listas_Pares.setText("Listas/Pares");
        listas_Pares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listas_ParesActionPerformed(evt);
            }
        });
        jPanel18.add(listas_Pares);
        listas_Pares.setBounds(50, 310, 260, 40);

        jLabel11.setText("jLabel2");
        jPanel18.add(jLabel11);
        jLabel11.setBounds(0, 0, 350, 380);

        jPanel19.setBackground(new java.awt.Color(51, 255, 255));
        jPanel19.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel19.setMinimumSize(new java.awt.Dimension(355, 383));
        jPanel19.setPreferredSize(new java.awt.Dimension(355, 383));
        jPanel19.setLayout(null);

        estructuras.setText("Estructuras de datos");
        jPanel19.add(estructuras);
        estructuras.setBounds(50, 310, 260, 40);

        jLabel12.setText("jLabel2");
        jPanel19.add(jLabel12);
        jLabel12.setBounds(0, 0, 350, 380);

        jPanel20.setBackground(new java.awt.Color(51, 255, 255));
        jPanel20.setMaximumSize(new java.awt.Dimension(355, 383));
        jPanel20.setMinimumSize(new java.awt.Dimension(355, 383));

        jLabel13.setText("la ultima");

        grafico.setText("Modo Grafico");
        grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addComponent(grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(755, 755, 755)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionesActionPerformed

    private void vectoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vectoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vectoresActionPerformed

    private void graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_graficoActionPerformed

    private void recursividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recursividadActionPerformed

    private void listas_ParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listas_ParesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listas_ParesActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cadenas;
    public javax.swing.JButton caracteres;
    public javax.swing.JButton condicionales;
    public javax.swing.JButton estructuras;
    public javax.swing.JButton expreciones;
    public javax.swing.JButton funciones;
    public javax.swing.JButton grafico;
    public javax.swing.JButton introduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton listas_Pares;
    public javax.swing.JButton recursividad;
    public javax.swing.JButton vectores;
    // End of variables declaration//GEN-END:variables
}
