/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fatorial;

/**
 *
 * @author ricar
 */
public class Fatorial {

    public static void main(String[] args) {
        int fatorial = 1;
        int valor = 7; 

        for( int i = 1; i <= valor; i++ )
        {
        fatorial *= i;
        }

        System.out.println( "O fatorial de " + valor + " é igual a " + fatorial );
    }
}
