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
                 "La gran mayoria de lenguajes de programacion nos ofrece un modo \n "
                +"grafico o un conjunto de instrucciones y/o funciones que \n" +
                 "permiten usar ventanas, pixeles,multimedia y raton, con el fin \n" +
                 "de desarrollar programas en modo grafico. \n";
        return data;
    }
    
    public String grafico2(){
        String data =   
                "Para realizar un programa en modo grafico, primero debemos definir\n" +
                "con que libreria de gráficos vamos a programar. \n" +
                "En nuestro caso, sera: 'Graphics' \n"+
                "para indicárselo a Racket debemos agregar la siguiente linea de \n"+
                "código al inicio de nuestro porgrama\n";
        return data;
    }
    
    public String grafico3(){
        String data =   
                ";Aunque no es una funcion del modo grafico, es de gran relevancia,\n"
                +";pues con ella vamos a llamar a la libreria grafica \n"
                + "\n"
                +"(require (lib ''graphics.ss''''graphics'') ;llamado de la libreria\n"
                +"(open-graphics) ;inicializa la libreria Graphics \n"
                +"(open-viewport ''aqui_el_nombre_de_la_ventana'' 800 600) \n"      
                +";crea una ventana de 800X600 pixeles\n"
                +"(sleep n) ;Esta funcion causa un retardo de n segundos \n "
                +"(define Ventana(open-viewport ''Mi ventana'' 800 600));es una funcion\n"
                +";que crea una ventana\n"
                +"(close-viewport Ventana) ;cierra una ventana de tipo viewport su \n"
                +";argumento es la ventana a cerrar\n"
                +"(estruct posn (x y)) ; Asi nos referimos a una ubicacion pixel a \n"
                +";pixel mediante coordenadas siendo la esquina superior izquierda el\n "
                +";pixel (0,0) y las posiciones\n se incrementan a la derecha para x e\n"
                +";izquierda y\n"
                +"((draw-viewportVentana)(make-rgb 0.7 0.1 1 ; Colorear toda una venta \n "
                + "en formato rgb\n"
                +"((draw-viewportVentana) ''green'') ;Colorear ventana mediante colores \n"
                + ";predefinidos por racket\n"
                +"((clear-viewportVentana)) ;limpia todo el contenido de la ventana \n"
                +"((draw-pixwl Ventana)(make-posn 200 202) ''black'' ; Lo que hace es \n "
                +";pintar el pixel en la posicion x, y \n"
                +"((draw-rectangle Ventana) (make-posn 100 100) 50 100 ''blue'') ;En \n"
                +";racket se pueden realizar diferentes figuras depende de lo que \n"
                +";queramos, tan solo es usar la palabra reservada en el\n "
                + ";sistema y llenemos los parametros solicitados\n"
                +"((draw-string Ventana)(make-posn 100 100) ''EJEMPLO'' ''red'') Dibujar \n "
                +";una cadena, esta consta de: ventana, posición cadena y color \n"
                +"((draw-pixmap Ventana) ''img.bmp'' (make-posn 0 0)) ; podemos  \n"
                + ";importar imagenes dentro de una ventana\n"
                +"\n"
                +"Operaciones con el Mouse\n" 
                +"(get-mouse-click Ventana) ; tiene un argunmento, la ventana de la cual\n "
                + "leer la acción del mouse\n"
                +"(ready-mouse-click Ventana) ;identifica si se hizo o no click en la\n "
                +"pantalla, retorna true o false \n"
                +"(ready-mouse-release Ventana) ;recibe una ventana y retorna verdadero\n"
                + "si se dejo de oprimir un boton del mouse\n"
                +"(query-mouse-posn Ventana) ;Recibe una ventana y retorna posicion \n"
                + "del cursor dentro de la ventana\n "
                +"mouse-click-posn (get-mouse-click Ventana) ;recibe un descriptor y\n"
                + "retorna donde se dio click den la ventana\n"
                +"(left-mouse-click? (get-mouse-click Ventana)) recibe un descriptor y \n"
                + "retorna verdadero si se dio click izquierdo y  \n"
                +";falso en caso contrario, lo mismo aplica para el boton del centro y \n "
                + "el boton derecho ''middle'' y ''right'' respectivamente\n"
                +"\n" 
                +"Operaciones con el teclado\n"
                +"(get-key-press Ventana) ;Espera a que el usuario presione una tecla y \n"
                + "devuelve un descriptor \n"
                +"(ready-key-press Ventana) ;Esta funcion no espera a que el usuario\n "
                + "oprima una tecla, en\n"
                + "caso contrario  devueve un descriptor\n"
                +"(key-value (get-key-press Venetana)) recibe un descriptor y devuelve\n"
                + "el caracter correspondiente a la tecla que fue presionada\n ";
                
        return data;
    }
    
    public String Ejerecursividad1(){
        String data =   ";Imprimir los numeros del uno al 10 recursivamente:\n" +
                        "\n" +
                        "(define(prinNum-10 X)\n" +
                        "     (if (= X 10)                                            ;El caso base se dara cuando X sea igual a 10\n" +
                        "        (display X)                                         ;Cuando el caso base se cumpla se imprimira \"X\"\n" +
                        "            (begin                                            ;Casos generales, cuando X no es igual a 10\n" +
                        "                 (displlay X)                               ;Si X es diferente de 10 imprimir \"X\"\n" +
                        "                 (PrinNum- 10  (+  1  X)))        ;Si X diferente de 10, volver a llamar la funcion  \n" +
                        "                                                                    ;estableciendo a X como X+1\n" +
                        "      )\n" +
                        "   )\n" +
                        "\n" +
                        "  (PrinNum-10   0)                                   ;llamado de la funcion";
        return data;
    }
    
    
     public String Ejerecursividad2(){
        String data =   ";Construir un programa que calcula la cantidad  de divisores  de un numero utilizando la ;recursividad.\n" +
                        "\n" +
                        "   (define(Divs A Cont)\n" +
                        "        (if  (= Cont 1)                                            ;Caso base cuando Cont = 1\n" +
                        "          (display (/ A Cont))                                ;Imprimir el # divisor\n" +
                        "          (begin                                                      ;Casos generales, cuando cont no es igual a 1\n" +
                        "            (if (interger? (/ A Cont))\n" +
                        "              (begin\n" +
                        "               (display( / A Cont))\n" +
                        "               (newline)                                              ;Salto de linea\n" +
                        "               (Divs A (- Cont 1) )                              ;Llamado recursivo\n" +
                        "           )\n" +
                        "         (Divs A (- Cont 1) )                                    ;Llamado recursivo\n" +
                        "  )  )  )  )\n" +
                        "\n" +
                        "  (define  (Divisores X)\n" +
                        "       (Divs XX 0)   )\n" +
                        "  (Divisores 110240)";
        return data;
    }
     
      public String Ejerecursividad3(){
        String data =   ";Hacer  un  programa  que  reciba   un  numero  y  determine  si  es  un numero perfecto. Un \n" +
                        ";numero es perfecto  cuando la suma de sus divisores menores a el ,da como resultado el \n" +
                        ";mismo numero. Ej: 28 es un numero perfecto pues sus divisores son 14,7,4,2,1 y la suma \n" +
                        ";de estos numeros da 28.\n" +
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
        String data =   ";Para el primer renglon solo se pide imprimir una letra \"A\" y luego se debe saltar al nuevo \n" +
                        ";renglon, sin espacios en blanco.\n" +
                        "\n" +
                        ";Para el segundo renglon se debe colocar un espacio en blanco, luego imprimir una letra \n" +
                        ";\"A\" y despues se debe saltar al nuevo renglon\n" +
                        "\n" +
                        ";Para el tercer  renglon se debe colocar dos espacios en blanco, luego imprimir una letra \n" +
                        ";\"A\" y despues se debe saltar al nuevo renglon.\n" +
                        "\n" +
                        ";Para el cuarto renglon se debe colocar tres espacios en blanco, luego imprimir una letra \n" +
                        ";\"A\" y despues se debe saltar al nuevo renglon\n" +
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
