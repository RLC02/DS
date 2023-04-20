/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopasswordfield;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author dti
 */
public class ExemploPasswordField extends JFrame {
    JPasswordField caixa;
    JLabel rotulo;
    public ExemploPasswordField(){
        super("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
        rotulo = new JLabel("senha: ");
        caixa = new JPasswordField("10");
        rotulo.setBounds(50,20,100,20);
        caixa.setBounds(50,60,100,20);
        tela.add(rotulo);
        tela.add(caixa);
        setSize(400, 250);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        ExemploPasswordField app = new ExemploPasswordField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
