package menus;

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

public abstract class RestaurantMenu {
    
    private String name;  // Menu name
    private String period;  // Menu period (e.g., "Fall", "Winter")

    // Menu items (one of each type)
    protected Entree[] entrees;  // Array of entrees for the menu
    protected MainCourse[] mainCourses;  // Array of main courses for the menu
    protected Dessert[] desserts;  // Array of desserts for the menu
    protected Drink[] drinks;  // Array of drinks for the menu
    
    // Getters and Setters for name and period
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    
    // Abstract method to populate the menu (must be implemented by subclasses)
    public abstract void populateMenu();
    
    // Returns the menu content as a formatted string
    @Override
    public String toString() {
        StringBuilder menuDetails = new StringBuilder();
        menuDetails.append("Menu Name: ").append(name).append("\n");
        menuDetails.append("Period: ").append(period).append("\n");
        
        menuDetails.append("Entrees: ");
        if (entrees != null) {
            for (Entree entree : entrees) {
                menuDetails.append(entree).append(", ");
            }
        }
        menuDetails.append("\n");

        menuDetails.append("Main Courses: ");
        if (mainCourses != null) {
            for (MainCourse mainCourse : mainCourses) {
                menuDetails.append(mainCourse).append(", ");
            }
        }
        menuDetails.append("\n");

        menuDetails.append("Desserts: ");
        if (desserts != null) {
            for (Dessert dessert : desserts) {
                menuDetails.append(dessert).append(", ");
            }
        }
        menuDetails.append("\n");

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
