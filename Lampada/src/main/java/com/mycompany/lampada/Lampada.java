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
public class Lampada {
        //declarando uma variavel string privada e a atribuindo
        private String estadoDaLampada = "apagada";
        
        //criando um metodo da classe lampada para atribuir uma string a variavel
        public void acende() {
            
            estadoDaLampada = "acesa";
            
        }
        //criando um metodo da classe lampada para atribuir uma string a variavel
        public void apaga() {
            
            estadoDaLampada = "apagada";
            
        }
        //criando um metodo da classe lampada para exibir o estado da lampada
        public void mostraEstado() {
            //usando uma arquitetura de decisão para se tiver acessa exibir uma mensagem
            if(estadoDaLampada.equals("acesa")){
                System.out.println("Esta acesa!");
            }
            //se não exibir outra mensagem
            else{
                System.out.println("Esta apagada!");
            }
            
        }
//fim da classe Lampada    
}
