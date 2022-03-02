/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Figureg;

/**
 *
 * @author christian.zammataro
 */
public class Triangoli extends FiguraGeometrica {
    public final int latoA;
    public final int latoB;
    public final int latoC;

    public Triangoli(int latoA, int latoB, int latoC) {
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }

    public Triangoli(int latoA, int latoB, int latoC, String a) {
        super(a);
        this.latoA = latoA;
        this.latoB = latoB;
        this.latoC = latoC;
    }
    @Override
    public int getarea(){
        return latoA*latoB*latoC;
  }

    @Override
    public String toString() {
        return "Triangoli{" + "latoA=" + latoA + ", latoB=" + latoB + ", latoC=" + latoC + '}';
    }
    
}
   