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
        String data="Es una función que sirve para determinar si algún dato es un carácter.\n" +
                    "\n" +
                    "Sintaxis                                      Salida\n" +
                    "(char? a)               ->                 #t o #f";
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
           String data=     ";Recibir   un  carácter  que  represente   una   nota.  Si   es  la  letra  E  mayúscula  o  la \n" +
                            ";letra  e minúscula  imprimir  \"excelente\" ,  si es la letra  B o la letra b imprimir \"Bueno\" , \n" +
                            ";si  es la letra A o la  letra  a  imprimir  \"Aceptable\" , si es la letra D o la letra d imprimir \n" +
                            "\"Define\", y si es la letra I o la   letra  i imprimir   \"Insuficiente\".\n\n" +
                            "\n" +
                            "(define (Notas X) \n" +
                            "      (cond \n" +
                            "	( (char-ci=? X #/e)   (display\"Excelente\") ) \n" +
                            "	( (char-ci=? X #/s)   (display\"Sobresaliente\")) \n" +
                            "	( (char-ci=? X #/a)   (display \"Aceptable\") ) \n" +
                            "	( (char-ci=? X #/i)    (display \"Insuficiente\") ) \n" +
                            "	( (char-ci=? X #/d)   (display \"Deficiente\") ) \n" +
                            "	(else  (display \"No es una nota valida.\") )\n" +
                            "                     )\n" +
                            "                  )\n" +
                            "(Notas  (read) )";
        return data;
    } 
    
    public String Ejecaracter2(){
        String data=    ";Imprimir los caracteres que equivalen a los números hasta el 1024 código ASCII\n\n" +
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
        String data=    ";Realice  el   programa  propuesto  y  documente  el  código siguiendo el diseño \n" +
                        ";guiado por contrato:  Escribir  un  programa  que  pida  un  número  y  saque  por  \n" +
                        ";pantalla  su  tabla de multiplicar.; Contrato: TablaMultiplicar: número número -> \n" +
                        ";número cadena número cadena numero...\n" +
                        "\n" +
                        "; Propósito: Visualizar determinada tabla de multiplicar.\n" +
                        "\n" +
                        "; Ejemplo: {TablaMultiplicar 8 0} debe producir la tabla de multiplicar del número 8 \n" +
                        ";hasta el 10, con el formato: 8*0 = 0... 8*10 =80\n" +
                        "\n" +
                        "; Parámetros:\n" +
                        ";        a: Indica que numero multiplicar\n" +
                        ";        b:Actua como contador y siempre debe iniciar en 0\n" +
                        "\n" +
                        ";Definición:\n\n" +
                        "\n" +
                        "(define(TablaMultiplicar a b)\n" +
                        "    (if(=b 10)\n" +
                        "         (begin\n" +
                        "               (display a)\n" +
                        "               (display \"*\")\n" +
                        "               (display b)\n" +
                        "               (display \" = \")\n" +
                        "               (display(* a b ))\n" +
                        "          )\n" +
                        "         (begin\n" +
                        "              (display a)\n" +
                        "              (display b)\n" +
                        "              (display\" = \")\n" +
                        "              (display(* a b))(newline)\n" +
                        "              (TablaMultiplicar a (+ 1 b))\n" +
                        "           )\n" +
                        "     )\n" +
                        ")\n" +
                        "(TablaMultiplicar (read) 0)";
        return data;
    }
    
    public String Ejecaracter4(){
        String data=    ";Construir una funcion que reciba un caracter e imprima \"Es una vocal\" si el caracter es una\n" +
                        ";vocal, de lo contrario imprimir \"No es una vocal\".\n" +
                        "\n" +
                        "(define (EsVocal?  voc)\n" +
                        "       (cond\n" +
                        "                  ( (char-ci=? voc #/a)   (display  \"Es una vocal\") )\n" +
                        "                  ( (char-ci=? voc #/e)   (display  \"Es una vocal\") )\n" +
                        "                  ( (char-ci=? voc #/i)   (display  \"Es una vocal\") ) \n" +
                        "                  ( (char-ci=? voc #/o)   (display  \"Es una vocal\") )\n" +
                        "                  ( (char-ci=? voc #/u)   (display  \"Es una vocal\") )\n" +
                        "            (else \n" +
                        "                    (display  \"No es una vocal\")\n" +
                        "             )\n" +
                        "       )\n" +
                        ")\n" +
                        "\n" +
                        "(EsVocal?  (read))";
        return data;
    }
    
    public String Ejecaracter5(){
        String data=    ";Construir una funcion que reciba un caracter y lo convierta en una letra mayuscula, si la letra\n" +
                        ";es mayuscula que la convierta en minuscula.\n" +
                        "\n" +
                        "(define (convertir  letra)\n" +
                        "       (cond\n" +
                        "                  ((char-upper-case? letra )    (display (char-upcase letra) ) )\n" +
                        "                  ((char-lower-case?  letra) )   (display (downcase letra) ) )\n" +
                        "            (else \n" +
                        "                    (display  \"Ingrese un caractter\")\n" +
                        "             )\n" +
                        "       )\n" +
                        ")\n" +
                        "\n" +
                        "(convertir (read))";
        return data;
    }
    
    public String Ejecaracter6(){
        String data=    ";Construir una funcion que reciba dos caracteres y compare cual es el mayor; si el primero\n" +
                        ";es mayor que el segundo mostrar el caracter .\n" +
                        "\n" +
                        "(define (comparar  caract caract2)\n" +
                        "       (cond\n" +
                        "                  ((char>? caract caract2)    (display caract ) )\n" +
                        "                  ((char<? caract caract2)    (display  caract2 ) )\n" +
                        "       )\n" +
                        ")\n" +
                        "\n" +
                        "(comparar (read) (read))";
        return data;
    }
    
    public String Ejercicios(){
        String data =   "1.Construir una función que reciba un para metro y devuelva  Verdadero si es un carácter. \n" +
                        "Falso si no lo es.\n" +
                        "\n" +
                        "2.Construir una función que reciba un parámetro. Si el parámetro es un carácter alfabético, "+
                        "\ndeterminar si está en minúscula.  El  programa  debe  pasarlo  a  mayúsculas  y retornarlo. \n" +
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
