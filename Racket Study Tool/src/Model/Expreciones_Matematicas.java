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
                        "intervienen  en  dicha expresión son números, el resultado es un número \n" +
                        "y los operadores son aritméticos.\n" +
                        "\n" +
                        "+,  - ,  * ,  /";
        return data;
    }
    
    
     public String expreciones2(){
        String data =   "Los   operadores   lógicos  y  de  comparación  nos  proporcionan  un \n" +
                        "resultado que indica el cumplimiento o no de una condición, es decir:\n" +
                        "\n" +
                        "- - - - - - - - - - - - - - - - - - - \n" +
                        "Sintaxis                            :\n" +
                        "(Si (< a  b)                       :\n" +
                        "       (escribir  a)              :\n" +
                        "sino                                  :\n" +
                        "       (escribir  b)              :\n" +
                        ")                                         :\n" +
                        "- - - - - - - - - - - - - - - - - - - \n" +
                        "Ejemplo                           :\n" +
                        "(if (< a  b)                         :\n" +
                        "       (display a)                :\n" +
                        "       (display b)                :\n" +
                        ")                                         :\n" +
                        "- - - - - - - - - - - - - - - - - - - ";
        return data;
    }
     
      public String Ejeexpreciones1(){
        String data =   ";Calcular el área de un anillo.\n\n" +
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
        String data =   ";Desarrolle un programa que nos diga cual es el área del arco de una circunferencia.\n" +
                        "\n" +
                        "(define (ArcoCircunferencia)\n" +
                        "     (display \"de radio: \")\n" +
                        "      (define r (read))\n" +
                        "      (display \"de alfa: \")\n" +
                        "      (define alfa (read))\n" +
                        "      (display \"es: \")\n" +
                        "      (/ (*(*(* 2 pi)r)alfa)360)\n" +
                        ")\n" +
                        "\n" +
                        "(ArcoCircunferencia)";
        return data;
    }
    
    public String Ejeexpreciones3(){
        String data =   ";Definir una función que calcule la distancia entre dos puntos de una recta.\n" +
                        "\n" +
                        ";La fórmula para esto es:  raíz [ [x2-x1]^2 + [y2-y1]^2 ]\n" +
                        "\n" +
                        ";Creamos la función de distancia.\n\n" +
                        "\n" +
                        "(define (Distancia x1 x2 y1 y2)\n" +
                        "          (display \"Distancia\")\n" +
                        "          (sqrt (+ (expt (- x2 x1) 2) (expt (- y2 y1) 2)) ) \n" +
                        ")\n" +
                        "\n" +
                        "(Distancia (read) (read) (read) (read))";
        return data;
    }
    
    public String Ejeexpreciones4(){
        String data =   ";Diseñe un programa en racket que nos diga cual es la pendiente de una racta.\n\n" +
                        "\n" +
                        "(define (PendienteReckta)\n" +
                        "    (display \"Valor y2= \")\n" +
                        "    (define y2 (read))\n" +
                        "    (display \" Valor y1=  \")\n" +
                        "    (define y1 (read))\n" +
                        "    (display \"Valor x2=  \")\n" +
                        "    (define x2 (read))\n" +
                        "    (display \" Valor x1=  \")\n" +
                        "    (define x1 (read))\n" +
                        "    (display \" Pendiente= \")\n" +
                        "    (/ (-y2 y1)(- x2 x1))\n" +
                        ")\n" +
                        "\n" +
                        "(PendienteReckta)";
        return data;
    }
    
    public String Ejeexpreciones5(){
        String data =   ";Desarrolle un programa que nos calcule el área de un tetraedro.\n\n" +
                        "(define (AreaTetraedro)\n" +
                        "     (display \"de el valor  a\")\n" +
                        "     (define a (read))\n" +
                        "      (display \" es: \")\n" +
                        "      (* (sqrt 3) (* a a a))\n" +
                        ")\n" +
                        "\n" +
                        "(AreaTetraedro)";
        return data;
    }
    
    public String Ejeexpreciones6(){
        String data =   ";Desarrolle un programa que nos calcule el volumen de un octaedro.\n\n" +
                        "(define (VolumenOctaedro)\n" +
                        "    (display \" de el valor de a \")\n" +
                        "    (define a (read))\n" +
                        "    (display \" es: \")\n" +
                        "    (* (/ (sqrt 2)3) (* a a a))\n" +
                        ")\n" +
                        "\n" +
                        "(VolumenOctaedro)";
        return data;
    }
}
