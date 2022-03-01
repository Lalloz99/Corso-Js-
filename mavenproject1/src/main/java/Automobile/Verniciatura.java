/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automobile;

/**
 *
 * @author christian.zammataro
 */
public class Verniciatura {
    public void Verniciatura(String nuovocolore,Automobile generale){
            generale.setcolore(nuovocolore);
    }           
    public static Automobile immatricolaFerrari360Gt(String targa){
        Automobile a;
        a= new Automobile(targa,"Ferrari","giallo", null);{
        return a;
    }
    
    }
    public static void main(String[] args){
        System.out.println(immatricolaFerrari360Gt("GF450LF"));
    }
}
        
      
        
        
    
   
        
  
     
     
    


