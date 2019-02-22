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
public class Decimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double arena = 0.05;
        double area = 0;
        double base = 0;
        double altura = 0;
        
        
        System.out.print("Ingresa base de la pared: ");
        base = Double.valueOf(entrada.next());
        System.out.print("Ingresa altura de la pared: ");
        altura = Double.valueOf(entrada.next());
        
        area = base * altura;
        
        
        System.out.println("Total de mts cubicos de arena para revocar la pared: "+area*arena);
    }
    
}
