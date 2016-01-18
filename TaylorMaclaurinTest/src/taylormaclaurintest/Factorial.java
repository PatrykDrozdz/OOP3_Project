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
 * Classname: Factorial
 * 
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 *
 * Version: 1.02, 11.01.2015
 * 
 */

public class Factorial extends POJOClass
        implements FactorialInterface {
    
    @Override
    public int getFactorial (int a) {
        
        for(int i = a-1; i >= 1; i--) {
            a *= i;
        }
        return a;
    }
}