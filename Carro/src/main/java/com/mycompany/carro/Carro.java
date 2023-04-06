/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Carro {
     private String marca = JOptionPane.showInputDialog("Insira a marca do carro");
     private String modelo = JOptionPane.showInputDialog("Insira o modelo do carro");
     private String cor = JOptionPane.showInputDialog("Insira a cor do carro");
     private String placa = JOptionPane.showInputDialog("Insira a placa do carro");
          
     static void ligar(){
         JOptionPane.showMessageDialog(null, "O carros esta ligado");
     }
     static void desligar(){
         JOptionPane.showMessageDialog(null, "O carros esta desligado");
     }
     static void acelerando(){
         JOptionPane.showMessageDialog(null, "O carros esta acelerando");
     }
     static void freando(){
         JOptionPane.showMessageDialog(null, "O carros esta freando");
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
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

}

