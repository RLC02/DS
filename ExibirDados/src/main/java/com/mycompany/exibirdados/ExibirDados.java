/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exibirdados;

//importando classes da bibliotecas do java 
package com.mycompany.soma;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.text.*;

import javax.swing.text.*;

/**
 *
 * @author dti
 */
//instanciando a classe principal
public class ExibirDados extends JFrame {
    
    //estrutra de variaveis de instancia
    JLabel rotulocep,rotulotel,rotulocpf,rotulodata;
    JFormattedTextField cep,tel,cpf,data;
    MaskFormatter mascaracep,mascaratel,mascaracpf,mascaradata;
    JButton exibir;
    
    //metodo construtor da classe
    public ExibirDados(){
        //Dlecarando o nome da janela chamando JFRAME
        super("Exemplo com JFormattedTextField");
         //instanciando objeto tela e atribuindo da superclasse
        Container tela = getContentPane();
         //Forçando a existencia do set bound com o metodo
        setLayout(null);
        
        //instanciando os Objetos e o atribuindo
        rotulocep = new JLabel("Cep: ");
        rotulotel = new JLabel("Telefone: ");
        rotulocpf = new JLabel("CPF: ");
        rotulodata = new JLabel("Data: ");
        rotulocep.setBounds(50,40,100,20);
        rotulotel.setBounds(50,80,100,20);
        rotulocpf.setBounds(50,120,100,20);
        rotulodata.setBounds(50,160,100,20);
        exibir = new JButton("Exibir");
        
        //metodo try para captura de exeções
        try{
            
            //atribuindo mascara aos objetos
            mascaracep = new MaskFormatter("#####-###");
            mascaratel = new MaskFormatter("(##)#####-####");
            mascaracpf = new MaskFormatter("#########-##");
            mascaradata = new MaskFormatter("##/##/####");
            
            //setando o local de placeholder
            mascaracep.setPlaceholderCharacter('_');
            mascaratel.setPlaceholderCharacter('_');
            mascaracpf.setPlaceholderCharacter('_');
            mascaradata.setPlaceholderCharacter('_');
             
        }catch(ParseException excp){}
        
        //Adicionando a ação do botão a lista
        exibir.addActionListener((ActionEvent e) -> {
            //instanciando variavel 
            String cep1,tel1,cpf1,data1;
            //Passando valor para texto pelo getext  em string e passando para inteiro para atribuir numero1
            cep1 = (cep.getText());
            tel1 = (tel.getText());
            cpf1 = (cpf.getText());
            data1 = (data.getText());
            //setando o exibir como visivel
            exibir.setVisible(true);
            
            //setando o texto ao exibibir
            JOptionPane.showMessageDialog(null,"O cep digato é: "+cep1+"\n"+"O telefone digitado é: "+tel1+"\n"+"O cpf digitado é: "+cpf1+"\n"+"A data digitada é: "+data1+"\n");
        } //adicionando o evento ao click
        );//fechamento ActionListener
        
        //Atribuindo as mascaras ao textfield
        cep = new JFormattedTextField(mascaracep);
        tel = new JFormattedTextField(mascaratel);
        cpf = new JFormattedTextField(mascaracpf);
        data = new JFormattedTextField(mascaradata);
        
        //setando a posição na tela dos obejtos
        exibir.setBounds(150,200,100,20);
        cep.setBounds(150,40,100,20);
        tel.setBounds(150,80,100,20);
        cpf.setBounds(150,120,100,20);
        data.setBounds(150,160,100,20);
        
        //adicionado os objetos a tela
        tela.add(exibir);
        tela.add(rotulocep);
        tela.add(rotulotel);
        tela.add(rotulocpf);
        tela.add(rotulodata);
        tela.add(cep);
        tela.add(tel);
        tela.add(cpf);
        tela.add(data);
        
        //setando o tamanho da janela
        setSize(400,300);
        //setando para janela aparecer no local nulo
        setLocationRelativeTo(null);
        //setando a visibilidade da janela
        setVisible(true);
         
    }
       public static void main(String[] args) {
        //instanciando um objeto a partir da classe
         ExibirDados app = new  ExibirDados();
        //setando opçoes de maipulação da janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }//fechamento metodo main
}

