/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menuimc;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Situacao {
    
    private String situacao;
    
    public Situacao(String situacao){
        this.situacao = situacao;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    public void verificarSituacao(IMC p){
        if(p.getImc() < 18.5){
            setSituacao("Baixo Peso");
        }
        else {
            if (p.getImc() <= 24.9 && p.getImc() >=18.5) {
            setSituacao("Peso normal");
        }
        }
          if (p.getImc() >=25 && p.getImc() <29.9) {
            setSituacao("Excesso de peso");
        }
           else {
            if (p.getImc() == 30) {
            setSituacao("Obesidade");
        }
    }
            if (p.getImc() >30 && p.getImc() <34.9) {
            setSituacao("Obesidade tipo 1");
        }
            else {
            if (p.getImc() >=35 && p.getImc()<= 39.9) {
            setSituacao("Obesidade tipo 2");
        }
            }      
              if (p.getImc() >=40) {
            setSituacao("Obesidade tipo 3");
        }
    }          
}
