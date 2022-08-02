/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabanco;

/**
 *
 * @author ricar
 */
public class Conta {
    //atributos
    int numero;
    String dono;
    double saldo;
    double limite;
    
    //metodos
    
    // deposita valor na conta
    void deposita(double quantidade){
        this.saldo+=quantidade;
    }
    //saca valor na conta e retorna true se operacao bem sucedida
    boolean saca(double quantidade){
        if (this.saldo + limite < quantidade){
            return false;
        } else {
            this.saldo-=quantidade;
            return true;
        }
    }
    //imprime na tela as informacoes
    void imprimir(){
        System.out.println("### Conta do Cliente ###");
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Nome: " + this.dono);
        System.out.println("Saldo: " + this.saldo + "(Limite: " + this.limite +")");
        System.out.println("########################");
    }
    //retorna o saldo
    double getSaldo(){
        return this.saldo;
    }
    //realiza um transferencia caso passe no teste de validacao
    void transferirPara(Conta destino, double valor){
        boolean consegui;
        consegui = this.saca(valor);
        if(consegui){
            destino.deposita(valor);
        } else {
             System.out.println("Saldo insuficiente para transferencia.");
        }
    }
}


