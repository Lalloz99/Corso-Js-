/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author christian.zammataro
 */
public class Persona {
    private String nome;
    private String residenza;
    public Persona(String x,String y){ //costruttore
        nome=x;
        residenza=y;
    }
    
    public String getNome(){
        return nome;
    }
    public String getResidenza(){
        return residenza;
    }
    public void setResidenza(String nuovaResidenza){
        residenza=nuovaResidenza;
    }
}
