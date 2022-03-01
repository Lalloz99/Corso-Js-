/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struttura_elementari;

/**
 *
 * @author christian.zammataro
 */
public class Insegnanti {
    private String nome;
    private String cognome;
    private String annovincita;
    private String scuola;
    
    
    public Insegnanti(String a, String b , String c, String d){
         nome=a;
         cognome=b;
         annovincita=c;
         scuola=d;
    }
         public void setnome(String nuovo){
            nome=nuovo;
        }
        public void setcognome(String nuovo){
            cognome=nuovo;
        }
            
        public void setannovincita(String nuovo){
           annovincita=nuovo;
        }
        public void setscuola(String nuova){
            scuola=nuova;
        }

    @Override
    public String toString() {
        return "Insegnanti{" + "nome=" + nome + ", cognome=" + cognome + ", annovincita=" + annovincita + ", scuola=" + scuola + '}';
    }
           
      public static void main(String[] args){
          Insegnanti b;
        b= new Insegnanti("Alessio","Ferrucci","2005","Sandro Pertini");
        System.out.println(b);      
      }
        
    
}
