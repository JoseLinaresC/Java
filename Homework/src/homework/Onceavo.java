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
public class Onceavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        double valor_s = 0.25;
        
        System.out.print("Ingrese cantidad de horas: ");
        hora = Integer.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de minutos: ");
        minuto = Integer.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de segundos: ");
        segundo = Integer.valueOf(entrada.next());
        
        System.out.println("Costo del proceso: Bs."+((hora*3600)+(minuto*60)+(segundo))*valor_s);
        
    }
    
}
