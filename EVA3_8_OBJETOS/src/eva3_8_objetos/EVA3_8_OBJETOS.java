/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_objetos;

/**
 *
 * @author invitado
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        CLASES Y OBJETOS
        Clases--> plantillas de código (no existen) /para hacer objetos
        OBJETOS--> es la implementación del código de la clase 
        */
        Persona perso1 = new Persona ();
        //Scanner input=new Scanner (System.in);
        //int [] arreglo = new int [1];
        System.out.println(perso1);
        perso1.nombre="Benito";
        perso1.apellido="Gonzalez";
        perso1.edad=34;
        System.out.println(perso1);
        imprimirPersonas(perso1);
        
        Persona perso2 = new Persona ();
        //Scanner input=new Scanner (System.in);
        //int [] arreglo = new int [1];
        System.out.println(perso2);
        perso2.nombre="Luis";
        perso2.apellido="Rubio";
        perso2.edad=24;
        System.out.println(perso2);
        imprimirPersonas(perso2);
    }
    public static void imprimirPersonas(Persona perso){
        System.out.println("Dirección: "+perso);
        System.out.println("Nombre completo: "+perso.nombre +" "+perso.apellido);
        System.out.println("Edad: "+perso.edad);
    }
}
//Clases son plantillas y tipos de datos 
class Persona{
    String nombre;
    String apellido;
    int edad;
    
}