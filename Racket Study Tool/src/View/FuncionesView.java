/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.concurrent.ExecutionException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xlOnly
 */
public class FuncionesView extends javax.swing.JFrame {

    /**
     * Creates new form FuncionesView
     */
    NumeroLinea numerolinea;
    
    public FuncionesView() {
        setResizable(false);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/racket-icon.png")).getImage());
        numerolinea = new NumeroLinea(code);
        jScrollPane4.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code2);
        jScrollPane9.setRowHeaderView(numerolinea);
        
        numerolinea = new NumeroLinea(code3);
        jScrollPane12.setRowHeaderView(numerolinea);

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
        funciones1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        funciones2 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        funciones3 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        code3 = new javax.swing.JTextPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        verinfo3 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        run3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        DatosStruct = new javax.swing.JTable();
        letsgo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 748));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 748));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setLayout(null);

        funciones1.setColumns(20);
        funciones1.setRows(5);
        funciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        funciones1.setFocusable(false);
        jScrollPane1.setViewportView(funciones1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 439, 140);

        jLabel3.setText("Funciones Construidas (Definidas por el Usuario)");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 220, 400, 22);

        jLabel4.setText("Funciones Primitivas");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 20, 184, 22);

        funciones2.setColumns(20);
        funciones2.setRows(5);
        funciones2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        funciones2.setFocusable(false);
        jScrollPane3.setViewportView(funciones2);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(20, 250, 439, 140);

        funciones3.setColumns(20);
        funciones3.setRows(5);
        funciones3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        funciones3.setFocusable(false);
        jScrollPane5.setViewportView(funciones3);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(20, 440, 439, 140);

        jLabel5.setText("¿Que es un argumento?");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 410, 400, 22);

        jScrollPane6.setViewportView(jPanel2);

        jPanel1.add(jScrollPane6);
        jScrollPane6.setBounds(10, 70, 500, 600);

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

        jTabbedPane1.addTab("define", jPanel3);

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

        jTabbedPane1.addTab("read", jPanel4);

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(run3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(run3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("display", jPanel6);

        jLabel7.setText("Ejemplos");

        jButton2.setText("ayuda");

        jLabel15.setText("Funciones que operan con valores numericos");

        DatosStruct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"*", "(* num1 num2) -> num", "Multiplicacion"},
                {"+", "(+ num1 num2) -> num", "Suma"},
                {"-", "(-  num1 num2) -> num", "Resta"},
                {"/", "(/  num1 num2) -> num", "Division"},
                {"<", "(< num1 num2) -> #t o #f", "Comprar el primer valor con los demas, si este es menor devuelve #t, sino #f"},
                {"<=", "<= num1 num2) -> #t o #f", "Comprar el primer valor con los demas, si este es menor o igual devuelve #t, sino #f"},
                {">", "(>  num1 num2) -> #t o #f", "Comprar el primer valor con los demas, si este es mayor devuelve #t, sino #f"},
                {">=", "(>= num1 num2) -> #t o #f", "Comprar el primer valor con los demas, si este es mayor o igual devuelve #t, sino #f"},
                {"abs", "(abs  num) -> num", "Valor absoluto de un numero"},
                {"acos", "(acos  num) -> num", "Arco-coseno"},
                {"add1", "(add1  num) -> num+1", "Aumenta un numero en 1"},
                {"angle", "(angle  num) -> num", "Calcula el angulo de un real"},
                {"asin", "(asin  num) -> num", "Arco-seno"},
                {"atan", "(atan  num) -> num", "Arco-tangente"},
                {"ceiling", "(celing  num) -> num", "Aproxima un valor real"},
                {"complex?", "(any  data) -> #t o #f", "Evalua si algo es un numero complejo"},
                {"conjugate", "(conjugate  num) -> num", "El conjugado complejo de un numero"},
                {"cos", "(cos  num) -> num", "Coseno"},
                {"cosh", "(cosh  num) -> num", "Coseno Hiperbolico"},
                {"current-secconds", "date", "Devuelve la hora actual en segundos"},
                {"e", "( e ) -> num", "''e'' es Euler 2.718281"},
                {"event?", "(even?  num) -> #t o #f", "Prueba un numero para una propiedad particular devolviendo segun sea el caso #t o #f"},
                {"exact->inexact", "(exact->inexact  num) -> num", "Las operaciones especiales exact->inexact son vasados en los tipos de datos numericos asegurando que el tipo respectivo es exacto o no"},
                {"exact?", "(exact?  num) -> #t  o #f", "Nos dice si el numero es exacto o no"},
                {"exp", "(exp num) -> num", "Devuelve el valor de Euler elevado a la potencia indicada"},
                {"expt", "(expt num1 num2) -> num", "Eleva un numero a determinada potencia"},
                {"floor", "(floor num) -> num", "Aproxima a piso"},
                {"gcd", "(gcd num1 num2) -> num", "Maximo comun divisor"},
                {"imag-part", "(image-part  num ) -> num", "Devuelve la parte imaginaria de un numero complejo en coordenadas rectangulares"},
                {"integer->char", "(integer->char num) -> char", "Entero o Caracter"},
                {"integer-sqrt", "(integer-sqrt  num) -> raiz( num)", "Saca la raiz de un numero entero"},
                {"integer?", "(integer? any) -> #f t o #f", "Nos dice si algo es un numero entero o no"},
                {"log", "(log  num) -> num", "Calcula el logaritmo de un numero"},
                {"magnitude", "(magnitude  num) -> num", "Devuelve la magnitud de un numero complejo en coordenadas rectangulares"},
                {"make-polar", "(make-polar num1 num2) -> num", "Devuelve el resultado de la operacion (+(* magnitude (cos num))(* magnitude (cos num)))"},
                {"make-rectangular", "(make-rectangular num1 num2) -> num", "Devuelve el resultado de la operacion (+ x (* y + 0+li))"},
                {"max", "(max num1  num2) -> num", "Evalua dos o mas numeros y nos dice cual es el mayor de todos"},
                {"min", "(min num1  num2) -> num", "Evalua dos o mas numeros y nos dice cual es el menor de todos"},
                {"modulo", "(modulo num1  num2) -> num", "Devuelve el modulo de la division entre dos numeros"},
                {"negative?", "(negative?  num) -> #t  o #f", "Evalua un numero y dice si es negativo o no"},
                {"number->string", "(number->string num) -> string", "Devuelve una cadena que es la forma impresa de num es la base especificada por r (2,8,10,16)"},
                {"number?", "(number? any) -> #f t o #f", "Evalua el valor y nos dice si es un numero"},
                {"numerator", "(numerator num) -> num", "Encuentra el numerado del numero expresado, obliga al numero racinal a ser un numero exacto"},
                {"odd?", "(add? num) -> #f t o #f", "Devuelve el resultado de evaluar (not(even? n))"},
                {"Pi", "( Pi ) -> num", "''pi'' es igual a:3.14159265"},
                {"positive?", "(positive? num) -> #f t o #f", "Devuelve #t si num es mayor a 0, #f en caso contrario"},
                {"quotient", "(quotient num1  num2) -> num", "Devuelve el cociente de la division entre dos numeros"},
                {"random", "( random ) -> num", "Devuelve un numero aleatorio"},
                {"rational?", "(rational? any) -> #f t o #f", "Devuelve #t si any es un numero racional, #f en otro caso"},
                {"real-part", "(real-part num) -> num", "Devuelve la parte real de un numero complejo en coordenadas rectangulares"},
                {"real?", "(real? any) -> #f t o #f", "Evalua un valor y nos dice si es real"},
                {"remainder", "(reminder  num1  num2) -> num", "Devuelve el residuo de la division entre dos numeros"},
                {"round", "(round  num) -> num", "Redondea un numero"},
                {"sgn", "(sgn  num) -> num", "Devuelve el signo de un numero como -1,0,1"},
                {"sin", "(sin  num) -> num", "Devuelve el seno de un numero"},
                {"sinh", "(sinh  num) -> num", "Devuelve el seno hiperbolico de un numero"},
                {"sqrt", "(sqrt  num) -> raiz(num)", "Calcula la raiz cuadrada de un numero"},
                {"sub1", "(sub1  num) -> num-1", "Devuelve el resultado de la operacion (- num 1)"},
                {"tan", "(tan  num) -> num", "Devuelve la tagente de un numero"},
                {"zero?", "(zero? num) -> #f t o #f", "Evalua un numero y nos dice si es cero o no"}
            },
            new String [] {
                "Funcion", "Entrada-salida", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DatosStruct.setToolTipText("");
        DatosStruct.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        DatosStruct.setFocusable(false);
        jScrollPane11.setViewportView(DatosStruct);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(415, 415, 415)
                        .addComponent(jButton2))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(jScrollPane7))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane13.setViewportView(jPanel7);

        jPanel1.add(jScrollPane13);
        jScrollPane13.setBounds(510, 70, 630, 600);

        letsgo.setText("Vamos alla");
        jPanel1.add(letsgo);
        letsgo.setBounds(530, 700, 150, 23);

        jLabel8.setText("¡¡¿Que te parece si practicamos con unos ejercicios para reforzar lo aprendido?!!");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 670, 570, 30);

        menu.setText("Menu");
        jPanel1.add(menu);
        menu.setBounds(1040, 700, 73, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Funciones");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 170, 30);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/marca_UTP.png"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(980, 0, 160, 70);

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
            java.util.logging.Logger.getLogger(FuncionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable DatosStruct;
    public javax.swing.JTextPane code;
    public javax.swing.JTextPane code2;
    public javax.swing.JTextPane code3;
    public javax.swing.JTextArea funciones1;
    public javax.swing.JTextArea funciones2;
    public javax.swing.JTextArea funciones3;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JButton letsgo;
    public javax.swing.JButton menu;
    public javax.swing.JButton run1;
    public javax.swing.JButton run2;
    public javax.swing.JButton run3;
    public javax.swing.JTextArea verinfo1;
    public javax.swing.JTextArea verinfo2;
    public javax.swing.JTextArea verinfo3;
    // End of variables declaration//GEN-END:variables
}
