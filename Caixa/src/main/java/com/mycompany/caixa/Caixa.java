/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;

/**
 *
 * @author Admin
 */
public class Caixa {
    private double saldo;
    
    public Caixa(){
        this(0);
    }
    public Caixa(double saldo){
        this.saldo = saldo;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void entrar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }
    }
    public void retirar(double valor){
        if (valor > 0){
            this.setSaldo(this.getSaldo() - valor);
        }
    }
 
}
