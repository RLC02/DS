/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//importação pacote principal java
package com.mycompany.diferenca;
//importando o pacote de interfaçe grafica
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
//Criando a classe main
public class Main {
    //importando o pacote de nucleo java, dentro iniciando as variaveis e atribuindo com imputs, chamando o metodo exibirDiferença
    public static void main(String[] args) {
        Double n1;
        Double n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
        exibirDiferença(n1, n2);
               
        
        
    }//fim do metodo main
    
    //criando o metodo exibirDiferença parametrado atribuindo a variavel diferença e exibindo o resultado em uma estrutura de decisão
    static void exibirDiferença(Double n1, Double n2){
        
        Double diferenca;
        
        if(n1>n2){
            diferenca = n1-n2;
            JOptionPane.showMessageDialog(null, "A diferença entre esses numeros sera: "+diferenca);
        }else{
            diferenca = n2-n1;
            JOptionPane.showMessageDialog(null, "A diferença entre esses numeros sera: "+diferenca);
        }
    }//fim do metodo exibirDiferença
    
}//fim da classe main
