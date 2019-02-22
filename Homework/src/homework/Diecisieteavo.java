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
public class Diecisieteavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double sueldo = 0;
        double venta = 0;
        double acumulador = 0;
        
        System.out.print("Ingrese sueldo base del empleado: ");
        sueldo = Double.valueOf(entrada.next());
        
        for(int i = 0; i < 3 ; i++){
            System.out.println("Durante el mes se realizan 3 ventas de la siguiente manera: ");
            System.out.print("Ingresa venta: ");
            venta = Double.valueOf(entrada.next());
            acumulador = acumulador+venta;
        }
        System.out.println("Total de comision por las ventas por 10%: "+(acumulador*0.10));
        System.out.println("Sueldo mas comisiones: "+(sueldo+(acumulador*0.10)));
    }
    
}
