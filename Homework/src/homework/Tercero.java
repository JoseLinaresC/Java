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
public class Tercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double Costo = 1.5;
        int hora = 0;
        double total = 0;
        double descuento = 0;
        
        System.out.print("Ingrese cantidad de horas: ");
        hora = Integer.valueOf(entrada.next());
        
        if(hora > 0 && hora < 5){
            System.out.println("Total a pagar: Bs."+(hora*Costo)+"No hay descuento");
        }
        else{
            descuento = hora/5 * Costo;
            total = hora * Costo - descuento;
            System.out.println("Total a pagar: Bs."+total+" Se descuenta una hora.");
        }
    }
    
}
