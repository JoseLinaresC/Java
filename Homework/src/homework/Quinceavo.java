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
public class Quinceavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int meses = 0;
        int años = 0;
        
        System.out.print("Ingresa años de la persona: ");
        años = Integer.valueOf(entrada.next());
        System.out.print("Ingresa meses de la persona: ");
        meses = Integer.valueOf(entrada.next());
        
        System.out.println("Total en meses: "+((años*12)+meses+" meses"));

    }
    
}
