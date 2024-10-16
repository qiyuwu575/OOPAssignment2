/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus_main;
import menu_building.*;
import menus.*;

/**
 *
 * @author gouraya
 */
public class MenuFactoryTest {

    public static void main(String[] args) {
        
        // Step 1: Create a ConcreteMenuBuilding object for building menus
        MenuBuilding theBuilding = new ConcreteMenuBuilding();
        
        // Step 2: Build and print the Fall menu
        System.out.println("Adding items to Fall Menu\n");
        RestaurantMenu theFallMenu = theBuilding.buildRestaurantMenu("Fall"); 
        System.out.println(theFallMenu);
        
        // Step 3: Build and print the Winter menu
        System.out.println("Adding items to Winter Menu\n");
        RestaurantMenu theWinterMenu = theBuilding.buildRestaurantMenu("Winter");
        System.out.println(theWinterMenu);
        
        // Step 4: Build and print the Spring menu
        System.out.println("Adding items to Spring Menu\n");
        RestaurantMenu theSpringMenu = theBuilding.buildRestaurantMenu("Spring");
        System.out.println(theSpringMenu);
         
        // Step 5: Build and print the Summer menu
        System.out.println("Adding items to Summer Menu\n");
        RestaurantMenu theSummerMenu = theBuilding.buildRestaurantMenu("Summer");
        System.out.println(theSummerMenu);
        
    }    
}
