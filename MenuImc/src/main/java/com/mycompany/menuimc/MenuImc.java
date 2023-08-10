/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuimc;

/**
 *
 * @author Admin
 */
public class MenuImc {
    
    private MenuImc imc;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public MenuImc(){
     
        this.imc = new MenuImc();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();          
    }
    
    
}

