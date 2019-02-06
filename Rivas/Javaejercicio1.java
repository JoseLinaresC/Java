/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author rivas
 */
public class Javaejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double conversion=0.0,valor=0.0;
     Scanner net=new Scanner(System.in);
     System.out.println("introduce la cantidad de quetzales a convertir");
        int Quetzales = net.nextInt();
     
     System.out.println("introduce el valor del dolar");
     valor=net.nextDouble();
        double quetzales = 0;
     
        double Conversion = quetzales*valor;
     
     System.out.print("la convercion total es: "+ conversion );
     
    }
    
}
