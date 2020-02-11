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

    public String IsString(){
        String data= "Para comprobar si un dato es una cadena usamos\nla funcion string?\n\n"
                    +"Sintaxis\n(string? n)\n\nEjemplo\n\n"
                    +"Codigo                 Salida\n"
                    +"(string? ''casa'')   #t \n"
                    +"(string? 'rana)      #f ;'rana no es una cadena \n"
                    +"(string? 8)             #f ;8 es un numero\n"
                    +"(string? '''')            #t ;es una cadena aunque este vacia\n\n"
                    +"Como se puede observar se considera cadena a todo aquello\nque se encuentre dentro de unas comillas dobles '' ''";
        return data;
    }

    public String makeString(){
        String data= "Para la creacion de cadenas podemos usar las \nfunciones make-string y string\n\n"
                    +"Sintaxis\n(make-string n)\n(make-string n ch)\n(string ch1 ch2 ...)\n\nEjemplo\n\n"
                    +"Codigo                          Salida\n"
                    +"(make-string 3)            ''      ''  cadena de tres posiciones\n"
                    +"(make-string 3 #/a)      ''aaa''  cadena con el caracter a de 3 posiciones\n"
                    +"(string #/H #/o #/l #/a)  ''Hola'' cadena con caracteres dados\n\n"
                    +"Como se puede ver las funciones make-string y string sirben\npara crear cadenas\n\n";
        return data;
    }

    public String lenght(){
        String data= "La longitud de una cadena es el numero de caracteres\nque la componen\n\n"
                    +"Por ejemplo la longitud de una cadena vacia es 0 y la\nlongitud de una cadena ''hola'' es 4.\n\n"
                    +"Sintaxis\n(string-length cadena) toamndo una cadena como\nreferencia y retorna el numero de caracteres que tiene\n\nEjemplo\n\n"
                    +"Codigo                        Salida\n"
                    +"(string-length ''hola'')       4\n"
                    +"(string-length '''')               0\n\n"
                    +"Las cadenas tambien pueden ser concatenadas (unidas) \nusando la funcion (string-append cad1 cad2  ..) toma varias \ncadenas y retorna "
                    +"una cadena con la union de todas las cadenas\n\n"
                    +"Ejemplo\n\n"
                    +"Codigo                                                Salida\n"
                    +"(string-append ''Hola '' ''mundo'')      Hola mundo\n"
                    +"(string-append)                                    '''' cadena vacia\n";
        return data;
    }

    public String setSring(){
        String data = "Cadenas modificables\n\n"
                     +"Una cadena es modificable por medio de operacuines que \ncambian su contenido "
                     +"es decir: Cadena: Maria se puede \nmodificar por Mario\n\n"
                     +"Cabe resaltar que una cadena creada entre comillas dobles \nno es modificable,"
                     +" para ello usamos las sentencias (string), \n(make-string)\n\n"
                     +"Para modificar una cadena usamos la funcion (string-set!)\nSintaxix\n\n"
                     +"(string-set! cadena n caracter) donde n es la posicion a \nreemplazar el caracter\n\nEjemplo\n\n"
                     +"(string-set! (string #/M #/a #/r #/i #/a) 4 #/o)\n\n"
                     +"Podemos obtener caracteres de una cadena haciendo uso \nde (string-ref cadena n)\n\nEjemplo\n\n"
                     +"Codigo                        Salida\n"
                     +"(string-ref ''Hola'' 1)       o\n\n"
                     +"Usamos la funcion (substring cadena a b) para sacar caracteres \nde un cadana entre un intervalo, es decir:"
                     +" tenemos la cadena \n''Hola Mundo'' y sacaremos un \ninterbalo entre 2 y 6 y lo que obtendriamos es:\nla Mun\nEjemplo\n"
                     +"Codigo                             Salida\n"
                     +"(substring ''futbol'' 1 3)          ut"
                ;
        return data;
    }

   public String Stringcmp(){
       String data ="Comparacion de cadenas\n"
                    +"Si dos cadenas son de diferente longitud y una cadena es prefijo de \nla otra cadena, la "
                    +"cadena mas corta es \nconsiderada lexicograficamente menor que la otra; \n\nEjemplo\n"
                    +"''carro'' es prefijo de la cadena ''carrotanque'' por tanto la cadena \n''carro'' es considerada menor que la otra\n\nSintaxis\n"
                    +"(string=? cadena1 cadena2)    cadena1 igual a cadena2?\n" +
                    "(string<? cadena1 cadena2)     cadena1 menor a cadena2\n" +
                    "(string>? cadena1 cadena2)     cadena1 mayor a cadena2\n" +
                    "(string<=? cadena1 cadena2)    cadena1 menor o igual que cadena2\n" +
                    "(string>=? cadena1 cadena2)    cadena1 mayor o igual que cadena2\n" +
                    "(string-ci=? cadena1 cadena2)  igual que string=? pero insensivle\n" +
                    "(string-ci<? cadena1 cadena2)  igual que string<? pero insensivle\n" +
                    "(string-ci>? cadena1 cadena2)  igual que string>? pero insensivle\n" +
                    "(string-ci<=? cadena1 cadena2) igual que string<=? pero insensivle\n" +
                    "(string-ci>=? cadena1 cadena2) igual que string>=? pero insensivle\n\n" +
                    "Ejemplo\n\n"
                    +"Codigo                              \t    Salida\n"
                    +"(string=? ''hola'' ''Hola'')         \t    f\n"
                    +"(string-ci=? ''hola'' ''Hola'')      \t    t; procedimeinto insensible\n"
                    +"(string<? ''bar'' ''futbol'           \t    t; b es menor que f)\n"
                    +"(string-ci=? ''futbolbar'' ''futbol')\t    f; cadena 2 prefijo menor\n"
               ;
       return data;
   }


   public String Ejemplos(int r){
       String data ="";
       switch(r){
           case 1: data =   ";Construir un programa que permita genrear codigos de usarios con el \n" +
                            ";procedimiento siguiente:debde de leer el nombre y los dos apellidos \n" +
                            ";de una persona y devolver un codigo de usario formado por las tres \n" +
                            ";primeras letras del primer apellido, segundo apellido y del nombre\n" +
                            "\n" +
                            ";ejemplo:\n" +
                            ";Balvin Sanches Ana\n" +
                            "\n" +
                            ";BalSanAna\n\n"+
                            ";(define(Codigo nom ap1 ap2)\n" +
                                  "    (display(substring nom 0 3))\n" +
                                  "    (display(substring ap1 0 3))\n" +
                                  "    (display(substring ap2 0 3))\n" +
                                  ")\n"+
                                  "(codigo(read)(read)(read))";
                    break;
           default: data =  ";Construir un programa que reciva una cadena y devuelva una cadena \n" +
                        ";equivalente, pero sin las vocales\n" +
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

       }
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
