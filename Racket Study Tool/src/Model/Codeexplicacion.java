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
        String data = "";
        return data;
    }
    
    public String Ejemplo2(){
        String data = "";
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
        return data;
    }
    
    public String Paso2(int este){
        String data = "";
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
    
    
    
    String data =  " ;Ejemplo de cond \n" +
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
