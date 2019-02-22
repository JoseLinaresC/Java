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
public class Treintayunoavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double PI = 3.1416;
        double r = 0;
        
        System.out.print("Ingrese radio del circulo: ");
        r = Double.valueOf(entrada.next());
        
        System.out.println("Área del circulo es: "+(PI*(r*r)));
    }
    
}
