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
public class Recorrido {
    private String Simbolos;
    private int numero;
    
    public Recorrido() {
        this.Simbolos = "+ - * /";
    }
    
    public String Preorden(){
        String data = "hi";
        return data;
    }
    
    public String Inorden(){
        String data = "hi";
        return data;
    }
    
    public String Posorden(){
        String data = "hi";
        return data;
    }
    
    public void cdebuger_ejemplo(){
        String data =  ";Construir un programa que reciva una cadena y devuelva una cadena \n" +
                        ";equivalente, pero sin las vocales\n\n" +
                        "(define(Cadena read);lee y almacena nuestra cadena.\n" +
                        "    (Read)\n" +
                        ")\n" +
                        "(define(Tamaño read)\n;Define y almacena el tamaño de nuestra Cadena.\n" +
                        "     (string-length(Cadena read)\n" +
                        ")\n" +
                        "(define(Sinvocls CAD LENGTH POS)\n" +
                        "    (if(=LENGTH POS)\n" +
                        "       (display'' '')\n" +
                        "       (begin\n" +
                        "           (if(or(char-cir=?(string-ref(Cadena CAD)POS)#/a)\n" +
                        "            \n" +
                        "                  (char-cir=?(string-ref(Cadena CAD)POS)#/e)\n" +
                        "                  (char-cir=?(string-ref(Cadena CAD)POS)#/i)\n" +
                        "                  (char-cir=?(string-ref(Cadena CAD)POS)#/o)\n" +
                        "                  (char-cir=?(string-ref(Cadena CAD)POS)#/u))\n" +
                        "                  (display '' '');De cumplirse,devolver vacío.\n" +
                        "                  (display(string-ref(Cadena CAD)POS))\n" +
                        "            )\n" +
                        "          (Sinvocls CAD LENGTH(+ POS 1))\n" +
                        "       )\n" +
                        "      )\n" +
                        "   )\n" +
                        "(define(Principal usrdef)\n" +
                        "    (Sinvocls(Cadena usrdef)(Tamaño usrdef)0)\n" +
                        ")\n" +
                        "(Principal (read))";
        String an ="";
        int d = 0;
        for(int i=0; i < data.length();i++){
            an += data.charAt(i);
            d = ((i+1) < data.length())? i+1 : i;
           if((data.charAt(i) == ')') &&  (data.charAt(d) == '\n')){
                an += data.charAt(i)+"<-";
            }
        }
      System.out.println(an);
    }
}
