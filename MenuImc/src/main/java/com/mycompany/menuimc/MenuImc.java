/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuimc;

/**
 *
 * @author Admin
 */
public class MenuImc {
    
    private IMC imc;
    private int opcao;
    private ConversorNumeros conversor;
    private Situacao  situacao;
    private EntradaSaidaDados io;
    
    public MenuImc(){
     
        this.imc = new IMC();
        this.situacao = new Situacao();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();          
    }
      public void executarImc(){
        do{
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }
         while(this.opcao!=0);
        
    }
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção "
                +"\n 1 - Cadastar Peso e Altura:"
                +"\n 2 - Consultar Dados Cadastrados:"
                +"\n 3 - Calcular IMC:"
                +"\n 4 - Verificar Situação:"
                +"\n 5 - Sair: ";
        String opcao = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(opcao);
    }
   public void avaliarOpcaoEscolhida(){
        String saida;
        switch(this.opcao){
            
            case 1 :
            imc.cadastrarDados(conversor.stringToDouble(io.entradaDados("Digite seu Peso: ")), 
            conversor.stringToDouble(io.entradaDados("Digite sua Altura: ")));
            break;
            
            case 2:
            io.saidaDados("Dados Inseridos:\nAltura: " + imc.getAltura() + "\nPeso: " + imc.getPeso());
            break;
            
            case 3:
                imc.calcular();
                io.saidaDados("O seu IMC é:  " + imc.getImc());
            break;
                
            case 4:
                situacao.verificarSituacao(imc);
                io.saidaDados("Sua situação é: " + situacao.getSituacao());
            break;
             
            case 5:
                imc.sair();
            break;
                
            default:
                io.saidaDados("Opção inválida");
            break;
        }
    }
}
 
    
