/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import menu_factory.RestaurantMenuFactory;

/**
 * FallRestaurantMenu is a concrete class that extends the abstract RestaurantMenu class.
 * It represents a specific menu for the Fall season and is responsible for populating
 * the menu with Fall-specific menu items (Entrees, Main Courses, Desserts, and Drinks) 
 * using a factory that adheres to the RestaurantMenuFactory interface.
 * 
 * This class follows the Abstract Factory pattern and uses a factory to generate 
 * the appropriate Fall menu items.
 * 
 * @author gouraya
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    // Factory used to create Fall-specific menu items
    RestaurantMenuFactory theFactory;
    
    /**
     * Constructor that takes a RestaurantMenuFactory and uses it to create 
     * the specific menu items for the Fall season.
     * 
     * @param factory A concrete implementation of the RestaurantMenuFactory interface,
     *                used to create Fall menu items.
     */
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    /**
     * Method to populate the Fall menu with specific items. It uses the provided factory 
     * to create and assign Fall-specific Entrees, Main Courses, Desserts, and Drinks.
     */
    @Override
    public void populateMenu() {
        System.out.println("populating " + getName());
        // Use the factory to create menu items for the Fall season
        this.entrees = theFactory.createEntree();
        this.mainCourses = theFactory.createMainCourse();
        this.desserts = theFactory.createDessert();
        this.drinks = theFactory.createDrink();
    }
}
