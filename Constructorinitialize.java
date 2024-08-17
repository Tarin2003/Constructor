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
public class Constructorinitialize {
    public static void main(String[] args) {
     
        Constructor ob1 = new Constructor(2,5,9);
   double v1,v2,v3;
       v1 = ob1.volum();
        System.out.println("volum1 = "+v1);
        Constructor ob2 = new Constructor(9,6,10);
        v2 = ob2.volum();
        System.out.println("volum2 = "+v2);
        Constructor ob3 = new Constructor(9,6,20);
       v3= ob3.volum();
        
        System.out.println("volum3 = "+v3);
        if(v1>v2 && v1>v3) {
            System.out.println("volum1 = "+v1);
            
        }
        else if(v2>v3){
        System.out.println("volum2 = "+v2);
    }
        else{
               System.out.println("volum3 = "+v3); 
                }
        
    }
       
   
            
        }
       

        
     
    }
    

