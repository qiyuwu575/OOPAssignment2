/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class SpringDrink implements Drink  {
private String name;

    // Constructor
    public SpringDrink(String name) {
        this.name = name;
    }

    // toString method to return the name of the drink
    @Override
    public String toString() {
        return name;
    }

}
