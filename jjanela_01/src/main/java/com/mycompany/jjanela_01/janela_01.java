/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jjanela_01;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author dti
 */
public class janela_01 extends JFrame {
    janela_01(){
            setSize(400, 200);
            setLocationRelativeTo(null);
            setExtendedState(MAXIMIZED_BOTH);
            Container tela = getContentPane();
            tela.setBackground( new Color (125,125,125));
            ImageIcon icone = new ImageIcon("vasco-escudo-1.png");
            setIconImage(icone.getImage());
            setVisible(true);
    }
    public static void main(String[] args) {
        janela_01 app = new janela_01();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
