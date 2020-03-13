/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ALEJO
 */
public class PracticasModel {
    
    public PracticasModel(){
    }
    
    public String ejerecu1(){
        
        String data = "(define (fibo n)\n" +
                        "  (if(= n 1)\n" +
                        "     1\n" +
                        "         (if(= n 2)\n" +
                        "           1\n" +
                        "           (+(fibo(- n 1))(fibo(- n 2)))\n" +
                        "           )\n" +
                        "        )\n" +
                        "  )\n" +
                        "(fibo 8)) ";
        
        return data;
    }
    
    public String ejerecu2(){
        String data =   "#lang racket\n" +
                        ";Vector de primos \n" +
                        "; este programa crea un vector de m posiciones y lo carga con los primeros m primos\n" +
                        "\n" +
                        "; primo\n" +
                        "; función para evaluar si un numero es primo\n" +
                        "; (primo n) -> boolean\n" +
                        "(define (primo n i)\n" +
                        "  (if (<= i (sqrt n))\n" +
                        "      (if ( = (remainder n i) 0)\n" +
                        "          #f\n" +
                        "          (primo n (+ i 1))\n" +
                        "       )\n" +
                        "      #t\n" +
                        "      ))\n" +
                        "; VecPrimo\n" +
                        "; recibe un vector y lo carga con los numeros primos\n" +
                        "; (VectPrimo vector num) -> vector\n" +
                        "(define (VecPrimo vec pos nro)\n" +
                        "  (if (= pos (vector-length vec))\n" +
                        "      vec\n" +
                        "      (if (primo nro 2)\n" +
                        "          (begin\n" +
                        "            (vector-set! vec pos nro)\n" +
                        "            (VecPrimo vec (+ pos 1) (+ nro 1))\n" +
                        "            )\n" +
                        "          (VecPrimo vec pos (+ nro 1))\n" +
                        "          )))\n" +
                        "\n" +
                        "(VecPrimo (make-vector 10) 0 3)";
        return data;
    }
    
    public String ejefuncion1(){
        
        String data =   "(define (valorpc c)\n" +
                        "  (if (< c 5)\n" +
                        "      (-(* 1800000 c)(*(* 1800000 c)0.10))\n" +
                        "      (if (and (>= c 5)(< c 10))\n" +
                        "          (-(* 1800000 c)(*(* 1800000 c)0.20))\n" +
                        "          (if (>= c 10)\n" +
                        "              (-(* 1800000 c)(*(* 1800000 c)0.10))\n" +
                        "              \"numero no valido\"\n" +
                        "              )\n" +
                        "          )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(valorpc 8)";
        return data;
    }
    
    public String ejefuncion2(){
        
        String data =   "#lang racket\n" +
                        "(define (mayor x y z k)\n" +
                        "  (if (and (> x y)(> x z)(> x k))\n" +
                        "      x\n" +
                        "      (if(and (> y x)(> y z)(> y k))\n" +
                        "         y\n" +
                        "         (if (and (> z x)(> z y)(> z k))\n" +
                        "             z\n" +
                        "             k\n" +
                        "             )\n" +
                        "         )\n" +
                        "      )\n" +
                        "  )\n" +
                        "(mayor 1212 32133 213 21312)";
                return data;
                }
    
    public String ejearitmetica1(){
        
        String data =   "#lang racket\n" +
                        ";Problema 3. El supermercado “El Ahorrito” necesita un programa que calcule el valor de una bolsa de monedas. Defina\n" +
                        ";un programa que reciba el número de monedas de: $20, $50, $100, $200 y $500 que hay en la bolsa y devolver la cantidad\n" +
                        ";de dinero que hay en ella. [Asumir que el primer parámetro corresponde a la cantidad de monedas de $20, el segundo a las\n" +
                        ";de $50, y así sucesivamente]\n\n" +
                        "\n" +
                        "(define (m20 $20)\n" +
                        "  (* $20 20)\n" +
                        "  )\n" +
                        "\n" +
                        "(define (m50 $50)\n" +
                        "  (* $50 50)\n" +
                        "  )\n" +
                        "\n" +
                        "(define (m100 $100)\n" +
                        "  (* $100 100)\n" +
                        "  )\n" +
                        "\n" +
                        "(define (m200 $200)\n" +
                        "  (* $200 200)\n" +
                        "  )\n" +
                        "\n" +
                        "(define (m500 $500)\n" +
                        "  (* $500 500)\n" +
                        "  )\n" +
                        "\n" +
                        "(display \" Cantidad total de monedas en una bolsa \")\n" +
                        "(newline)\n" +
                        "\n" +
                        "(define (coso q w e r t )\n" +
                        "  (+ (m20 q) (+ (m50 w) (+ (m100 e) (+ (m200 r)(m500 t)))))\n" +
                        "  )\n" +
                        "\n" +
                        "\n" +
                        "(display (coso 1 1 1 1 1))";
        
                return data;
        }
    
    public String ejearitmetica2(){
        
        String data =   "#lang racket\n" +
                        ";Problema 8. El crecimiento de un feto demás de 12 semanas de gestación se calcula mediante la función\n" +
                        ";L(t) =1,53 × t - 6,7 , donde L es la longitud (en cm) y t es el tiempo (en semanas). Calcula la edad de un feto cuya longitud\n" +
                        ";es 28 centímetros.\n" +
                        "\n" +
                        ";L + 6,7 /1,53 = t\n" +
                        "\n" +
                        "(displayln \"Edad de un feto\")\n" +
                        "(displayln \" Digite la longitud del feto\")\n" +
                        "(define longitud (read))\n" +
                        "(define edad (/ (+ longitud 6.7) 1.53))\n" +
                        "(display \"La edad de un feto de: \")\n" +
                        "(display longitud)\n" +
                        "(display \" cm, es: \")\n" +
                        "(display edad)\n" +
                        "(display \" semanas\")";
        
                return data;
        }
    
    public String ejecond1(){
        
        String data =   "(define (igual h k)\n" +
                        "  (if(= h k)\n" +
                        "     \"son iguales\"\n" +
                        "     (if(> h k)\n" +
                        "             \"el primero es mayor que el segundo\"\n" +
                        "             (if (< h k)\n" +
                        "                 \"el segundo numero es mayor\"\n" +
                        "                 )\n" +
                        "             )\n" +
                        "     )\n" +
                        "  )  \n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "(igual 1535 1245)";
        
                return data;
        }
    
    public String ejecond2(){
        
        String data =   "(define (libro1 l)\n" +
                        "  (if (= l 1)\n" +
                        "      \"reproducir EL CAPITAL\"\n" +
                        "      (if (= l 2)\n" +
                        "          \"“reproducir EL CÓDIGO DA VINCI\"\n" +
                        "          (if(= l 3)\n" +
                        "             \"“reproducir HARRY POTTER AND THE HALF BLOOD PRINCE\"\n" +
                        "             (if (= l 4)\n" +
                        "                 \"reproducir CIEN AÑOS DE SOLEDAD\"\n" +
                        "                 (if (= l 5)\n" +
                        "                     \"reproducir LA ODISEA\"\n" +
                        "                     \"La opcion no es valida\"\n" +
                        "                     )\n" +
                        "                 )\n" +
                        "             )\n" +
                        "          )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(libro1 3)";
        
                return data;
        }
    
    public String ejecaracteres1(){
        
        String data =   "(define(caracter x)\n" +
                        "  (if (char? x)\n" +
                        "      #\\t\n" +
                        "      #\\f\n" +
                        "      )\n" +
                        "  )\n" +
                        "(caracter #\\7)";
        
                return data;
        }
    
    public String ejecaracteres2(){
        
        String data =   "(define (esvocal x)\n" +
                        "  (if (or(char=? x #\\a)\n" +
                        "         (char=? x #\\e)\n" +
                        "         (char=? x #\\i)\n" +
                        "         (char=? x #\\o)\n" +
                        "         (char=? x #\\u)\n" +
                        "         )\n" +
                        "      \"es vocal\"\n" +
                        "      \"no es vocal\"\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(esvocal #\\e)";
        
                return data;
        }
    
    public String ejecadenas1(){
        
        String data =   "(define cadena1(string #\\W #\\A #\\S #\\S #\\A #\\M #\\A#\\S #\\S #\\A #\\W))\n" +
                        "\n" +
                        "(define cadena2(make-string(string-length cadena1)))\n" +
                        "\n" +
                        "(define (operacion a b)\n" +
                        "  (if (> a 0)\n" +
                        "      (begin\n" +
                        "        (string-set! cadena2 b (string-ref cadena1 (- a 1)))\n" +
                        "        (operacion (- a 1)(+ b 1))\n" +
                        "        )\n" +
                        "      (if (and (string=? cadena1 cadena2))\n" +
                        "          \"Es palindrome\"\n" +
                        "          \"No es palindrome\"\n" +
                        "      \n" +
                        "      )\n" +
                        "    )\n" +
                        "  )\n" +
                        "\n" +
                        "(define (evaluarcadena cadena1)\n" +
                        "  (if (= (string? cadena1) #t)\n" +
                        "     (+ 9 5)\n" +
                        "  \"error en parametros\"\n" +
                        "  )\n" +
                        " )\n" +
                        "(operacion (string-length cadena1)0)";
        
                return data;
        }
    
    public String ejecadenas2(){
        
        String data =   "(define cadena1(string #\\P #\\E #\\R #\\E #\\I #\\R #\\A))\n" +
                        "\n" +
                        "\n" +
                        "(define (operacion a b)\n" +
                        "  (if (> a 0)\n" +
                        "      (begin\n" +
                        "        (display(string-ref cadena1 (- a 1)))\n" +
                        "        (operacion (- a 1)(+ b 1)))\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(operacion (string-length cadena1)0)";
        
                return data;
        }
    
    public String ejevector1(){
        
        String data =   ";llenar 1 vector de n hasta m\n" +
                        "\n" +
                        "(define (mostrar vec i n)\n" +
                        "  (if (< i n)\n" +
                        "      (begin\n" +
                        "        (display (vector-ref vec i))\n" +
                        "        (display \"-\")\n" +
                        "        (mostrar vec (+ i 1) n)\n" +
                        "        )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(define vec1 (vector 4 5 6 9 8 ))\n" +
                        "                  \n" +
                        "                  \n" +
                        "(define (comparar vec1 i n )\n" +
                        "  (if (< i (vector-length vec1))\n" +
                        "      (if (= n (vector-ref vec1 i))\n" +
                        "          (comparar vec1 (+ i 1 )(+ n 1))\n" +
                        "          \"No esta ordenado\"          \n" +
                        "        )\n" +
                        "      \"esta ordenado\"\n" +
                        "      )\n" +
                        "  )\n" +
                        "      \n" +
                        "\n" +
                        "(comparar vec1 0 (vector-ref vec1 0))";
        
                return data;
        }
    
    public String ejevector2(){
        
        String data =   ";llenar 1 vector de n hasta m\n" +
                        "\n" +
                        "(define (hacervec n m)\n" +
                        "  (define vec1 (make-vector (+ (- m n) 1)))\n" +
                        "  (llenar vec1 0 n m)\n" +
                        "  )\n" +
                        "\n" +
                        "(define (llenar vec1 i n m)\n" +
                        "  (if (< i (vector-length vec1))\n" +
                        "      (begin\n" +
                        "       (vector-set! vec1 i n)\n" +
                        "       (llenar vec1 (+ i 1) (+ n 1) m)\n" +
                        "       )\n" +
                        "      (mostrar vec1 0)\n" +
                        "     \n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(define (mostrar vec1 i)\n" +
                        "  (if (< i (vector-length vec1))\n" +
                        "      (begin\n" +
                        "        (display (vector-ref vec1 i))\n" +
                        "        (display \" \")\n" +
                        "        (mostrar vec1 (+ i 1))\n" +
                        "        )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "(hacervec 10 17)";
        
                return data;
        }
    
    public String ejelistas1(){
        
        String data = "Falta estos ejercicios que no los tengo";
        
                return data;
        }
    
    public String ejelistas2(){
        
        String data = "Falta estos ejercicios que no los tengo";
        
                return data;
        }
    
    public String ejegrafico1(){
        
        String data =   "(require (lib \"graphics.ss\" \"graphics\"))\n" +
                        "(open-graphics)\n" +
                        "\n" +
                        "(define ventana1 (open-viewport \"graficos\" 1000 700))\n" +
                        "((draw-line ventana1)(make-posn 0 233.33)(make-posn 1000 233.33)\"black\")\n" +
                        "((draw-line ventana1)(make-posn 0 466.66)(make-posn 1000 466.66)\"black\")\n" +
                        "\n" +
                        "(define (solido r g b)\n" +
                        "  (if (= b 1)\n" +
                        "      (if (= g 1)\n" +
                        "          (if (= r 1)\n" +
                        "              ((draw-solid-rectangle ventana1)(make-posn  0 233.33) 1000 233.33(make-rgb 0 g b))\n" +
                        "              (begin\n" +
                        "                ((draw-solid-rectangle ventana1)(make-posn  0 233.33) 1000 233.33(make-rgb r g b))\n" +
                        "                (sleep 0.1)\n" +
                        "                (solido (exact->inexact (+ r 0.2)) g b )))\n" +
                        "          (begin\n" +
                        "                ((draw-solid-rectangle ventana1)(make-posn  0 233.33) 1000 233.33(make-rgb 0 g b))\n" +
                        "                (sleep 0.1)\n" +
                        "                (solido r (exact->inexact (+ g 0.2)) b )))\n" +
                        "          (begin\n" +
                        "                ((draw-solid-rectangle ventana1)(make-posn  0 233.33) 1000 233.33(make-rgb 0.5 g b))\n" +
                        "                (sleep 0.1)\n" +
                        "                (solido r g (exact->inexact (+ b 0.2)))\n" +
                        "                )\n" +
                        "          )\n" +
                        "  )\n" +
                        "\n" +
                        "(define (colores x)\n" +
                        "  (cond\n" +
                        "    ((= x 0) \"green\")\n" +
                        "    ((= x 1) \"black\")\n" +
                        "    ((= x 2) \"red\")\n" +
                        "    ((= x 3) \"yellow\")\n" +
                        "    ((= x 4) \"purple\")\n" +
                        "    )\n" +
                        "  )\n" +
                        "\n" +
                        "(define (cuadro x y color)\n" +
                        "  (if (= x 1000)\n" +
                        "      (display \"fin\")\n" +
                        "      (begin\n" +
                        "         ((draw-solid-rectangle ventana1)(make-posn  x y) 100 100(colores color))\n" +
                        "         (sleep 0.5)\n" +
                        "         (cuadro (+ x 200) y (random 4))\n" +
                        "         )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(define (linea x y)\n" +
                        "  (if (= x 1000)\n" +
                        "      ((draw-pixel ventana1)(make-posn 0 133)\"green\")\n" +
                        "      (begin\n" +
                        "       ((draw-pixel ventana1)(make-posn x y)\"green\")\n" +
                        "       (sleep 0.001)\n" +
                        "       (linea (+ x 1) y )\n" +
                        "       )\n" +
                        "      )\n" +
                        "  )\n" +
                        "\n" +
                        "(linea 0 133)\n" +
                        "(solido 0 0 0)\n" +
                        "(cuadro 0 583.32 1)";
        
                return data;
        }
    
    public String ejegrafico2(){
        
        String data =   "(require (lib \"graphics.ss\" \"graphics\"))\n" +
                        "(open-graphics)\n" +
                        "\n" +
                        "(define ventana1 (open-viewport \"graficos\" 1000 700))\n" +
                        "\n" +
                        "(define (dibujar op q w)\n" +
                        "        ((draw-solid-rectangle ventana1)(make-posn q w) 80 80 \"red\")\n" +
                        "        (sleep 1)\n" +
                        "    )\n" +
                        "\n" +
                        "(dibujar 1 100 100)";

                return data;
        }
    
    
}
