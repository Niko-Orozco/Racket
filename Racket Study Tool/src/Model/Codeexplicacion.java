/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author xlOnly
 */
public class Codeexplicacion {

    public Codeexplicacion() {
        
    }
    
    public String Ejemplo1(){
        String data =   "(define (ElevarpotenciaN num pot)\n" +
                        "           (define a (expt num pot))\n" +
                        "           (displayln a)\n" +
                        ")\n" +
                        "\n" +
                        "(ElevarpotenciaN 4 6 )";
        return data;
    }
    
    public String Ejemplo2(){
        String data =       "  ;Suponga que el banco paga 4% para  depósitos  menores \n" +
                            "  ;a $50.000 inclusive , 4.5% para  depósitos  menores \n" +
                            "  ;a $250.000  inclusive, y 5% para depósitos  mayores\n" +
                            "  ;a $250.000.  Realice   una   función  que reciba  un \n"+
                            "  ;reciba un depósito y devuelva el porcentaje asignado \n\n" +
                            "\n" +
                            "   (define (interes cantidad)\n" +
                            "         (cond\n" +
                            "             [(<= cantidad 50000) 0.040]\n" +
                            "             [(<= cantidad 250000) 0.045]\n" +
                            "             [(> cantidad 250000) 0.050]\n" +
                            "         )\n" +
                            "     )\n\n(interes 2312312)";
        return data;
    }
    
    public String Ejemplo3(){
        String data =   ";Factorial de un numero\n" +
                        "\n" +
                        "( define ( calcular-factorial n )\n" +
                        "    ( cond\n" +
                        "          [ ( = n 0  1 )]\n" +
                        "           [ ( = n 1 ) 1 ]\n" +
                        "       [ else\n" +
                        "          ( * n ( calcular-factorial (- n 1 ) ) ) ]\n" +
                        "))\n" +
                        "\n" +
                        "( calcular-factorial 4 )";
        return data;
    }
    
    public String Ejemplo4(){
        String data =   ";Crear una cadena de tamaño n  y luego llenar ese tamaño con la letra H\n\n\n" +
                        "( define ( s n )\n" +
                        "       ( make-string n #\\H )		\n" +
                        " )\n" +
                        "\n" +
                        "(s 10)	";
        return data;
    }
    
    public String Ejemplo5(){
        String data =   "( define-struct  Tienda ( Producto Precio descripción ) )\n" +
                        "\n" +
                        "(define (CrearTienda)\n" +
                        "        ( define p1 ( make-Tienda \"Chocolate\"  \"10 mil\"  \"Consumir antes de terminar el año\"))\n" +
                        "        ( define p2 ( make-Tienda \"Huevos\"  \"8 mil\"  \" Los mejores huevos de la ciudad \"))\n" +
                        "        ( define p3 ( make-Tienda \"Salchicha\"  \"50 mil\"  \"Importada desde Japón\"))\n" +
                        "\n" +
                        "       ( display ( Tienda-Producto p1 ) )\n" +
                        "       ( display ( Tienda-Precio p1 ))\n" +
                        "\n" +
                        "       ( display ( Tienda-Producto p2 ) )\n" +
                        "       ( display ( Tienda-Precio p2 ))\n" +
                        "\n" +
                        "       ( display ( Tienda-Producto p2 ) )\n" +
                        "       ( display ( Tienda-Precio p2 ))\n" +
                        ")\n" +
                        "\n" +
                        "( CrearTienda )";
        return data;
    }
    
    public String Ejemplo6(){
        String data =   ";Hacer un programa que calcule el volumen de un cono\n\n" +
                        "(define Pi 3.1416)\n" +
                        "        (display &quot; Valor radio= &quot;)\n" +
                        "        (define r (read))\n" +
                        "        (display &quot; Valor altura= &quot;)\n" +
                        "        (define h (read))\n" +
                        "        (display &quot; Volumen= &quot;)\n" +
                        ")\n" +
                        "\n" +
                        "(* 1/3 Pi r h)";
        return data;
    }
    
    public String Ejemplo7(){
        String data =   ";Programa para determinar si una letra es vocal o no\n\n" +
                        "(define (EsVocal? voc)\n" +
                        "            (cond\n" +
                        "                     ((= voc  #\\a)  (display \"Es vocal\"))\n" +
                        "                     ((= voc  #\\e)  (display \"Es vocal\"))\n" +
                        "                     ((= voc  #\\i)  (display \"Es vocal\"))\n" +
                        "                     ((= voc  #\\o)  (display \"Es vocal\"))\n" +
                        "                     ((= voc  #\\u)  (display \"Es vocal\"))\n" +
                        "                (else \n" +
                        "                     (display \"No es una vocal\")\n" +
                        "                )\n" +
                        "            )\n" +
                        ")\n" +
                        "\n" +
                        "(EsVocal? (read))";
        return data;
    }////////////////////////////// Asta aqui falta el 8 9 y 10
    
    public String Ejemplo8(){
        String data =   ";Crear una vector de forma global de 10 posiciones, luego llenarlo de valores aleatorios y mostrarlos por pantalla\n\n" +
                        "\n" +
                        "( define vec (make-vector 12)\n" +
                        "\n" +
                        "( define (LlenarRandom)\n" +
                        "        ( vector-fill! vec (random 220))\n" +
                        "        ( display vec )\n" +
                        ")\n" +
                        "\n" +
                        "(LlenarRandom)";
        return data;
    }
    
    public String Ejemplo9(){
        String data =   ";Cree un par mediante la funcion cons, llenelo  con  los  datos: 12 y \"Mariana\". Defina una funcion\n" +
                        ";tal que pregunte si el argumento recivido es un par;  Sí lo és,  mostrar  por  pantalla  \"Es  par\",  la\n" +
                        ";suma de la cabeza y el dato almacenado en la cola\n\n" +
                        "\n" +
                        "( define par (cons 12 \"Mariana\"))\n" +
                        "(define ( SumadePares )\n" +
                        "       (if (pair? par)\n" +
                        "             (begin\n" +
                        "                     (display \"Es par\")\n" +
                        "                     (display (+ (car par)  5))\n" +
                        "                     (display (cdr par))\n" +
                        "             )\n" +
                        "             (display \"No es un par\")\n" +
                        ")\n" +
                        "(SumadePares)";
        return data;
    }
    
    public String Ejemplo10(){
        String data =   ";Cree  una  lista  vacia   mediante  la  funcion list. Defina una funcion tal que reciva una lista, sí esta lista está vacia \n" +
                        ";Llenarla con numeros del 1 al 8. Mostrar los datos almacenados, mostrar la suma de los numeros almacenados\n" +
                        ";y agregue mediante la funcion append los numeros 12 y 45,\n" +
                        "\n" +
                        "(define listas (list))\n" +
                        "\n" +
                        "(define (AgregarDatos)\n" +
                        "          (append listas 1)\n" +
                        "          (append listas 2)\n" +
                        "          (append listas 3)\n" +
                        "          (append listas 4)\n" +
                        "          (append listas 5)\n" +
                        "          (append listas 6)\n" +
                        "          (append listas 7)\n" +
                        "          (append listas 8)\n" +
                        ")\n" +
                        "\n" +
                        "(define (EsVacia)\n" +
                        " (if  (null? listas)\n" +
                        "   (begin \n" +
                        "        (AgregarDatos)\n" +
                        "        (display listas)\n" +
                        "   (display (+(+(+(+(+(+(+(list-ref listas 0)(list-ref listas 1))(list-ref listas 2))(list-ref listas 3))(list-ref listas 4))(list-ref listas 5))(list-ref  listas 6))(list-ref  listas 7)))\n" +
                        "     (append listas 12)\n" +
                        "     (append listas 45)\n" +
                        "     (display listas) \n" +
                        "   )\n" +
                        " )\n" +
                        ")\n" +
                        "\n" +
                        "(EsVacia)";
        return data;
    }
    
    public String Paso1(int este){
        String data = "";
        switch(este){
            case 1: data =  "Definimos la función ElevarpotenciaN y recibe\n" +
                            "dos argumentos";
                    break;
            case 2: data =  "Llamaos la función ElevarpotenciaN y pedimos\n" +
                            "dos datos por teclado";
                  break;
            case 3: data =  "Definimos la variable que contendrá el resultado\n" +
                            "de elevar los números";
                  break;
            case 4: data =  "Imprimimos el resultado de elevar el número\n" +
                            "ingresado a la potencia dada";
                  break;
        }
        return data;
    }
    
    public String Paso2(int este){
        String data = "";
        switch(este){
            case 1: data =  "Definimos la función intereses y recibe un\n" +
                            "argumento";
                    break;
            case 2: data =  "Llamamos la función intereses y pedimos un\n" +
                            "dato por teclado";
                  break;
            case 3: data =  "Evaluamos la función cond";
                  break;
            case 4: data =  "Evaluamos si  la variable cantidad es menor\n" +
                            "a 50.000, de ser así devolvemos el valor del\n" +
                            "interes 0.040: 4%";
                  break;
            case 5: data =  "Evaluamos  si   la  variable  cantidad   es  menor\n" +
                            "o igual a 250.000, de ser así devolvemos el valor\n" +
                            "del interes 0.045: 4.5%";
                  break;
            case 6: data =  "Evaluamos si la variable cantidad es mayor\n" +
                            "a 250.000, de  ser  así  devolvemos el valor\n" +
                            "del interes 0.050: 5%";
                  break;
        }
        return data;
    }
    
    public String Paso3(int este){
        String data =   "Definimos la función calcular-factorial";
        String data1 =  "Llamamos la función calcular-factorial y como \n" +
                        "parámetro le enviamos el número 4";
        String data2 =  "Evaluamos la función cond";
        String data3 =  "comparamos si la variable n es igual a 0, de ser\n" +
                        "así  devolvemos  el  número  1 y  terminamos  la \n" +
                        "condición";
        String data4 =  "comparamos si la variable n es igual a 1, de ser\n" +
                        "así  devolvemos  el  número  1 y  terminamos  la \n" +
                        "condición";
        String data5 =  "Evaluamos la función else de la condición con \n" +
                        "nos encargamos  de hacer la recursión dado\n" +
                        "que no se cumpla el paso anterior";
        String data6 =  "Hacemos  el  llamado recursivo  de la función \n" +
                        "para  calcular   el  factorial  de el numero dado\n" +
                        "multiplicación   e l  valor  que  tiene  n  en  ese \n" +
                        "momento por el valor de n -1 y luego llamamos\n" +
                        "la función decrementando a n en uno";
        return data;
    }
    
    public String Paso4(int este){
        String data =   "Definimos  la función  s y recibe un argumente\n" +
                        "el cual es el numero de caracteres que tendrá\n" +
                        "la cadena";
        String data2 =  "Llamamos la función s y como parámetro le\n" +
                        "enviamos un numero leído por teclado";
        String data3 =  "mediante la función make-string creamos la\n" +
                        "cadena  a  llenar  con  el tamaño n asignado\n" +
                        "con los caracteres #\\H";
        String data4 =  "usamos la función display para mostrar un texto\n" +
                        "guía por pantalla";
        return data;
    }
    
    public String Paso5(int este){
        String data = "";
        return data;
    }
        
}
