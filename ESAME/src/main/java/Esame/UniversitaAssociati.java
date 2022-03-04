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
public class UniversitaAssociati extends Universita{
    ArrayList<DocenteAssociato> docentiassociati = new ArrayList<DocenteAssociato>();

    public UniversitaAssociati(ArrayList<Docente> n,ArrayList<DocenteAssociato> x) {
        super(n);
        this.docentiassociati=x;
    }
    
    
    
    
    
}
