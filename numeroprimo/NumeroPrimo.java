/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numeroprimo;

/**
 *
 * @author ricar
 */
public class NumeroPrimo {

    public static void main(String[] args) {
        int numero=5;
        int i;
        
        for(i=3; i < numero; i++){
            if(numero%i==0){ 
                System.out.println("Nao eh primo\n");
            }
           
        }
        System.out.println("Eh primo");
    }
}
