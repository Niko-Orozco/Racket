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
                        "(ElevarpotenciaN (read) (read) )";
        return data;
    }
    
    public String Ejemplo2(){
        String data =       "  ;Suponga que el banco paga 4% para  depositos  menores \n" +
                            "  ;a $50.000 inclusive , 4.5% para  depositos  menores \n" +
                            "  ;a $250.000  inclusive, y 5% para depositos  mayores\n" +
                            "  ;a $250.000.  Realize   una   funcion  que reciba  un \n"+
                            "  ;reciba un deposito y devuelva el procentaje asignado \n" +
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
        String data = "";
        return data;
    }
    
    public String Ejemplo4(){
        String data = "";
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
        String data = "";
        return data;
    }
    
    public String Paso4(int este){
        String data = "";
        return data;
    }
    
    public String Paso5(int este){
        String data = "";
        return data;
    }
        
}
