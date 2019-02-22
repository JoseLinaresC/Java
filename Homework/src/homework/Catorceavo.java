/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Catorceavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        
        System.out.print("Ingrese numero: ");
        A = Integer.valueOf(entrada.next());
        System.out.print("Ingrese numero: ");
        B = Integer.valueOf(entrada.next());
        System.out.print("Ingrese numero: ");
        C = Integer.valueOf(entrada.next());
        
        
        System.out.println("X="+A+B+C);
    }
    
}
