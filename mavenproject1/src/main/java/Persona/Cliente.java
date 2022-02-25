/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;


/**
 *
 * @author christian.zammataro
 */
public class Cliente {
   public static void main(String[] args) {
       Persona p1; 
       p1= new Persona("Marco","Via Forza Napoli");
       p1.setResidenza("Terni");
       System.out.println(p1.getResidenza());//mi serve a stampare le istruzioni che io gli assegno, che io gli do
       System.out.println(p1.getNome());
   }
}
