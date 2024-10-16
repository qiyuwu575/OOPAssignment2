/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class WinterDessert implements Dessert {
     private String name;

    // Constructor
    public WinterDessert(String name) {
        this.name = name;
    }

    // toString method to return the name of the dessert
    @Override
    public String toString() {
        return name;
    }
 
}
