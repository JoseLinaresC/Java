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
public class Dieciochoavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double compra = 0;
        
        System.out.print("Ingrese precio de la compra: ");
        compra = Double.valueOf(entrada.next());
        
        System.out.println("Total de la compra menos descuento del 15%: "+(compra-(compra*0.15)));
    }
    
}
