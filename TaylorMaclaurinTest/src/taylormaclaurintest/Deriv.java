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
 * Classname: Derive
 * 
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 *
 * Version: 1.01, 11.01.2015
 * 
 */

public class Deriv extends First {
    
    public double dx(double x){
        
        double result = ((1 - Math.pow(x , 2.0))/
                (Math.pow(Math.pow(x , 2.0) + 1.0 , 2.0)));
        
        return result;
    }


}
