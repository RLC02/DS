/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jlabel;
//Importando o paco javax completo
import javax.swing.*;
//Importando o pacote de awt JFrame completo
import java.awt.*;
/**
 *
 * @author dti
 */
//instanciando a classe Exemplo label herdando do JFrame
public class ExemploLabel extends JFrame {
    //instanciando os objetos rotulo1,rotulo2,rotulo3,rotulo4
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    //instanciando o metodo referente a classe
    public ExemploLabel(){
        //criando com a função super a legenda do janela 
        super("Exemplo com Label");
        //instanciando um objeto tela a partir de um contaneir
        Container tela = getContentPane();
        setLayout(null);
        //utilizando o JLabel para adicionar um texto ao rotulo
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        
        //utilizando a função setbound para posicionar o rotulo na janela
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        
         //utilizando a função setForeground para setar uma cor a partir da biblioteca
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        
         //utilizando a função setForeground para setar uma cor nova
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        
        //utilizando a função setFont para mudar tamanho estilo da fonte
        rotulo1.setFont(new Font("Arial",Font.BOLD,14));
        rotulo2.setFont(new Font("Comic Sans MS",Font.BOLD,16));
        rotulo3.setFont(new Font("Courier New",Font.BOLD,18));
        rotulo4.setFont(new Font("Times New Roman",Font.BOLD,20));
        
        //adicionando os objetos rotulos a janela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        //setando o tamanho da janela a partir de SetSize
        setSize(400, 250);
        //Tornando a janela e os rotulos visiveis com setVisible
        setVisible(true);
        //Possicionando a janela no ponto zero da tela
        setLocationRelativeTo(null);
    }
    
    //Importando o pacote de nucleo java
    public static void main(String[] args) {
       
       //Instanciando um objeto app atraves da classe  
       ExemploLabel app = new ExemploLabel();
       //setando para exebir a janela JFrame
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
