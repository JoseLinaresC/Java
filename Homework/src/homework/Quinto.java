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
public class Quinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double precio = 0;
        double descuento = 0.35;
        
        System.out.print("Ingrese precio del medicamento: ");
        precio = Double.valueOf(entrada.next());
        
        System.out.println("Total de medica con 35% de descuento: Bs."+(precio -(precio * descuento)));
    }
    
}
