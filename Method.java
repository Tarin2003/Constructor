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
public class Method {
    String name;
    int batch, id;
    
    void information(){
        System.out.println("Name = "+name);
        System.out.println("Id= "+id);
        System.out.println("Batch = "+batch);
    }

    public static void main(String[] args) {
        Method student1 = new Method();
        student1.name ="Sadia";
        student1.id = 130;
        student1.batch = 21;
        student1.information();
        Method student2 = new Method();
        student2.name ="Fatema";
        student2.id = 104;
        student2.batch = 21;
        student2.information();
        Method student3 = new Method();
        student3.name ="Sadia";
        student3.id = 110;
        student3.batch = 21;
        student3.information();
        
        
      }
}
