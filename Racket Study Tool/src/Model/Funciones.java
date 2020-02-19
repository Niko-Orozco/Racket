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
        String data =   "Las funciones primitivas son aquellas que ya estan definidas en el lenguaje\n" +
                        "de programacion, por ejemplo la funcion de suma reprecentada por \"+\"  y la\n" +
                        "funcion \"display\", la cual nos sirve para mostrar por pantalla texto\n" +
                        "\n" +
                        "En Racket para el uso de las funciones es necesario agruparlas por medio\n" +
                        "de  parentesis \"(  )\",  bien  sean  tanto  funciones  porpias,  como  funciones\n" +
                        "creadas por el usuario\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "(display \"Hola Mundo\")";
        return data;
    }
    
    public String funciones2(){
        String data =   "Al igual que en otros lenguajes de programacion en Racket podemos\n" +
                        "Asociar valores a nombres, Esto se puede usar usando la funcion define\n" +
                        "\n" +
                        "Muchas veces cuando programamos necesitamos usar un mismo valor\n" +
                        "en repetidas ocasiones, seria muy tedioso he ineficiente tener que \n" +
                        "escribir el mismo valor tantas veces para ello le asiga un nombre o\n" +
                        "(variable) a el valor. Por ejemplo\n" +
                        "\n" +
                        "(define numer 234)\n" +
                        "(define letras \"Hola\")";
        return data;
    }
    
    public String Ejefunciones1(){
        String data =   ";crear un programa en Racket tal que eleve un numero a una potencia, luego ese mismo \n" +
                        ";numero mostrarlo por pantalla\n" +
                        "\n" +
                        "(define (MostrarPotencia n)\n" +
                        "          ;elevamos el numero al cuadrado y luego lo mostramos\n" +
                        "          (display (expt n 2))\n" +
                        ")\n" +
                        "\n" +
                        ";llamamos la funcion\n" +
                        "(MostrarPotencia 3)";
        return data;
    }
    
    public String Ejefunciones2(){
        String data =   ";crear un programa en Racket tal que reciva dos numeros por teclado y los muestre por\n" +
                        ";pantalla, muestre la suma de los numeros y su multiplicacion\n" +
                        "\n" +
                        ";Creamos la fucnon con dos argumentos\n" +
                        "(define (datos n1 n2)\n" +
                        "      ;mostramos los datos usando la funcion display\n" +
                        "      (display n1)\n" +
                        "      (display \" \")\n" +
                        "      (display n2)\n" +
                        "      (display \" \")\n" +
                        "      (display (+ n1 n2))\n" +
                        "      (display \" \")\n" +
                        "      (display (* n1 n2))\n" +
                        ")";
        return data;
    }
    
    public String Ejefunciones3(){
        String data =   ";crear un programa en Racket tal que mediante la funcion displayln mostrar los dias de la\n" +
                        ";semana\n" +
                        "\n" +
                        ";la funcion displayln nos sirve para dar un salto de linea es decir, es como dar un enter\n" +
                        "\n" +
                        ";Creamos la fucnon \n" +
                        "(define (DiasSemana)\n" +
                        "      ;mostramos los datos usando la funcion display\n" +
                        "      (displayln \" Lunes\")\n" +
                        "      (displayln \" Martes\")\n" +
                        "      (displayln \" Miercoles\")\n" +
                        "      (displayln \" Jueves\")\n" +
                        "      (displayln \" Viernes\")\n" +
                        "      (displayln \" Sabado\")\n" +
                        "      (displayln \" Domingo\")\n" +
                        ")\n" +
                        "(DiasSemana)";
        return data;
    }
    
    
}
