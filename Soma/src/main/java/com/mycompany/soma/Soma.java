/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soma;
//importando classe de bibliotecas do java 
import javax.swing.*;
//importando classe de bibliotecas do java 
import java.awt.*;
//importando classe de bibliotecas do java 
import java.awt.event.*;

/**
 *
 * @author dti
 */
//declarando classe soma herdando de JFrame
public class Soma extends JFrame{
    //estrutra de variaveis de instancia
    JLabel rotulo1, rotulo2, exibir;
    //estrutra de variaveis de instancia
    JTextField texto1, texto2;
    //estrutra de variaveis de instancia
    JButton somar, subtrair, multiplicar, dividir;
    //Metodo construtor da classe
    public Soma(){
        //Dlecarando o nome da janela chamando JFRAME
        super("Exemplo de soma");
        //instanciando objeto tela e atribuindo da superclasse
        Container tela = getContentPane();
        //Forçando a existencia do set bound com o metodo
        setLayout(null);
        
        //instanciando os Objetos e o atribuindo
        rotulo1 = new JLabel("1° Número");
        rotulo2 = new JLabel("2° Número");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new JLabel("");
        somar = new JButton("Somar");
        subtrair = new JButton("subtrair");
        multiplicar = new JButton("multiplicar");
        dividir = new JButton("dividir");
        
        //setando a posição dos objetos com set Bound
        rotulo1.setBounds(50,20,100,20);rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20);texto2.setBounds(120,60,200,20);
        exibir.setBounds(150,170,200,20);somar.setBounds(150,100,80,20);subtrair.setBounds(250,100,80,20);multiplicar.setBounds(30,100,100,20);dividir.setBounds(150,140,80,20);
        
        //Adicionando a ação ao objeto botão 
        somar.addActionListener((ActionEvent e) -> {
            //instanciando e atribuindo variavel soma
            int numero1,numero2,soma;
            soma=0;
            //Passando valor para texto pelo getext  em string e passando para inteiro para atribuir numero1
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            //atribuindo valor a variavel soma
            soma = numero1 + numero2;
            //setando o exibir como visivel
            exibir.setVisible(true);
            //setando o texto ao exibibir
            //exibir.setText("A soma é: " + soma);
            JOptionPane.showMessageDialog(null,"A soma é: " + soma);
        } //adicionando o evento ao click
        );//fechamento ActionListener
        
        //Adicionando a ação ao objeto botão 
        subtrair.addActionListener((ActionEvent e) -> {
            //instanciando e atribuindo variavel subtrai
            int numero1,numero2,subtrai;
            subtrai=0;
            //Passando valor para texto pelo getext  em string e passando para inteiro para atribuir numero1
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            //atribuindo valor a variavel subtrai
            subtrai = numero1 - numero2;
            //setando o exibir como visivel
            exibir.setVisible(true);
            //setando o texto ao exibibir
            //exibir.setText("A subtracao é: " + subtrai);
            JOptionPane.showMessageDialog(null,"A subtracao é: " + subtrai );
        } //adicionando o evento ao click
        );//fechamento ActionListener
        
        //Adicionando a ação ao objeto botão 
        multiplicar.addActionListener((ActionEvent e) -> {
            //instanciando e atribuindo variavel multiplica
            int numero1,numero2,multiplica;
            multiplica=0;
            //Passando valor para texto pelo getext  em string e passando para inteiro para atribuir numero1
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            //atribuindo valor a variavel multiplicar
            multiplica = numero1 * numero2;
            //setando o exibir como visivel
            exibir.setVisible(true);
            //setando o texto ao exibibir
            //exibir.setText("A multiplicação é: " + multiplica);
            JOptionPane.showMessageDialog(null,"A multiplicação é: " + multiplica);
        } //adicionando o evento ao click
        );//fechamento ActionListener
        
        //Adicionando a ação ao objeto botão 
        dividir.addActionListener((ActionEvent e) -> {
            //instanciando e atribuindo variavel dividi
            double numero1,numero2,dividi;
            dividi=0;
            //Passando valor para texto pelo getext  em string e passando para inteiro para atribuir numero1
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            //atribuindo valor a variavel dividi
            dividi = numero1 / numero2;
            //setando o exibir como visivel
            exibir.setVisible(true);
            //setando o texto ao exibibir
            //exibir.setText("A divisão é: " + dividi);
            JOptionPane.showMessageDialog(null,"A divisão é: " + dividi);
        } //adicionando o evento ao click
        );//fechamento ActionListener
             
    exibir.setVisible(false);
    
    //adicionando os objetos a tela
    tela.add(rotulo1); tela.add(rotulo2);
    tela.add(texto1); tela.add(texto2);
    tela.add(exibir); tela.add(somar);
    tela.add(subtrair); tela.add(multiplicar);
    tela.add(dividir);
    
    //setando o tamanho da janela
    setSize(400, 250);
    //setando a localização da janela para o ponto nulo
    setLocationRelativeTo(null);
    //setando a visibiliadade da tela para visivel
    setVisible(true);
    
    }//fechamento classe Somar
    
    //instanciando o pacote nucleo java
    public static void main(String[] args) {
        //instanciando o objeto usando a classe
        Soma app = new Soma();
        //setando os botoes de acões da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fechamento metodo main
        
}//fechamento classe principal
