/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2constuctor;

/**
 *
 * @author Hp
 */
public class MethodOverload {
    double d , s ,h;
 
    void area(double a,double b,double c){
         s = 0.5*(a+b+c);
        h = s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(h));   
        
       
    }
    void area(double a,double b){
  
        d = 0.5*a*b;
        
        System.out.println(d);
    }
}
   
    
    

