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
                    "y así comunicarnos con el usuario.";
        return data;
    }
    
    public String caracter2(){
        String data="Es una función que sirve para determinar si algún dato es un carácter.";
        return data;
    }
    
    public String caracter3(){
        String data="Se  utiliza  para  un  caso  insensible,  es   decir ,   mayúsculas   o   minúsculas \n" +
                    "Racket las tomara como iguales.\n" +
                    "\n" +
                    "(Racket  también  provee  funciones  para encontrar que tipo de carácter se \n" +
                    "está  evaluando .  Puede   ser  un  alfabético,  numérico,  espacio en blanco, \n" +
                    "mayúsculas o minúscula).";
        return data;
    }
    
    public String caracter4(){
        String data="Como   habíamos   visto   anteriormente,  se comienza usando  el carácter\n" +
                    "punto y coma y terminan en el siguiente salto  de línea. También tenemos\n" +
                    "las   \"Cajas de comentarios\"   que   son  recuadros en los que (Sin importar\n" +
                    "la  cantidad de saltos o  el texto que incluyamos todo lo que este dentro de\n" +
                    "el será considerado comentario.\n" +
                    "\n" +
                    "Para usar una  caja de  comentarios basta con ir al menú \"insert\" y  luego\n" +
                    "dar clic en la opción \"insertar caja de comentarios\".\n" +
                    "\n" +
                    "Con  comentarios  también  podemos  dividir el  código  en  secciones  y  \n" +
                    "de esta forma nos facilitaremos  mucho  el trabajo a  la hora de corregir, \n" +
                    "revisar y/o optimizar.";
        return data;
    }
    
    public String caracter5(){
        String data="La  documentación   de   un   programa  va  desde comentar sus  líneas   de  \n" +
                    "código  al  escribir el manual del usuario.\n" +
                    "\n" +
                    "En nuestro caso , veremos a grandes rasgos dos elementos  importantes en\n" +
                    "la   documentación:   el  diseño   guiado   por   recetas   (también   llamado\n" +
                    "contrato ) y el uso de los comentarios. ";
        return data;
    }
    
    
    public String Ejecaracter1(){
           String data=    ";Recibir   un  carácter  que  represente   una   nota.  Si   es  la  letra  E  mayúscula  o  la  letra  e\n" +
                            ";minúscula  imprimir \"excelente\" ,  si es la letra B o la letra b imprimir \"Bueno\" , si  es la letra A\n" +
                            ";o la letra a imprimir  \"Aceptable\" , si es la letra D o la letra d imprimir \"Define\", y si es la letra I o \n" +
                            ";la   letra  i imprimir   \"Insuficiente\".\n\n" +
                            "(define (Notas X) \n" +
                            "      (cond \n" +
                            "	[ (char-ci=? X #/e)   (display\"Excelente\") ]\n" +
                            "	[ (char-ci=? X #/s)   (display\"Sobresaliente\") ]\n" +
                            "	[ (char-ci=? X #/a)   (display \"Aceptable\") ]\n" +
                            "	[ (char-ci=? X #/i)    (display \"Insuficiente\") ]\n" +
                            "	[ (char-ci=? X #/d)   (display \"Deficiente\") ]\n" +
                            "	(else  (display \"No es una nota valida.\") )\n" +
                            "                     )\n" +
                            "                  )\n" +
                            "(Notas  (read) )";
       
                    
        return data;
    } 
    
    public String Ejecaracter2(){
        String data=    ";Imprimir los caracteres que equivalen a los números hasta el 1024 código ASCII\n" +
                        "\n" +
                        "(define(CodASCII Cont)\n" +
                        "   (if(=Cont 1024)\n" +
                        "      (display(integer->char Cont))  \n" +
                        "      (begin                                         \n" +
                        "           (display (integer->char Cont))    \n" +
                        "           (display \" \")       \n" +
                        "           (CodASCII(+ 1 Cont)) \n" +
                        "           )\n" +
                        "        )\n" +
                        "    )\n" +
                        " (CodASCII 1)";
        return data;
    }
    
    public String Ejecaracter3(){
        String data=    ";Realice  el   programa  propuesto  y  documente  el  código siguiendo el diseño guiado por \n" +
                        ";contrato:  Escribir  un  programa  que  pida  un  número  y  saque  por  pantalla  su  tabla de \n" +
                        ";multiplicar.; Contrato: TablaMultiplicar: número número -> número cadena número cadena \n" +
                        ";numero...\n" +
                        "\n" +
                        "; Propósito: Visualizar determinada tabla de multiplicar.\n" +
                        "\n" +
                        "; Ejemplo: {TablaMultiplicar 8 0} debe producir la tabla de multiplicar del número 8 hasta el \n" +
                        ";10, con el formato: 8*0 = 0... 8*10 =80\n" +
                        "\n" +
                        "; Parámetros:\n" +
                        ";        a: Indica que numero multiplicar\n" +
                        ";        b:Actua como contador y siempre debe iniciar en 0\n" +
                        "\n" +
                        ";Definición:\n\n" +
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
                        "(TablaMultiplicar (read) 0)\n";
        return data;
    }
    
    public String Ejercicios(){
        String data =   "1.Construir una función que reciba un para metro y devuelva  Verdadero si es un carácter. \n" +
                        "Falso si no lo es.\n" +
                        "\n" +
                        "2.Construir una función que reciba un parámetro. Si el parámetro es un carácter alfabético, determinar si está en minúscula.  El  programa  debe  pasarlo  a  mayúsculas  y retornarlo. \n" +
                        "Hacer lo mismo en caso contrario.\n" +
                        "\n" +
                        "4.Construir una función que reciba un carácter e imprima  \"Es una vocal\"  si el carácter es \n" +
                        "una vocal   o devuelva  un  mensaje  de  error en  caso  contrario.  Usar la función anterior.\n" +
                        "\n" +
                        "7.Construir una función que reciba un parámetro. Si el parámetro es un carácter  devolver \n" +
                        "el número  que  corresponda  en  la  tabla  del  código ASCII y si es un numero devolver el \n" +
                        "carácter que  corresponda  en  la tabla. Nota: la función (number? n), retorna verdadero si \n" +
                        "n es un número y falso de lo contrario.\n" +
                        "\n" +
                        "9.Escribir un programa que reciba una palabra acabada en un  punto  y  cuente las letras \n" +
                        "que contiene.";
        return data;
    }
 
}
