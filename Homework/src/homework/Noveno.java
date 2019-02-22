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
public class Noveno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int horas_t = 0;
        int horas_e = 0;
        double valor_h = 0;
        
        System.out.print("Ingrese cantidad de horas trabajadas: ");
        horas_t = Integer.valueOf(entrada.next());
        System.out.print("Ingrese cantidad de horas extra trabajadas: ");
        horas_e = Integer.valueOf(entrada.next());
        System.out.print("Ingrese valor por hora trabajada: ");
        valor_h = Double.valueOf(entrada.next());
       
        System.out.println("Total por horas trabajadas: "+(horas_t*valor_h));
        System.out.println("Total por horas extra trabajadas: "+(horas_e*valor_h*2));
        System.out.println("Total obtenido: "+((horas_t*valor_h)+(horas_e*valor_h*2)));
        
    }
    
}
