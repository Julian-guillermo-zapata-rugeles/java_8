/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorletrasencadena;

import java.util.Scanner;

/**
 *
 * @author latanic
 */
public class ContadorLetrasEnCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaramos las varibales necesarias 
        Scanner flujo_entrada = new Scanner(System.in);
        int contador = 0;
        char buscada;
        String cadena_ingreso;
        
        // capturamos la información cadena
        System.out.println("(Este programa encuentra cuantas veces existe un caracter en una frase )");
        System.out.print("Ingrese una cadena que deseé comprobar : ");
        cadena_ingreso =  flujo_entrada.nextLine();
        
        // capturamos el caracter 
        System.out.print("Ingrese la letra buscada : ");
        buscada = flujo_entrada.next().charAt(0);
        
        //  iteramos para encontrar cuantas veces se repite 
        for (int i = 0; i < cadena_ingreso.length(); i++) {
            if(cadena_ingreso.charAt(i)==buscada){
                contador++;
            }          
        }
        // mostramos la información 
        System.out.println("Hemos encontrado la letra ("+buscada+") "+contador+" veces ");
    }
    
}
