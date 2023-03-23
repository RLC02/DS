/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//importando pacote principal
package com.mycompany.media_nota;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Admin
 */
//Criando a classe main
public class Main {
    
    //importando o pacote nucleo java, puxando o metodo lerNota
    public static void main(String[] args) {
        lerNota();
    }//fim do metodo main
    
    //criando o metodo lernota, instanciando variaveis atribuindo com imput a essas variaveis, chamando o metodo calcular media parametrado
    static void lerNota()
    {
        String nome;
        Double n1;
        Double n2;
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        calcularMedia(n1, n2 , nome);
    }//fim do metodo lernota
    
    //criando metodo calcularMedia parametrado, que com calculara a media, e com uma estrura de decisão exibira de acordo com o estado do aluno
    static void calcularMedia(Double n1, Double n2, String nome){
 
        Double media = (n1+n2)/2;
        if(media >= 7.0){
         JOptionPane.showMessageDialog(null, " O aluno "+nome+"\n se encontra aprovado com media: "+media);  
        }else{
         
         JOptionPane.showMessageDialog(null, " O aluno "+nome+"\n se encontra reprovado com media: "+media);  
             
         }   
        
     
        }//fim do metodo calcular media
        
    
        
}//fim da classe main
