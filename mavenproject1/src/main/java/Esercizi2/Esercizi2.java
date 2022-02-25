/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Esercizi2;

import java.util.Scanner;

/**
 *
 * @author christian.zammataro
 */
public class Esercizi2 {

    public static void main(String[] args) {
        String x="genoveffa";
        String y="nove";
       // Scanner scan = new Scanner(System.in);
      //  System.out.println("Inserisci la prima stringa: ");
       // x = scan.nextLine();
      //  System.out.println("Inserisci la seconda stringa: ");
      //  y = scan.nextLine();
        if (x.contains(y)) {
            System.out.println("La stringa x: "+x+" contiene la stringa y: "+y);
        } else {
            System.out.println("La stringa x: "+x+" NON contiene la stringa y: "+y);
        }
    String u="ciao";
    for(var i=0; i<u.length(); i++){
        char christian = u.charAt(i);
        if (i%2==0){//se è vero è pari se è falso è dispari(% è resto)
        System.out.println(Character.toUpperCase(christian));
        } else{System.out.println(christian);
    }
    }
        
        
    
        
        }
        
    }
    
      
    

