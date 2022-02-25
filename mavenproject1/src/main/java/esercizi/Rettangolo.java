/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esercizi;

/**
 *
 * @author christian.zammataro
 */
public class Rettangolo {
    private int altezza;
    private int larghezza;
    public Rettangolo(int x,int y){ //costruttore
        altezza=x;
        larghezza=y;
}
    public int getaltezza(){
        return altezza;
    }
    public int getlarghezza(){
        return larghezza;
    }
    public void setaltezza(int h){
        altezza=h;
        
    }
    public void setlarghezza(int g){
        larghezza=g;
    }
    public static void main(String[] args){
        Rettangolo x2;
        x2= new Rettangolo(2,3);
        //x2.setaltezza(2); non mi serve il set perchè ho gia' il costruttore
        //x2.setaltezza(3);
        System.out.println(x2.getaltezza());//mi serve a stampare le istruzioni che io gli assegno, che io gli do
        System.out.println(x2.getlarghezza());
        
    }
}
