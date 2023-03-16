/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//pacote principal java
package com.mycompany.exemplo;
//importando o pacote de interfaçe grafica java
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
//criado a classe exemplo_1
public class exemplo_1 {
    //importação do pacote nucleo java
    public static void main(String[] args) 
    {
        //chamando o metodo digite
        digite();
    }
    //instanciando e atribuindo o metodo digite
    static void digite(){
        int a = 0;
        //atribuindo para a um valor que sera digitado na interface grafica exibido pelo JOptionPane
        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
        dobro(a);
    }
     //instanciando e atribuindo o metodo dobro, parametrado com n para receber o valor de a
    static void dobro(int n){
        int d = n*2;
        //chamando a interface grafica para exibir o resultado
        JOptionPane.showMessageDialog(null, "O Dobro de " +n+ " é " +d);
    }
    
}
