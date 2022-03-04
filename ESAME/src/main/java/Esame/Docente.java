/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esame;

/**
 *
 * @author christian.zammataro
 */
public class Docente {
public String nome;
public String cognome;
public  int codice;
public int eta;

    public Docente(String nome, String cognome, int codice, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.eta = eta;
    }

public String getnome(){
return nome;
}
public String getcognome(){
return cognome;
}
public int getcodice(){
return codice;
}
public int geteta(){
return eta;
}

    int getEta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}