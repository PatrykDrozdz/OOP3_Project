/*
 * Patryk Dróżdż
 *
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 * 
 * In this program author tried to solve the problem of implementing 
 * the Taylor and Maclaurin Theorms. In the output we can see the reult of
 * counting thes Theorms. In Taylor thread We use Random double number.
 * Author also needed to use the HashMap. The HashMap returns the sign of
 * in Taylor's Theorm. It also throws exception in Lagranze Form.
 *
 * This software should be safe for any computer
 *
 */

package taylormaclaurintest;

/*
 * Classname: POJOClass
 * 
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 *
 * Version: 1.03, 12.01.2015
 * 
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
