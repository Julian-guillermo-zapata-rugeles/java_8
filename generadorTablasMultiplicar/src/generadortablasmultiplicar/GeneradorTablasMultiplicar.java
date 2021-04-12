/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadortablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author latanic
 */
public class GeneradorTablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generación de código simple 

        
        int base;
        boolean salir =  false;
        Scanner flujo_entrada  = new Scanner(System.in);
        
        while (salir==false) {
            System.out.println("***********************************************************");
            System.out.println("*                                                         *");
            System.out.println("*                 GENERADOR DE TABLAS                     *");        
            System.out.println("*                                                         *");
            System.out.println("***********************************************************");
            System.out.print("Ingrese un numero o (0) para salir : ");
            base = flujo_entrada.nextInt(); // capturamos el dato en un numero entero  
           
            if (base!=0) {
                for (int i = 1 ; i <= 10; i++) {
                   System.out.println(base+" x "+i+" = "+(base*i));
                }
            }
            else{
                salir = true;
            }
           
        }
        
    }
    
}
