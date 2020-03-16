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
public class Vectores {

    public Vectores() {
    }
    
    public String quevect(){
        String data =   "Un vector   se puede ver como un conjunto  de  elementos  ordenados\n" +
                        "en filas o ( filas y columnas si tuviera dos dimensiones ) \n" +
                        "\n" +
                        "En    programación,    una   matriz    o    un   vector   es   una   zona    de \n" +
                        "almacenamiento continuo   que   contiene   una   serie   de  elementos\n" +
                        "del mismo tipo. Los elementos del vector.\n" +
                        "\n" +
                        "El  tipo  de  dato  vector,  es conocido como un tipo de dato compuesto \n" +
                        "de uno  o  más  tipos  de  dato  básico,  primitivo  o  de  otros  tipos  de \n" +
                        "datos compuestos, inclusive vectores mismos.";    
        return data;
    }
    
    public String vectset(){
        String data =   "vector-set!  es una funcion de  Racket  que toma tres parámetros como \n" +
                        "referencia para modificar un dato de un vector, lo primero que recibe es\n" +
                        "el vector  el  segundo  dato  es  la  posición del elemento a cambiar y el\n" +
                        "tercero es el dato por el que deseamos reemplazar\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                            :\n" +
                        "(vector-cambiar! vect n dato)       :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "Ejemplo                                                              :\n" +
                        "(define vect  (vector  #\\q \"Carmen\" ´p 9))      :\n" +
                        "(vector-set! vect 1 ´j)                                         :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";    
        return data;
    }
    
    public String vectfill(){
        String data =   "vector-fill  es una funcion de  Racket  permite ingresar el mismo dato en \n" +
                        "todas las posiciones de un vector, tomando dos parámetros, el nombre\n" +
                        "del vector y el dato a introducir en todas las posiciones.\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "Sintaxis                                                               :\n" +
                        "(vector-llenarl vect  dato)                                 :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "Ejemplo                                                              :\n" +
                        "(define vect (vector 5 7 8 0 \"lambda\" ´f)        :\n" +
                        "(vector-fill vect  \"<Hola\")                                   :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";    
        return data;
    }
    
    public String vectlen(){
        String data =   "vector-length es una funcion que nos permite saber cuántas posiciones\n" +
                        "tiene un vector, es decir su tamaño y solo toma un vector.\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                :\n" +
                        "(vector-tamaño vect)          :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "Ejemplo                                                            :\n" +
                        "(define vect (vector 1 9 ´p \"dos\" ´z))             :\n" +
                        "(vector-length vect)                        ->       5    :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";    
        return data;
    }
    
    public String makevect(){
        String data =   "La función make-vector, crea un vector únicamente  con los  elementos\n" +
                        "que   se   le   indiquen   en   el   momento   de   declarar   dicha  función.\n" +
                        "Adicionalmente, en Racket  a diferencia de  la mayoría  de lo lenguajes\n" +
                        "de programación podemos  almacenar  absolutamente  cualquier  tipo  \n" +
                        "de  dato  en  nuestros  vectores.\n" +
                        "Para la creación de vectores podemos usar la  funcion make-vector\n" +
                        "\n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                                         :\n" +
                        "(hacer-vector n char)                                  : \n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                                                                                              ;\n" +
                        "(make-vector 5 )                                                                                :\n" +
                        "Crea un vector de 5 posiciones vacío o con el elemento 0     :\n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ";    
        return data;
    }
    
    public String vectref(){
        String data =   "Al  igual  que  con  las  cadenas  podemos  obtener  datos  de un vector\n" +
                        "haciendo  uso  de  la  funcion  (vector-ref).\n" +
                        "\n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n" +
                        "Sintaxis                                                                                                                 :\n" +
                        "(vector-referencia vect n)                                                                                   : \n" +
                        "vect  es  el  vector al  cual  queremos  sacar uno o más datos y la \"n\"   : \n" +
                        "hace referencia a la posición en el vector donde queremos sacar la    :\n" +
                        "información                                                                                                         :\n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                                                                                                               :\n" +
                        "(define vect  (vector  #\\z \"Pollito\" 4 #t))                                                           :\n" +
                        "(vector-referencia vect 2)                        ->       \"Pollito\"                                 :\n" +
                        " - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ";    
        return data;
    }
    
    public String makeeje(){
        String data =   ";Defina una funcion tal que cree un vector de 5 posiciones con la letra J y luego mostrar el \n" +
                        ";resultado  por pantalla\n\n" +
                        "\n" +
                        "(define (CrearVector)\n" +
                        "     (define vec (make-vector 5 # \\j))\n" +
                        "     (displayln vec)\n" +
                        ")\n" +
                        "\n" +
                        "(CrearVector)";
        return data;
    }
    
    public String refeje(){
        String data =   ";Cree una funcion que nos muestre los daos de la posición dos de un vector, luego \n" +
                        ";mostrarlos por pantalla con la funcion displayln\n\n" +
                        "\n" +
                        "(define (PosisionVector)\n" +
                        "      (define vect  (vector  #\\q \"Hola\" 34 #t))\n" +
                        "      (displayln (vector-ref vect 2))\n" +
                        ")\n" +
                        "\n" +
                        "(PosisionVector)";
        return data;
    }
    
    public String seteje(){
        String data =   ";Cree un vector, llénelo de datos y cambie el dato de la posición 2 por \"pollito\", luego \n" +
                        ";muéstrelo por pantalla usando la funcion displayln\n\n" +
                        "\n" +
                        "(define (ModificarVect)\n" +
                        "      (define vect  (vector  #\\q \"Hola\" 34 #t))\n" +
                        "      (vector-set! vect 2 \"pollito\")\n" +
                        "      (displayln vect)\n" +
                        ")\n" +
                        "\n" +
                        "(ModificarVect)";
        return data;
    }
    
    public String filleje(){
        String data = ";Hacer un  programa  que  reciba  un numero entero y cree un vector de tamaño  n,  donde\n" +
                        ";cada   posición   del  vector   se   llene  del índice  0  al 9  con  los  números   del  1  al  10.  \n" +
                        ";En caso  de que el vector sea mayor que  10  posiciones,  las  restantes  se  deben  llenar\n" +
                        ";con las letras del abecedario   desde    la   \"a\"  hasta la    \"z\"   y   en  caso tal que el numero\n" +
                        ";de posiciones  del vector sea   aún   mayor , las   posiciones   siguientes   deben   llenarse\n" +
                        ":con   la   misma   secuencia  de   números [1 al 10] y seguido las letras del abecedario.\n\n" +
                        "\n" +
                        "(defineVect(make-vector (read)))\n" +
                        "(define(LlenarVectLength Pos LlenarNumLlenarChar n)\n" +
                        "     (if(= LengthPos)\n" +
                        "           (displayVect)\n" +
                        "            (begin\n" +
                        "               (if(<= n 10)\n" +
                        "                  (begin\n" +
                        "                      (vector-set! Vect Pos LlenarNum)\n" +
                        "                      (LlenarVectLength (+ 1 Pos) (+ 1 LlenarNum) 97 (+ 1 n)) )\n" +
                        "                   (begin\n" +
                        "                     (vector-set! Vect Pos (integer->charLlenarChar))\n" +
                        "                     (if(= n 36)\n" +
                        "                       (LlenarVectLength (+ 1 Pos) 1 (+ 1 LlenarChar) 1)\n" +
                        "                       (LlenarVectLength (+ 1 Pos) 1 (+ 1 LlenarChar) (+ 1 n))\n" +
                        "                       ))\n" +
                        "                     )\n" +
                        "                 ))\n" +
                        "               )\n" +
                        "\n" +
                        "         (LlenarVect(vector-lengthVect) 0 1 (read) 1)";
        return data;
    }
    
    public String leneje(){
        String data =   ";Dado un  vector  con  diferentes  valores  imprimir  dichos  valores leyéndolos uno de manera\n" +
                        ";recursiva:\n\n" +
                        "\n" +
                        "(define Vect (vector \"Esto\" \" \"Es\" \" \"Un\" \"\n" +
                        " \"Vector\" \" \" \"Leído\" \" \" \"Recursivamente\" \".\") )\n" +
                        "(define (DisplayVectLength Pos)\n" +
                        "    (if (= (- Length 1) Pos)\n" +
                        "\n" +
                        " (display(vector-refVect Pos))\n" +
                        "    (begin\n" +
                        "       (display (vector-ref Vect Pos))\n" +
                        "        (display VectLength (+ 1 Pos))\n" +
                        "         )\n" +
                        "     )\n" +
                        " )\n" +
                        "(DisplayVect (vector-lengthVect) 0) ";
        return data;
    }
    
    public String buildeje(){
        String data =   ";Construir un programa que llene un vector del 1 al 15 usando la funcion build-vector y \n" +
                        ";mostrae\n" +
                        ";el resultado por pantalla\n\n" +
                        "\n" +
                        "(define (construirVector)\n" +
                        "         (define vect  (build-vector 5 add1))\n" +
                        "         (display vect)\n" +
                        ")\n" +
                        "\n" +
                        "(construirVector)";
        return data;
    }
    
    public String ejercicios(){
        String data =   "1. Construir un programa  que reciba un vector y muestre el ultimo\n" +
                        "dato del vector.\n" +
                        "\n" +
                        "2. Construir un programa que reciba un valor entero N y devuelva  un\n" +
                        "vector de tamaño N, donde cada posición del vector contiene el valor\n" +
                        "-1.\n" +
                        "\n" +
                        "3. Dado un vector con diferentes valores imprimir dichos valores del\n" +
                        "vector leyéndolos uno por uno de manera recursiva.\n" +
                        "\n" +
                        "4. Dado un numero n, crear un vector de tamaño n y  luego  ingresar\n" +
                        "en  el  vector  los  números  del  1  hasta  n,  e  imprimir  el vector. Ej:\n" +
                        "Dado el numero =5 ingresar en el vector (vector 1 2 3 4 5).\n" +
                        "\n" +
                        "5. Dado  un  vector  con  solo  números ,  realizar  la  suma  de  sus \n" +
                        "elementos.\n" +
                        "\n" +
                        "7. Dada  un  vector  con  n  números  calcular  el  promedio  de  los \n" +
                        "elementos del vector.\n" +
                        "\n" +
                        "8. Construir un programa que reciba un entero N y devuelva un \n" +
                        "vector de tamaño N almacenamiento los valores  leídos por teclado.\n" +
                        "\n" +
                        "11. Construir un programa que reciba un vector de enteros y un \n" +
                        "numero x. La funcion debe borrar el numero si lo encuentra y debe\n" +
                        " (mover a la izquierda) todos los elementos siguientes y dejando \n" +
                        "el valor -1 en la última posición. Hay que considerar que todos los números\n" +
                        "son diferentes.";
        return data;
    }
    
       
}
