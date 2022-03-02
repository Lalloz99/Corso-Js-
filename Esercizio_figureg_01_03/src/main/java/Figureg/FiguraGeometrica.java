/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figureg;

/**
 *
 * @author christian.zammataro
 */
abstract public class FiguraGeometrica {
    public String Figura;
    
    
    public FiguraGeometrica(){}
    public FiguraGeometrica(String a){
        Figura=a;
    }
    public String getFigurag(){
        return Figura;
    }
    public void setFigurag(String nuova){
        Figura=nuova;
    }
    abstract public int getarea();        

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "Figura=" + Figura + '}';
    }
   
    
        
    
   








}





