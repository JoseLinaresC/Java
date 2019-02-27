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
public class cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[5]; 
        Scanner ent = new Scanner(System.in);
        int tamaño = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Ingresa numero: ");
            arreglo[i] = Integer.valueOf(ent.next());
            
        }
        System.out.println("Reversa: ");
        for(int i = 0; i < 5; i++){
            System.out.print(arreglo[i]);
        }
        
    }
    
}
