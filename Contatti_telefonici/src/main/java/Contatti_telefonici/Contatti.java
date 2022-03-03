/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatti_telefonici;
/**
 *
 * @author christian.zammataro
 */
/*Sia data una classe Contatto le cui istanze rappresentano contatti telefonici. Ogni contatto ha
un nome, un cognome e un numero telefonico (tutti di tipo String), un costruttore che riceve come parametro
il nome, il cognome e il numero di telefono associati al contatto, metodi per leggere tali valori e il metodo
toString() che restituisce una rappresentazione testuale del contatto.
Scrivere una classe Rubrica che rappresenta una collezione di contatti. La classe memorizza i contatti per
mezzo di una lista ed è dotata dei seguenti metodi:
 void aggiungiContatto(String nome, String cognome, String telefono) che aggiunge un contatto alla
rubrica;
 void rimuoviContatto(String nome, String cognome) che rimuove dalla rubrica il contatto associato
al nome e cognome dati;
 String cerca(String nome, String cognome) che dato un nome e cognome restituisce il numero di
telefono associato a quel nome e cognome oppure null se il nome e cognome non sono presenti in
rubrica;
 String toString() che restituisce una descrizione testuale dell’intera rubrica*/
public class Contatti {
    public String nome;
    public String cognome;
    public String numero;

    public Contatti(String nome, String cognome, String numero) {
        this.nome = nome;
        this.cognome = cognome;
        this.numero = numero;
    }
    public String getnome(){
        return nome;
    }
    public String getcognome(){
        return cognome;
    }
    public String getnumero(){
        return numero;
    }
    
    

    @Override
    public String toString() {
        return "Contatti{" + "nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + '}';
    }
    
    
}
