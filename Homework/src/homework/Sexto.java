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
public class Sexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double salario = 0;
        double Incremento = 0.08;
        double Descuento = 0.025;
        
        System.out.print("Ingrese salario del empleado: ");
        salario = Double.valueOf(entrada.next());
        
        System.out.println("Incremento sobre el salario: "+(salario * Incremento));
        System.out.println("Descuento sobre el salario: "+(salario * Descuento));
        System.out.println("Salario total con incremento y descuento: "+((salario+(salario*Incremento))-(salario * Descuento)));
    }
    
}
