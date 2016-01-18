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
public class Deriv2 extends Deriv {
    
    public double dx2(double x) {
        
        double result = ((6.0*Math.pow(x, 3.0)-2.0*Math.pow(x, 2.0))/
                (Math.pow((Math.pow(x, 2.0)+1.0), 3.0)));
        
        return result;
    }  
}
