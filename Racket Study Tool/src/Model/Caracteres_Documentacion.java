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
    
    public String caracter1(){
        String data="Son un tipo  de  dato. Los caracteres se utilizan para  mostrarlos  en  pantalla\n" +
                    "y asi comunicarno con el usuario.";
        return data;
    }
    
    public String caracter2(){
        String data="Es una funcion que sirve para determinar si algun dato es un caracter.";
        return data;
    }
    
    public String caracter3(){
        String data="Se  utiliza  para  un  caso  insensible,  es   decir ,   mayusculas   o   minusculas \n" +
                    "Racket las tomara como iguales.\n" +
                    "\n" +
                    "(Racket  tambien  provee  funciones  para encontar que tipo de caracter se \n" +
                    "esta  evaluando .  Puede   ser  un  alfabetico,  numerico,  espacio en blanco, \n" +
                    "mayusculas o miscula).";
        return data;
    }
    
    public String caracter4(){
        String data="Como   habiamos   visto   anteriormente,  se comienza usando  el caracter\n" +
                    "punto y coma y terminan en el siguiente salto  de linea. Tambien tenemos\n" +
                    "las   \"Cajas de comentarios\"   que   son  recuadros en los que (Sin importar\n" +
                    "la  cantidad de saltos o  el texto que incluyamos todo lo que ete dentro de\n" +
                    "el sera considerado comentario.\n" +
                    "\n" +
                    "Para usar una  caja de  comentarios basta con ir al menu \"insert\" y  luego\n" +
                    "dar clic en la opcion \"insertar caja de comentarios\".\n" +
                    "\n" +
                    "Con  comentarios  tambien  podemos  dividir el  codigo  en  secciones  y  \n" +
                    "de esta forma nos facilitaremos  mucho  el trabajo a  la hora de corregir, \n" +
                    "revisar y/o optimizar.";
        return data;
    }
    
    public String caracter5(){
        String data="La  documentacion   de   un   programa  va  desde comentarsus  lineas   de  \n" +
                    "codigo  al  escribir el manual del usuario.\n" +
                    "\n" +
                    "En nuestro caso , veremos a grandes rasgos dos elementos  importantes en\n" +
                    "la   documentacion:   el  diseño   guiado   por   recetas   (tambien   llamado\n" +
                    "contrato ) y el uso de los comentarios. ";
        return data;
    }
    
    
    public String Ejecaracter1(){
           String data=    ";Recibir   un  caracter  que  represente   una   nota.  Si   es  la  letra  E  (mayuscula)  o  la  letra  e\n" +
                            ";minuscula  imprimir \"excelente\" ,  si es la letra B o la letra b imprimir \"Bueno\" , si  es la letra A\n" +
                            ";o la letra a imprimir  \"Aceptable\" , si es la letra D o la letra d imprimir \"Define\", y si es la letra I o \n" +
                            ";la   letra  i imprimir   \"Insuficiente\".\n\n" +
                            "(define (Notas X)              ;El argumento X debe ser reemplazado con un caracter\n" +
                            "      (cond                              ;Usamos cond ya que es idoneo para este tipo de ejercicios\n" +
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
        String data=    ";Imprimir los caracteres que equivalen a los numeros asta el 1024 codigo ASCII\n" +
                        "\n" +
                        "(define(CodASCII Cont)\n" +
                        "   (if(=Cont 1024)                                      ; Cont aumentara hasta 1024 y se dara el caso base\n" +
                        "      (display(integer->char Cont))          ;(caso base)\n" +
                        "      (begin                                                   ; Para todos los casos generales\n" +
                        "           (display (integer->char Cont))     ;Imprimir Cont como un caracter\n" +
                        "           (display \" \")                                      ; Imprimir un espacio para separar los caracteres \n" +
                        "           (CodASCII(+ 1 Cont))                    ;Llamado recursivo, aumenta Cond en 1\n" +
                        "           )\n" +
                        "        )\n" +
                        "    )\n" +
                        " (CodASCII 1)";
        return data;
    }
    
    public String Ejecaracter3(){
        String data=    ";Realice  el   programa  propuesto  y  documente  el  codigo siguiendo el diseño guiado por \n" +
                        ";contrato:  Escribir  un  programa  que  pida  un  numero  y  saque  por  pantalla  su  tabla de \n" +
                        ";multiplicar.; Contrato: TablaMultiplicar: numero numero -> numero cadena numero cadena \n" +
                        ";numero...\n" +
                        "\n" +
                        "; Proposito: Visualizar determinada tabla de multiplicar.\n" +
                        "\n" +
                        "; Ejemplo: (]TablaMultiplicar 8 0) debe producir la tabla de multiplicar del numero 8 hasta el \n" +
                        ";10, con el formato: 8*0 = 0... 8*10 =80\n" +
                        "\n" +
                        "; Parametros:\n" +
                        ";        a: Indica que numero multiplicar\n" +
                        ";        b:Actua como contador y siempre debe iniciar en 0\n" +
                        "\n" +
                        ";Definicion:\n\n" +
                        "\n" +
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
                        "(TablaMultiplicar (read) 0)\n" +
                        "; Valor esperado: Debe devolver la tabla de multiplicar del numero ingresado\n" +
                        "; por  teclado hasta multiplicarse por 10, con el siguiente formato:\n" +
                        ";              a*0=0\n" +
                        ";                      ...\n" +
                        ";              a*10=a*10";
        return data;
    }
    
    public String Ejercicios(){
        String data =   "1.Construir una funcion que reciba un para metro y devuelva  Verdadero si es un caracter. \n" +
                        "Falso si no lo es.\n" +
                        "\n" +
                        "2.Construir una funcion que reciba un parametro. Si el parametro es un caracter alfabetico, determinar si esta en minuscula.  El  programa  debe  pasarlo  a  mayusculas  y retornarlo. \n" +
                        "Hacer lo mismo en caso contrario.\n" +
                        "\n" +
                        "4.Construir una funcion que reciba un caracter e imprima  \"Es una vocal\"  si el caracter es \n" +
                        "una vocal   o devuelva  un  mensaje  de  error en  caso  contrario.  Usar la funcion anterior.\n" +
                        "\n" +
                        "7.Construir una funcion que reciba un parametro. Si el parametro es un caracter  devolver \n" +
                        "el numero  que  corresponda  en  la  tabla  del  codigo ASCII y si es un numero devolver el \n" +
                        "caracter que  corresponda  en  la tabla. Nota: la funcion (number? n), retorna verdadero si \n" +
                        "n es un numero y falso de lo contrario.\n" +
                        "\n" +
                        "9.Escribir un programa que reciba una palabra acabada en un  punto  y  cuente las letras \n" +
                        "que contiene.";
        return data;
    }
 
}
