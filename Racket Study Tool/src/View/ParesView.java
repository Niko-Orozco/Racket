/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.ImageIcon;

/**
 *
 * @author xlOnly
 */
public class ParesView extends javax.swing.JFrame {

    /**
     * Creates new form listaspares
     */
    NumeroLinea numerolinea;
    
    public ParesView() {
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
        jScrollPane12.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code5);
        jScrollPane13.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code6);
        jScrollPane14.setRowHeaderView(numerolinea);
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
        paresview3 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        paresview1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        paresview4 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        paresview2 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        paresview5 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
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
        jScrollPane12 = new javax.swing.JScrollPane();
        code4 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        verinfo4 = new javax.swing.JTextArea();
        run4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        code5 = new javax.swing.JTextPane();
        jScrollPane19 = new javax.swing.JScrollPane();
        verinfo5 = new javax.swing.JTextArea();
        run5 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        code6 = new javax.swing.JTextPane();
        jScrollPane20 = new javax.swing.JScrollPane();
        verinfo6 = new javax.swing.JTextArea();
        run6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        PasoPaso = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        letsgo = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1070, 705));
        jPanel1.setMinimumSize(new java.awt.Dimension(1070, 705));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Pares");
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 160, 30);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setFocusable(false);

        paresview3.setColumns(20);
        paresview3.setRows(5);
        paresview3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paresview3.setFocusable(false);
        jScrollPane5.setViewportView(paresview3);

        paresview1.setColumns(20);
        paresview1.setRows(5);
        paresview1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paresview1.setFocusable(false);
        jScrollPane1.setViewportView(paresview1);

        jLabel3.setText("la Funcion cons.");
        jLabel3.setFocusable(false);

        jLabel4.setText("¿Qué es un Par?");
        jLabel4.setFocusable(false);

        jLabel5.setText("Car.");
        jLabel5.setFocusable(false);

        paresview4.setColumns(20);
        paresview4.setRows(5);
        paresview4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paresview4.setFocusable(false);
        jScrollPane7.setViewportView(paresview4);

        jLabel6.setText("Cdr");
        jLabel6.setFocusable(false);

        paresview2.setColumns(20);
        paresview2.setRows(5);
        paresview2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paresview2.setFocusable(false);
        jScrollPane3.setViewportView(paresview2);

        paresview5.setColumns(20);
        paresview5.setRows(5);
        paresview5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paresview5.setFocusable(false);
        jScrollPane11.setViewportView(paresview5);

        jLabel9.setText("Pair?");
        jLabel9.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane5)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 70, 490, 600);

        jPanel7.setBackground(new java.awt.Color(252, 252, 252));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jLabel1.setFocusable(false);

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
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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

        jTabbedPane1.addTab("cons", jPanel3);

        jPanel4.setBackground(new java.awt.Color(252, 252, 252));

        code2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
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

        jTabbedPane1.addTab("car", jPanel4);

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));

        code3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        jTabbedPane1.addTab("cdr", jPanel5);

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));

        code4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code4.setFocusable(false);
        jScrollPane12.setViewportView(code4);

        verinfo4.setColumns(20);
        verinfo4.setRows(5);
        verinfo4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo4.setFocusable(false);
        jScrollPane18.setViewportView(verinfo4);

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
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("pair?", jPanel6);

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));

        code5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane13.setViewportView(code5);

        verinfo5.setColumns(20);
        verinfo5.setRows(5);
        verinfo5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo5.setFocusable(false);
        jScrollPane19.setViewportView(verinfo5);

        run5.setText("Ejecutar");
        run5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Consola");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pares y Listas", jPanel8);

        jPanel9.setBackground(new java.awt.Color(252, 252, 252));

        code6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane14.setViewportView(code6);

        verinfo6.setColumns(20);
        verinfo6.setRows(5);
        verinfo6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo6.setFocusable(false);
        jScrollPane20.setViewportView(verinfo6);

        run6.setText("Ejecutar");
        run6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run6ActionPerformed(evt);
            }
        });

        jLabel15.setText("Consola");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run6)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Par de Vectores", jPanel9);

        jLabel7.setText("Ejemplos:");
        jLabel7.setFocusable(false);

        jButton2.setText("ayuda");
        jButton2.setFocusable(false);

        PasoPaso.setText("Paso a Paso");
        PasoPaso.setFocusable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PasoPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasoPaso)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7);
        jPanel7.setBounds(500, 70, 590, 600);

        menu.setText("Menu");
        menu.setFocusable(false);
        jPanel1.add(menu);
        menu.setBounds(990, 700, 73, 29);

        jLabel8.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jLabel8.setFocusable(false);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 680, 570, 30);

        letsgo.setText("Vamos allá.");
        letsgo.setFocusable(false);
        jPanel1.add(letsgo);
        letsgo.setBounds(440, 710, 150, 29);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(930, 0, 160, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void run3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run3ActionPerformed

    }//GEN-LAST:event_run3ActionPerformed

    private void run2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run2ActionPerformed

    }//GEN-LAST:event_run2ActionPerformed

    private void run1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run1ActionPerformed

    }//GEN-LAST:event_run1ActionPerformed

    private void run4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run4ActionPerformed

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
            java.util.logging.Logger.getLogger(ParesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton PasoPaso;
    public javax.swing.JTextPane code;
    public javax.swing.JTextPane code2;
    public javax.swing.JTextPane code3;
    public javax.swing.JTextPane code4;
    public javax.swing.JTextPane code5;
    public javax.swing.JTextPane code6;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton letsgo;
    public javax.swing.JButton menu;
    public javax.swing.JTextArea paresview1;
    public javax.swing.JTextArea paresview2;
    public javax.swing.JTextArea paresview3;
    public javax.swing.JTextArea paresview4;
    public javax.swing.JTextArea paresview5;
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
