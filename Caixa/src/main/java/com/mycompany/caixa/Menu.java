/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caixa;

/**
 *
 * @author Admin
 */
public class Menu {
    private Caixa caixa;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradaSaidaDados io;
    
    public Menu(){
        this.caixa = new Caixa();
        this.opcao = -1;
        this.conversor = new ConversorNumeros();
        this.io = new EntradaSaidaDados();
    }
    public void executarCaixa(){
        do {
            this.executarMenuPrincipal();
            this.avaliarOpcaoEscolhida();
        }while(this.opcao!=4);
    }
    private void executarMenuPrincipal(){
        String mensagemMenu = "Selecione uma opção"
                + "\n1 - Entrada"
                +"\n2 - Retirada"
                +"\n3 - Consultar saldo"
                +"\n4 - Sair";
        String entradaDados = io.entradaDados(mensagemMenu);
        this.opcao = conversor.stringToInt(entradaDados);
    }
    public void avaliarOpcaoEscolhida(){
        switch(this.opcao){
            case 1:
                String mensagemEntrada = " Digite o Valor de Entrada";
                double valorEntrada = conversor.stringToDouble(io.entradaDados(mensagemEntrada));
                caixa.entrar(valorEntrada);
                break;
            case 2:
                String mensagemRetirada = " Digite o Valor de Retirada";
                double valorRetirada = conversor.stringToDouble(io.entradaDados(mensagemRetirada));
                caixa.retirar(valorRetirada);
                break;
            case 3:
                String mensagemSaldo = "Saldo atual: " + caixa.getSaldo();
                io.saidaDados(mensagemSaldo);
                break;
            case 4: io.saidaDados("finalizando progama!");
            break;
            default:
                io.saidaDados("Opção invalida");
                break;                
    }
   
    }
    
}
