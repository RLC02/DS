/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.automotivo;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Automotivo {
    
    private String modelo;
    private String marca;
    private String cor;
    private String ano;
    private String chasi;
    


public Automotivo ( ) {
        this(" "," "," "," "," ");
 }

public Automotivo (String modelo, String marca, String cor, String ano, String chasi){

    this.modelo = modelo;
    this.marca = marca;
    this.cor = cor;
    this.ano = ano;
    this.chasi = chasi;

}
    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    public String getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * @return the chasi
     */
    public String getChasi() {
        return chasi;
    }

    /**
     * @param chasi the chasi to set
     */
    public void setChasi(String chasi) {
        this.chasi = chasi;
    }

    public void provareistencia( ){
        JOptionPane.showMessageDialog(null, "O modelo do carro é: " + getModelo() +"\n A marca do carro é: "+ getMarca() +"\n A cor do carro é: "+ getCor()+ "\n O ano do carro é: " + getAno()+ "\n O chassi do carro é: "+ getChasi());
    }
    
    public void entrardados( ){
        setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
        setMarca(JOptionPane.showInputDialog("Digite a marca do carro: "));
        setCor(JOptionPane.showInputDialog("Digite o cor do carro: "));
        setAno(JOptionPane.showInputDialog("Digite o ano do carro: "));
        setChasi(JOptionPane.showInputDialog("Digite o chasi do carro: "));
    }
}
