/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struttura_elementari;

/**
 *
 * @author christian.zammataro
 */
public class Classe {
    private final String scuola;
    private final String nome;
    Insegnanti[] name= new Insegnanti[3];
    public int n;
    
     public Classe(String a, String b , Insegnanti i1,Insegnanti i2, Insegnanti i3 ,int x){
         scuola=a;
         nome=b;
         name [0]= i1;
         name[1]= i2;
         name[2]=i3;
         n=x;
     }
     public void setn(int x){
         n=x;
         }
     public String getscuola(){
         return scuola;
    }
     public String getnome(){
         return nome;
    }
     public int getn(){
         return n;
    }
   
        }
   
        
    
        
    

