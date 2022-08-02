/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poscomp2014;

/**
 *
 * @author ricar
 */
public class C2 extends C1 {
    static int i = 0;
    Integer j;
    @Override
    public Object cria(){
        i++;
        j = new Integer(i);
        return j;
    }
    public void mostra(){
        System.out.print("j=" +j);
    }
}
