/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_2_funciones_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_2_FUNCIONES_2 {

    /**
     * @param args the command line arguments
     */
    //static int x=100;
    public static void main(String[] args) {
        // TODO code application logic here
       /* Scanner input=new Scanner (System.in);
        EVA3_2_FUNCIONES_2  objeto=new  EVA3_2_FUNCIONES_2();
        System.out.println(objeto.x);
               */
        int num1=100,num2=200;
        //SE USA EL VALOR DIRECTAMENTE DE LA FUNCIÓN
        System.out.println(buscarMax(100,200));
        //GUARDAMOS EL VALOR DEVULTO PARA SU USO POSTERIOR
        int valor=buscarMax(num1,num2);
        System.out.println(valor);
        //SE EJECUTA LA FUCIÓN, PERO IGNORAMOS EL RESULTADO
        buscarMax(num1,num2);
    }
    private static int buscarMax(int num1, int num2){
       /* int resu;
        if (num1>num2) {
            resu=num1;
        }else{
            resu=num2;
        }   return resu;*/
         if (num1>num2) 
            return num1;
        else
            return num2;
    }
}
