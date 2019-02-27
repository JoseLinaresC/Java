/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lina;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        int a1[] = new int[10];
        int a2[] = new int[10];
        int a3[] = new int[20];
        int n = 0;
       System.out.println("Ingrese 10 numeros: ");
       for(int i =0; i < 10; i++){
           System.out.print("ingrese numero: ");
           a1[i] = Integer.valueOf(ent.next());
       }
       System.out.println("Ingrese 10 numeros, nuevamente: ");
       for(int i =0; i < 10; i++){
           System.out.print("Ingrese numero: ");
           a2[i] = Integer.valueOf(ent.next());
       }
       for(int i =0; i < 10; i++){
           a3[n] = a1[i];
           n++;
           a3[n] = a2[i];
           n++;
       }
        System.out.print("Concatenación de numeros según sus indices: ");
        for(int i =0; i < 20; i++){
            System.out.print(a3[i]+"");
        }
    }
    
}
