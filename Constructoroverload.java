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
public class Constructoroverload {
    int a,b,c;
    Constructoroverload(){

     
    }
    Constructoroverload(int p, int d){
        a = p;
        b = d;
        
    }
    Constructoroverload(int s, int t,int q){
      a=s;
        b=t;
        c=q;  
    }
    Constructoroverload(int a){
       this.a = a;
       
        
    }
    int value(){
        return a*b*c;
    }
    
    
    public static void main(String[] args) {
        Constructoroverload h1=new Constructoroverload();
        System.out.println(h1.c);
        Constructoroverload h2=new Constructoroverload( 2,3);
       System.out.println (h2.a);
        Constructoroverload h3=new Constructoroverload(4,9,12);
        System.out.println(h3.c);
        System.out.println(h3.b);
        Constructoroverload h4=new Constructoroverload(3);
       System.out.println (h4.a);
       int vol;
       vol = h3.value();
        System.out.println("value = "+vol);
        vol = h4.value();
        System.out.println("value = "+vol);
    
        
                
    }
            
    
    
}
