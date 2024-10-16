/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_building;
import menus.*;

/**
 * MenuBuilding is an abstract class responsible for defining the template for constructing 
 * a restaurant menu based on a specific season. The actual implementation of how 
 * to build the menu for each season is left to the subclasses.
 * 
 * This class follows the Builder pattern and provides a common method `buildRestaurantMenu`
 * that uses the abstract method `makeMenuBuilding` to create and populate the menu.
 * 
 * @author gouraya
 */
public abstract class MenuBuilding {

    /**
     * Abstract method that must be implemented by subclasses to create 
     * a specific seasonal restaurant menu.
     * 
     * @param season The season for which the menu is being created (e.g., "Fall", "Winter").
     * @return A RestaurantMenu object for the specific season.
     */
    protected abstract RestaurantMenu makeMenuBuilding(String season);

    /**
     * Public method that builds the restaurant menu for a given season. 
     * It calls the abstract `makeMenuBuilding` method to create the menu 
     * and then populates it with the appropriate items (entrees, main courses, desserts, drinks).
     * 
     * @param season The season for which the menu should be built (e.g., "Fall", "Winter").
     * @return A fully constructed and populated RestaurantMenu object.
     */
    public RestaurantMenu buildRestaurantMenu(String season) {
        // Create the restaurant menu based on the season
        RestaurantMenu theMenu = makeMenuBuilding(season);
        // Populate the menu with the items for the specific season
        theMenu.populateMenu();
        // Return the populated menu
        return theMenu;
    }
}
