/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janelinha;
//importando o pacote de interfaçe grafica java
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Admin
 */

//instanciando classe herdeira
public class PrimeiraJanela extends JFrame{
    //instanciando uma função Primeirajanela
    public PrimeiraJanela(){
        //seta a legenda da janela
        super("Nossa primeira janela");
        
        
        //seta a janela para não ser redimensionavel
        setResizable(false);
        
        
        //seta a posição de aparecimento da janela como nulo, o ponto zero da tela
        setLocationRelativeTo(null);
        
        //seta o tamanho da janela
        setSize(500, 500);
        
        
        //seta a visibilidade da janela
        setVisible(true);
        
        //instanciando um container a janela
        Container tela = getContentPane();
        
        //adicionando cor ao container criado anteriormente
        //tela.setBackground(Color.pink);
        
        
        tela.setBackground(new Color(25,25,25));
        
        
        //A interfaçe ira abrir a janela maximizada
        //setExtendedState(MAXIMIZED_BOTH);
        
        
        //A Interfaçe ira abrir a janela minimizada
        //setExtendedState(ICONIFIED);
        
        imageIcon icone = nwe imageIcon("");
        setIconImage(icone.getImage());
    }
    public static void main(String[] args) {
        //instanciando oobjeto PrimeraJanela
        PrimeiraJanela app = new PrimeiraJanela();
       
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}



