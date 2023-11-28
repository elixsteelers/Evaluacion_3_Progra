/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_7_paso_referencia;

/**
 *
 * @author invitado
 */
public class EVA3_7_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PASO POR REFERENCIA-->Se envía la dirección de los parametros
        //funciona con objetos
        int [] arreglo=new int[10];
        System.out.println("El vvalor en arreglo en el main "+arreglo);
        llenarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ "+arreglo[i]+" ]");
            
        }
    }
    public static void llenarArreglo(int [] valores){
        System.out.println("El valor de arreglo en llenarArreglo es "+valores);
        for (int i = 0; i < valores.length; i++) {
            valores [i]=(int)(Math.random()*100);
        }
        }
    }

