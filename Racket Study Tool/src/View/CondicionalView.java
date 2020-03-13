/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;

/**
 *
 * @author Niko
 */
public class CondicionalView extends javax.swing.JFrame {

    /**
     * Creates new form CondicionalView
     */
    
    NumeroLinea numerolinea;
    
    public CondicionalView() {
        setResizable(false);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/racket-icon.png")).getImage());
        numerolinea = new NumeroLinea(code);
        jScrollPane4.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code2);
        jScrollPane8.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code3);
        jScrollPane10.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code4);
        jScrollPane18.setRowHeaderView(numerolinea);
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        conif = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        ques = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        concond = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bolerel = new javax.swing.JTextArea();
        menu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        letsgo = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
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
        jScrollPane8 = new javax.swing.JScrollPane();
        code2 = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        verinfo2 = new javax.swing.JTextArea();
        run2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        code3 = new javax.swing.JTextPane();
        jScrollPane17 = new javax.swing.JScrollPane();
        verinfo3 = new javax.swing.JTextArea();
        run3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        code4 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        verinfo4 = new javax.swing.JTextArea();
        run4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        code5 = new javax.swing.JTextPane();
        jScrollPane21 = new javax.swing.JScrollPane();
        verinfo5 = new javax.swing.JTextArea();
        run5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        code6 = new javax.swing.JTextPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        verinfo6 = new javax.swing.JTextArea();
        run6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PasoPaso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1070, 705));

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1070, 705));
        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 705));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 705));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Condicionales");
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 160, 30);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setFocusable(false);

        conif.setColumns(20);
        conif.setRows(5);
        conif.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        conif.setFocusable(false);
        jScrollPane5.setViewportView(conif);

        ques.setColumns(20);
        ques.setRows(5);
        ques.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ques.setFocusable(false);
        jScrollPane1.setViewportView(ques);

        jLabel3.setText("Boleanos y Relaciones");
        jLabel3.setFocusable(false);

        jLabel4.setText("¿Que es una condicional?");
        jLabel4.setFocusable(false);

        jLabel5.setText("Condicional IF");
        jLabel5.setFocusable(false);

        concond.setColumns(20);
        concond.setRows(5);
        concond.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        concond.setFocusable(false);
        jScrollPane7.setViewportView(concond);

        jLabel6.setText("Condicional COND");
        jLabel6.setFocusable(false);

        bolerel.setColumns(20);
        bolerel.setRows(5);
        bolerel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(bolerel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 70, 490, 600);

        menu.setText("Menu");
        jPanel1.add(menu);
        menu.setBounds(990, 700, 73, 23);

        jLabel8.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 680, 570, 30);

        letsgo.setText("Vamos alla");
        jPanel1.add(letsgo);
        letsgo.setBounds(440, 710, 150, 23);

        jPanel7.setBackground(new java.awt.Color(252, 252, 252));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane1.setBackground(new java.awt.Color(252, 252, 252));

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
        run1.setFocusable(false);
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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 427, Short.MAX_VALUE)
                        .addComponent(run1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("IF", jPanel3);

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));

        code2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code2.setFocusable(false);
        jScrollPane8.setViewportView(code2);

        verinfo2.setColumns(20);
        verinfo2.setRows(5);
        verinfo2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo2.setFocusable(false);
        jScrollPane9.setViewportView(verinfo2);

        run2.setText("Ejecutar");
        run2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Consola");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("IF-begin", jPanel4);

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));

        code3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code3.setFocusable(false);
        jScrollPane10.setViewportView(code3);

        verinfo3.setColumns(20);
        verinfo3.setRows(5);
        verinfo3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo3.setFocusable(false);
        jScrollPane17.setViewportView(verinfo3);

        run3.setText("Ejecutar");
        run3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run3ActionPerformed(evt);
            }
        });

        jLabel12.setText("Consola");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("cond", jPanel5);

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));
        jPanel6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        code4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code4.setFocusable(false);
        jScrollPane18.setViewportView(code4);

        verinfo4.setColumns(20);
        verinfo4.setRows(5);
        verinfo4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo4.setFocusable(false);
        jScrollPane19.setViewportView(verinfo4);

        run4.setText("Ejecutar");
        run4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run4ActionPerformed(evt);
            }
        });

        jLabel13.setText("Consola");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane18)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("cond-begin", jPanel6);

        jPanel9.setBackground(new java.awt.Color(252, 252, 252));
        jPanel9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        code5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane20.setViewportView(code5);

        verinfo5.setColumns(20);
        verinfo5.setRows(5);
        verinfo5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo5.setFocusable(false);
        jScrollPane21.setViewportView(verinfo5);

        run5.setText("Ejecutar");
        run5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Consola");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane20)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mayor de 3", jPanel9);

        jPanel10.setBackground(new java.awt.Color(252, 252, 252));
        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        code6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane22.setViewportView(code6);

        verinfo6.setColumns(20);
        verinfo6.setRows(5);
        verinfo6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo6.setFocusable(false);
        jScrollPane23.setViewportView(verinfo6);

        run6.setText("Ejecutar");
        run6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run6ActionPerformed(evt);
            }
        });

        jLabel15.setText("Consola");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane22)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("cond-begin", jPanel10);

        jLabel7.setText("Ejemplos");
        jLabel7.setFocusable(false);

        jButton2.setText("ayuda");
        jButton2.setFocusable(false);

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));
        jPanel8.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pic001.gif"))); // NOI18N
        jLabel9.setFocusable(false);
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 0, 240, 230);

        jLabel10.setText("Reprecentacion grafica de un condicional");
        jLabel10.setFocusable(false);

        PasoPaso.setText("Paso a Paso");
        PasoPaso.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(23, 23, 23))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PasoPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasoPaso)
                .addGap(15, 15, 15))
        );

        jScrollPane11.setViewportView(jPanel7);

        jPanel1.add(jScrollPane11);
        jScrollPane11.setBounds(500, 70, 610, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void run4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run4ActionPerformed

    }//GEN-LAST:event_run4ActionPerformed

    private void run3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run3ActionPerformed

    }//GEN-LAST:event_run3ActionPerformed

    private void run2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run2ActionPerformed

    }//GEN-LAST:event_run2ActionPerformed

    private void run1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run1ActionPerformed

    }//GEN-LAST:event_run1ActionPerformed

    private void run5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run5ActionPerformed

    private void run6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run6ActionPerformed

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
            java.util.logging.Logger.getLogger(CondicionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CondicionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CondicionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CondicionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CondicionalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton PasoPaso;
    public javax.swing.JTextArea bolerel;
    public javax.swing.JTextPane code;
    public javax.swing.JTextPane code2;
    public javax.swing.JTextPane code3;
    public javax.swing.JTextPane code4;
    public javax.swing.JTextPane code5;
    public javax.swing.JTextPane code6;
    public javax.swing.JTextArea concond;
    public javax.swing.JTextArea conif;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton letsgo;
    public javax.swing.JButton menu;
    public javax.swing.JTextArea ques;
    public javax.swing.JButton run1;
    public javax.swing.JButton run2;
    public javax.swing.JButton run3;
    public javax.swing.JButton run4;
    public javax.swing.JButton run5;
    public javax.swing.JButton run6;
    public javax.swing.JTextArea verinfo1;
    public javax.swing.JTextArea verinfo2;
    public javax.swing.JTextArea verinfo3;
    public javax.swing.JTextArea verinfo4;
    public javax.swing.JTextArea verinfo5;
    public javax.swing.JTextArea verinfo6;
    // End of variables declaration//GEN-END:variables
}
