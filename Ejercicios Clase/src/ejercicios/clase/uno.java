/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.clase;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jose
 */
public class uno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent = new Scanner(System.in);
        int entrada = -1;
        
        char letra[];
        letra = new char[26];
        
        for(int i = 65, l = 0; i <= 90; i++, l++ ){
            letra[l] = (char) i;
        }
        
        String datos = "";
        
        do{
            System.out.print("Ingrese numero <De 0 a 25, -1 para finalizar>: ");
            entrada = Integer.valueOf(ent.next());
            
            if(!(entrada >= 0 && entrada <= 25)){
                System.out.println("Ingrese valor en el rango");
            }
            else{
                if(entrada != -1){
                    datos += letra[entrada];
                }
            }
        }
        while( entrada != -1);
        System.out.println(datos);
        
        
    }
    
}
