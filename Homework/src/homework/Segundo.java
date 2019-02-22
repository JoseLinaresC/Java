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
public class Segundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double Costo_km = 10.50;
        double kms = 0;
        
        System.out.print("Ingrese cantidad de kms a recorrer: ");
        kms = Double.valueOf(entrada.next());
        
        System.out.println("Precio del Boleto: Bs."+(Costo_km * kms)+"\nPrecio de cada km: Bs."+Costo_km);
    }
    
}
