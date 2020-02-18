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
public class Cadenas_Strings {

    public Cadenas_Strings() {

    }
    
    public String Ques(){
        String data =   "Una cadena es la union de dos o mas caractares que reprecentan una \n" +
                        "palabra  en   pocas   palabras, un  conjunto  de  caracteres   forma  una  \n" +
                        "cadena, es decir; \"Hola\". \n" +
                        "\n" +
                        "Reprecentado por comillas dobles";
        return data;
    }

    public String IsString(){
        String data=    "Para comprobar si un dato es una cadena usamos la funcion string?\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "\n" +
                        "(string? n)\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                    Salida\n" +
                        "(string? ''casa'')      #t \n" +
                        "(string? 'rana)         #f ;'rana no es una cadena \n" +
                        "(string? 8)                #f ;8 es un numero\n" +
                        "(string? '''')                #t ;es una cadena aunque este vacia\n" +
                        "\n" +
                        "Como se puede observar se considera cadena a todo aquelloque se\n" +
                        "encuentre dentro de unas comillas dobles  '' '\n" +
                        "\n" +
                        "";
        return data;
    }

    public String makeString(){
        String data=    "Para la creacion de cadenas podemos usar las  funciones make-string\n" +
                        "y string\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "(make-string n)\n" +
                        "(make-string n ch)\n" +
                        "(string ch1 ch2 ...)\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                            Salida\n" +
                        "(make-string 3)              ''      ''  cadena de tres posiciones\n" +
                        "(make-string 3 #/a)       ''aaa''  cadena con el caracter a de 3 posiciones\n" +
                        "(string #/H #/o #/l #/a)   ''Hola'' cadena con caracteres dados\n" +
                        "\n" +
                        "Como se puede ver las funciones make-string y string sirben para crear\n" +
                        "cadenas\n" +
                        "";
        return data;
    }

    public String lenght(){
        String data=    "La   longitud   de   una   cadena   es   el   numero   de  caracteres que la \n" +
                        "componen\n" +
                        "\n" +
                        "Por  ejemplo  la  longitud de una cadena vacia es 0 y la longitud de una\n" +
                        "cadena ''hola'' es 4.\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "(string-length cadena)    tomando una cadena como referencia y retorna\n" +
                        "                                            el numero de caracteres que tiene\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                               Salida\n" +
                        "(string-length ''hola'')       4\n" +
                        "(string-length '''')               0";
        return data;
    }
    
    public String unioncad(){
        String data =   "Las cadenas  tambien  pueden  ser  concatenadas  (unidas)  usando la\n" +
                        "funcion (string-append cad1 cad2  ..) toma varias cadenas y retorna una\n" +
                        "cadena con la union de todas las cadenas\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                                                   Salida\n" +
                        "(string-append ''Hola '' ''mundo'')      Hola mundo\n" +
                        "(string-append)                                    '''' cadena vacia";
        return data;
    }
    
    public String stringref(){
        String data =   "Podemos   obtener    caracteres   de    una    cadena   haciendo  uso  de \n" +
                        "(string-ref cadena n)\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                            Salida\n" +
                        "(string-ref ''Hola'' 1)       o\n" +
                        "\n" +
                        "O tambien\n" +
                        "\n" +
                        "Usamos la funcion (substring cadena a b) para sacar caracteres  de un\n" +
                        "cadana entre un intervalo, es decir: tenemos la cadena  ''Hola Mundo'' y \n" +
                        "sacaremos un interbalo entre 2 y 6 y lo que obtendriamos es:\n" +
                        "la Mun\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "Codigo                             Salida\n" +
                        "(substring ''futbol'' 1 3)          ut";
        return data;
    }

    public String setSring(){
        String data =   "Una cadena es modificable por medio de operacuines que cambian su\n" +
                        "contenido es decir: Cadena: Maria se puede modificar por Mario\n" +
                        "\n" +
                        "Cabe   resaltar   que   una   cadena creada entre comillas dobles  no es \n" +
                        "modificable, para ello usamos las sentencias (string), \n" +
                        "\n" +
                        "(make-string)\n" +
                        "\n" +
                        "Para modificar una cadena usamos la funcion (string-set!)\n" +
                        "\n" +
                        "Sintaxix\n" +
                        "\n" +
                        "(string-set! cadena n caracter)    donde n es la posicion a reemplazar el\n" +
                        "                                                           caracter\n" +
                        "\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "(string-set! (string #/M #/a #/r #/i #/a) 4 #/o)"
                ;
        return data;
    }

   public String Stringcmp(){
       String data =    "Si   dos   cadenas   son de diferente longitud y una cadena es prefijo de \n" +
                        "la otra cadena, la cadena mas corta es considerada lexicograficamente\n" +
                        "menor que la otra; \n" +
                        "\n" +
                        "Ejemplo\n" +
                        "''carro'' es prefijo de la cadena ''carrotanque'' por tanto la cadena \n" +
                        "''carro'' es considerada menor que la otra\n" +
                        "\n" +
                        "Sintaxis\n" +
                        "(string=? cadena1 cadena2)        cadena1 igual a cadena2?\n" +
                        "(string<? cadena1 cadena2)        cadena1 menor a cadena2\n" +
                        "(string>? cadena1 cadena2)        cadena1 mayor a cadena2\n" +
                        "(string<=? cadena1 cadena2)      cadena1 menor o igual que cadena2\n" +
                        "(string>=? cadena1 cadena2)      cadena1 mayor o igual que cadena2\n" +
                        "(string-ci=? cadena1 cadena2)    igual que string=? pero insensivle\n" +
                        "(string-ci<? cadena1 cadena2)    igual que string<? pero insensivle\n" +
                        "(string-ci>? cadena1 cadena2)    igual que string>? pero insensivle\n" +
                        "(string-ci<=? cadena1 cadena2)  igual que string<=? pero insensivle\n" +
                        "(string-ci>=? cadena1 cadena2)  igual que string>=? pero insensivle\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "\n" +
                        "Codigo                              	    Salida\n" +
                        "(string=? ''hola'' ''Hola'')         	    f\n" +
                        "(string-ci=? ''hola'' ''Hola'')      	    t; procedimeinto insensible\n" +
                        "(string<? ''bar'' ''futbol'           	    t; b es menor que f)\n" +
                        "(string-ci=? ''futbolbar'' ''futbol')	    f; cadena 2 prefijo menor";
       return data;
   }
   
   public String makeseje(){
       String data =    " ;Al momento de usar la funcion meke-string solo  nos sirve para crear una cadena con los\n" +
                        " ;mismos caracteres, aunque estas cadenas pueden ser modificadas\n" +
                        "\n" +
                        " ;Crear  una  funcion  que llena  una  caden a  de  4  posiciones  con  el  caracter  J  usando \n" +
                        " ;make-string.  Luego  cree  una cadena con la funcion string que di ga  \"Hola que tal tu dia\"  \n" +
                        " ;y  por ultimo muestra  las cadenas creadas usando la funcion (displayln)\n" +
                        "\n" +
                        "(define cad1 (make-string 4 #\\j))\n" +
                        "\n" +
                        "(displayln cad1)\n" +
                        "\n" +
                        "(define cad2 (string #\\H #\\o #\\l #\\a #\\q #\\u #\\e #\\t #\\a #\\l #\\t #\\u #\\d #\\i #\\a))\n" +
                        "\n" +
                        "(displayln cad2)";
       return data;
   }
   
   public String stringeje(){
       String data =    ";crear una funcion que diga si los datos ingresados por teclado es una cadena o no\n" +
                        "\n" +
                        "(define (MiCadena cd)\n" +
                        "     (if  (string? cd)\n" +
                        "            (displayln \"si es una cadena\")\n" +
                        "            (displayln \"no es una cadena\")\n" +
                        "      )\n" +
                        ")\n" +
                        "\n" +
                        "(MiCadena (read))";
       return data;
   }
   
   public String lengtheje(){
       String data =    ";Construir un programa que usando la funcion string-length muestre por pantalla si una\n" +
                        ";cadena   es   mayor    que   10,   si  lo es imprimir cadena de tamaño menor a diez de lo \n" +
                        ";contrario impirmir cadena de tamaño menor a diez.\n" +
                        "\n" +
                        "(define (MiCadena cd)\n" +
                        "     (if  (< (string-length cd) 10)\n" +
                        "            (displayln \"cadena de tamaño menor a diez\")\n" +
                        "            (displayln \"cadena de tamaño mayor a diez.\")\n" +
                        "      )\n" +
                        ")\n" +
                        "\n" +
                        "(MiCadena (read))";
       return data;
   }
   
   public String appendeje(){
       String data =    ";Cree una programa que una dos cadenas usando la funcion string-append, luego mostrar\n" +
                        ";el resultado por pantalla\n" +
                        "\n" +
                        "(define (MisCadena cd cd2)\n" +
                        "\n" +
                        "        (displayln (string-append cd cd2))\n" +
                        ")\n" +
                        "\n" +
                        "(MisCadena (read))";
       return data;
   }
   
   public String seteje(){
       String data =    ";Cree  una cadena con la funcion string que diga  \"Es hora de cenar\", luego  mediante la \n" +
                        ";funcion  string-set!  cambiar  la  letra  c  de la cadena por una  z y  por ultimo  muestra  la\n" +
                        ";cadena creada usando la funcion (displayln)\n" +
                        "\n" +
                        "\n" +
                        "(define cad (string #\\E #\\s #\\h #\\o #\\r #\\a #\\d #\\e #\\c #\\e #\\a #\\r))\n" +
                        "\n" +
                        "(displayln (string-set! cad 9 #\\z))";
       return data;
   }
   
   public String refeje(){
       String data =    ";Construir  un  programa  que  permita  genrear  codigos  de  usarios  con  el  procedimiento\n" +
                        ";siguiente :debde de leer el nombre y los dos apellidos de una persona y devolver un codigo\n" +
                        ";de usario  formado  por   las tres primeras letras del primer apellido, segundo apellido y del\n" +
                        ";nombre\n" +
                        "\n" +
                        ";ejemplo:\n" +
                        "\n" +
                        ";Balvin Sanches Ana\\n\n" +
                        ";BalSanAna\n" +
                        "\n" +
                        ";(define(Codigo nom ap1 ap2)\n" +
                        "    (display(substring nom 0 3))\n" +
                        "    (display(substring ap1 0 3))\n" +
                        "    (display(substring ap2 0 3))\n" +
                        ")\n" +
                        "(codigo(read)(read)(read))";
       return data;
   }
   
   public String strincmpeje(){
       String data =";Construir un programa que reciva una cadena y devuelva una cadena equivalente, pero\n" +
                    ";sin las vocales\n" +
                    "\n" +
                    "(define(Cadena read);lee y almacena nuestra cadena.\n" +
                    "    (Read)\n" +
                    ")\n" +
                    "\n" +
                    "(define(Tamaño read) ;Define y almacena el tamaño de nuestra Cadena.\n" +
                    "     (string-length(Cadena read)\n" +
                    ")\n" +
                    "\n" +
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
                    "\n" +
                    "(define(Principal usrdef)\n" +
                    "    (Sinvocls(Cadena usrdef)(Tamaño usrdef)0)\n" +
                    ")\n" +
                    "\n" +
                    "(Principal (read))";
       return data;
   }

    public String Ejercicios(){
        String exersises = "1.Construir una funcion que reciba una cadena y\n la devuelva invertida\n\n"
                         +"2.Construir una funcion que reciba una cadena y\n que devuelva cuantas vocales tiene\n\n "
                         +"3.Construir una programa que permita recibir una\n cadena e imprimir el primer y el ultimo caracter\n\n "
                         +"4.Construir un programa que reciba una cadena y \n si la cadena tiene mas de 10 caracteres\n imprimir "
                         +"'Es muy larga esta cadena' de lo contrario \n 'la cadena es pequeña'\n\n"
                         +"5.Construir un programa que permita recibir \n una cadena e imprimir cuantos espacios en blaco tiene\n\n"
                         +"6.Construir un programa que reciba dos cadenas \n y que devuelva una tercer cadena con la \n union de ellas"
                         +". No usar la funcion string-append\n\n"
                         +"7.Construir una funcion en racket que reciba una \n Cadena y que devuelva otra cadena solo \n con sus consonantes\n\n"
                         +"8.Construir un programa que permita recibir una cadena\n y cambiar el ultimo caracter por una X,\n luego imprimir el resultado\n\n";
        return exersises;
    }

}
