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
public class Dieciseisavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double capital = 0;
  
        
        System.out.print("Ingrese capital: ");
        capital = Double.valueOf(entrada.next());
        
        System.out.println("Dinero ganado despues de un año si el banco paga a razon de 2.5% mensual: "+((capital*0.025)*12));
    }
    
}
