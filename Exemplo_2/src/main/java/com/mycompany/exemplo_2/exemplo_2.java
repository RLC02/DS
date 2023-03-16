/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//importando o pacote principal
package com.mycompany.exemplo_2;
//importando o pacote de interface grafica java
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
//criando a classe exemplo-2
public class exemplo_2 {
    //importadando o pacote de nucleo java
    public static void main(String[] args) {
        //chamando o metodo digite
        digite();
    }
    //criando o metodo digite, instanciado e atribuindo a variaveis t e p utilizando a interface grafica para receber e exibir esses valores
    static void digite(){
        int t;
        String p;
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        //atribuindo a variavel t o metodo tamanho e parametrando
        t = tamanho(p);
        JOptionPane.showMessageDialog(null,p+ " possui " +t+ " caracteres");
    }
    //criando o metodo tamanho parametrado que ira retornar a quantidade de letra do valor da variavel
    static int tamanho(String x){
        return x.length();
    }
}
