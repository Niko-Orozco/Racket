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
        String data =   "Se entiende por exprecion aritmetica a aquella donde los operandos que \n" +
                        "intervienen  en  dicha exprecion son numeros, el resultado es un numero \n" +
                        "y los operadores son aritmeticos.\n" +
                        "\n" +
                        "+,  - ,  * ,  /";
        return data;
    }
    
    
     public String expreciones2(){
        String data =   "Los operadores logicos y de comparacion nos proporcionan un resultado\n" +
                        "que indica el cumplimiento o no de una condicion, es decir:\n" +
                        "\n" +
                        "Si a < b:\n" +
                        "       imprimir: a\n" +
                        "sino:\n" +
                        "       imprimir: b";
        return data;
    }
     
      public String Ejeexpreciones1(){
        String data =   ";Calcular el area de un anillo\n" +
                        "\n" +
                        "(define (AreaAnillo R-int R-ext)\n" +
                        "          (-  (* pi (expt R-ext 2)) (* pi (expt R-int 2)))                      ;Area = ( Pi*r^2 ) - ( Pi*r^2 )\n" +
                        ")\n" +
                        "\n" +
                        ";Definimos la funcion para mostrar el area\n" +
                        "(define (Area var1 var2)\n" +
                        "    (display \"Area del Anillo\")\n" +
                        "    (display (AreaAnillo var1 var2))\n" +
                        ")\n" +
                        "\n" +
                        ";Llamamos la funcion\n" +
                        "(Area (read) (read))";
        return data;
    }
      
    public String Ejeexpreciones2(){
        String data =   ";Definir una funcion que calcule la distancia entre dos puntos de una recta\n" +
                        "\n" +
                        ";La formula para esto es:  raiz ( (x2-x1)^2 + (y2-y1)^2 )\n" +
                        "\n" +
                        ";Creamos la funcion de distancia\n" +
                        "\n" +
                        "(define (Distancia x1 x2 y1 y2)\n" +
                        "          (displayln \"Distancia\")\n" +
                        "          [sqrt (+ (expt (- x2 x1) 2) (expt (- y2 y1) 2)) ]   ;Expresamos la ecuacion en terminologia Racket\n" +
                        ")\n" +
                        "\n" +
                        ";Llamamos la funcion y pedimos al usuaro que ingrese los puntos\n" +
                        "(Distancia (read) (read) (read) (read))";
        return data;
    }
}
