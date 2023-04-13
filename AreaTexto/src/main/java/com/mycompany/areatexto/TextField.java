/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.areatexto;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class TextField extends JFrame{
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    JTextField texto1,texto2,texto3,texto4;
    TextField(){
      //criando com a função super a legenda do janela 
        super("Exemplo com JTextField");
        //instanciando um objeto tela a partir de um contaneir
        Container tela = getContentPane();
        setLayout(null);
        //utilizando o JLabel para adicionar um texto ao rotulo
        rotulo1 = new JLabel("Nome");
        rotulo2 = new JLabel("Idade");
        rotulo3 = new JLabel("Telefone");
        rotulo4 = new JLabel("Celular");
        
        texto1 = new JTextField(50);
        texto3 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        
        
        //utilizando a função setbound para posicionar o rotulo na janela
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        
        //utilizando a 
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,20,20);
        texto3.setBounds(110,100,80,20);
        texto4.setBounds(110,140,80,20);
        
        //utilizando a função setForeground para setar uma cor a partir da biblioteca
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        
         //utilizando a função setForeground para setar uma cor nova
        rotulo3.setForeground(new Color(190,152,142));
        rotulo4.setForeground(new Color(201,200,100));
        
       
        //adicionando os objetos rotulos a janela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        
        
        
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
        TextField app = new TextField();
        //setando para exebir a janela JFrame
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
    }
    
}
