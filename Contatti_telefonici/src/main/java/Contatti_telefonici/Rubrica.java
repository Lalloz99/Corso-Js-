/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatti_telefonici;

import java.util.*;

/**
 *
 * @author christian.zammataro
 */
/*Scrivere una classe Rubrica che rappresenta una collezione di contatti. La classe memorizza i contatti per
mezzo di una lista ed è dotata dei seguenti metodi:
 void aggiungiContatto(String nome, String cognome, String telefono) che aggiunge un contatto alla
rubrica;
 void rimuoviContatto(String nome, String cognome) che rimuove dalla rubrica il contatto associato
al nome e cognome dati;
 String cerca(String nome, String cognome) che dato un nome e cognome restituisce il numero di
telefono associato a quel nome e cognome oppure null se il nome e cognome non sono presenti in
rubrica;
 String toString() che restituisce una descrizione testuale dell’intera rubrica*/
public class Rubrica{
    ArrayList<Contatti> contatto = new ArrayList<Contatti>();
    
    void aggiungiContatto(String nome, String cognome, String telefono){
       contatto.add(new Contatti(nome,cognome,telefono));
    }
    void rimuoviContatto(String nome, String cognome){
       Iterator <Contatti> x = contatto.iterator();
       while (x.hasNext()){
           Contatti i = x.next();
           if(i.getnome()==nome && i.getcognome()==cognome){
           x.remove();
       }
       }
    }
           String cerca(String nome, String cognome){
           String telefono=null;
           Iterator <Contatti> y = contatto.iterator();
           while (y.hasNext()){
           Contatti i = y.next();
           if(i.getnome().equals(nome) && i.getcognome().equals(cognome)){
               telefono=i.getnumero();
           }
       }           
           return telefono;

           }

    @Override
    public String toString() {
        return "Rubrica{" + "contatto=" + contatto + '}';
    }
      public static void main(String[] args) {
        Rubrica x=new Rubrica();
       x.aggiungiContatto("Roberto","Master","335987654");
          System.out.println(x);
       x.aggiungiContatto("Alessio","Menichini","336789321");
          System.out.println(x);   
        
        
        
    }
     
}
                      
           
       
       
       
       
 
           

    

    


