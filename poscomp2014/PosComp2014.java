/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.poscomp2014;

/**
 *
 * @author ricar
 */
public class PosComp2014 {

    public static void main(String[] z) {
        C1 a,b,c;
        Object o1,o2,o3;
        a = new C2();
        b = new C2();
        c = new C3();
        o1 = a.cria();
        o1 = a.cria();
        o2 = b.cria();
        o3 = c.cria();
        o3 = c.cria();
        a.mostra();
        System.out.print("   ");
        b.mostra();
        System.out.print("   ");
        c.mostra();
        System.out.print("   " + o1);
        System.out.print("   " + o2);
        System.out.print("   " + o3);
    }
}
