/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.imc;

/**
 *
 * @author ricar
 */
public class IMC {

    public static void main(String[] args) {
        int imc = 0;
        
        if (imc < 20){
            System.out.println("Magro");
        }
        else if(imc >= 20 && imc <25){
            System.out.println("Normal");
        }
        else if(imc >= 25 && imc <29){
            System.out.println("Acima do Peso");
        }
        else if(imc >= 29 && imc <30){
            System.out.println("Obeso");
        }
        else if(imc >= 30){
            System.out.println("Muito Obeso");
        }
    }
}
