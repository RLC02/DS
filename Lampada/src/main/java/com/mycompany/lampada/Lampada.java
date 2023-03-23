/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//pacote principal 
package com.mycompany.lampada;
//importando o pacote de interfaçe grafica do java
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
//criando a classe lampada
public class Lampada {
    //importando o pacote de nucleo de java, criando variavel e a instanciando com imput, e chamando o metodo mostratarEstado
    public static void main(String[] args) {
        String Estadolampada;
        Estadolampada = JOptionPane.showInputDialog("Qual o estado da lampada: ");
        mostrarEstado(Estadolampada);
    }//fim do metodo main
    
    //Criando o metodo mostrar estado parametrado, e com uma estrura de decisão exibindo o estado da lampada
    static void mostrarEstado(String Estadolampada){
        if("acesa".equals(Estadolampada) || "Acesa".equals(Estadolampada)){
            
             JOptionPane.showMessageDialog(null, "A lampada se encontra: "+Estadolampada);
             
        }
        else if("apagada".equals(Estadolampada) || "Apagada".equals(Estadolampada)){
            
             JOptionPane.showMessageDialog(null, "A lampada se encontra: "+Estadolampada);
            
        }else{
             JOptionPane.showMessageDialog(null, "Nenhum estado valido foi inserido ");
        }
      
    }//fim do metodo estado lampada
    
}//fim da classe Lampada
