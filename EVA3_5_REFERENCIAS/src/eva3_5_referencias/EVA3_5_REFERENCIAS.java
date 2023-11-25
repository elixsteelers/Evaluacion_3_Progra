/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_referencias;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        @-->at / referencia (las referencias son para objetos)
        [I@15db9742
        [ arreglo I integer @ en 15db9742 esa dirección de memoria
        si es creado con new es un objeto (ejemplo:String)
        */
        int [] arreglo=new int [10];
        System.out.println(arreglo);
        for (int i : arreglo) {
            System.out.println(i);
        }
        String [][] arreCade=new String [10][10];
        System.out.println(arreCade);
        Scanner input = new Scanner (System.in);
        System.out.println(input);
    }
    
}
