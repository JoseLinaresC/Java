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
public class Octavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int m1 = 0;
        int m2 = 0;
        int m3 = 0;
        int m4 = 0;
        int m5 = 0;
        int m6 = 0;
        
        System.out.print("Ingrese monedas de 5 centavos: ");
        m1 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese monedas de 10 centavos: ");
        m2 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese monedas de 12.5 centavos: ");
        m3 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese monedas de 25 centavos: ");
        m4 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese monedas de 50 centavos: ");
        m5 = Integer.valueOf(entrada.next());
        System.out.print("Ingrese monedas de 1 Bolívar: ");
        m6 = Integer.valueOf(entrada.next());
        
        System.out.println("Dinero total es: Bs"+((m1*0.05)+(m2*0.10)+(m3*0.125)+(m4*0.25)+(m5*0.50)+(m6*1)));
    }
    
}
