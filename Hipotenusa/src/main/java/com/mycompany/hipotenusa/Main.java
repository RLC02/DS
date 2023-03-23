/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hipotenusa;
//importando pacotes de math e interfaçe do java
import javax.swing.JOptionPane;
import java.lang.Math;
import static java.lang.Math.sqrt;

/**
 *
 * @author Admin
 */
//criando a class main principal
public class Main {
    //importando pacote do nucleo java
    public static void main(String[] args) {
        //chamando o metodo hipotenusa
        Hipotenusa();
    }//fim do metodo main
    /*declarando o metodo hipotenusa instanciando as variaveis usando o joption para atribuir o valores, calculando a hipotenusa, 
    e depois mostrando a variavel com show mensage*/
    static void Hipotenusa(){
        Double altura;
        Double base;
        Double hipotenusa;
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base: "));
        hipotenusa = sqrt ((Math.pow(altura, 2)+ Math.pow(base, 2)));
        JOptionPane.showMessageDialog(null, "A hipotenusa sera: "+hipotenusa);
    }//fim do metodo Hipotenusa
}//fim da classe main
