/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

import java.util.Scanner;

/**
 *
 * @author ploks
 */
public class Main {

    public static void main(String[] ar) {
        ArbolBinario abo = new ArbolBinario();
        int var;
        Scanner texto = new Scanner(System.in);
        do {
            System.out.println("Menu Arboles");
            System.out.println("1.- Agregar al arbol");
            System.out.println("2.- Impresion preOrden: ");
            System.out.println("3.- Impresion entreOrden: ");
            System.out.println("4.- Impresion postOrden: ");
            System.out.println("5.- Cantidad de nodos del arbol");
            System.out.println("6.- cantidad de nodos hoja");
            System.out.println("7.- In orden con nivel");
            System.out.println("8.- Altura del arbol");
            System.out.println("9.- Valor menor");
            System.out.println("10.- Borrar el valor menor");
            System.out.println("11.- Valor mayor");
            System.out.println("12.- Borrar el mayor");
            System.out.println("13.- Existe???");
            System.out.println("14.- BALANCE");
            System.out.println("15.- InOrden ordenado");
            System.out.println("16.- Cambiar los valores(multiplicar*3)");

            System.out.println("0.- Salir");
            var = texto.nextInt();
            switch (var) {
                case 1:
//                    System.out.println("Ingresa el dato");
//                    abo.agregar(texto.nextInt());
                    abo.agregar(11);
                    abo.agregar(9);
                    abo.agregar(12);
                    abo.agregar(8);
                    abo.agregar(10);
                    abo.agregar(13);
                    abo.agregar(7);
                    abo.agregar(9);
                    abo.agregar(14);
                    abo.agregar(6);
                    abo.agregar(8);
                    abo.agregar(15);
                    abo.agregar(4);
                    abo.agregar(5);
                    abo.agregar(6);
                    break;
                case 2:
                    abo.imprimirPre();
                    break;
                case 3:
                    abo.imprimirEntre();
                    break;
                case 4:
                    abo.imprimirPost();
                    break;
                case 5:
                    System.out.println("Cantidad de nodos del árbol:" + abo.cantidad());
                    break;
                case 6:
                    System.out.println("Cantidad de nodos hoja:" + abo.cantidadNodosHoja());
                    break;
                case 7:
                    abo.imprimirEntreConNivel();
                    break;
                case 8:
                    System.out.println("La alturra del arbol es:" + abo.retornarAltura());
                    break;
                case 9:
                    abo.menorValor();
                    break;
                case 10:
                    abo.borrarMenor();
                    abo.imprimirEntre();
                    break;
                case 11:
                    abo.mayorValor();
                    break;
                case 12:
                    abo.borrarMayor();
                    abo.imprimirEntre();
                    break;
                case 13:
                    System.out.println("Ingresa un valor");
                    if (abo.existe(texto.nextInt())) {
                        System.out.println("Si esta");
                    } else {
                        System.out.println("No esta");
                    }

                    break;
                case 14:
                    abo.imprimirBalance();
                    break;
                case 15:
                    //imprimir con nivel
                    abo.alturaArbol();
                    abo.imprimirNivel();
                    break;
                case 16:
                    abo.cambiar();
                    break;
            }
        } while (var != 0);

    }
    
    
}
