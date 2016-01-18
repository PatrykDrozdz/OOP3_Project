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


import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashMap;

public class TaylorMaclaurinTest {

    /**
     * @param args the command line arguments
     * @throws taylormaclaurintest.LagranzeForm
     */
    public static void main(String[] args) 
            throws LagranzeForm {
        
        Random rand = new Random(); 
        Set<Double> taylor = new TreeSet<>();
        HashMap<Double, String> hash = new HashMap<>();
        
        LinkedList mac = new LinkedList();
        POJOInterface pj = new POJOClass();
        Deriv2 dx2 = new Deriv2();
        FactorialInterface fact = new Factorial();
        
        double x;
        x = rand.nextDouble()*10;
        
        pj.SetX(x);
        pj.SetZ(0.0);
        
        System.out.println("X in Taylor: "+x);
        System.out.println("X in Maclaurin: 0");
        System.out.println();
        System.out.println();
        
        for(int i=0; i<=3; i++) {
            
            if(i==0) {
                taylor.add(dx2.FirstPart(pj.GetX()));
                mac.add(dx2.FirstPart(pj.GetZ()));
                
                if(dx2.FirstPart(pj.GetX()) > 0.0){
                    hash.put(dx2.FirstPart(pj.GetX()), "plus");
                } else{
                    hash.put(dx2.FirstPart(pj.GetX()), "minus");
                }
            } 
            if(i==1) {
                pj.SetY(i);
                taylor.add(dx2.dx(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY())); 
                mac.add(dx2.dx(pj.GetZ())*1.0/
                        (double)fact.getFactorial(pj.GetY()));
                
                if(dx2.dx(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()) > 0.0){
                    hash.put(dx2.dx(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()), "plus");
                } else{
                    hash.put(dx2.dx(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()), "minus");
                }
                
            }
            if(i==2) {
                pj.SetY(i);
                taylor.add(dx2.dx2(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()));
                mac.add(dx2.dx2(pj.GetZ())*1.0/
                        (double)fact.getFactorial(pj.GetY()));
                
                if(dx2.dx2(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()) > 0.0){
                    hash.put(dx2.dx2(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()), "plus");
                } else{
                    hash.put(dx2.dx2(pj.GetX())*1.0/
                        (double)fact.getFactorial(pj.GetY()), "minus");
                }
                
                System.out.println("Taylors's Theorem:");
                System.out.println(taylor);
                System.out.println();
                System.out.println();
                System.out.println("HasMap signes:");
                System.out.println(hash);
                System.out.println();
                System.out.println();
                System.out.println("Maclaurin's Theorem:");
                System.out.println(mac);
                System.out.println();
                System.out.println();
            }
            if(i==3){
                throw new LagranzeForm();
            }
            
        }
         
    }
    
}
