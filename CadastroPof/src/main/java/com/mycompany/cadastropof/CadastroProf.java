/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropof;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.text.*;

import javax.swing.text.*;

/**
 *
 * @author dti
 */
public class CadastroProf extends JFrame {
    
    JLabel Rtitulo,Rnome,Rmatricula,Rdisciplina,RqtdAula;
    JFormattedTextField nome,matricula,disciplina,Aula;
    JButton confirmarCadastro;
    
    public CadastroProf(){
     //Dlecarando o nome da janela chamando JFRAME
        super("Exemplo com JFormattedTextField");
         //instanciando objeto tela e atribuindo da superclasse
        Container tela = getContentPane();
         //Forçando a existencia do set bound com o metodo
        setLayout(null);
        
        //instanciando os Objetos e o atribuindo
        Rtitulo = new JLabel("Cadastro Professor ");
        Rnome = new JLabel("Nome: ");
        Rmatricula = new JLabel("Matricula: ");
        Rdisciplina = new JLabel("Disciplina: ");
        RqtdAula = new JLabel("QTD de aulas: ");
        confirmarCadastro = new JButton("Confirmar Cadastro");
        
        //setando a posição na tela dos obejtos
        confirmarCadastro.setBounds(150,200,100,20);
        Rtitulo.setBounds(5,10,200,20);    
        Rnome.setBounds(5,40,100,20);
        Rmatricula.setBounds(5,80,100,20);
        Rdisciplina.setBounds(5,120,100,20);
        RqtdAula.setBounds(5,160,100,20);
        
        Rtitulo.setFont(new Font("Arial",Font.BOLD,18));
        
        nome = new JFormattedTextField();
        matricula = new JFormattedTextField();
        disciplina = new JFormattedTextField();
        Aula = new JFormattedTextField();
        
        //setando a posição na tela dos obejtos
        confirmarCadastro.setBounds(120,200,160,20);
        nome.setBounds(130,40,230,20);
        matricula.setBounds(130,80,100,20);
        disciplina.setBounds(130,120,230,20);
        Aula.setBounds(130,160,100,20);
        
        
        
        //adicionado os objetos a tela
    
        tela.add(Rnome);
        tela.add(Rmatricula);
        tela.add(Rdisciplina);
        tela.add(RqtdAula);
        tela.add(nome);
        tela.add(matricula);
        tela.add(disciplina);
        tela.add(Aula);
        tela.add(confirmarCadastro);
        tela.add(Rtitulo);
        //setando o tamanho da janela
        setSize(400,300);
        //setando para janela aparecer no local nulo
        setLocationRelativeTo(null);
        //setando a visibilidade da janela
        setVisible(true);
    }
     public static void main(String[] args) {
        //instanciando um objeto a partir da classe
         CadastroProf app = new  CadastroProf();
        //setando opçoes de maipulação da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//fechamento metodo main
     
}
