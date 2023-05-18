/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bhaskara;
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
public class Bhaskara extends JFrame{
     //estrutra de variaveis de instancia
    JLabel titulo1, titulo2,rotulo1, rotulo2,rotulo3, exibir1, exibir2;
    //estrutra de variaveis de instancia
    JTextField texto1, texto2, texto3;
    //estrutra de variaveis de instancia
    JButton calcular;
    //Metodo construtor da classe
    public Bhaskara(){
    //Dlecarando o nome da janela chamando JFRAME
        super("Formula de Bhaskara");
        //instanciando objeto tela e atribuindo da superclasse
        Container tela = getContentPane();
        //Forçando a existencia do set bound com o metodo
        setLayout(null);
        
        //instanciando os Objetos e o atribuindo
        titulo1 = new JLabel("Formula de bhaskara");
        titulo2 = new JLabel("ax^2 + bx^2 + c = 0");
        rotulo1 = new JLabel("Valor de A:");
        rotulo2 = new JLabel("Valor de B:");
        rotulo3 = new JLabel("Valor de C");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        exibir1 = new JLabel("");
        exibir2 = new JLabel("");
        calcular = new JButton("calcular");
       //setando a posição dos objetos com set Bound
        titulo1.setBounds(110,5,200,20);titulo2.setBounds(145,20,170,20)     ;
        rotulo1.setBounds(50,50,100,20);rotulo2.setBounds(50,100,100,20);rotulo3.setBounds(50,150,200,20);
        texto1.setBounds(150,50,100,20);texto2.setBounds(150,100,100,20);texto3.setBounds(150,150,100,20);
        exibir1.setBounds(177,250,170,20);calcular.setBounds(150,200,100,20);
        exibir2.setBounds(177,270,180,20);
        
        titulo1.setFont(new Font("Arial",Font.BOLD,18));
        tela.setBackground(new Color(252, 252, 226));
        //Adicionando a ação ao objeto botão 
        calcular.addActionListener((ActionEvent e) -> {
            //instanciando e atribuindo variavel 
            double a,b,c,x1,x2 = 0;
            //Passando valor para texto pelo getext  em string e passando para double para atribuir numero1
            a = Double.parseDouble(texto1.getText());
            b = Double.parseDouble(texto2.getText());
            c = Double.parseDouble(texto3.getText());
            //atribuindo valor a variavel soma
            x1 = (-b + Math.sqrt(b*b - 4*a*c))/2 ;
            x2 = (-b - Math.sqrt(b*b - 4*a*c))/2 ;
            //setando o exibir como visivel
            exibir1.setVisible(true);
            exibir2.setVisible(true);
            //setando o texto ao exibibir
            exibir1.setText("x1 é: " + x1);
            exibir2.setText("x2 é: " + x2);
          
        } //adicionando o evento ao click
        );//fechamento ActionListener
        
    exibir1.setVisible(false);
    exibir2.setVisible(false);
    
    //adicionando os objetos a tela
    tela.add(titulo1); tela.add(titulo2);
    tela.add(rotulo1); tela.add(rotulo2);tela.add(rotulo3);
    tela.add(texto1); tela.add(texto2);tela.add(texto3);tela.add(exibir1); 
    tela.add(exibir2); tela.add(calcular);

    //setando o tamanho da janela
    setSize(400, 350);
    //setando a localização da janela para o ponto nulo
    setLocationRelativeTo(null);
    //setando a visibiliadade da tela para visivel
    setVisible(true);
    
}
     public static void main(String[] args) {
        //instanciando o objeto usando a classe
        Bhaskara app = new Bhaskara();
        //setando os botoes de acões da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//fechamento metodo main
} 
