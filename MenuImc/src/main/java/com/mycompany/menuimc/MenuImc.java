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
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
   public void avaliarOpcaoEscolhida(){
        String saida;
        double Altura=0, Peso=0;
        switch(this.opcao){
            case 1 :
            String mensagemEntrada = "Digite sua Altura: ";
            Altura = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            mensagemEntrada = "Digite seu Peso: ";
            Peso = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
            imc.cadastrarDados(Peso, Altura);
            break;
            
            case 2:
            saida="Dados Inseridos:\nAltura: " + imc.getAltura() + "\nPeso: " + imc.getPeso();
            io.saidaDados(saida);
            break;
            
            case 3:
                imc.calcular();
                saida="O seu IMC é:  " + imc.getImc();
                io.saidaDados(saida);
                break;
                
             case 4:
                situacao.verificarSituacao(imc);
                saida = "Sua situação é: " + situacao.getSituacao();
                io.saidaDados(saida);
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
 
    
