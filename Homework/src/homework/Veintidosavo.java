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
public class Veintidosavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        //Todo en metros
        double metros = 0;
        double pies = 3.28084;
        double pulgadas = 39.3701;
        
        System.out.print("Ingrese distancia en metros: ");
        metros = Double.valueOf(entrada.next());
        
        System.out.println("Metros a pies: "+(metros*pies));
        System.out.println("Metros a pulgadas: "+(metros*pulgadas));
    }
    
}
