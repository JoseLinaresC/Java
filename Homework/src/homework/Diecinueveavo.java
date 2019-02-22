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
public class Diecinueveavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double parcial = 0;
        double calificacion = 0;
        
        System.out.println("Calificación final de 3 parciales de la materia de Algoritmos");
        
        for(int i = 0; i < 3 ; i++){
            System.out.print("Ingrese calificacion: ");
            parcial = Double.valueOf(entrada.next());
            calificacion = calificacion+parcial;
        }
        System.out.println("Calificación final: "+(calificacion)/3);
    }
    
}
