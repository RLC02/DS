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
public class Testarcarro {
    public static void main(String[] args) {
           Carro c = new Carro();
           JOptionPane.showMessageDialog(null, "A marca é: "+ c.getMarca()+"\n O modelo é: "+ c.getModelo() +"\n A cor é: "+ c.getCor() +"\n A placa é: "+ c.getPlaca());         
           c.ligar();
           c.acelerando();
          
         }
    
}
