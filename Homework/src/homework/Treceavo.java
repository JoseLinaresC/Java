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
public class Treceavo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int suma = 0;
        double promedion1 = 0;
        double promedion2 = 0;
        
        suma = (n1*n1)+(n2*n2);
        promedion1 = (n1*n1*n1)/3;
        promedion2 = (n2*n2*n2)/3;
        
        System.out.println("Suma del doble del primero mas el cuadrado del segundo: "+suma);
        System.out.println("Promedio del cubo del primer numero:"+promedion1);
        System.out.println("Promedio del cubo del segundo numero:"+promedion2);
    }
    
}
