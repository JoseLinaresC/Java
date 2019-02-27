/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lina;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class dos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        int n[] = new int[5];
        int positivos = 0;
        int negativos = 0; 
        int ceros = 0;
        
        for(int i = 0; i < 5; i++) {
            System.out.print("introduzca numero: ");
            n[i] = Integer.valueOf(ent.next());
            if(n[i] > 0){
                positivos++;
            }
            else if(n[i] < 0){
                negativos++;
            }
            else{
                ceros++;
            }
        }
        System.out.println("Total de positivos: "+ positivos);
        System.out.println("Total de negativos: "+ negativos);
        System.out.println("Total de ceros: "+ ceros);
    }
    
}
