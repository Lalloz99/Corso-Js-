/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automobile;

/**
 *
 * @author christian.zammataro
 */
public class Automobile {
    private String targa;
    private String modello;
    public String colore;
    public Persona proprietario;
    
    public String gettarga(){
        return targa;
    } 
    public String getmodello(){
        return modello;
    }
    public String getcolore(){
        return colore;
    }
    public Persona getproprietario(){
        return proprietario;
    }
    public Automobile(String a, String b , String c){
        targa=a;
        modello=b;
        colore=c;
    }
    public Automobile(String a, String b , String c, Persona p){
        targa=a;
        modello=b;
        colore=c;
        proprietario=p;
    }

    @Override
    public String toString() {
        return "Automobile{" + "targa=" + targa + ", modello=" + modello + ", colore=" + colore + ", proprietario=" + proprietario + '}';
    }
        
        public void setcolore(String nuovocolore){
            colore=nuovocolore;
        }
        public void setproprietario(Persona nuova){
            proprietario=nuova;
              
}
    
    
  

    
        
        
    
    
}

