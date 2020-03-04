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
public class Estructuras_De_Datos {


    public Estructuras_De_Datos(){

    }
    
    
    
    public String quees(){
        String data =   "Es una forma de organizar un conjunto de datos con el objetivo de facilitar\n" +
                        "su    manipulación.   Una    estructura   de   datos  define  la organización e\n" +
                        "interrelación   de   estos   y   un  conjunto  de  operaciones  que se pueden \n" +
                        "realizar sobre ellos.";
        return data;
    } 
    
    public String defstruct(){
        String data =   "En   DrRacket   definir   una   estructura  es sencillo, se  logra mediante el \n" +
                        "procedimiento: (define-struct.)\n" +
                        "\n" +
                        "Ejemplo\n" +
                        "(define-struct alumnos(nombre apellido teléfono correo))";
        return data;
    }
    
    public String makestr(){
        String data =   "La función make-struct nos sirve para agregar datos a la estructura, pero\n" +
                        "para esto debe de estar previamente creada mediante define-struct\n" +
                        "\n" +
                        "Veamos cómo es:\n" +
                        "(define-struct Empleados (nombre apellido)\n" +
                        "\n" +
                        "y para la función make (make-struct) donde struct el nombre de nuestra\n" +
                        "estructura es decir:\n" +
                        "\n" +
                        "(make-Empleados \"José\" \"Cardona\")\n" +
                        "\n" +
                        "cómo pueden ver se cambió el struct por el nombre de la estructura";
        return data;
    }
    
    public String defeje(){
        String data =   ";Cree 5 estructuras para doctores, pacientes y Enfermeros  tales que contengan los datos \n" +
                        ";nombre, apellido, teléfono y dirección\n\n" +
                        "\n" +
                        "(define-struct Doctores(nombre apellido telefono direccion))\n" +
                        "(define-struct Enfermeros(nombre apellido telefono direccion))\n" +
                        "(define-struct Clientes(nombre apellido telefono direccion))\n\n";
        return data;
    }
    
    public String makeeje(){
        String data =   ";Tomando como referencia el ejemplo anterior de define-struc, cree una función que llene\n" +
                        ";los datos de estas estructuras mediante el procedimiento make-struct, luego mostrar los\n" +
                        ";apellidos de cada uno.\n\n" +
                        "\n" +
                        "(define-struct Doctores(nombre apellido telefono direccion))\n" +
                        "(define-struct Enfermeros(nombre apellido telefono direccion))\n" +
                        "(define-struct Clientes(nombre apellido telefono direccion))\n" +
                        "\n" +
                        "(define (LlenarDatos)\n" +
                        "         (define d1 (make-Doctores (read) (read) (read) (read)))\n" +
                        "         (define d2 (make-Enfermeros (read) (read) (read) (read)))\n" +
                        "         (define d3 (make-Clientes (read) (read) (read) (read)))\n" +
                        "\n" +
                        "         (displayln (Doctores-apellido d1))\n" +
                        "         (displayln (Enfermeros-apellido d2))\n" +
                        "         (displayln (Clientes-apellido d3))\n" +
                        ")\n" +
                        "\n" +
                        "(LlenarDatos)";
        return data;
    }
    
       public String Ejercicios(){
        String data =   "";
        return data;
    }
}
