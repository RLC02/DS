/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste;
import javax.swing.JOptionPane;
        
/**
 *
 * @author dti
 */
public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario();
        usuario1.nome = JOptionPane.showInputDialog(null, "Digite seu nome: " );
        usuario1.email = JOptionPane.showInputDialog(null, "Digite seu email: " );
        usuario1.login= JOptionPane.showInputDialog(null, "Digite seu login: " );
        usuario1.senha = JOptionPane.showInputDialog(null, "Digite sua senha: " );
        
        usuario1.provarExistencia();
        
        JOptionPane.showMessageDialog(null, "Os dados digitado são \n\nNome: " + usuario1.nome + "\nemail: " + usuario1.email + "\nLogin: " + usuario1.login + "\nsenha: " + usuario1.senha);
        
        
    }
}
