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
public class Factorial extends POJOClass
        implements FactorialInterface {
    
    @Override
    public int getFactorial (int a) {
        
        for(int i = a-1; i>=1; i--) {
            a *= i;
        }
        return a;
    }
    
}
