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
        String data =   "Se entiende por expresión aritmética a aquella donde los operandos que \n" +
                        "intervienen  en  dicha expresión son números, el resultado es un numero \n" +
                        "y los operadores son aritméticos.\n" +
                        "\n" +
                        "+,  - ,  * ,  /";
        return data;
    }
    
    
     public String expreciones2(){
        String data =   "Los operadores lógicos y de comparación nos proporcionan un resultado\n" +
                        "que indica el cumplimiento o no de una condición, es decir:\n" +
                        "\n" +
                        "Si (< a  b)\n" +
                        "       escribir: a\n" +
                        "sino\n" +
                        "       escribir: b";
        return data;
    }
     
      public String Ejeexpreciones1(){
        String data =   ";Calcular el área de un anillo\n\n" +
                        "\n" +
                        "(define (AreaAnillo R-int R-ext)\n" +
                        "         (-  (* pi (expt R-ext 2)) (* pi (expt R-int 2))) \n" +
                        ")\n" +
                        "\n" +
                        "(define (Area var1 var2)\n" +
                        "    (display \"Area del Anillo\")\n" +
                        "    (display (AreaAnillo var1 var2))\n" +
                        ")\n" +
                        "\n" +
                        "(Area (read) (read)))";
        return data;
    }
      
    public String Ejeexpreciones2(){
        String data =   ";Definir una función que calcule la distancia entre dos puntos de una recta\n" +
                        "\n" +
                        ";La fórmula para esto es:  raíz [ [x2-x1]^2 + [y2-y1]^2 ]\n" +
                        "\n" +
                        ";Creamos la función de distancia\n\n" +
                        "\n" +
                        "(define (Distancia x1 x2 y1 y2)\n" +
                        "          (displayln \"Distancia\")\n" +
                        "          [sqrt (+ (expt (- x2 x1) 2) (expt (- y2 y1) 2)) ] \n" +
                        ")\n" +
                        "\n" +
                        "(Distancia (read) (read) (read) (read))";
        return data;
    }
}
