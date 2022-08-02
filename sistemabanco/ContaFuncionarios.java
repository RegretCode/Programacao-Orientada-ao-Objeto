/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemabanco;

/**
 *
 * @author ricar
 */
public class ContaFuncionarios {
    String nome;
    String nomeDepartamento;
    double salario;
    String dataEntradaBanco;
    String rg;
    
    
    public String getDataEntrada(){
        return dataEntradaBanco;
    }
    void setDataEntrada(String dataEntradaBanco){
        this.dataEntradaBanco = dataEntradaBanco;
    } 
    public String getDepartamento(){
        return nomeDepartamento;
    }   
    public void setDepartamento(String nomeDepartamento) {
	this.nomeDepartamento = nomeDepartamento;
    }
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public String getRG() {
            return rg;
    }

    public void setRG(String RG) {
            this.rg = RG;
    }
    public double getSalario() {
            return salario;
    }
    public void setSalario(double salario) {
            this.salario = salario;
    }
    public void bonificaFuncionario(double valorBeneficio) {
            setSalario(getSalario() + valorBeneficio);
    }
    public void calculaGanhoAnual(){
        this.salario*=12;
    }
}
   



