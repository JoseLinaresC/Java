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
public class Cuarto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double Dolar = 2150;
        double Euro = 3117.5;  //1 dolar 2150 * 1 euro 1.45 = 3117.5
        double cantidad = 0;
        int opcion = 0;
        
        System.out.print("1.Dolares a Bolivares.\n2.Euros a Bolivares.\nIngrese su pocion: ");
        opcion = Integer.valueOf(entrada.next());
        
        if(opcion == 1){
            System.out.println("Dolares a Bolivares");
            System.out.print("Ingresa cantidad en Dolares: $.");
            cantidad = Double.valueOf(entrada.next());
            System.out.println("Total: Bs."+(cantidad * Dolar));
        }
        else if(opcion == 2){
            System.out.println("Euros a Bolivares");
            System.out.print("Ingresa cantidad en Euros: $.");
            cantidad = Double.valueOf(entrada.next());
            System.out.println("Total: Bs."+(cantidad * Euro));
        }
        else{
            System.out.println("Dato incorrecto.");
        }
    }
    
}
