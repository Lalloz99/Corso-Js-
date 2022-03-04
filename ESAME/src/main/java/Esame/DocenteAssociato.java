/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esame;

import java.util.ArrayList;

/**
 *
 * @author christian.zammataro
 */
public class DocenteAssociato extends Docente {
    public int votoDiDottorato;
    ArrayList<Contratti> contratti = new ArrayList<Contratti>();

    public DocenteAssociato(int votoDiDottorato, String nome, String cognome, int codice, int eta, ArrayList<Contratti> x) {
        super(nome, cognome, codice, eta);
        this.votoDiDottorato = votoDiDottorato;
        this.contratti=x;
    }
    
    
    
}
