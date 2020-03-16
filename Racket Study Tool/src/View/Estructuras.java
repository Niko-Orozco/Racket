/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controlador;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xlOnly
 */
public class Estructuras extends javax.swing.JFrame {

    /**
     * Creates new form Estructuras
     */
    NumeroLinea numerolinea;
    private codex Codex;
    private Controlador Controller;
    
    public Estructuras() {
        setResizable(false);
        initComponents();
        Controller = new Controlador();
        Codex = new codex();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/racket-icon.png")).getImage());
        numerolinea = new NumeroLinea(code);
        jScrollPane4.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code2);
        jScrollPane9.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code3);
        jScrollPane12.setRowHeaderView(numerolinea);
               
        numerolinea = new NumeroLinea(code4);
        jScrollPane15.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code5);
        jScrollPane17.setRowHeaderView(numerolinea);
        
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
        jScrollPane5 = new javax.swing.JScrollPane();
        makestruc = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        questruct = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        defstruct = new javax.swing.JTextArea();
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        code3 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        verinfo3 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        run3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        code4 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        verinfo4 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        run4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        code5 = new javax.swing.JTextPane();
        jScrollPane18 = new javax.swing.JScrollPane();
        verinfo5 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        run5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        adddata = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        DatosStruct = new javax.swing.JTable();
        PasoPaso = new javax.swing.JButton();
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

        makestruc.setColumns(20);
        makestruc.setRows(5);
        makestruc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        makestruc.setFocusable(false);
        jScrollPane5.setViewportView(makestruc);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(27, 404, 413, 140);

        questruct.setColumns(20);
        questruct.setRows(5);
        questruct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questruct.setFocusable(false);
        jScrollPane1.setViewportView(questruct);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(27, 39, 413, 140);

        jLabel3.setText("Define-struct");
        jLabel3.setFocusable(false);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(27, 190, 215, 22);

        jLabel4.setText("¿Qué es una estructura de datos?");
        jLabel4.setFocusable(false);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(27, 11, 184, 22);

        jLabel5.setText("Make-struct");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(27, 376, 196, 22);

        defstruct.setColumns(20);
        defstruct.setRows(5);
        defstruct.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        defstruct.setFocusable(false);
        jScrollPane3.setViewportView(defstruct);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(27, 225, 413, 140);

        jScrollPane6.setViewportView(jPanel2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 70, 500, 600);

        jPanel7.setBackground(new java.awt.Color(252, 252, 252));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseEntered(evt);
            }
        });

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo 1", jPanel3);

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
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo 2", jPanel4);

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));

        code3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code3.setFocusable(false);
        jScrollPane12.setViewportView(code3);

        verinfo3.setColumns(20);
        verinfo3.setRows(5);
        verinfo3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo3.setFocusable(false);
        jScrollPane14.setViewportView(verinfo3);

        jLabel19.setText("Consola");

        run3.setText("Ejecutar");
        run3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo 3", jPanel5);

        jPanel8.setBackground(new java.awt.Color(252, 252, 252));

        code4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code4.setFocusable(false);
        jScrollPane15.setViewportView(code4);

        verinfo4.setColumns(20);
        verinfo4.setRows(5);
        verinfo4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo4.setFocusable(false);
        jScrollPane16.setViewportView(verinfo4);

        jLabel20.setText("Consola");

        run4.setText("Ejecutar");
        run4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run4)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo 4", jPanel8);

        jPanel9.setBackground(new java.awt.Color(252, 252, 252));

        code5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        code5.setFocusable(false);
        jScrollPane17.setViewportView(code5);

        verinfo5.setColumns(20);
        verinfo5.setRows(5);
        verinfo5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verinfo5.setFocusable(false);
        jScrollPane18.setViewportView(verinfo5);

        jLabel21.setText("Consola");

        run5.setText("Ejecutar");
        run5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run5)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ejemplo 5", jPanel9);

        jLabel7.setText("Ejemplos");
        jLabel7.setFocusable(false);

        jButton2.setText("ayuda");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Reprecentasión gráfica de una estructura de datos");
        jLabel15.setFocusable(false);

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });
        jPanel6.setLayout(null);

        adddata.setText("Agregar Datos");
        adddata.setFocusable(false);
        adddata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adddataMouseEntered(evt);
            }
        });
        jPanel6.add(adddata);
        adddata.setBounds(240, 10, 120, 23);

        DatosStruct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DatosStruct.setFocusable(false);
        jScrollPane11.setViewportView(DatosStruct);

        PasoPaso.setText("Paso a Paso");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405)
                        .addComponent(jButton2))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PasoPaso, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(19, 19, 19)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasoPaso)
                .addGap(19, 19, 19))
        );

        jScrollPane13.setViewportView(jPanel7);

        jPanel1.add(jScrollPane13);
        jScrollPane13.setBounds(510, 70, 630, 600);

        letsgo.setText("Vamos alla");
        letsgo.setFocusable(false);
        jPanel1.add(letsgo);
        letsgo.setBounds(530, 700, 150, 23);

        jLabel8.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jLabel8.setFocusable(false);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 670, 570, 30);

        menu.setText("Menu");
        menu.setFocusable(false);
        jPanel1.add(menu);
        menu.setBounds(1040, 700, 73, 23);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setText("Estructuras de datos ");
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 360, 40);

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

    private void run3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run3ActionPerformed

    private void adddataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adddataMouseEntered
        this.Codex.codes.setText("");
        SeeCode();
    }//GEN-LAST:event_adddataMouseEntered

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        this.Codex.setVisible(false);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void run4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run4ActionPerformed

    private void run5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_run5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_run5ActionPerformed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        this.Codex.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseEntered
        this.Codex.setVisible(false);
    }//GEN-LAST:event_jTabbedPane1MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            File path = new File ("src/View/Manual.pdf");
            Desktop.getDesktop().open(path);
       }catch (IOException ex) {
            ex.printStackTrace();
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void SeeCode(){
        this.Codex.setVisible(true);
        Codex.ok.setVisible(false);
        this.Codex.setTitle("Código");
        this.Codex.setLocationRelativeTo(null);
        String data =   ";Creamos la estructura para los clientes\n\n" +
                        "(define-struct Clientes(nombre apellido teléfono correo))\n" +
                        "\n" ;
        String data2 = ";Le ingresamos datos a la estructura clientes\n\n" +
                        "(define dato (make-Clientes (read) (read) (read) (read)))";
                        
        Controller.PonerColor(Codex.codes, data);
        Controller.PonerColor(Codex.codes, data2);
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
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estructuras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estructuras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DatosStruct;
    public javax.swing.JButton PasoPaso;
    public javax.swing.JButton adddata;
    public javax.swing.JTextPane code;
    public javax.swing.JTextPane code2;
    public javax.swing.JTextPane code3;
    public javax.swing.JTextPane code4;
    public javax.swing.JTextPane code5;
    public javax.swing.JTextArea defstruct;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton letsgo;
    public javax.swing.JTextArea makestruc;
    public javax.swing.JButton menu;
    public javax.swing.JTextArea questruct;
    public javax.swing.JButton run1;
    public javax.swing.JButton run2;
    public javax.swing.JButton run3;
    public javax.swing.JButton run4;
    public javax.swing.JButton run5;
    public javax.swing.JTextArea verinfo1;
    public javax.swing.JTextArea verinfo2;
    public javax.swing.JTextArea verinfo3;
    public javax.swing.JTextArea verinfo4;
    public javax.swing.JTextArea verinfo5;
    // End of variables declaration//GEN-END:variables
}
