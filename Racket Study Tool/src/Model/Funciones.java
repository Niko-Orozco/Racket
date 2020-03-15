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
                        "función \"display\", la cual nos sirve para mostrar el texto por pantalla.\n" +
                        "\n" +
                        "En Racket para el uso de las funciones es necesario agruparlas por medio\n" +
                        "de  paréntesis \"(  )\",  bien  sean  tanto  funciones  propias,  como  funciones\n" +
                        "creadas por el usuario.\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                       :\n" +
                        "(escribir \"Hola Mundo\")           :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                                      :\n" +
                        "(display \"Hola Mundo\")            :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - ";
        return data;
    }
    
    public String funciones2(){
        String data =   "Al  igual   que   en  otros  lenguajes  de  programación  en Racket podemos\n" +
                        "Asignar valores a variables,  Esto se puede usar usando la función \"define\".\n" +
                        "\n" +
                        "Muchas  veces  cuando  programamos  necesitamos  usar un mismo valor\n" +
                        "en   repetidas   ocasiones, para   ello, de forma más practica se  le  asigna  \n" +
                        "un nombre o (variable) al valor. \n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                        :\n" +
                        "(definir numer 234)                   :\n" +
                        "(definir letras \"Hola\")                :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        " Ejemplo                                      :\n" +
                        "(define numer 234)                   :\n" +
                        "(define letras \"Hola\")                :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - ";
        return data;
    }
    
    public String funciones3(){
        String data =   "A   diferencia    de   la    definición    de    parámetros,    los    argumentos   no\n" +
                        "tienen nombres.  Cada argumento   es  una expresión,  que puede contener \n" +
                        "cero o más variables, constantes y literales. El tipo de datos de la expresión \n" +
                        "evaluada   debe   coincidir    normalmente   con  el   tipo   de  datos   definido  \n" +
                        "para    el    parámetro    correspondiente   y   en  cualquier   caso,   debe   ser\n" +
                        "convertible  en  el tipo de parámetro.\n" +
                        "\n" +
                        "Parametro:\n" +
                        "Es una variable utilizada para recibir valores de entrada de un metodo.\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                                                                     :\n" +
                        "(definir (Suma parametroA parametroB)            :\n" +
                        "         (+  parametroA   parametroB)                      :\n" +
                        ")                                                                                  :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                                                                      :\n" +
                        "(define (Suma parametroA parametroB))           :\n" +
                        "         (+  parametroA   parametroB)                      :\n" +
                        ")                                                                                   :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "\n" +
                        "Argumento\n" +
                        "Valores que son enviados desde un método hacia una función\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                   Salida       :\n" +
                        "(Suma 2 3)    ->       5                :\n" +
                        "(Suma 6 9)    ->       15              :\n" +
                        "- - - - - - - - - - - - - - - - - - - - - - - - ";
        return data;
    }
    
    public String Ejefunciones1(){
        String data =   ";Crear un programa en Racket tal que eleve un número a una potencia, luego ese mismo \n" +
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
        String data =   ";Crear un programa en Racket tal que reciba dos números por teclado y los muestre por\n" +
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
        String data =   ";Crear un programa en Racket tal que mediante la función displayln mostrar los días de la\n" +
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
    
    public String Ejefunciones4(){
        String data =   ";Crear un programa que nos calcule el promedio de 4 notas\n" +
                        "\n" +
                        "(define n1 (read))\n" +
                        "(define n2 (read))\n" +
                        "(define n3 (read))\n" +
                        "(define n4 (read))\n" +
                        "\n" +
                        "(define (promedio w x y z)\n" +
                        "    (/ (+ w x y z)4)\n" +
                        ")\n" +
                        "\n" +
                        "(Promedio n1 n2 n3 n4)";
        return data;
    }
    
    public String Ejefunciones5(){
        String data =   ";Crear un programa que nos calcule el volumen de una esfera\n" +
                        "\n" +
                        "(define (cubo a)\n" +
                        "     (* a a a)\n" +
                        ")\n" +
                        "\n" +
                        "(define (Volumen radio)\n" +
                        "      (* (/ 4 3) 3.1416 (cubo radio))\n" +
                        ")\n" +
                        "\n" +
                        "(Volumen (read))";
        return data;
    }
    
    public String Ejefunciones6(){
        String data =   ";Calcular el perimetro de un Rectangulo.\n" +
                        "\n" +
                        "(define (Perimetro)\n" +
                        "   (display \"de altura: \")\n" +
                        "   (define l (read))\n" +
                        "   (display \"y de base: \")\n" +
                        "   (define y (read))\n" +
                        "   (display\" es: \")\n" +
                        "   (* 2 (+ l y))\n" +
                        ")\n" +
                        "\n" +
                        "(Perimetro)";
        return data;
    }
    
    
}
