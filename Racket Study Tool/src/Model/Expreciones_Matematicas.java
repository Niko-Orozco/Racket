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
public class Expreciones_Matematicas {

    public Expreciones_Matematicas() {
    }
    
    public String expreciones1(){
        String data =   "Imprimir los numeros del uno al 10 recursivamente:\n" +
                        "(define(prinNum-10 X)\n" +
                        "     (if (= X 10)    ;El caso base se dara cuando X sea igual a 10\n" +
                        "        (display X)   ;Cuando el caso base se cumpla se imprimira \"X\"\n" +
                        "            (begin  ;Casos generales, cuando X no es igual a 10\n" +
                        "                 (displlay X)   ;Si X es diferente de 10 imprimir \"X\"\n" +
                        "                 (PrinNum- 10  (+  1  X)))   ;Si X diferente de 10, volver a llamar la funcion  \n" +
                        "                       estableciendo a X como X+1\n" +
                        "      )\n" +
                        "   )\n" +
                        "  (PrinNum-10   0)   ;llamado de la funcion";
        return data;
    }
    
    
     public String expreciones2(){
        String data =   "Construir un programa que calcula la cantidad  de divisores  de un numero utilizando la recursividad.\n" +
                        "\n" +
                        "   (define(Divs A Cont)\n" +
                        "        (if  (= Cont 1)  ;Caso base cuando Cont = 1\n" +
                        "          (display (/ A Cont))  ;Imprimir el # divisor\n" +
                        "          (begin ;Casos generales, cuando cont no es igual a 1\n" +
                        "            (if (interger? (/ A Cont))\n" +
                        "              (begin\n" +
                        "               (display( / A Cont))\n" +
                        "               (newline)     ;Salto de linea\n" +
                        "               (Divs A (- Cont 1) )  ;Llamado recursivo\n" +
                        "           )\n" +
                        "         (Divs A (- Cont 1) )  ; Llamado recursivo\n" +
                        "  )  )  )  )\n" +
                        "  (define  (Divisores X)\n" +
                        "       (Divs X X 0)   )\n" +
                        "  (Divisores 110240)";
        return data;
    }
     
      public String expreciones3(){
        String data =   "Hacer un programa que reciba  un numero y determine si es un numero perfecto. Un numero es perfecto  cuando la suma de sus divisores menores a el ,da como resultado el mismo numero. Ej: 28 es un numero perfecto pues sus divisores son 14,7,4,2,1 y la suma de estos numeros da 28.\n" +
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
                        " (Perfecto?28)";
        return data;
    }
      
       public String expreciones4(){
        String data =   "Para el primer renglon solo se pide imprimir una letra \"A\" y luego se debe saltar al nuevo renglon, sin espacios en blanco.\n" +
                        "\n" +
                        "Para el segundo renglon se debe colocar un espacio en blanco, luego imprimir una letra \"A\" y despues se debe saltar al nuevo renglon\n" +
                        "\n" +
                        "Para el tercer  renglon se debe colocar dos espacios en blanco, luego imprimir una letra \"A\" y despues se debe saltar al nuevo renglon.\n" +
                        "\n" +
                        "Para el cuarto renglon se debe colocar tres espacios en blanco, luego imprimir una letra \"A\" y despues se debe saltar al nuevo renglon\n" +
                        "\n" +
                        "\n" +
                        ";Usando el lenguaje muy Grande\n" +
                        "  (define  (Espacios a)\n" +
                        "      (if  (> a 1)\n" +
                        "         (begin\n" +
                        "             (display \" \")\n" +
                        "             (Espacios  (- a 1 ) )   ) ) )\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
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
