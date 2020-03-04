/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.awt.Color;
import java.awt.Font; 
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
                    "\n";
        return data;
    }
    
    public String bol(){
        String data =   "Los  booleanos  y  las sentencias de comparación  está estrechamente\n" +
                        "ligados a los condicionales, cuando  queremos   crear una   condición,\n" +
                        "esta evalúa sentencias de  comparación que   arrojan como resultado \n" +
                        "un booleano y dependiendo de  esta   se  ejecutará   una  acción  u otra. \n" +
                        "Los booleanos son de la forma #t -> True  o  #f   False\n" +
                        "\n" +
                        "Ejemplo:\n" +
                        "\n" +
                        "(= x y)    ; ''¿x es igual a y?''\n" +
                        "(< x y)    ; ''¿x es menor a y?''\n" +
                        "(> x y)    ; ''¿x es mayor a y?''\n" +
                        "(<= x y)  ; ''¿x es menor o igual a y?''\n" +
                        "(>= x y)  ; ''¿x es mayor o igual a y?''";
        return data;
    }
  
    public String elif(){
        String data =   "En Racket encontramos las funciones if y cond que nos ayudaran a \n" +
                        "compara dos o más cosas. Por ejemplo:\n" +
                        "\n" +
                        "Si a > b\n" +
                        "    ''a es mayor que b''\n" +
                        "sino\n" +
                        "    ‘’b es mayor que a’’\n" +
                        "\n" +
                        "\n" +
                        "El código en racket seria:\n" +
                        "\n" +
                        "( if ( condición )\n" +
                        "      ( Respuesta_Verdadera )\n" +
                        "      ( Respuesta_Falsa )\n" +
                        " )\n" +
                        "\n" +
                        "Por ejemplo\n" +
                        "\n" +
                        "( if (< a b )\n" +
                        "       (display ''a es menor que b'') ; si la condición es verdadera\n" +
                        "       (display ''a es mayor que b'') ; si la condición es falsa\n" +
                        ")\n" +
                        "\n" +
                        "Pero que pasa si queremos dar más de una respuesta si la condición \n" +
                        "se  cumple o no, es decir:\n" +
                        "\n" +
                        " sí a < b \n" +
                        "        ''a menor que b''\n" +
                        "        ''el número menor es'' a\n" +
                        "sino:\n" +
                        "        ''a es mayor que b''\n" +
                        "\n" +
                        "Racket tiene una función especial para estos casos la cual es ''begin'' \n" +
                        "y su estructura es:\n" +
                        "\n" +
                        "( begin\n" +
                        "        (''a menor que b'')\n" +
                        "        (''el número de es:'' a)\n" +
                        ")";
         return data;
     }
    
    public String elcond(){
        String data="EL CONDICONAL: COND.\n" +
                    "\n" +
                    "Al usar la  instrucción cond,   independiente  de si   nuestro lenguaje este \n" +
                    "en modo estudiante  o avanzado  la parte falsa es opcional.  Se escribe\n" +
                    "luego de  todas  las  condiciones  y  únicamente se ejecuta si  ninguna\n" +
                    "de las condiciones anteriores es Verdadera\n" +
                    "\n" +
                    "Su formato general:\n" +
                    "   (cond\n" +
                    "       [(condicional)(Respuesta_Verdadero)]\n" +
                    "       [(condicion2)(Respuesta_Verdadero)]\n" +
                    "       …\n" +
                    "       [(condición)(Respuesta_Verdadero)]\n" +
                    "       (else (Respuesta_Falso)\n" +
                    "   )";
        return data;
    }
    
    public String EjeIf(){
        String data;
        data =  " ;Ejemplo de if con función de suma\n" +
                "\n" +
                " ;Construir un programa que dada la suma de dos números \n" +
                " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                "\n" +
                ";definimos la función encargada de sumar los números\n\n" +
                "  (define (Suma N1 N2)\n" +
                "        (+ N1 N2)\n" +
                "  )\n" +
                "\n" +
                "  (define (MayorQ10? N1 N2)\n" +
                "       (if ( >  (Suma N1 N2) 10)\n" +
                "                 (display ''Si es mayor que 10'')\n" +
                "                 (display ''No es mayor que 10'')\n" +
                "       )\n" +
                "   )\n" +
                "\n" +
                "  (MayorQ10? (read) (read))";
        return data;
    }
    
    public String EjeIfbegin(){
        String data;
        data =  " ;Ejemplo de if con función begin y anidación\n" +
                " \n" +
                " ;Construir un programa que dada la suma de dos números \n" +
                " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                "\n" +
                ";definimos la función y le damos y le damos dos argumentos los datos a ingresar\n\n" +
                "  (define (MayorQ10? N1 N2)\n" +
                "       (if ( >  (+  N1 N2) 10)\n" +
                "             (begin\n" +
                "                 (display (+ N1 N2)) \n" +
                "                 (display ''Si es mayor que 10'') \n" +
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
                "  (MayorQ10? (read) (read))";
        return data;
    }
    
    public String EjeCond(){
        String data;
        data =  " ;Ejemplo de cond\n" +
                "\n" +
                " ;Construir un programa que dada la suma de dos números \n" +
                " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                "\n" +
                ";definimos la función y le damos y le damos dos argumentos los datos a ingresar\n\n" +
                "(define(MayorQ10? N1 N2)\n" +
                "   (cond\n" +
                "          [(>(+N1 N2)10)(begin(display(+ N1 N2))(display “Es mayor que 10”))]\n" +
                "          [(=(+ N1 N2)10)(begin(display(+ N1 N2))(display “Es Igual que 10”))]\n" +
                "          [(<(+ N1 N2)10)(begin(display(+ N1 N2))(display “Es Menor que 10”)) )\n" +
                "   ))\n" +
                "\n" +
                "(MayorQ10? (read) (read))";
                        return data;
    }
    
    public String EjeCondbegin(){
       String data;
       data =   " ;Ejemplo de cond con else\n" +
                "\n" +
                " ;Construir un programa que dada la suma de dos números\n" +
                " ;imprima si dicha suma es mayo, menor o igual a 10\n" +
                "\n" +
                ";definimos la función y le damos y le damos dos argumentos los datos a ingresar\n\n" +
                " (define(MayorQ10? N1 N2)\n" +
                "  (cond\n" +
                "        [(>(+ N1 N2)10)(begin (display(+ N1 N2))(display “Es Mayor que 10”))]\n" +
                "        [(=(+ N1 N2)10)(begin (display(+ N1 N2))(display “Es Igual que 10))]\n" +
                "        (else (begin (display(+ N1 N2))(display “Es Menor que 10)) )\n" +
                "   ))\n" +
                "\n" +
                "(MayorQ10? (read) (read))";
       return data;
   }
    
    public String Ejercicios(){
        String data =   "1. Hacer una función que reciba un número. Si el número es mayor o igual \n" +
                        "    que 10 imprima por pantalla ''El número es mayor o igual que 10''. Si es \n" +
                        "    menor que 10 muestre por pantalla ''El número es menor que 10''.\n" +
                        "\n" +
                        " 2.Se va a realizar un paseo en una escuela. Si van hasta 10 niños, el valor \n" +
                        "     por   cada  niño  es de 3000 pesos. Si van más 10 niños, pero menos o \n" +
                        "     igual  que 50,  el valor  por cada  niño es de 2500 pesos. Si van más de \n" +
                        "     50  niños,  pero  menos  o  igual   que 200,  el valor por cada niño es de \n" +
                        "     2000.  Si  van  más  de  200  niños,  el  valor  por  cada  niño es de 1800 \n" +
                        "     pesos.  Construir  una  función  que  permita  calcular  el  dinero en total \n" +
                        "     que  se  va  a  recolectar  para el  paseo dependiendo de la cantidad de \n" +
                        "     niños que vayan a ir.\n" +
                        "\n" +
                        "3. Todas las ecuaciones cuadráticas (en una variable) tienen la siguiente \n" +
                        "    forma general: ax2+bx+c=0\n" +
                        "   El número de solicitudes de una  ecuación  cuadrática  depende  de los \n" +
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
                        "    (numero) y el año (en formato numérico), retorne el día (lunes, martes...) \n" +
                        "    de la semana a la que pertenece la fecha ingresada.\n" +
                        "\n\n" +
                        "";
        return data;
    }
    
    
    
    
    
    
}
