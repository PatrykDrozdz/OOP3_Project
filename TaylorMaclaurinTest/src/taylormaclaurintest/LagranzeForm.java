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
 * Classname: LagranzeForm with Exception
 * 
 * Copyright (c) Patryk Dróżdż, this software is for anyone
 *
 * Version: 1.00, 08.01.2015
 * 
 */

public class LagranzeForm extends Exception {
    
    @Override
    public String getMessage() {
        return "(- 18 * c^4 + 8 * c^3 + 18 * c^2 - 4 * c)/(c^2 + 1)^4";
    }
    
}
