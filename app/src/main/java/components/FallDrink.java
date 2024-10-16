/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package components;

/**
 *
 * @author gouraya
 */
public class FallDrink implements Drink {
 private String name;
 public FallDrink(String name) {
        this.name = name;
    }
@Override
    public String toString() {
        return name;
    
}
}