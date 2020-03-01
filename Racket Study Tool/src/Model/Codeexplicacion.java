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
        String data =       "  ;Suponga que el banco paga 4% para  depositos  menores \n" +
                            "  ;a $50.000 inclusive , 4.5% para  depositos  menores \n" +
                            "  ;a $250.000  inclusive, y 5% para depositos  mayores\n" +
                            "  ;a $250.000.  Realize   una   funcion  que reciba  un \n"+
                            "  ;reciba un deposito y devuelva el procentaje asignado \n\n" +
                            "\n" +
                            "   (define (interes cantidad)\n" +
                            "         (cond\n" +
                            "             [(<= cantidad 50000) 0.040]\n" +
                            "             [(<= cantidad 250000) 0.045]\n" +
                            "             [(> cantidad 250000) 0.050]\n" +
                            "         )\n" +
                            "     )\n\n(interes (read))";;
        return data;
    }
    
    public String Ejemplo3(){
        String data =   ";Factorial de un numero\n" +
                        "\n" +
                        "( define ( calcular-factorial n )\n" +
                        "    ( cond\n" +
                        "          [ ( = n 0  1 ]\n" +
                        "           [ ( = n 1 ) 1 ]\n" +
                        "       [ else\n" +
                        "          ( * n ( calcular-factorial (- n 1 ) ) ) ]\n" +
                        "))\n" +
                        "\n" +
                        "( calcular-factorial 4 )";
        return data;
    }
    
    public String Ejemplo4(){
        String data =   ";Crear una cadena de tamaño n  y luego llenar ese tamaño con la letra H\n" +
                        "( define ( s n )\n" +
                        "       ( make-string n #\\H )		\n" +
                        " )\n" +
                        "\n" +
                        "(display \"Ingrese valor de N: \\n\")\n" +
                        "(s (read))	";
        return data;
    }
    
    public String Ejemplo5(){
        String data = "";
        return data;
    }
    
    public String Paso1(int este){
        String data = "";
        switch(este){
            case 1: data =  "Definimos la funcion ElevarpotenciaN y recive\n" +
                            "dos argumentos";
                    break;
            case 2: data =  "Llamaos la funcion ElevarpotenciaN y pedimos\n" +
                            "dos datos por teclado";
                  break;
            case 3: data =  "Definimos la variable que contendra el resultado\n" +
                            "de elever los numeros";
                  break;
            case 4: data =  "Imprimimos el resultado de elevar el numero\n" +
                            "ingresado a la potencia dada";
                  break;
        }
        return data;
    }
    
    public String Paso2(int este){
        String data = "";
        switch(este){
            case 1: data =  "Definimos la funcion intereses y recibe un\n" +
                            "argumento";
                    break;
            case 2: data =  "Llamamos la funcion intereses y pedimos un\n" +
                            "dato por teclado";
                  break;
            case 3: data =  "Evaluamos la funcion cond";
                  break;
            case 4: data =  "Evaluamos si  la variable cantidad es menor\n" +
                            "a 50.000, de ser asi devolvemos el valor del\n" +
                            "interes 0.040: 4%";
                  break;
            case 5: data =  "Evaluamos  si   la  variable  cantidad   es  menor\n" +
                            "o igual a 250.000, de ser asi devolvemos el valor\n" +
                            "del interes 0.045: 4.5%";
                  break;
            case 6: data =  "Evaluamos si la variable cantidad es mayor\n" +
                            "a 250.000, de  ser  asi  devolvemos el valor\n" +
                            "del interes 0.050: 5%";
                  break;
        }
        return data;
    }
    
    public String Paso3(int este){
        String data =   "Definimos la funcion calcular-factorial";
        String data1 =  "Llamamos la funcion calcular-factorial y como \n" +
                        "parametro le enviamos el numero 4";
        String data2 =  "Evaluamos la funcion cond";
        String data3 =  "comparamos si la variable n es igual a 0, de ser\n" +
                        "asi  devolvemos  el  numero  1 y  terminamos  la \n" +
                        "condicion";
        String data4 =  "comparamos si la variable n es igual a 1, de ser\n" +
                        "asi  devolvemos  el  numero  1 y  terminamos  la \n" +
                        "condicion";
        String data5 =  "Evaluamos la funcion else de la condicion con \n" +
                        "nos encargamos  de hacer la recuersion dado\n" +
                        "que no se cumpla el paso anterior";
        String data6 =  "Hacemos  el  llamado recursivo  de la funcion \n" +
                        "para  calcular   el  factorial  de el numero dado\n" +
                        "multiplicacios   e l  valor  que  tiene  n  en  ese \n" +
                        "momento por el valor de n -1 y luego llamamo\n" +
                        "la funcion decrementando a n en uno";
        return data;
    }
    
    public String Paso4(int este){
        String data =   "Definimos  la funcion  s y recive un argumente\n" +
                        "el cual es el numero de caracteres que tendra\n" +
                        "la cadena";
        String data2 =  "Llamamos la funcion s y como parametro le\n" +
                        "enviamos un numero leido por teclado";
        String data3 =  "mediante la funcion make-string creamos la\n" +
                        "cadena  a  llenar  con  el tamaño n asignado\n" +
                        "con los caracteres #\\H";
        String data4 =  "usamos la funcion display para mostrar un texto\n" +
                        "guia por pantalla";
        return data;
    }
    
    public String Paso5(int este){
        String data = "";
        return data;
    }
        
}
