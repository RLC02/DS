/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//pacote principal
package com.mycompany.lampada;

/**
 *
 * @author dti
 */
//declarando a classe lampada
public class ExemploLampada {
    
    //importaçao do pacote nucleo do java
    public static void main(String[] args) {
        
        //instanciando um objrto a partir da classe lampada
        Lampada lampada = new Lampada();
        
        //puxando e executando o metodo acende
        lampada.acende();
        //puxando e executando o metodo apaga
        lampada.apaga();
        //puxando e executando o metodo mostrarEstado
        lampada.mostraEstado();
    //fim do metodo main  
    }
//fim da classe ExemploLampada    
}
