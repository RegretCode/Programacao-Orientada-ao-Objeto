/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poscomp2014;

/**
 *
 * @author ricar
 */
public class C3 extends C1{
    double d=3.14;
    Float f;
    public Object cria(){
        d = d + 1.0;
        f = new Float(d);
        return f;
    }
    public void mostra(){
        System.out.print("f=" +f);
    }
}
