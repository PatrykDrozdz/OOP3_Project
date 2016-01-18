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
 * Classname: Deriv2
 * 
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 *
 * Version: 1.03, 12.01.2015
 * 
 */

public class Deriv2 extends Deriv {
    
    public double dx2(double x) {
        
        double result = ((6.0 * Math.pow(x, 3.0) - 2.0 * Math.pow(x, 2.0)) /
                (Math.pow((Math.pow(x , 2.0) + 1.0) , 3.0)));
        
        return result;
    }  
}
