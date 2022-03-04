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
public class Universita {
        ArrayList<Docente> docenti = new ArrayList<Docente>();

    public Universita(ArrayList<Docente> n){
    docenti=n;
    }
    public int etaMinima(){
        int min=docenti.get(0).geteta();
        for(int i=1;i<=docenti.size();i++){
        if(docenti.get(i).geteta()<min) min=docenti.get(i).geteta();
        }
        return min;
    }
    
    public String[] trovaGiovani(){
        String [] risultato;
        int cont=0;
        for(int i=0;i<docenti.size();i++)
        if(docenti.get(i).geteta()==etaMinima())cont++;
        risultato=new String[cont];
        cont=0;
        for(int i=0;i<docenti.size();i++)
        if(docenti.get(i).geteta()==etaMinima()){
        risultato[i]=docenti.get(i).getcognome();
        cont++;
        }
        return risultato;
    }
}


    
        

        
  

    
    

    
    
        
  
    



    
    
    
    
    
    
    
    
    
    
   
    
    
    
        
        

   
        
        
        



