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
public class Septimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double urgencias = 0;
        double pediatria = 0;
        double traumatologia = 0;
        double presupuesto = 0;
        
        System.out.print("Ingrese presupuesto de dinero anual: ");
        presupuesto = Double.valueOf(entrada.next());
        
        urgencias = presupuesto * 0.37;
        System.out.println("Cantidad para área de urgencias: "+urgencias);
        pediatria = presupuesto * 0.42;
        System.out.println("Cantidad para área de pediatria: "+pediatria);
        traumatologia = presupuesto * 0.21;
        System.out.println("Cantidad para área de traumatologia: "+traumatologia);
        
        
    }
    
}
