/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author Admin
 */
public class Calculadora {
    private double numero01;
    private double numero02;
    private double resultado;
    
    public Calculadora(){
        this(0,0,0);
    }
    public Calculadora(double numero01,double numero02, double resultado ){
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    /**
     * @return the numero01
     */
    public double getNumero01() {
        return numero01;
    }

    /**
     * @param numero01 the numero01 to set
     */
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    /**
     * @return the numero02
     */
    public double getNumero02() {
        return numero02;
    }

    /**
     * @param numero02 the numero02 to set
     */
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void somar(double numero01, double numero02){
        setResultado(this.getNumero01() + this.getNumero02());
    }
    public void subtrair (double numero01, double numero02){
        setResultado(this.getNumero01() - this.getNumero02());
    }
    public void multiplicar(double numero01, double numero02){
        setResultado(this.getNumero01() * this.getNumero02());
    }
    public void dividir(double numero01, double numero02){
        setResultado(this.getNumero01() / this.getNumero02());
    }
    public void sair(){
        System.exit(0);
    }
}
