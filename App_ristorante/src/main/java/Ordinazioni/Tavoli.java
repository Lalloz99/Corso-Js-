/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordinazioni;
import java.util.ArrayList;

/**
 *
 * @author christian.zammataro
 */
/*Scrivi un programma in grado di gestire le ordinazioni ai tavoli di un ristorante. Nel ristorante possono essere disposti dei tavoli, ciascuno qualificato da un id numerico e da un numero di coperti. 
Per ciascun tavolo devono essere memorizzate le bevande ed i piatti consumati, in automatico deve poter essere calcolato il conto da pagare.
I piatti e le bevande disponibili, sono invece memorizzati in una classe 'Menu' che li suddivide in due categorie (piatti e bevande, appunto).
Ogni piatto o bevanda deve essere qualificato da un identificatore univoco alfanumerico (nome) e dal suo prezzo.*/
public class Tavoli {
    public int n;
    public int c;
    
    ArrayList<Cibo> cibi = new ArrayList<Cibo>();
    
    void aggiungiCibi(String bevande, String piatti){
       cibi.add(new Cibo(bevande,piatti));
    }
    
    

    public Tavoli(int n, int c) {
        this.n = n;
        this.c = c;
    }
    
     public int getn(){
        return n;
    }
    public int getc(){
        return c;
    }
    
}
