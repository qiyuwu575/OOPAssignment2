/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class SpringMainCourse implements MainCourse {
     private String name;

    // Constructor
    public SpringMainCourse(String name) {
        this.name = name;
    }

    // toString method to return the name of the main course
    @Override
    public String toString() {
        return name;
    }
   
    
}
