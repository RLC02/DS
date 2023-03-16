/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//importando pacote principal
package com.mycompany.exemplo_3;
//importando pacote de interface grafica do java
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
//criando a class exemplo 3
public class exemplo_3 {
    //importando pacote de nucleo java 
    public static void main(String[] args) {
        //instanciando as variaveis
        int idade1, idade2;
        String nome1, nome2;
        //atribuindo valor as variaveis
        nome1 = JOptionPane.showInputDialog(("Digite o nome da 1ª pessoa: "));
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade 1ª pessoa: "));
        //atribuindo valor as variaveis
        nome2 = JOptionPane.showInputDialog(("Digite o nome da vc2ª pessoa: "));
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade 2ª pessoa: "));
        //atribuindo a string texto o metodo pessoa parametrado
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
        
        JOptionPane.showMessageDialog(null, texto);
        
    }
    //criando o metodo pessoa mais velha com uma estrutura de decisão para saber a pessoa com a maior idade
     static String PessoaMaisVelha(String n1, int id1, String n2, int id2){
         if (id1 > id2)
             return n1+ " é a pessoa mais velha";
         else
             if (id2 > id1)
                 return n2 + " é a pessoa mais velha";
             else
                 return n1 + " e " + n2 + " tem a mesma idade";
             
     } 
    
}
