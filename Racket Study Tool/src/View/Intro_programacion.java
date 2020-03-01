/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;

/**
 *
 * @author ALEJO
 */
public class Intro_programacion extends javax.swing.JFrame {

    /**
     * Creates new form Intro_programacion
     */
    public Intro_programacion() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/racket-icon.png")).getImage());
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
        jLabel1 = new javax.swing.JLabel();
        funciones = new javax.swing.JButton();
        introduccion = new javax.swing.JButton();
        recursividad = new javax.swing.JButton();
        condicionales = new javax.swing.JButton();
        expreciones = new javax.swing.JButton();
        caracteres = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dr. Racket Study Tool");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 10, 250, 50);

        funciones.setText("Que es la programacíon");
        funciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionesActionPerformed(evt);
            }
        });
        jPanel1.add(funciones);
        funciones.setBounds(220, 190, 450, 40);

        introduccion.setText(" Introducción");
        jPanel1.add(introduccion);
        introduccion.setBounds(220, 130, 450, 40);

        recursividad.setText("Notación preorden, recorrido de arbol binario");
        recursividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recursividadActionPerformed(evt);
            }
        });
        jPanel1.add(recursividad);
        recursividad.setBounds(220, 450, 450, 40);

        condicionales.setText("Conceptos fundamentales de programación funcional");
        jPanel1.add(condicionales);
        condicionales.setBounds(220, 380, 450, 40);

        expreciones.setText("Paradigmas de programación");
        jPanel1.add(expreciones);
        expreciones.setBounds(220, 320, 450, 40);

        caracteres.setText("Actividades");
        jPanel1.add(caracteres);
        caracteres.setBounds(220, 520, 450, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Atras.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1);
        jButton1.setBounds(780, 540, 80, 67);
        jButton1.getAccessibleContext().setAccessibleName("atras");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Racket book image.jpeg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 860, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void funcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionesActionPerformed

    private void recursividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recursividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recursividadActionPerformed

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
            java.util.logging.Logger.getLogger(Intro_programacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intro_programacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intro_programacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intro_programacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intro_programacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton caracteres;
    public javax.swing.JButton condicionales;
    public javax.swing.JButton expreciones;
    public javax.swing.JButton funciones;
    public javax.swing.JButton introduccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton recursividad;
    // End of variables declaration//GEN-END:variables
}
