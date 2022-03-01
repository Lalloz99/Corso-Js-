/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struttura_elementari;
//importjava.lang.*
/**
 *
 * @author christian.zammataro
 */
public class Struttura_elementari {
    private String nome;
    private String indirizzo;
    private String provveditorato;

    public String getnome(){
        return nome;
    } 
    public String getindirizzo(){
        return indirizzo;
    }
    public String getprovveditorato(){
        return provveditorato;
}
    public Struttura_elementari(String a, String b , String c){
        nome=a;
        indirizzo=b;
        provveditorato=c;
    }
    public void setnome(String nuovo){
            nome=nuovo;
        }
        public void setindirizzo(String nuovo){
            indirizzo=nuovo;
        }
            
    public void setprovveditorato(String nuovo){
            provveditorato=nuovo;
        }

    @Override
    public String toString() {
        return "Struttura_elementari{" + "nome=" + nome + ", indirizzo=" + indirizzo + ", provveditorato=" + provveditorato + '}';
    }
    public static void main(String[] args){
          Struttura_elementari a;
        a= new Struttura_elementari("Sandro Pertini","Via Sestio Calvino","Burocratico");
        System.out.println(a);
    }
}
