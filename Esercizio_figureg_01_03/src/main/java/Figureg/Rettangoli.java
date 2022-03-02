/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figureg;

/**
 *
 * @author christian.zammataro
 */
public class Rettangoli extends FiguraGeometrica{
    private final int base;
    private final int altezza;

    public Rettangoli(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangoli(int base, int altezza, String a) {
        super(a);
        this.base = base;
        this.altezza = altezza;
    }
    
    public int getbase(){
        return base;
    }
    public int getaltezza(){
        return altezza;
    }
    
    @Override
    public int getarea(){
        return base*altezza;
  }

    @Override
    public String toString() {
        return "Rettangoli{" + "base=" + base + ", altezza=" + altezza + '}';
    }


        
    
    
    
    





}