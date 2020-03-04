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
public class Recursividad {

    public Recursividad() {
        
    }
    
    public String recursividad1(){
        String data =   "Los  ciclos  o  bucles permiten ejecutar repetidas veces una instrucción o \n" +
                        "un bloque de ellas; deben estar construidos de manera tal  que se pueda \n" +
                        "tener  control  de  la  cantidad de repeticiones a realizar, de lo contrario se \n" +
                        "generaría   un  ciclo  de  ejecución  infinita  que  podría  desencadenar  un\n" +
                        "desborde  de  memoria  y  en consecuencia un fallo de la aplicación, o un\n" +
                        "bloqueo de la misma porque el flujo de ejecución quedaría estancado en \n" +
                        "el  ciclo,   sobrecargando  de  tareas  al  procesador  de  la  máquina  que \n" +
                        "ejecuta el programa.";
        return data;
    }
    
    public String recursividad2(){
        String data =   "La   recursividad   consiste   en   funciones   que  se  llaman  a  sí mismas, \n" +
                        "evitando el uso de bucles y otros iteradores.\n" +
                        "";
        return data;
    }
    
    public String recursividad3(){
        String data =   "En   programación,   una   iteración   es   la   repetición   de   una   serie  de \n" +
                        "instrucciones en un programa de computadora";
        return data;
    }
    
    public String Ejerecursividad1(){
        String data =   ";Imprimir los números del uno al 10 recursivamente:\n\n" +
                        "\n" +
                        "(define(prinNum-10 X)\n" +
                        "     (if (= X 10)   \n" +
                        "        (display X)  \n" +
                        "            (begin \n" +
                        "                 (displlay X) \n" +
                        "                 (PrinNum- 10  (+  1  X))) \n" +
                        "      )\n" +
                        "   )\n" +
                        "\n" +
                        "  (PrinNum-10   0)";
        return data;
    }
    
    
     public String Ejerecursividad2(){
        String data =   ";Construir un programa que calcula la cantidad  de divisores  de un numero utilizando la ;recursividad.\n\n" +
                        "\n" +
                        "   (define(Divs A Cont)\n" +
                        "        (if  (= Cont 1) \n" +
                        "          (display (/ A Cont))  \n" +
                        "          (begin    \n" +
                        "            (if (interger? (/ A Cont))\n" +
                        "              (begin\n" +
                        "               (display( / A Cont))\n" +
                        "               (newline)  \n" +
                        "               (Divs A (- Cont 1) )  \n" +
                        "           )\n" +
                        "         (Divs A (- Cont 1) )   \n" +
                        "  )  )  )  )\n" +
                        "\n" +
                        "  (define  (Divisores X)\n" +
                        "       (Divs XX 0)   )\n" +
                        "  (Divisores 110240)";
        return data;
    }
     
      public String Ejerecursividad3(){
        String data =   ";Hacer  un  programa  que  reciba   un  número  y  determine  si  es  un numero perfecto. Un \n" +
                        ";número es perfecto  cuando la suma de sus divisores menores a el ,da como resultado el \n" +
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
