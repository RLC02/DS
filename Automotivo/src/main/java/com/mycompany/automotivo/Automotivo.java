/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//pacote principal
package com.mycompany.automotivo;
//iportando o pacote de interface grafica do java
import javax.swing.JOptionPane;
/**
 *
 * @author dti
 */

//instanciando a classe Automotivo
public class Automotivo {
    
    //instanciando variaveid privadas String e Integer
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    //instancinado um metodo construtor sem parametro
    public Automotivo(){
        this("", "", 0, "");
    }
    
    //instancinado um metodo construtor com parametros e referenciando as variaveis
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    //instancinado o metodo get
    public String getModelo() {
        return modelo;
    }

    //instancinado o metodo set
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //instancinado o metodo get
    public String getMarca() {
        return marca;
    }

    //instancinado o metodo set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //instancinado o metodo get
    public Integer getAno() {
        return ano;
    }

    //instancinado o metodo set
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    //instancinado o metodo get
    public String getCor() {
        return cor;
    }

    //instancinado o metodo set
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //instanciando um metodo para provar que os valores foram referenciados
    public void provarExistencia() {
        JOptionPane.showMessageDialog(null, "\n Modelo: " + this.getModelo() + "\n Marca: " + this.getMarca() + "\n Ano: " + this.getAno() + "\n Cor: " + this.getCor());
    }
    
    //instanciando um metodo para receber os valores que serão referenciado 
    public void entraDados() {
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        String marca = JOptionPane.showInputDialog("Marca: ");
        setModelo(marca);
        String ano = JOptionPane.showInputDialog("Ano: ");
        setModelo(ano);
        String cor = JOptionPane.showInputDialog("cor: ");
        setModelo(cor);
    }
    //instanciando o pacote nucleo do java
    public static void main(String[] args) {
        //atribuindo um objeto a classe Automotivo
        Automotivo autol;
        //atribuindo um objeto a classe Automotivo
        autol = new Automotivo();
        //puxando e executando o metodo entraDados
        autol.entraDados();
        //puxando e executando o metodo entraDados
        autol.provarExistencia();
    //fim do metodo main
    }
//fim da classe Automovel     
}
