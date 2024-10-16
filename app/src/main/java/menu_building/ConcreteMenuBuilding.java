/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;
import menu_factory.*;
import menus.*;

/**
 * ConcreteMenuBuilding class that extends MenuBuilding to implement 
 * the method of constructing specific restaurant menus based on the season.
 * This class uses the Abstract Factory pattern to create menus for different seasons.
 * 
 * The makeMenuBuilding method constructs a menu based on the provided season
 * and fills in the menu name and active period accordingly.
 * 
 * @author gouraya
 */
public class ConcreteMenuBuilding extends MenuBuilding {

    /**
     * This method builds a restaurant menu based on the season.
     * It uses different factories to create seasonal menus (Fall, Winter, Spring, Summer).
     * 
     * @param season The season for which the menu needs to be built (e.g., "Fall", "Winter").
     * @return A RestaurantMenu object filled with specific items for the provided season.
     */
    @Override
    protected RestaurantMenu makeMenuBuilding(String season) {
        RestaurantMenu theMenu = null;  // Initialize the menu object
        
        // Check if the season is Fall
        if ("Fall".equalsIgnoreCase(season)) {
            // Create a factory for Fall menu items
            RestaurantMenuFactory theFactory = new FallRestaurantMenuFactory();
            // Create a Fall menu using the factory
            theMenu = new FallRestaurantMenu(theFactory);
            // Set the name and active period for the Fall menu
            theMenu.setName("Fall Menu");
            theMenu.setPeriod("September 1 to November 30.");
        }
        // Check if the season is Winter
        else if ("Winter".equalsIgnoreCase(season)) {
            // Create a factory for Winter menu items
            RestaurantMenuFactory theFactory = new WinterRestaurantMenuFactory();
            // Create a Winter menu using the factory
            theMenu = new WinterRestaurantMenu(theFactory);
            // Set the name and active period for the Winter menu
            theMenu.setName("Winter Menu"); 
            theMenu.setPeriod("December 1 to February 28.");
        }
        // Check if the season is Spring
        else if ("Spring".equalsIgnoreCase(season)) {
            // Create a factory for Spring menu items
            RestaurantMenuFactory theFactory = new SpringRestaurantMenuFactory();
            // Create a Spring menu using the factory
            theMenu = new SpringRestaurantMenu(theFactory);
            // Set the name and active period for the Spring menu
            theMenu.setName("Spring Menu");
            theMenu.setPeriod("March 1 to May 30.");
        }
        // Check if the season is Summer
        else if ("Summer".equalsIgnoreCase(season)) {
            // Create a factory for Summer menu items
            RestaurantMenuFactory theFactory = new SummerRestaurantMenuFactory();
            // Create a Summer menu using the factory
            theMenu = new SummerRestaurantMenu(theFactory);
            // Set the name and active period for the Summer menu
            theMenu.setName("Summer Menu");
            theMenu.setPeriod("June 1 to August 31");
        }
        
        // Return the constructed menu
        return theMenu;
    }
}
