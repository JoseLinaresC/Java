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
public class Primero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double Prestamo = 10000;
        double Interes = 0.27;
        
        System.out.println("Total de Interés anual a pagar: Bs."+(Prestamo*Interes));
    }
    
}
