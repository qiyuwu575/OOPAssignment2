package menus;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * RestaurantMenu is an abstract class representing a restaurant's seasonal menu.
 * It includes attributes for the menu's name, active period, and arrays of menu items 
 * (Entrees, Main Courses, Desserts, and Drinks). 
 * 
 * The class provides methods to set and get the menu's name and period, as well as 
 * an abstract method `populateMenu()` which must be implemented by subclasses 
 * to populate the menu with specific items for each season.
 * 
 * The `toString()` method is overridden to provide a formatted string representation 
 * of the menu, including its name, period, and all the menu items.
 * 
 * This class is intended to be extended by concrete seasonal menu classes 
 * (e.g., FallRestaurantMenu, WinterRestaurantMenu).
 * 
 * @author gouraya
 */
public abstract class RestaurantMenu {
    
    // Name of the menu (e.g., "Fall Menu")
    private String name;  
    
    // Period during which the menu is active (e.g., "September 1 to November 30")
    private String period;  
    
    // Arrays of menu items for the menu (Entrees, Main Courses, Desserts, Drinks)
    protected Entree[] entrees;  
    protected MainCourse[] mainCourses;  
    protected Dessert[] desserts;  
    protected Drink[] drinks;  
    
    /**
     * Gets the name of the menu.
     * 
     * @return The name of the menu.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the menu.
     * 
     * @param name The name to be assigned to the menu.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the period during which the menu is active.
     * 
     * @return The active period of the menu.
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the period during which the menu is active.
     * 
     * @param period The active period to be assigned to the menu.
     */
    public void setPeriod(String period) {
        this.period = period;
    }
    
    /**
     * Abstract method to populate the menu with items (Entrees, Main Courses, Desserts, Drinks).
     * This method must be implemented by subclasses to create and assign the specific 
     * menu items for each season (e.g., Fall, Winter).
     */
    public abstract void populateMenu();
    
    /**
     * Provides a formatted string representation of the menu, including its name, 
     * active period, and all the menu items (Entrees, Main Courses, Desserts, Drinks).
     * 
     * @return A formatted string showing the menu details and items.
     */
    @Override
    public String toString() {
        StringBuilder menuDetails = new StringBuilder();
        menuDetails.append("Menu Name: ").append(name).append("\n");
        menuDetails.append("Period: ").append(period).append("\n");
        
        // Append Entrees to the string
        menuDetails.append("Entrees: ");
        if (entrees != null) {
            for (Entree entree : entrees) {
                menuDetails.append(entree).append(", ");
            }
        }
        menuDetails.append("\n");

        // Append Main Courses to the string
        menuDetails.append("Main Courses: ");
        if (mainCourses != null) {
            for (MainCourse mainCourse : mainCourses) {
                menuDetails.append(mainCourse).append(", ");
            }
        }
        menuDetails.append("\n");

        // Append Desserts to the string
        menuDetails.append("Desserts: ");
        if (desserts != null) {
            for (Dessert dessert : desserts) {
                menuDetails.append(dessert).append(", ");
            }
        }
        menuDetails.append("\n");

        // Append Drinks to the string
        menuDetails.append("Drinks: ");
        if (drinks != null) {
            for (Drink drink : drinks) {
                menuDetails.append(drink).append(", ");
            }
        }
        menuDetails.append("\n");

        return menuDetails.toString();
    }
}
