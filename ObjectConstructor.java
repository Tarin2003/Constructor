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
public class ObjectConstructor {
    String name;
        int id;
    public static void main(String[] args) {
        
    
        ObjectConstructor student1 = new ObjectConstructor();
        student1.name ="Ummehuny";
        student1.id = 130;
        System.out.println(student1.name);
        System.out.println(student1.id);
        ObjectConstructor student2 = new ObjectConstructor();
        student2.name ="Sharika";
        student2.id = 50;
        System.out.println(student2.name);
        System.out.println(student2.id);
        
        
    
    }
}
