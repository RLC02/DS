/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janela_da_figura;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author dti
 */
public class Janela_Da_Figura extends JFrame {
     JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
        public Janela_Da_Figura(){
            
            setSize(450, 450);
            setLocationRelativeTo(null);
            setResizable(false);
            Container tela = getContentPane();
            setLayout(null);
            rotulo1 = new JLabel("Cadastro de Clientes");
            rotulo1.setBounds(145,20,1000,20);
            rotulo1.setForeground(Color.blue);
            rotulo1.setFont(new Font("Arial",Font.BOLD,14));
            
            
            rotulo2 = new JLabel("Nome   : ");
            rotulo2.setBounds(80,100,1000,20);
            rotulo2.setForeground(Color.black);
            rotulo2.setFont(new Font("Arial",Font.BOLD,12));
            
            
            rotulo3 = new JLabel("Endereço   : ");
            rotulo3.setBounds(80,150,1000,20);
            rotulo3.setForeground(Color.black);
            rotulo3.setFont(new Font("Arial",Font.BOLD,12));
            
            
            rotulo4 = new JLabel("Cidade   : ");
            rotulo4.setBounds(80,200,1000,20);
            rotulo4.setForeground(Color.black);
            rotulo4.setFont(new Font("Arial",Font.BOLD,12));
            
            
            rotulo5 = new JLabel("Estado   : ");
            rotulo5.setBounds(80,250,1000,20);
            rotulo5.setForeground(Color.black);
            rotulo5.setFont(new Font("Arial",Font.BOLD,12));
            
            rotulo6 = new JLabel("Cep   : ");
            rotulo6.setBounds(80,300,1000,20);
            rotulo6.setForeground(Color.black);
            rotulo6.setFont(new Font("Arial",Font.BOLD,12));
            
            rotulo7 = new JLabel("Estado   : ");
            rotulo7.setBounds(80,350,1000,20);
            rotulo7.setForeground(Color.black);
            rotulo7.setFont(new Font("Arial",Font.BOLD,12));
            
            
            tela.setBackground(Color.cyan);
            ImageIcon icone = new ImageIcon("vasco-escudo-1.png");
            setIconImage(icone.getImage());
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(rotulo4);
            tela.add(rotulo5);
            tela.add(rotulo6);
            tela.add(rotulo7);
            setVisible(true);
            
        }
        public static void main(String[] args) {
        Janela_Da_Figura app = new Janela_Da_Figura();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
