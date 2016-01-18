/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taylormaclaurintest;

/**
 *
 * @author Patryk
 */
public class POJOClass implements POJOInterface {
    
    private double x; //
    private int y;
    private double z;
    
    public POJOClass() {
        x = 0.0;
        y = 0;
    }
    
    public POJOClass(double x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void SetX(double x) {
        this.x = x;
    }
    
    @Override
    public double GetX() {
        return this.x;
    }
    
    @Override
    public void SetY(int y) {
        this.y = y;
    }
    
    @Override
    public int GetY() {
        return this.y;
    }
    
    @Override
     public void SetZ(double z) {
        this.z = z;
    }
    
    @Override
    public double GetZ() {
        return this.z;
    }
    
}
