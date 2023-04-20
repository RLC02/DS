/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//importando pacote principal
package com.mycompany.exemplobotao;
//importando bibliboteca java swing
import javax.swing.*;
//importando bibliboteca java awt
import java.awt.*;
//importando bibliboteca java event
import java.awt.event.*;
/**
 *
 * @author dti
 */
//instanciando a classe exemplobotao erando do JFrame
public class ExemploBotao extends JFrame{
    //instanciando variaveis distacias
    JButton botao1,botao2,botao3,botao4;
    //instanciando o metodo ExemploBotao erando do JFrame
    public ExemploBotao(){
        //criando um rotulo para janela JFrame
        super("Exemplo com JButton");
        //instanciando o objeto tela com a classe Container
        Container tela = getContentPane();
        //setando o layout para nulo
        setLayout(null);
        
        //instanciando as variaveis ao um JButton e Nomeando
        botao1 = new JButton ("Procurar");
        botao2 = new JButton ("Voltar >>");
        botao3 = new JButton ("Proximo >>");
        botao4 = new JButton ("Sair");
        
        //setando a cor do backgroun do botao
        botao1.setBackground(Color.yellow);
        botao2.setBackground(Color.red);
        botao3.setBackground(Color.blue);
        botao4.setBackground(Color.white);

        //setando teclas de atalho para os eventos do botao
        botao1.setMnemonic(KeyEvent.VK_P);
        botao2.setMnemonic(KeyEvent.VK_V);
        botao3.setMnemonic(KeyEvent.VK_X);
        botao4.setMnemonic(KeyEvent.VK_S);
        
        //setando a cor da fonte do botao
        botao1.setForeground(Color.green);
        botao2.setForeground(Color.blue);
        botao3.setForeground(Color.white);
        botao4.setForeground(Color.red);
        
        //Setando o tamanho e posição do botao
        botao1.setBounds(50,20,100,20);
        botao2.setBounds(50,60,100,20);
        botao3.setBounds(50,100,100,20);
        botao4.setBounds(50,140,100,20);
        
        //adicionando os botoes ao objeto tela
        tela.add(botao1);
        tela.add(botao2);
        tela.add(botao3);
        tela.add(botao4);
        
        //setando o tamanho da janela
        setSize(400, 250);
        
        //setando que a janela seja visivel
        setVisible(true);
        
    }//fechamento metodo ExmploBotao
    
}//fechamento da classe ExemploBotao
