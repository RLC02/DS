/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//pacote principal
package com.mycompany.lernota;
//importando o pacote de interfaçe do java
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */
//instanciando a classe Lernota
public class LerNota {
    //instanciando pacote nucleo java e chamando o metodo LerNota
    public static void main(String[] args) {
        lerNota();
    }
    /*atribuindo ao metodo as variaveis n1 e n2 e nome e atribuindos valores a essas variaves com a interface de imput, exibindo a variavel nome com show, 
    chamando o metodo calculomedia parametrado*/
    static void lerNota(){
        double n1,n2;
        String nome;
        nome=JOptionPane.showInputDialog(null, "Digite um Nome:");
            n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira Nota"));
            n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda Nota"));
            JOptionPane.showMessageDialog(null,nome);
        calculaMedia(n1,n2);      
    }//fechamento do metodo 
    /*atribuindo ao metodo calculo media parametrado a variavel md referenciando n1 e n2, atribuindo uma sentença de decisão if e else para exibir uma mensagem
    de acordo com o valor de md 
    */ 
    private static void calculaMedia(double a1, double a2){
        double md;
        md=(a1+a2)/2;
        if ((md>=7)){
            JOptionPane.showMessageDialog(null, "Aprovado: "+ md);
            
        }else{
            if (md<7 && md>3);
            JOptionPane.showMessageDialog(null, "Recuperação: " + md);
        }if (md<3){
            JOptionPane.showMessageDialog(null, "Reprovado: " + md);
            
        }
        
        
            
        
    }//fechamento do metodo calculaMedia
            
}//fecham
