/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus_main;
import menu_building.*;
import menus.*;

/**
 * MenuFactoryTest is the main class responsible for testing the creation 
 * of different seasonal restaurant menus (Fall, Winter, Spring, Summer).
 * 
 * This class demonstrates how to use the ConcreteMenuBuilding class to 
 * build menus for each season and prints the populated menus to the console.
 * 
 * The buildRestaurantMenu method from ConcreteMenuBuilding is used to 
 * create and fill each seasonal menu with the appropriate menu items, 
 * which are then printed.
 * 
 * @author gouraya
 */
public class MenuFactoryTest {

    /**
     * The main method is the entry point of the program, and it is responsible 
     * for building and printing seasonal menus using the ConcreteMenuBuilding class.
     * 
     * @param args Command-line arguments (not used).
     */
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
