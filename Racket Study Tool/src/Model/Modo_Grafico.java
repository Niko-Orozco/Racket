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
                "(require (lib \"graphics.ss\" \"graphics\"))\n" +
"(open-graphics)\n" +
"\n" +
"(define ventana1 (open-viewport \"graficos\" 1000 700))\n" +
"\n" +
"(define (dibujar op)\n" +
"  (if (= op 1)\n" +
"  (begin\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 100 100) 50 50 \"red\")\n" +
"    (sleep 1)\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 100 100) 50 50 \"white\")\n" +
"    )\n" +
"  )\n" +
"(if (= op 2)\n" +
"  (begin\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 160 100) 50 50 \"blue\")\n" +
"    (sleep 1)\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 160 100) 50 50 \"white\")\n" +
"    )\n" +
"  )\n" +
"  (if (= op 3)\n" +
"  (begin\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 160 160) 50 50 \"green\")\n" +
"    (sleep 1)\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 160 160) 50 50 \"white\")\n" +
"    )\n" +
"  )\n" +
"  (if (= op 4)\n" +
"  (begin\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 100 160) 50 50 \"black\")\n" +
"    (sleep 1)\n" +
"    ((draw-solid-rectangle ventana1)(make-posn 100 160) 50 50 \"white\")\n" +
"    )\n" +
"  )\n" +
")\n" +
"\n" +
"(define (recursividad op)\n" +
"  (if (< op 5)\n" +
"      (begin\n" +
"        (dibujar op)\n" +
"        (recursividad (+ 1 op))\n" +
"        )             \n" +
"        (begin\n" +
"          (recursividad 0)\n" +
"          )\n" +
"        )\n" +
"      )\n" +
"(recursividad 1)"; 
        return data;
    }
    
    
     public String Ejegrafico2(){
        String data =   "(require (lib \"graphics.ss\" \"graphics\"))\n" +
"(open-graphics)\n" +
"\n" +
"(define ventana1 (open-viewport \"graficos\" 350 220))\n" +
"\n" +
"((draw-line ventana1)(make-posn 0 100)(make-posn 350 100)\"black\")\n" +
"((draw-line ventana1)(make-posn 0 200)(make-posn 350 200)\"black\")\n" +
"\n" +
"(define (solido r g b)\n" +
"  (if (= b 1)\n" +
"      (if (= g 1)\n" +
"          (if (= r 1)\n" +
"              ((draw-solid-rectangle ventana1)(make-posn  0 200) 524 233.33(make-rgb 0 g b))\n" +
"              (begin\n" +
"                ((draw-solid-rectangle ventana1)(make-posn  0 200) 524 233.33(make-rgb r g b))\n" +
"                (sleep 0.1)\n" +
"                (solido (exact->inexact (+ r 0.2)) g b )))\n" +
"          (begin\n" +
"                ((draw-solid-rectangle ventana1)(make-posn  0 200) 524 233.33(make-rgb 0 g b))\n" +
"                (sleep 0.1)\n" +
"                (solido r (exact->inexact (+ g 0.2)) b )))\n" +
"          (begin\n" +
"                ((draw-solid-rectangle ventana1)(make-posn  0 200) 524 233.33(make-rgb 0.5 g b))\n" +
"                (sleep 0.1)\n" +
"                (solido r g (exact->inexact (+ b 0.2)))\n" +
"                )\n" +
"          )\n" +
"  )\n" +
"\n" +
"(define (colores x)\n" +
"  (cond\n" +
"    ((= x 0) \"green\")\n" +
"    ((= x 1) \"black\")\n" +
"    ((= x 2) \"red\")\n" +
"    ((= x 3) \"yellow\")\n" +
"    ((= x 4) \"purple\")\n" +
"    )\n" +
"  )\n" +
"\n" +
"(define (cuadro x y color)\n" +
"  (if (= x 524)\n" +
"      (display \"fin\")\n" +
"      (begin\n" +
"         ((draw-solid-rectangle ventana1)(make-posn  x y) 50 50(colores color))\n" +
"         (sleep 0.5)\n" +
"         (cuadro (+ x 100) y (random 4))\n" +
"         )\n" +
"      )\n" +
"  )\n" +
"\n" +
"(define (linea x y)\n" +
"  (if (= x 524)\n" +
"      ((draw-pixel ventana1)(make-posn 0 133)\"green\")\n" +
"      (begin\n" +
"       ((draw-pixel ventana1)(make-posn x y)\"green\")\n" +
"       (sleep 0.001)\n" +
"       (linea (+ x 1) y )\n" +
"       )\n" +
"      )\n" +
"  )\n" +
"\n" +
"(linea 0 133)\n" +
"(solido 0 0 0)\n" +
"(cuadro 0 200.32 1)";
        return data;
    }
     
      public String Ejegrafico3(){
        String data =   "(require (lib \"graphics.ss\" \"graphics\"))\n" +
"(open-graphics)\n" +
"\n" +
"(define ventana1 (open-viewport \"graficos\" 350 220))\n" +
"(define (dibujar op q w)\n" +
"  (if (< op 3)\n" +
"      (begin\n" +
"        ((draw-solid-rectangle ventana1)(make-posn q w) 50 50 \"red\")\n" +
"        (sleep 1)\n" +
"    (dibujar (+ op 1) q (+ w 110))\n" +
"    )))\n" +
"\n" +
"(dibujar 1 20 20)";
        return data;
    }
      
       public String Ejegrafico4(){
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
