/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ALEJO
 */
public class PracticasModel {
    
    public PracticasModel(){
    }
    
    public String ejerecu1(){
        
        String data = "(define (fibo n)\n" +
                        "  (if(= n 1)\n" +
                        "     1\n" +
                        "         (if(= n 2)\n" +
                        "           1\n" +
                        "           (+(fibo(- n 1))(fibo(- n 2)))\n" +
                        "           )\n" +
                        "        )\n" +
                        "  )\n" +
                        "(fibo 8)) ";
        
        return data;
    }
    
    public String ejerecu2(){
        String data = "#lang racket\n" +
";Vector de primos \n" +
"; este programa crea un vector de m posiciones y lo carga con los primeros m primos\n" +
"\n" +
"; primo\n" +
"; función para evaluar si un numero es primo\n" +
"; (primo n) -> boolean\n" +
"(define (primo n i)\n" +
"  (if (<= i (sqrt n))\n" +
"      (if ( = (remainder n i) 0)\n" +
"          #f\n" +
"          (primo n (+ i 1))\n" +
"       )\n" +
"      #t\n" +
"      ))\n" +
"; VecPrimo\n" +
"; recibe un vector y lo carga con los numeros primos\n" +
"; (VectPrimo vector num) -> vector\n" +
"(define (VecPrimo vec pos nro)\n" +
"  (if (= pos (vector-length vec))\n" +
"      vec\n" +
"      (if (primo nro 2)\n" +
"          (begin\n" +
"            (vector-set! vec pos nro)\n" +
"            (VecPrimo vec (+ pos 1) (+ nro 1))\n" +
"            )\n" +
"          (VecPrimo vec pos (+ nro 1))\n" +
"          )))\n" +
"\n" +
"(VecPrimo (make-vector 10) 0 3)";
        return data;
    }
    
}
