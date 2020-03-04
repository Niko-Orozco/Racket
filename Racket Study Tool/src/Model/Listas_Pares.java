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
        String data =   "La función cons permite crear un par y tiene dos argumentos. El primero:\n" +
                        "la cabeza y el segundo: la cola\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(cons a b) -> la cabeza es a y la cola es b";
        return data;
    }

    public String Pares3(){
        String data =   "La función car nos sirve para  extraer la cabeza  de un par   y el argumento\n" +
                        "que recibe es un par para ser analizado\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(define par (cons 1 \"hola\"))\n" +
                        "(displayln (car par))  -->  1";
        return data;
    }

    public String Pares4(){
        String data =   "La función cdr nos sirve para    extraer   la  cola   de un par   y el argumento\n" +
                        "que recibe es un par para ser analizado\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "    (define par (cons 3 \\\"mama\\\"))\n" +
                        "    (displayln (cdr par))  -->  \"hola\"";
        return data;
    }

    public String Pares5(){
        String data =   "El procedimiento pair? nos permite determinar si un objeto es o no, tiene\n" +
                        "un solo argumento y solo es el objeto a evaluar\n" +
                        "\n" +
                        "(define par (cons 3 \"pollito\"))\n" +
                        "(pair? par) --> #t";
        return data;
    }

    public String EjePares1(){
        String data =   "; mediante el procedimiento cons cree 3 pares y llénelos con diferentes tipos de datos, luego \n" +
                        ";mostrar los datos almacenados en el par\n\n" +
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
        String data =   "; mediante el procedimiento cons cree 3 pares y llene las cabezas con número, luego \n" +
                        ";mostrar la suma de las cabezas de los pares\n\n" +
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
                        ";mostrar los datos de las colas de los pares\n\n" +
                        "\n" +
                        "(define par1 (cons (read) (read)))\n" +
                        "(define par2 (cons (read) (read)))\n" +
                        "\n" +
                        "(displayln (cdr par1)) \n" +
                        "(displayln (cdr par2))\n";
        return data;
    }

    public String EjePares4(){
        String data =   "; mediante el procedimiento cons cree un par y llénelo de cualquier tipo de dato luego mediante\n" +
                        ";el procedimiento pair?, decir si es par o si no lo es\n\n" +
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
        String data =   "Una lista es un tipo de dato con cierta similitud a un vector, pero  las  listas\n" +
                        "se diferencian principlamente de los vectores en que estas son dinámicas\n" +
                        "es decir, se les puede añadir información y las listas siempre terminan en \n" +
                        "un espacio vacío (empty), Aunque este no se vea";
        return data;
    }

    public String Listas2(){
        String data =   "La función list nos sirve para crear listas y los argumentos y/o elementos\n" +
                        "que tiene son tantos como queramos incluir en la lista\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "(list 4 9 6 \"hola\" 'bl #\\a (vector 8 9 4) (list 2  7 1) (+ 2 5))";
        return data;
    }

    public String Listas3(){
        String data =   "Tienen el mismo uso que en los pares, sirven para extraer la cabeza y la \n" +
                        "cola de una lista\n" +
                        "\n" +
                        "(car (list 4 5 6))  -> ( 4 )\n" +
                        "(cdr (list 3 0 9))  -> (0 9)";
        return data;
    }

    public String Listas4(){
        String data =   "El procedimiento null se encarga de determinar si una lista está vacía.\n" +
                        "Tiene un argumento y es la lista para evaluar y devuelve un valor booleano\n" +
                        "\n" +
                        "#t o #f\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(define Lista (list 2 4 5)\n" +
                        "(null? Lista))   --> #f\n" +
                        "\n" +
                        "(define Lista (list))\n" +
                        "(null? Lista))  --> #t";
        return data;
    }

    public String Listas5(){
        String data =   "El procedimiento append nos permite añadir elementos a una lista\n" +
                        "\n" +
                        "(define Listas (list 1 2 3 4))\n" +
                        "(append Lista 4)   \n" +
                        "\n" +
                        "(display Lista)    -->   (1 2 3 4)";
        return data;
    }

    public String Listas6(){
        String data =   "El procedimiento  list? determina  si  un  elemento es una lista, recibe un \n" +
                        "solo argumento y es la lista por evaluar.\n" +
                        "\n" +
                        "(define Listas (list 1 2 3))\n" +
                        "(list? Lista)   -->  #t";
        return data;
    }

    public String Listas7(){
        String data =   "El procedimiento length determina el tamaño de una lista y recibe un solo\n" +
                        "argumento y es la lista por evaluar.\n" +
                        "\n" +
                        "(define Listas (list 1 2 3))\n" +
                        "(length Lista)   -->  3";
        return data;
    }

    public String Listas8(){
        String data =   "El   procedimiento   reverse   sirve   para   invertir   una  lista, recibe un solo\n" +
                        "argumento y es la lista por evaluar.\n" +
                        "\n" +
                        "(define Listas (list 1 2 3))\n" +
                        "(reverse Lista)   -->  (3 2 1)";
        return data;
    }

    public String Listas9(){
        String data =   "La   función   list-tail   devuelve   una   subcola   de   una   lista,   tiene   dos \n" +
                        "argumentos,  el   primero  es   la   lista  y  el  segundo  es  el  índice  donde \n" +
                        "comienza la cola\n" +
                        "\n" +
                        "(define Listas (list \"Lunes\" \"Martes\" \"Miércoles\" \"Jueves\" \"Viernes\"))\n" +
                        "(list-tail Lista 2)   -->  (\"Miércoles\" \"Jueves\" \"Viernes\")";
        return data;
    }

    public String EjeListas1(){
        String data =   ";definir una función que cree una lista y llene 4 datos de la lista por teclado luego \n" +
                        ";mostrar los datos por pantalla con la función displayln\n\n" +
                        "\n" +
                        "(define Lista(list (read) (read) (read) (read)))\n" +
                        "\n" +
                        "(displayln Lista)";
        return data;
    }

    public String EjeListas2(){
        String data =   ";definir una función que cree una lista y llene 4 datos de la lista por teclado luego \n" +
                        ";mostrar la cabeza de la lista  por pantalla con la función displayln\n\n" +
                        "\n" +
                        "\n" +
                        "(define Lista(list (read) (read) (read) (read)))\n" +
                        "\n" +
                        "(displayln (car Lista))";
        return data;
    }

    public String EjeListas3(){
        String data =   ";cree una función que pida por teclado llenar una lista si esta está vacía, luego mostrar \n" +
                        ";los datos por pantalla\n\n" +
                        "\n" +
                        "(define lista (list))\n" +
                        "(define (isEmpty)\n" +
                        "      (if (null? lista)\n" +
                        "              (define listas (list (read) (read) (read))))\n" +
                        "              (display \"La lista tiene datos\")\n" +
                        "       )\n" +
                        "       (display listas)\n" +
                        ")\n" +
                        "\n" +
                        "(isEmpty)";
        return data;
    }

    public String EjeListas4(){
        String data =   ";cree una función que permita adicionar diez números a una lista\n\n" +
                        "\n" +
                        "(define lista (list))\n" +
                        "(define (adicionar  n)\n" +
                        "       (if (< n 10)\n" +
                        "            (begin\n" +
                        "                     (append lista (read))\n" +
                        "                     (adicionar n+1)\n" +
                        "             )\n" +
                        "             (display lista)\n" +
                        "       )\n" +
                        ")\n" +
                        "\n" +
                        "(adicionar 0)";
        return data;
    }

    public String EjeListas5(){
        String data =   ";cree una funcion tal que al recibir un argumento nos diga si es una lista o no.\n\n" +
                        "\n" +
                        "(define lista(list))\n" +
                        "(define (islista)\n" +
                        "        (if (list? lista)\n" +
                        "               (displayln \"Es una lista\")\n" +
                        "               (displayln \"No es una lista\")\n" +
                        "         )\n" +
                        ")\n" +
                        "\n" +
                        "(islista)";
        return data;
    }

    public String EjeListas6(){
        String data =   ";cree  una  funcion  que  pida por  teclado el  número de datos  a ingresar en una lista,\n" +
                        ";luego nos muestre los datos de la lista si el tamaño de esta es mayor a 5, de lo \n" +
                        ";contrario mostrar el tamaño de la lista\n\n" +
                        "\n" +
                        "(define lista(list))\n" +
                        "(define (medir  n n2)\n" +
                        "           (if (< n n2)\n" +
                        "                    (begin\\n\n" +
                        "                            (append lista (read))\n" +
                        "                             (adicionar n+1)\n" +
                        "                      )\n" +
                        "                      (display lista)\n" +
                        "             )\n" +
                        "             (if ( > (length lista) 5)\n" +
                        "                      (display lista)\n" +
                        "                      (display (length lista))\n" +
                        "              )\n" +
                        ")\n" +
                        "(medir 0 (read))";
        return data;
    }

    public String EjeListas7(){
        String data =   ";cree  una  funcion  que  pida por  teclado el número de datos  a ingresar en una lista,\n" +
                        ";luego nos muestre al revés los datos de la lista si el tamaño de esta es mayor  \n" +
                        ";a 5, de lo contrario mostrar el tamaño de la lista\n\n" +
                        "\n" +
                        "(define lista(list))\n" +
                        "(define (addlist  n n2)\n" +
                        "           (if (< n n2)\n" +
                        "                    (begin\\n\n" +
                        "                            (append lista (read))\n" +
                        "                             (adicionar n+1)\n" +
                        "                      )\n" +
                        "                      (void)\n" +
                        "             )\n" +
                        "             (if ( > (length lista) 5)\n" +
                        "                      (display (reverse lista))\n" +
                        "                      (display (length lista))\n" +
                        "              )\n" +
                        ")\n" +
                        "(addlist 0 (read))";
        return data;
    }

    public String EjeListas8(){
        String data =   ";cree una funcion  que llene una lista con cuatro datos y luego que a partir del dato 1 nos\n" +
                        ";muestre su contenido\n\n" +
                        "\n" +
                        "(define lista(list (read) (read) (read) (read)))\n" +
                        "(define (datos)\n" +
                        "         (display (list-tail lista 1))\n" +
                        ")\n" +
                        "(datos)";
        return data;
    }



    public String Ejercicios(){
        String data = "";
        return data;
    }

}
