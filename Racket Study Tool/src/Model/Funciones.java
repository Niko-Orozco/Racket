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
public class Funciones {

    public Funciones() {
        
    }
    
    public String funciones1(){
        String data =   "Las funciones primitivas son aquellas que ya están definidas en el lenguaje\n" +
                        "de programación, por ejemplo la función de suma representada por \"+\"  y la\n" +
                        "función \"display\", la cual nos sirve para mostrar por pantalla texto\n" +
                        "\n" +
                        "En Racket para el uso de las funciones es necesario agruparlas por medio\n" +
                        "de  paréntesis \"(  )\",  bien  sean  tanto  funciones  propias,  como  funciones\n" +
                        "creadas por el usuario\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "(display \"Hola Mundo\")";
        return data;
    }
    
    public String funciones2(){
        String data =   "Al  igual   que   en  otros  lenguajes  de  programación  en Racket podemos\n" +
                        "Asociar valores a  nombres,  Esto  se  puede usar usando la función define\n" +
                        "\n" +
                        "Muchas  veces  cuando  programamos  necesitamos  usar un mismo valor\n" +
                        "en   repetidas   ocasiones,   sería   muy    tedioso  he  ineficiente  tener  que \n" +
                        "escribir   el   mismo   valor  tantas  veces  para   ello  le  asigna  un nombre o\n" +
                        "(variable) a el valor. Por ejemplo\n" +
                        "\n" +
                        "(define numer 234)\n" +
                        "(define letras \"Hola\")";
        return data;
    }
    
    public String funciones3(){
        String data =   "A  diferencia  de  la   definición   de   parámetros,   los   argumentos   no   tienen\n" +
                        "nombres.  Cada argumento  es una expresión, que puede contener cero o más\n" +
                        "variables, constantes y literales. El tipo de datos de la expresión evaluada debe\n" +
                        "coincidir    normalmente   con  el  tipo   de  datos   definido   para   el  parámetro \n" +
                        "correspondiente   y,   en  cualquier   caso,   debe   ser  convertible  en  el tipo de \n" +
                        "parámetro.";
        return data;
    }
    
    public String Ejefunciones1(){
        String data =   ";crear un programa en Racket tal que eleve un numero a una potencia, luego ese mismo \n" +
                        ";número mostrarlo por pantalla\n\n" +
                        "\n" +
                        "(define (MostrarPotencia n)\n" +
                        "          (display (expt n 2))\n" +
                        ")\n" +
                        "\n" +
                        "(MostrarPotencia 3)";
        return data;
    }
    
    public String Ejefunciones2(){
        String data =   ";crear un programa en Racket tal que reciba dos números por teclado y los muestre por\n" +
                        ";pantalla, muestre la suma de los números y su multiplicación\n" +
                        "\n" +
                        ";Creamos la función con dos argumentos\n\n" +
                        "\n(define (datos n1 n2)\n" +
                        "      (display n1)\n" +
                        "      (display \" \")\n" +
                        "      (display n2)\n" +
                        "      (display \" \")\n" +
                        "      (display (+ n1 n2))\n" +
                        "      (display \" \")\n" +
                        "      (display (* n1 n2))\n" +
                        ")\n" +
                        "(datos (read) (read))";
                       
        return data;
    }
    
    public String Ejefunciones3(){
        String data =   ";crear un programa en Racket tal que mediante la función displayln mostrar los días de la\n" +
                        ";semana\n" +
                        ";la función displayln nos sirve para dar un salto de línea es decir, es como dar un enter\n" +
                        "\n" +
                        ";Creamos la función DiasSemana\n\n" +
                        "(define (DiasSemana)\n" +
                        "      (displayln \" Lunes\")\n" +
                        "      (displayln \" Martes\")\n" +
                        "      (displayln \" Miércoles\")\n" +
                        "      (displayln \" Jueves\")\n" +
                        "      (displayln \" Viernes\")\n" +
                        "      (displayln \" Sábado\")\n" +
                        "      (displayln \" Domingo\")\n" +
                        ")\n" +
                        "(DiasSemana)";
        return data;
    }
    
    
}
