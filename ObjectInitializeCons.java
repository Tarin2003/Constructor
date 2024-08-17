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
public class ObjectInitializeCons {
    String name;
    int batch, id;
    ObjectInitializeCons(String a,int b,int c){
        name = a;
        batch = b;
        id = c;
    }
     void information(){
        System.out.println("Name = "+name);
        System.out.println("Batch= "+batch);
        System.out.println("ID = "+id);
    }
     public static void main(String[] args) {
      ObjectInitializeCons student1 = new ObjectInitializeCons("Ummehuny",21,130);
      student1.information();
      ObjectInitializeCons student2 = new ObjectInitializeCons("Sharika",21,50);
      student2.information();
      ObjectInitializeCons student3 = new ObjectInitializeCons("Nishat",21,60);
      student3.information();
      ObjectInitializeCons student4 = new ObjectInitializeCons("Fawjia",21,118);
      student4.information();
      
      
    }
    
}
