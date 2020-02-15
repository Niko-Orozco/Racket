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
    
    public String ejercicios(){
        String data =   "1. Construir un programa  que reciba un vector y muestre el ultimo\n" +
                        "dato del vector.\n" +
                        "\n" +
                        "2. Construir un programa que reciba un valor entero N y devuelva  un\n" +
                        "vector de tamaño N, donde cada posicion del vector contiene el valor\n" +
                        "-1.\n" +
                        "\n" +
                        "3. Dado un vector con diferentes valores imprimir dichos valores del\n" +
                        "vector leyendolos uno por uno de manera recursiva.\n" +
                        "\n" +
                        "4. Dado un numero n, crear un vector de tamaño n y  luego  ingresar\n" +
                        "en  el  vector  los  numeros  del  1  hasta  n,  e  imprimir  el vector. Ej:\n" +
                        "Dado el numero =5 ingresar en el vector (vector 1 2 3 4 5).\n" +
                        "\n" +
                        "5. Dado  un  vector  con  solo  numeros ,  realizar  la  suma  de  sus \n" +
                        "elementos.\n" +
                        "\n" +
                        "7. Dada  un  vector  con  n  numeros  calcular  el  promedio  de  los \n" +
                        "elementos del vector.\n" +
                        "\n" +
                        "8. Construir un programa que reciba un entero N y devuelva un \n" +
                        "vector de tamaño N almacenamiento los valores  leidos por teclado.\n" +
                        "\n" +
                        "11. Construir un programa que reciba un vector de enteros y un \n" +
                        "numero x. La funcion debe borrar el numero si lo encuentra y debe\n" +
                        " (mover a la izquierda) todos los elementos siguientes y dejando \n" +
                        "el valor -1 en la ultima posicion. Considerar que todos los numeros\n" +
                        "son diferentes.";
        return data;
    }
    
    public String quevect(){
        String data =   "Un vector   se puede ver como un conjunto  de  elementos  ordenados\n" +
                        "en filas o ( filas y culmnas si tuviera dos dimenciones ) \n" +
                        "\n" +
                        "En    programacion,    una   matriz    o    un   vector   es   una   zona    de \n" +
                        "almacenamiento continuo   que   contiene   una   serie   de  elementos\n" +
                        "del msimo tipo. Los elementos del vector.\n" +
                        "\n" +
                        "El  tipo  de  dato  vector,  es conocido como un tipo de dato compuesto \n" +
                        "de uno  o  mas  tipos  de  dato  basico,  primitivo  o  de  otros  tipos  de \n" +
                        "datos compuestos, inclusive vectores mismos.";    
        return data;
    }
    
    public String vectset(){
        String data =   "vector-set!  es una funcion de  Racket  que toma tres parametros como \n" +
                        "referencia para modificar un dato de un vector, lo primero que recive es\n" +
                        "el vector  el  segundo  dato  es  la  posicion del elemento a cambiar y el\n" +
                        "tercero es el dato por el que deseamos reemplazar\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(vector-set! vect n dato)";    
        return data;
    }
    
    public String vectfill(){
        String data =   "vector-fill  es una funcion de  Racket  permite ingresar el mismo dato en \n" +
                        "todas las posiciones de un vector, tomando dos parametros, el nombre\n" +
                        "del vecotr y el dato a introducir en todas las posociones\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(vector-fill vect  dato)";    
        return data;
    }
    
    public String vectlen(){
        String data =   "vector-length  es una funcion que nos permite saber cuantas posiciones\n" +
                        "tiene un vector, es decir su tamaño y solo toma un vector\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(vector-length vect)";    
        return data;
    }
    
    public String makevect(){
        String data =   "La funcions make-vector, crea un vector unicamente  con los  elementos\n" +
                        "que   se   le   indiquen   en   el   momento   de   declarar   dicha    funcion.\n" +
                        "Adicionalmente.   En  Racket  a diferencia de  la mayoria   de   lenguajes\n" +
                        "de  programacion   podemos   almacenar  absolumente  cualquier  tipo  \n" +
                        "de  dato  en  nuestros  vectores.\n" + 
                        "Para la creacion de vectores podemos usar la  funcion make-vector\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(make-vector 6 # 'w)\n" +
                        "\n" +
                        "(make-vector 5 )  \n" +
                        "Crea un vector de 5 posiciones vacio o con el elemento 0";    
        return data;
    }
    
    public String vectref(){
        String data =   "Al  igual  que  con  las  cadenas  podemos  obtener   datos   de   un   vector\n" +
                        "haciendo  uso  de  la  funcion  (vector-ref)\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(vector-ref vect n) \n" +
                        "vect  es  el  vector  al  cual  queremos  sacar uno o mas datos y la \"n\" hace\n" +
                        "referencia a la posicion en el vector donde queremos sacar la informacion";    
        return data;
    }
    
    public String codigo(){
        String data =   ";Hacer un  programa  que  reciba  un numero entero y cree un vector de tamaño  n,  donde  cada\n" +
                        ";posicion   de l  vector   se   llene  del indice  0 al 9 con  los  numeros  del  1  al  10.   En  caso  de\n" +
                        ";que el vector sea mayor que  10  posiciones,  las  restantes  se  deben  llenar con las letras del\n" +
                        ";abecedario   desde    la   \"a\"  hasta la   \"z\"  y  en caso tal que el numero de posiciones del vector\n" +
                        ";sea  aun  mayor , las  posiciones  siguientes  deben  llenarse   con   la   misma   secuencia  de\n" +
                        ";numeros (1 al 10) y seguido las letras del abecedario.\n" +
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
                        "         (LlenarVect(vector-lengthVect) 0 1 97 1)";
        String code2 = ";Dado un  vector  con  diferentes  valores  imprimir  dichos  valores leyendolos uno de manera\n" +
                        ";recursiva:\n" +
                        "\n" +
                        "(define Vect (vector \"Esto\" \" \"Es\" \" \"Un\" \"\n" +
                        " \"Vector\" \" \" \"Leido\" \" \" \"Recursivamente\" \".\") )\n" +
                        "(define (DisplayVectLength Pos)\n" +
                        "    (if (= (- Length 1) Pos)\n" +
                        "\n" +
                        ";El  tamaño  del  vector  es  12,  pero  su  ultima posicion es de 11 (porque  empiezan  a  contar\n" +
                        ";en 0)  por  lo  tanto  Length  se  debe restar en 1 \n" +
                        "\n" +
                        " (display(vector-refVect Pos))\n" +
                        "    (begin\n" +
                        "       (display (vector-refVect Pos))\n" +
                        "        (display VectLength (+ 1 Pos))\n" +
                        "         )\n" +
                        "     )\n" +
                        " )\n" +
                        "(DisplayVect (vector-lengthVect) 0) ";
        return data;
    }
     
}
