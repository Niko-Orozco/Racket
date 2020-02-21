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
public class Caracteres_Documentacion {

    public Caracteres_Documentacion() {
        
    }
    
    public String Ejecaracter1(){
           String data=    "Recibir un caracter que represente una nota. Si es la letra E (mayuscula) o la "
                          + "letra e (minuscula) primir \"excelente\" ,,"
                          + " si es la letra B o la letra b imprimir \"Bueno\" , si es la letra A o la letra a imprimir \n" +
                            "\"Aceptable\" , si es la letra D o la letra d imprimir  \"Define\","
                          + " y si es la letra I o la letra i imprimir  \"Insuficiente\".(define (Notas X) ;El argumento X debe ser reemplazado con uncaracter\n" +
                            "      (cond ;Usamos cond ya que es idoneo para este tipo de ejercicios\n" +
                            "	[ (char-ci=? X #/e)   (display\"Execelente\") ]\n" +
                            "	[ (char-ci=? X #/s)   (display\"Sobresaliente\") ]\n" +
                            "	[ (char-ci=? X #/a)   (display \"Aceptable\") ]\n" +
                            "	[ (char-ci=? X #/i)    (display \"Insuficiente\") ]\n" +
                            "	[ (char-ci=? X #/d)   (display \"Deficiente\") ]\n" +
                            "	(else  (display \"No es una nota valida.\") );Si se introduce un caracter inesperado.\n" +
                            "                     )\n" +
                            "                  )\n" +
                            "(Notas  (read) )";
       
                    
        return data;
    } 
    
    public String Ejecaracter2(){
        String data=    "Imprimir los caracteres que equivalen a los numeros ast el 1024 (codigo ASCII)(define(CodASCII Cont)\n" +
                        "   (if(=Cont 1024) ; Cond aumentara hasta 1024 y se dara el caso base\n" +
                        "      (display(integer->char Cont)) ;(caso base)\n" +
                        "      (begin; Para todos los casos generales\n" +
                        "           (display (integer->char Cont)) ;Imprimir Cont como un caracter\n" +
                        "           (display \" \"); Imprimir un espacio para separar los caracteres \n" +
                        "           (CodASCII(+ 1 Cont)) ;Llamado recursivo, aumenta Cond en 1\n" +
                        "           )\n" +
                        "        )\n" +
                        "    )\n" +
                        " (CodASCII 1)";
        return data;
    }
    
    public String Ejecaracter3(){
        String data=    "Realice el programa propuesto y documente el codigo siguiendo el diseño guiado "
                      + "por contrato: Escribir un programa que pida un numero y saque por pantalla su tabla "
                     +  "de multiplicar.; Contrato: TablaMultiplicar: numero numero -> numero cadena numero cadena numero...\n" +
                        "; Proposito: Visualizar determinada tabla de multiplicar.\n" +
                        ";   Ejemplo: (]TablaMultiplicar 8 0) debe producir la tabla de multiplicar del numero 8 hasta el 10, \n" +
                        "con el formato: 8*0 = 0... 8*10 =80\n" +
                        "; Parametros:\n" +
                        ";        a: Indica que numero multiplicar\n" +
                        ";        b:Actua como contador y siempre debe iniciar en 0\n" +
                        ";Definicion:\n" +
                        "(define(TablaMultiplicar a b)\n" +
                        "    (if(=b 10)\n" +
                        "       (begin\n" +
                        "         (display a)\n" +
                        "         (display \"*\")\n" +
                        "         (display b)\n" +
                        "         (display \" = \")\n" +
                        "         (display(* a b ))\n" +
                        "         )\n" +
                        "         (begin\n" +
                        "           (display a)\n" +
                        "           (display b)\n" +
                        "           (display\" = \")\n" +
                        "           (display(* a b))(newline)\n" +
                        "           (TablaMultiplicar a (+ 1 b))\n" +
                        "            )\n" +
                        ")\n" +
                        ")\n" +
                        ";Pruebas:\n" +
                        "(TablaMultiplicar(read)0)\n" +
                        "; Valor esperado: Debe devolver la tabla de multiplicar del numero ingresado\n" +
                        ";                         por  teclado hasta multiplicarse por 10, con el siguiente formato:\n" +
                        ";                      a*0=0\n" +
                        ";                      ...\n" +
                        ";                      a*10=a*10";
        return data;
    }
    
 
}
