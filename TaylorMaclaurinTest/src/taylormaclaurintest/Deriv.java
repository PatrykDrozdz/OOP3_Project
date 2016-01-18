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
public class Deriv extends First {
    
    public double dx(double x){
        
        double result = ((1-Math.pow(x, 2.0))/
                (Math.pow(Math.pow(x, 2.0)+1.0, 2.0)));
        
        return result;
    }


}
