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
    
    public String Vector(){
        String data =   "Un vector  se puede ver como un conjunto  de  elementos  ordenados  en \n" +
                        "filas o ( filas y culmnas si tuviera dos dimenciones ) \n" +
                        "\n" +
                        "En programacion, una matriz o un vector es una zona de almacenamiento\n" +
                        "continuo   que   contiene   una   serie   de  elementos del msimo tipo. Los \n" +
                        "elementos del vector.\n" +
                        "\n" +
                        "El  tipo  de  dato  vector,  es conocido como un tipo de dato compuesto de \n" +
                        "uno  o  mas  tipos  de  dato  basico,  primitivo  o  de  otros  tipos  de datos \n" +
                        "compuestos, inclusive vectores mismos.\n" +
                        "\n" +
                        "forma general del vector\n" +
                        "\n" +
                        "\n" +
                        "          0           1         2         3          4          5         6          7        8            9\n" +
                        "      ------------------------------------------------------------------------------------------\n" +
                        "      |           |          |           |           |           |           |           |           |           |           | \n" +
                        "      ------------------------------------------------------------------------------------------\n" +
                        "  Vector unidimensional de 10 elementos.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " Sintaxis de vectores.\n" +
                        "\n" +
                        "                (vector(+ 2 2) 1 #\\q 'Wooow\"¡Hola!\")\n" +
                        "\n" +
                        "Este vector, tiene 5 elementos, el primero de ellos (cuyo índice es 0)\n" +
                        "es la funcion (+ 2 2), el segundo es el numero entero 1, el tercero \n" +
                        "es el caracter #\\q, el cuarto es el simbolo 'Wooow, y el quinto es la \n" +
                        "cadena \"¡Hola!\".\n" +
                        "\n" +
                        "La funciones vector, crea un vector unicamente con los elementos\n" +
                        "que se le indiquen en el momento de declarar dicha funcion.\n" +
                        "Adicionalmente podemos modificar dichos elementos o hacer \n" +
                        "referencia a ellos. Tambien existen funciones que nos permiten \n" +
                        "crear un vector  vacio con n posiciones  o de n posiciones con un \n" +
                        "mismo dato dentro de todas ellas. En Racket a diferencia de la \n" +
                        "mayoria de lenguajes de programacion podemos almacenar \n" +
                        "absolumente cualquier tipo de dato en nuestros vectores.\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "Ejemplos de programas con vectores.\n" +
                        "\n" +
                        "Ejercicios N° 1.\n" +
                        "\n" +
                        "Dado un vector con diferentes valores imprimir dichos valores \n" +
                        "leyendolos uno de manera recursiva:\n" +
                        "\n" +
                        "(define Vect (vector \"Esto\" \" \"Es\" \" \"Un\" \"\n" +
                        " \"Vector\" \" \" \"Leido\" \" \" \"Recursivamente\" \".\") )\n" +
                        "(define (DisplayVectLength Pos)\n" +
                        "    (if (= (- Length 1) Pos)\n" +
                        ";El tamaño del vector es 12, \n" +
                        "pero su ultima posicion es de 11 (porque empiezan a contar en 0)\n" +
                        "por lo tanto Length se debe restar en 1 \n" +
                        "      (display(vector-refVect Pos))\n" +
                        "      (begin\n" +
                        "          (display (vector-refVect Pos))\n" +
                        "          (display VectLength (+ 1 Pos))\n" +
                        "          )\n" +
                        "      )\n" +
                        "  )\n" +
                        "(DisplayVect (vector-lengthVect) 0) \n" +
                        "\n" +
                        "\n" +
                        "Ejercicio N°2\n" +
                        "\n" +
                        "Hacer un programa que reciba un \n" +
                        "numero entero y cree un vector de tamaño n, donde cada posicion \n" +
                        "del vector se llene del indice 0 al 9 con los numeros del 1 al 10.\n" +
                        "En caso de que el vector sea mayor que 10 posiciones, las restantes \n" +
                        "se deben llenar con las letras del abecedario desde la \"a\" hasta la \"z\" \n" +
                        "y en caso tal que el numero de posiciones del vector sea aun mayor, \n" +
                        "las posiciones siguientes deben llenarse con la misma secuencia de \n" +
                        "numeros (1 al 10) y seguido las letras del abecedario.\n" +
                        "\n" +
                        "         (defineVect(make-vector (read)))\n" +
                        "         (define(LlenarVectLength Pos LlenarNumLlenarChar n)\n" +
                        "           (if(= LengthPos)\n" +
                        "              (displayVect)\n" +
                        "              (begin\n" +
                        "                 (if(<= n 10)\n" +
                        "                    (begin\n" +
                        "                       (vector-set! Vect Pos LlenarNum)\n" +
                        "                       (LlenarVectLength (+ 1 Pos) (+ 1 LlenarNum) 97 (+ 1 n)) )\n" +
                        "                    (begin\n" +
                        "                      (vector-set! Vect Pos (integer->charLlenarChar))\n" +
                        "                      (if(= n 36)\n" +
                        "                        (LlenarVectLength (+ 1 Pos) 1 (+ 1 LlenarChar) 1)\n" +
                        "                        (LlenarVectLength (+ 1 Pos) 1 (+ 1 LlenarChar) (+ 1 n))\n" +
                        "                        ))\n" +
                        "                      )\n" +
                        "                  ))\n" +
                        "                )\n" +
                        "\n" +
                        "           (LlenarVect(vector-lengthVect) 0 1 97 1)\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "1. Construir un programa  que reciba un vector \n" +
                        "y muestre el ultimo dato del vector.\n" +
                        "\n" +
                        "2. Construir un programa que reciba un valor entero N y devuelva \n" +
                        "yn vector de tamaño N, donde cada posicion del vector contiene \n" +
                        "el valor-1.\n" +
                        "\n" +
                        "3. Dado un vector con diferentes valores imprimir dichos valores \n" +
                        "del vector leyendolos uno por uno de manera recursiva.\n" +
                        "\n" +
                        "4. Dado un numero n, crear un vector de tamaño n y luego ingresar\n" +
                        "en el vector los numeros del 1 hasta n, e imprimir el vector. Ej:\n" +
                        "Dado el numero =5 ingresar en el vector (vector 1 2 3 4 5).\n" +
                        "\n" +
                        "5. Dado un vector con solo numeros, realizar la suma de sus \n" +
                        "elementos.\n" +
                        "\n" +
                        "7. Dada un vector con n numeros calcular el promedio de los \n" +
                        "elementos del vector.\n" +
                        "\n" +
                        "8. Construir un programa que reciba un entero N y devuelva un \n" +
                        "vector de tamaño N almacenamiento los valores  leidos por teclado.\n" +
                        "\n" +
                        "11. Construir un programa que reciba un vector de enteros y un \n" +
                        "numero x. La funcion debe borrar el numero si lo encuentra y debe\n" +
                        " (mover a la izquierda) todos los elementos siguientes y dejando \n" +
                        "el valor -1 en la ultima posicion. Considerar que todos los numeros\n" +
                        "son diferentes.\n" +
                        "";
        return data;
    }
     
}
