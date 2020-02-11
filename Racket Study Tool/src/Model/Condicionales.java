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
public class Condicionales {

    public Condicionales() {
    }
    
    public String Quees(){
        String data="Una expresión condicional es una instrucción o grupo de instrucciones\nque se pueden " +
                    "ejecutar o no\n" +
                    "\n" +
                    "En Racket encontramos las funciones if y cond que nos ayudaran a \ncompara dos o mas " +
                    "cosas. Por ejemplo:\n" +
                    "\n" +
                    "Si a > b\n" +
                    "    ''a es mayor que b''\n" +
                    "sino\n" +
                    "    ‘’b es mayor que a’’\n" +
                    "\n" +
                    "Gráficamente tendríamos\n" +
                    "                	   -----------\n" +
                    "               	   |  a > b  |\n" +
                    "               	   -----------\n" +
                    "        si       	         |                     no\n" +
                    "       ----------------------------------------------\n" +
                    "       |             	                                      |\n" +
                    "''a es mayor que b''                 ‘’b es mayor que a’’\n" +
                    "       |             	                                      |\n" +
                    "       ---------------------------------------------\n" +
                    "                     	         |\n" +
                    "                            Respuesta";
        return data;
    }
    
    public String bol(){
        String data =   "Los boleanos y las sentencias de comparacion estan estrechamente ligados\n" +
                        "a los condicionales;  cuando  queremos   crear una   condicion,  esta   evalua\n" +
                        "sentencias    de    comparacion    que   arrojan  como resultado un boleano y\n" +
                        "dependiendo de esta se ejecutara una accion u otra. Los boleanos son de la\n" +
                        "forma #t -> True  o  #f   False\n" +
                        "\n" +
                        "Ejemplo:\n" +
                        "(= x y)  ; ''¿x es igual a y?''\n" +
                        "(< x y)  ; ''¿x es menor a y?''\n" +
                        "(> x y)  ; ''¿x es mayor a y?''\n" +
                        "(<= x y)  ; ''¿x es menor o igual a y?''\n" +
                        "(>= x y)  ; ''¿x es mayor o igual a y?''\n" +
                        "";
        return data;
    }
  
    public String elif(){
        String data =   "En Racket  el condicional if se hace de la siguiente manera\n" +
                        "\n" +
                        "( if ( condicion )\n" +
                        "      ( Respuesta_Verdadera )\n" +
                        "      ( Respuesta_Falsa )\n" +
                        " )\n" +
                        "\n" +
                        "Por ejemplo\n" +
                        "\n" +
                        "( if (< a b )\n" +
                        "       (display ''a es menor que b'') ; si la condicion es verdadera\n" +
                        "       (display ''a es mayor que b'') ; si la condicion es falsa\n" +
                        ")\n" +
                        "\n" +
                        "Pero que pasa si queremos dar mas de una respuesta si la condicion se \n" +
                        "cumple o no es decir:\n" +
                        "\n" +
                        " si a < b \n" +
                        "        ''a menor que b''\n" +
                        "        ''el numero menor es'' a\n" +
                        "sino:\n" +
                        "        ''a es mayor que b''\n" +
                        "\n" +
                        "Racket tiene una funcion especial para estos casos la cual es ''begin'' \n" +
                        "y su estrcutura es:\n" +
                        "\n" +
                        "( begin\n" +
                        "        (''a menor que b'')\n" +
                        "        (''el numero de es:'' a)\n" +
                        ")\n" +
                        "\n" +
                        "usando el ejemplo anterior el codigo quedaria de la siguiente manera\n" +
                        "\n" +
                        "( if (< a b )\n" +
                        "      (begin\n" +
                        "             (display  ''a menor que b'')\n" +
                        "              (display  ''el numero menor es'' a)\n" +
                        "       )\n" +
                        "        (display ''a es mayor que b'')\n" +
                        ")\n" +
                        "      ";
         return data;
     }
    
    public String elcond(){
        String data="EL CONDICONAL: COND.\n" +
                    "\n" +
                    "Al usar la instuccion cond,  idependiente de si  nuestro lenguaje este  en \n" +
                    "modo estudiante o avanzado la parte falsa es opcional. Se escribe luego\n" +
                    "de  todas  las  condiciones  y  unicamente se ejecuta si  nunguna  de las \n" +
                    "condiciones anteriores es Verdadera\n" +
                    "\n" +
                    "Su formato general:\n" +
                    "   (cond\n" +
                    "       [(condicional)(Respuesta_Verdadero)]\n" +
                    "       [(condicion2)(Respuesta_Verdadero)]\n" +
                    "       ....\n" +
                    "       [(condición)(Respuesta_Verdadero)]\n" +
                    "       (else (Respuesta_Falso)\n" +
                    "   )";
        return data;
    }
    
    public String Ejemplos(int r){
       String data;
       switch(r){
           case 1: data =   " ;Ejemplo de if con funcion de suma\n" +
                            "\n" +
                            " ;Construir un programa que dada la suma de dos numeros \n" +
                            " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                            "\n" +
                            "  (define (Suma N1 N2)\n" +
                            "        (+ N1 N2)\n" +
                            "  )\n" +
                            "\n" +
                            "  (define (MayorQ10? N1 N2)\n" +
                            "       (if ( >  (Suma N1 N2) 10)\n" +
                            "                (display ''Si es mayor que 10'')\n" +
                            "              (display ''No es mayor que 10'')\n" +
                            "       )\n" +
                            "   )\n" +
                            "\n" +
                            "  (MayorQ10? (read) (read))";
                   break;
           case 2: data =   " ;Ejemplo de if con funcion begin\n" +
                            "\n" +
                            " ;Construir un programa que dada la suma de dos numeros \n" +
                            " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                            "\n" +
                            "  (define (MayorQ10? N1 N2)\n" +
                            "       (if ( >  (Suma N1 N2) 10)\n" +
                            "             (begin\n" +
                            "                 (display (+ N1 N2))\n" +
                            "                 (display ''Si es mayor que 10'')\n" +
                            "             )\n" +
                            "             (begin\n" +
                            "                 (display (+ N1 N2))\n" +
                            "                 (display ''No es mayor que 10'')\n" +
                            "             )\n" +
                            "       )\n" +
                            "   )\n" +
                            "\n" +
                            "  (MayorQ10? (read) (read))";
                   break;
           case 3: data =   " ;Ejemplo de if con funcion begin y anidacion\n" +
                            " \n" +
                            " ;Construir un programa que dada la suma de dos numeros \n" +
                            " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                            "\n" +
                            "  (define (MayorQ10? N1 N2)\n" +
                            "       (if ( >  (Suma N1 N2) 10)\n" +
                            "             (begin\n" +
                            "                 (display (+ N1 N2))\n" +
                            "                 (display ''Si es mayor que 10'')\n" +
                            "             )\n" +
                            "             (if (= (+ N1 N2) 10)\n" +
                            "                    (begin\n" +
                            "                          (display (+ N1 N2))\n" +
                            "                          (display ' Es igual que 10'')\n" +
                            "                     )\n" +
                            "                     (begin\n" +
                            "                           (display (+ N1 N2))\n" +
                            "                           (display ''No es mayor que 10'')\n" +
                            "                     )\n" +
                            "             )\n" +
                            "       )\n" +
                            "   )\n" +
                            "\n" +
                            "  (MayorQ10? (read) (read))\n" +
                            "";
                   break;
           case 4: data =   " ;Ejemplo de cond\n" +
                            "\n" +
                            " ;Construir un programa que dada la suma de dos numeros \n" +
                            " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                            "\n" +
                            "(define(MayorQ10? N1 N2)\n" +
                            "   (cond\n" +
                            "          [(>(+N1 N2)10)(begin(display(+ N1 N2))(display “Es mayor que 10”))]\n" +
                            "          [(=(+ N1 N2)10)(begin(display(+ N1 N2))(display “Es Igual que 10”))]\n" +
                            "          [(<(+ N1 N2)10)(begin(display(+ N1 N2))(display “Es Menor que 10”)) )\n" +
                            "   ))\n\n(MayorQ10? (read) (read))";
                   break;
           case 5: data =   " ;Ejemplo de cond con else\n" +
                            "\n" +
                            " ;Construir un programa que dada la suma de dos numeros\n" +
                            " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                            "\n" +
                            " (define(MayorQ10? N1 N2)\n" +
                            "  (cond\n" +
                            "    [(>(+ N1 N2)10)(begin (display(+ N1 N2))(display “Es Mayor que 10”))]\n" +
                            "    [(=(+ N1 N2)10)(begin (display(+ N1 N2))(display “Es Igual que 10))]\n" +
                            "    (else (begin (display(+ N1 N2))(display “Es Menor que 10)) )\n" +
                            "   ))\n\n(MayorQ10? (read) (read))";
                   break;
           default: data =  " ;Ejemplo de cond \n" +
                            "\n" +
                            "  ;Suponga que el banco paga 4% para  depositos  menores \n" +
                            "  ;a $50.000 (inclusive) , 4.5% para  depositos  menores \n" +
                            "  ;a $250.000  (inclusive), y 5% para depositos  mayores\n" +
                            "  ; a $250.000.  Realize   una   funcion  que reciba  un \n"+
                            "reciba un deposito y devuelva el procentaje asignado \n" +
                            "\n" +
                            "   (define (interes cantidad)\n" +
                            "         (cond\n" +
                            "             [(<= cantidad 50000) 0.040]\n" +
                            "             [(<= cantidad 250000) 0.045]\n" +
                            "             [(> cantidad 250000) 0.050]\n" +
                            "         )\n" +
                            "     )\n\nm  (interes (read))";
       }
       return data;
   }
    
    public String Ejercicios(){
        String data =   "1. Hacer una función que reciba un numero. Si el numero es mayor o igual \n" +
                        "    que 10 imprima por pantalla ''El numero es mayor o igual que 10''. Si es \n" +
                        "    menor que 10 muestre por pantalla ''El numero es menor que 10''.\n" +
                        "\n" +
                        " 2.Se va a realizar un paseo en una escuela. Si van hasta 10 niños, el valor \n" +
                        "     por   cada  niño  es de 3000 pesos. Si van mas 10 niños, pero menos o \n" +
                        "     igual  que 50,  el valor  por cada  niño es de 2500 pesos. Si van mas de \n" +
                        "     50  niños,  pero  menos  o  igual   que 200,  el valor por cada niño es de \n" +
                        "     2000.  Si  van  mas  de  200  niños,  el  valor  por  cada  niño es de 1800 \n" +
                        "     pesos.  Construir  una  función  que  permita  calcular  el  dinero en total \n" +
                        "     que  se  va  a  recolectar  para el  paseo dependiendo de la cantidad de \n" +
                        "     niños que vayan a ir.\n" +
                        "\n" +
                        "3. Todas las ecuaciones cuadráticas (en una variable) tienen la siguiente \n" +
                        "    forma general: ax2+bx+c=0\n" +
                        "   El numero de solicitudes de una  ecuación  cuadrática  depende  de los \n" +
                        "   valores  de  a, b y c.  Si  el coeficiente  de  a  es  0, podemos decir que la\n" +
                        "   ecuación es degenerada y no  se  considera  cuantas  soluciones  tiene. \n" +
                        "   Asumiendo que a no es 0, la ecuación tiene:\n" +
                        "       i)    dos soluciones si b2>4 * a * c,\n" +
                        "       ii)   una solución si b2=4*a*c, and\n" +
                        "       iii)  ninguna solución si b2<4*a *c.\n" +
                        "   desarrollar la función cuantos, la cual recibe los coeficientes a, b y e de \n" +
                        "   una ecuación cuadrática apropiada y determinante cuantas soluciones\n" +
                        "   tiene la ecuación:\n\n" +
                        "        (Cuantos 10-1) = 2\n" +
                        "        (Cuantos 242) = 1\n" +
                        "\n" +
                        "\n" +
                        "4. Construir un programa que dado el día (en formato numérico),  el  mes \n" +
                        "    (numero) y el año (en formato numerico), retorne el día (lunes, martes..) \n" +
                        "    de la semana a la que pertenece la fecha ingresada.\n" +
                        "\n\n" +
                        "";
        return data;
    }
    
    
    
    
    
    
}
