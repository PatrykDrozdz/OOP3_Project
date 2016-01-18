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
public class LagranzeForm extends Exception {
    
    @Override
    public String getMessage() {
        return "(-18*c^4+8*c^3+18*c^2-4*c)/(c^2+1)^4";
    }
    
}
