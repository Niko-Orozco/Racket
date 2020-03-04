/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Niko
 */
public class Modo_Grafico {
    
        public Modo_Grafico() {
        
    }
    
    public String grafico1(){
        String data =   
                 "La gran mayoría de lenguajes de programación nos ofrece un modo grafico \n "
                +"o un conjunto de instrucciones y/o funciones que permiten usar ventanas, \n" +
                 "pixeles, multimedia y ratón, con el fin de desarrollar programas en modo \n" +
                 "grafico. \n";
        return data;
    }
    
    public String grafico2(){
        String data =   
                "Para realizar un programa en modo gráfico, primero debemos definir\n" +
                "con que librería de gráficos vamos a programar. \n" +
                "En nuestro caso, será: 'Graphics' \n"+
                "para indicárselo a Racket debemos agregar la siguiente línea de \n"+
                "código al inicio de nuestro programa\n";
        return data;
    }
    
    public String grafico3(){
        String data =   
                ";Aunque no es una función del modo gráfico, es de gran relevancia,\n"
                +";pues con ella vamos a llamar a la librería grafica \n"
                + "\n"
                +"(require (lib ''graphics.ss''''graphics'') ;llamado de la librería\n"
                +"(open-graphics) ;inicializa la librería Graphics \n"
                +"(open-viewport ''aquí el nombre de la ventana'' 800 600) \n"      
                +";crea una ventana de 800X600 pixeles\n"
                +"(sleep n) ;Esta funcion causa un retardo de n segundos \n "
                +"(define Ventana(open-viewport ''Mi ventana'' 800 600));es una funcion\n"
                +";que crea una ventana\n"
                +"(close-viewport Ventana) ;cierra una ventana de tipo viewport su \n"
                +";argumento es la ventana por cerrar\n"
                +"(estruct posn (x y)) ; Así nos referimos a una ubicación pixel a \n"
                +";pixel mediante coordenadas siendo la esquina superior izquierda el\n "
                +";pixel (0,0) y las posiciones\n se incrementan a la derecha para x e\n"
                +";izquierda y\n"
                +"((draw-viewportVentana)(make-rgb 0.7 0.1 1 ; Colorear toda una venta \n "
                + "en formato rgb\n"
                +"((draw-viewportVentana) ''green'') ;Colorear ventana mediante colores \n"
                + ";predefinidos por racket\n"
                +"((clear-viewportVentana)) ;limpia todo el contenido de la ventana \n"
                +"((draw-pixel Ventana)(make-posn 200 202) ''black'' ; Lo que hace es \n "
                +";pintar el pixel en la posición x, y \n"
                +"((draw-rectangle Ventana) (make-posn 100 100) 50 100 ''blue'') ;En \n"
                +";racket se pueden realizar diferentes figuras depende de lo que \n"
                +";queramos, tan solo es usar la palabra reservada en el\n "
                + ";sistema y llenemos los parámetros solicitados\n"
                +"((draw-string Ventana)(make-posn 100 100) ''EJEMPLO'' ''red'') Dibujar \n "
                +";una cadena, esta consta de: ventana, posición cadena y color \n"
                +"((draw-pixmap Ventana) ''img.bmp'' (make-posn 0 0)) ; podemos  \n"
                + ";importar imágenes dentro de una ventana\n"
                +"\n"
                +"Operaciones con el Mouse\n" 
                +"(get-mouse-click Ventana) ; tiene un argumento, la ventana de la cual\n "
                + "leer la acción del mouse\n"
                +"(ready-mouse-click Ventana) ;identifica si se hizo o no click en la\n "
                +"pantalla, retorna true o false \n"
                +"(ready-mouse-release Ventana) ;recibe una ventana y retorna verdadero\n"
                + "si se dejó de oprimir un botón del mouse\n"
                +"(query-mouse-posn Ventana) ;Recibe una ventana y retorna posición \n"
                + "del cursor dentro de la ventana\n "
                +"mouse-click-posn (get-mouse-click Ventana) ;recibe un descriptor y\n"
                + "retorna donde se dio click den la ventana\n"
                +"(left-mouse-click? (get-mouse-click Ventana)) recibe un descriptor y \n"
                + "retorna verdadero si se dio click izquierdo y  \n"
                +";falso en caso contrario, lo mismo aplica para el botón del centro y \n "
                + "el botón derecho ''middle'' y ''right'' respectivamente\n"
                +"\n" 
                +"Operaciones con el teclado\n"
                +"(get-key-press Ventana) ;Espera a que el usuario presione una tecla y \n"
                + "devuelve un descriptor \n"
                +"(ready-key-press Ventana) ;Esta funcion no espera a que el usuario\n "
                + "oprima una tecla, en\n"
                + "caso contrario  devuelve un descriptor\n"
                +"(key-value (get-key-press Ventana)) recibe un descriptor y devuelve\n"
                + "el carácter correspondiente a la tecla que fue presionada\n ";
                
        return data;
    }
    
    public String Ejegrafico1(){
        String data =   
                ";Construya un programa en donde en una ventana de 800*600 se dibuje un pixel \n"
                + ";en la posición [0.50], luego debe dibujarse otro pixel en la posición[1,50], \n"
                + ";(2,50), (3,50) hasta llegar a la posición (800,50). Use recursividad.\n" +
                        "\n"
                +"(require (lib \"graphics.ss\" \"graphics\"))\n" +
                "(open-graphics) ;Llamado de librería\n" +
                "\n" +
                "(define ventanal (open-viewport \"Línea de puntos\" 800 600))\n" +
                "(define (línea x y) ;x, y, son coordenadas.\n" +
                "  (if (= x 799) ; Caso base\n" +
                "      ((draw-pixel ventanal) (make-posn 800 50) \"green\") ; Dibuja el ultimo pixel\n" +
                "      (begin\n" +
                "        ((draw-pixel ventanal) (make-posn x y) \"green\") ;Dibuja el pixel en la posición (x, y)\n" +
                "        (sleep 0.001) ; Tiempo de espera para dibujar el siguiente pixel.\n" +
                "        (linea (+ x 1) y) ;Llamado recursivo\n" +
                "        )\n" +
                "      )\n" +
                "  )\n" +
                "(linea 0 50) ;llamado de la función"; 
        return data;
    }
    
    
     public String Ejerecursividad2(){
        String data =   ";Construir un programa que calcula la cantidad  de divisores  de un numero utilizando la ;recursividad.\n\n" +
                        "\n" +
                        "   (define(Divs A Cont)\n" +
                        "        (if  (= Cont 1)                                            \n;Caso base cuando Cont = 1\n" +
                        "          (display (/ A Cont))                               \n ;Imprimir el # divisor\n" +
                        "          (begin                                                     \n ;Casos generales, cuando cont no es igual a 1\n" +
                        "            (if (interger? (/ A Cont))\n" +
                        "              (begin\n" +
                        "               (display( / A Cont))\n" +
                        "               (newline)                                              \n;Salto de linea\n" +
                        "               (Divs A (- Cont 1) )                              \n;Llamado recursivo\n" +
                        "           )\n" +
                        "         (Divs A (- Cont 1) )                                   \n ;Llamado recursivo\n" +
                        "  )  )  )  )\n" +
                        "\n" +
                        "  (define  (Divisores X)\n" +
                        "       (Divs XX 0)   )\n" +
                        "  (Divisores 110240)";
        return data;
    }
     
      public String Ejerecursividad3(){
        String data =   ";Hacer  un  programa  que  reciba   un  número  y  determine  si  es  un numero perfecto. Un \n" +
                        ";número es perfecto  cuando la suma de sus divisores menores a él, da como resultado el \n" +
                        ";mismo número. Ej: 28 es un numero perfecto pues sus divisores son 14,7,4,2,1 y la suma \n" +
                        ";de estos números da 28.\n\n" +
                        "\n" +
                        " (define (Divs A Cont Suma)\n" +
                        "       (if  (= Cont 1)\n" +
                        "       (if  (= A Suma)\n" +
                        "         (begin\n" +
                        "               (display Suma)\n" +
                        "               (display \"Es un numero perfecto\")  )\n" +
                        "           (begin\n" +
                        "               (display A)\n" +
                        "               (display \"No es un numero perfecto\")  )\n" +
                        "       )\n" +
                        "    (begin\n" +
                        "         (if (interger? (/ A Cont))\n" +
                        "            (Divs A (-  Cont 1)  (+ Suma  (/A Cont) ) ) \n" +
                        "            (Divs A (- Cont 1)  Suma)\n" +
                        "          )  )  )  )\n" +
                        " (define (Perfecto? X)\n" +
                        "         (Divs X 10)  )\n" +
                        " (Perfecto? (read))";
        return data;
    }
      
       public String Ejerecursividad4(){
        String data =   ";Para el primer renglón solo se pide imprimir una letra \"A\" y luego se debe saltar al nuevo \n" +
                        ";renglón, sin espacios en blanco.\n" +
                        "\n" +
                        ";Para el segundo renglón se debe colocar un espacio en blanco, luego imprimir una letra \n" +
                        ";\"A\" y después se debe saltar al nuevo renglón\n" +
                        "\n" +
                        ";Para el tercer  renglón se debe colocar dos espacios en blanco, luego imprimir una letra \n" +
                        ";\"A\" y después se debe saltar al nuevo renglón.\n" +
                        "\n" +
                        ";Para el cuarto renglón se debe colocar tres espacios en blanco, luego imprimir una letra \n" +
                        ";\"A\" y después se debe saltar al nuevo renglón\n\n" +
                        "\n" +
                        "\n" +
                        "  (define  (Espacios a)\n" +
                        "      (if  (> a 1)\n" +
                        "         (begin\n" +
                        "             (display \" \")\n" +
                        "             (Espacios  (- a 1 ) )   ) ) )\n" +
                        "\n" +
                        "(define  (Principal a)\n" +
                        "    (if (<= a 15)\n" +
                        "      (begin\n" +
                        "          (Espacios a)\n" +
                        "          (display \"A\")\n" +
                        "          (newline)\n" +
                        "          (Principal   (+ a 1)  )\n" +
                        "       )\n" +
                        "    )\n" +
                        "  )\n" +
                        "  (Principal 1)";
        return data;
    }
    
}
