/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author xlOnly
 */
public class ExprecrionesView extends javax.swing.JFrame {

    /**
     * Creates new form ExprionesView
     */
    public ExprecrionesView() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Expreciones1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Expresiones2 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        verinfo1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        run1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        code2 = new javax.swing.JTextPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        verinfo2 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        run2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        menos = new javax.swing.JButton();
        mas = new javax.swing.JButton();
        por = new javax.swing.JButton();
        dividido = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        seecode = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        letsgo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 748));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 748));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setLayout(null);

        Expreciones1.setColumns(20);
        Expreciones1.setRows(5);
        Expreciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(Expreciones1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(41, 148, 413, 140);

        jLabel3.setText("¿Que son los operadores logicos y de comparacion?");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(41, 299, 344, 22);

        jLabel4.setText("¿Que es una exprecion aritmetica?");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(41, 120, 355, 22);

        Expresiones2.setColumns(20);
        Expresiones2.setRows(5);
        Expresiones2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(Expresiones2);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(41, 334, 413, 140);

        jScrollPane6.setViewportView(jPanel2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 70, 500, 600);

        jPanel7.setBackground(new java.awt.Color(252, 252, 252));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));

        code.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code.setFocusable(false);
        jScrollPane4.setViewportView(code);

        verinfo1.setColumns(20);
        verinfo1.setRows(5);
        verinfo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo1.setFocusable(false);
        jScrollPane2.setViewportView(verinfo1);

        jLabel1.setText("Consola");

        run1.setText("Ejecutar");
        run1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo #1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));

        code2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code2.setFocusable(false);
        jScrollPane9.setViewportView(code2);

        verinfo2.setColumns(20);
        verinfo2.setRows(5);
        verinfo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo2.setFocusable(false);
        jScrollPane10.setViewportView(verinfo2);

        jLabel18.setText("Consola");

        run2.setText("Ejecutar");
        run2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo #2", jPanel4);

        jLabel7.setText("Ejemplos");

        jButton2.setText("ayuda");

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(null);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/operaciones3[1].png"))); // NOI18N
        jPanel6.add(jLabel5);
        jLabel5.setBounds(10, 20, 410, 200);

        jLabel16.setText("operadores logicos y comparacion");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(10, 0, 200, 22);

        jPanel10.setBackground(new java.awt.Color(252, 252, 252));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel5.setLayout(null);

        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setFocusable(false);
        jPanel5.add(resultado);
        resultado.setBounds(170, 50, 90, 30);

        num1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(num1);
        num1.setBounds(10, 50, 60, 30);

        num2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(num2);
        num2.setBounds(80, 50, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("=");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(150, 50, 30, 30);

        menos.setText("-");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });
        jPanel5.add(menos);
        menos.setBounds(30, 130, 40, 30);

        mas.setText("+");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });
        jPanel5.add(mas);
        mas.setBounds(30, 90, 40, 30);

        por.setText("*");
        por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porActionPerformed(evt);
            }
        });
        jPanel5.add(por);
        por.setBounds(90, 90, 40, 30);

        dividido.setText("/");
        dividido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divididoActionPerformed(evt);
            }
        });
        jPanel5.add(dividido);
        dividido.setBounds(90, 130, 40, 30);

        jLabel10.setText("Calculadora con operaciones basicas");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 0, 190, 20);

        seecode.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        seecode.setText("Ver codigo ");
        jPanel5.add(seecode);
        seecode.setBounds(170, 100, 90, 60);

        jScrollPane7.setViewportView(jPanel5);

        jLabel15.setText("Expreciones Matematicas basicas");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(415, 415, 415)
                        .addComponent(jButton2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane13.setViewportView(jPanel7);

        jPanel1.add(jScrollPane13);
        jScrollPane13.setBounds(510, 70, 630, 600);

        letsgo.setText("Vamos alla");
        jPanel1.add(letsgo);
        letsgo.setBounds(490, 700, 150, 23);

        jLabel8.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 670, 440, 30);

        menu.setText("Menu");
        jPanel1.add(menu);
        menu.setBounds(1040, 700, 73, 23);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel2.setText("Expreciones matematicas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 250, 30);

        jLabel6.setBackground(new java.awt.Color(252, 252, 252));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(980, 0, 160, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1146, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void run1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run1ActionPerformed

    }//GEN-LAST:event_run1ActionPerformed

    private void run2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run2ActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed
        String res = ""+(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText()));
        resultado.setText(res);
    }//GEN-LAST:event_masActionPerformed

    private void porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porActionPerformed
        String res = ""+(Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText()));
        resultado.setText(res);
    }//GEN-LAST:event_porActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed
        String res = ""+(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText()));
        resultado.setText(res);
    }//GEN-LAST:event_menosActionPerformed

    private void divididoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divididoActionPerformed
        String res = ""+(Float.parseFloat(num1.getText()) / Float.parseFloat(num2.getText()));
        resultado.setText(res);
    }//GEN-LAST:event_divididoActionPerformed

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
            java.util.logging.Logger.getLogger(ExprecrionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExprecrionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExprecrionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExprecrionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExprecrionesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Expreciones1;
    public javax.swing.JTextArea Expresiones2;
    public javax.swing.JTextPane code;
    public javax.swing.JTextPane code2;
    public javax.swing.JButton dividido;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton letsgo;
    public javax.swing.JButton mas;
    public javax.swing.JButton menos;
    public javax.swing.JButton menu;
    public javax.swing.JTextField num1;
    public javax.swing.JTextField num2;
    public javax.swing.JButton por;
    public javax.swing.JTextField resultado;
    public javax.swing.JButton run1;
    public javax.swing.JButton run2;
    public javax.swing.JButton seecode;
    public javax.swing.JTextArea verinfo1;
    public javax.swing.JTextArea verinfo2;
    // End of variables declaration//GEN-END:variables
}
