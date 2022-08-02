/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistemabanco;

/**
 *
 * @author ricar
 */
public class SistemaBanco {

    public static void main(String[] args) {
        boolean consegui;
        Conta minhaConta, contaDestino;
        
        minhaConta = new Conta();
        minhaConta.dono = "Maria";
        minhaConta.deposita(500);
        minhaConta.limite = 500;
        minhaConta.imprimir();
        
        contaDestino = new Conta();
        contaDestino.dono = "Joao";
        contaDestino.deposita(200);
        contaDestino.limite = 0;
        contaDestino.imprimir();
        
        
        consegui = minhaConta.saca(700);
        
        if (consegui == true){
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        
        minhaConta.transferirPara(contaDestino, 400);
        minhaConta.imprimir();
        contaDestino.imprimir();
    }
}
