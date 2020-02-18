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
public class Listas_Pares {
   

    public Listas_Pares() {
        
    }
    
    public String Pares1(){
        String data =   "Un   par  es una estructura de datos con dos campos llamados cabeza y\n" +
                        "cola.  Los  pares   son   creados   con el procedimiento cons. Se pueden \n" +
                        "agregar cualquier tipo de dato";
        return data;
    }
    
    public String Pares2(){
        String data =   "La funcion cons permite crear un par y tiene dos argumentos. El primero:\n" +
                        "la cabeza y el segundo: la cola\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(cons a b) -> la cabeza es a y la cola es b";
        return data;
    }
    
    public String Pares3(){
        String data =   "La funcion car nos sirve para  extraer la cabeza  de un par   y el argumento\n" +
                        "que recive es un par para ser analizado\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(define par (cons 1 \"hola\"))\n" +
                        "(displayln (car par))  -->  1";
        return data;
    }
    
    public String Pares4(){
        String data =   "La funcion cdr nos sirve para    extraer   la  cola   de un par   y el argumento\n" +
                        "que recive es un par para ser analizado\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "    (define par (cons 3 \\\"mama\\\"))\n" +
                        "    (displayln (cdr par))  -->  \"hola\"";
        return data;
    }
    
    public String Pares5(){
        String data =   "El procediemiento pair? nos permite determinar si un objeto es o no, tiene\n" +
                        "un solo argumento y solo es el objeto a evaluar\n" +
                        "\n" +
                        "(define par (cons 3 \"pollito\"))\n" +
                        "(pair? par) --> #t";
        return data;
    }
    
    public String EjePares1(){
        String data =   "; mediante el procedimiento cons cree 3 pares y llenelos con difrentes tipos de datos, luego \n" +
                        ";mostrar los datos almacenados en el par\n" +
                        "\n" +
                        "(define par1 (cons (read) (read)))\n" +
                        "(define par2 (cons (read) (read)))\n" +
                        "(define par3 (cons (read) (read)))\n" +
                        "\n" +
                        "(displayln par1)\n" +
                        "(displayln par2)\n" +
                        "(displayln par3)";
        return data;
    }
   
    public String EjePares2(){
        String data =   "; mediante el procedimiento cons cree 3 pares y llene las cabezas con numero, luego \n" +
                        ";mostrar la suma de las cabezas de los pares\n" +
                        "\n" +
                        "(define par1 (cons (read) (read)))\n" +
                        "(define par2 (cons (read) (read)))\n" +
                        "(define par3 (cons (read) (read)))\n" +
                        "\n" +
                        "(displayln (+ (+ (car par1) (car par2)) (car par3)))";
        return data;
    }
   
    public String EjePares3(){
        String data =   "; mediante el procedimiento cons cree 2 pares y llene las colas con cadenas, luego \n" +
                        ";mostrar los datos de las colas de los pares\n" +
                        "\n" +
                        "(define par1 (cons (read) (read)))\n" +
                        "(define par2 (cons (read) (read)))\n" +
                        "\n" +
                        "(displayln (cdr par1)) \n" +
                        "(displayln (cdr par2))\n";
        return data;
    }
    
    public String EjePares4(){
        String data =   "; mediante el procedimiento cons cree un par y llenelo de cualquier tipo de dato luego mediante\n" +
                        ";el procedimiento pair?, decir si es par o si no lo es\n" +
                        "\n" +
                        "\n" +
                        "(define par1 (cons (read) (read)))\n" +
                        "(define (espar?)\n" +
                        "    (if (pair? par1)\n" +
                        "          (displayln \"Es par es:\")(displayln par1)\n" +
                        "          (displayln \"No es par\")\n" +
                        "     )\n" +
                        ")\n" +
                        "\n" +
                        "(espar?)";
        return data;
    }
    
    public String Listas1(){
        String data = "";
        return data;
    }
    
    public String Listas2(){
        String data = "";
        return data;
    }
    
    public String Listas3(){
        String data = "";
        return data;
    }
    
    public String Listas4(){
        String data = "";
        return data;
    }
    
    public String Listas5(){
        String data = "";
        return data;
    }
    
    public String Listas6(){
        String data = "";
        return data;
    }
   
    public String Ejercicios(){
        String data = "";
        return data;
    }
   
}
