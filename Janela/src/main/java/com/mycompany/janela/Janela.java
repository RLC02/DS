/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.janela;
import javax.swing.*;
import java.awt.*;
import static java.sql.DriverManager.println;
/**
 *
 * @author dti
 */
public class Janela extends JFrame{
    
        public Janela(){
            setSize(450, 250);
            setLocationRelativeTo(null);
            setVisible(true);
            setResizable(false);
            
 
                    
        }
        public static void main(String[] args) {
        Janela app = new Janela();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
