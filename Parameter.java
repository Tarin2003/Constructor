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
public class Parameter {
    String name,un;
    int id;
    void information(String a, String b,int c){
      name = a;
un = b;
id = c;
    
}
    void displayinformation(){
        System.out.println("name : "+name);
        System.out.println("University : "+un);
        System.out.println("ID : "+id);
    }
    }
