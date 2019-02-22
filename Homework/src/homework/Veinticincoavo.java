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
public class Veinticincoavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        
        System.out.print("Ingrese primer numero: ");
        n1 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese segundo numero: ");
        n2 = Integer.valueOf(entrada.next());
        
        System.out.println("Suma de los numeros: "+(n1+n2));
        System.out.println("Multiplicacion de los numeros: "+(n1*n2));
    }
    
}
