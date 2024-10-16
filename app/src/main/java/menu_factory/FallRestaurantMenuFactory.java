/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.FallDrink;
import components.FallDessert;
import components.FallEntree;
import components.FallMainCourse;

/**
 * FallRestaurantMenuFactory is a concrete implementation of the RestaurantMenuFactory interface.
 * It is responsible for creating the specific menu items (Entrees, Main Courses, Desserts, and Drinks)
 * that are relevant to the Fall season.
 * 
 * Each method in this factory creates an array of specific Fall items, such as fall-themed drinks,
 * main courses, entrees, and desserts, to populate the Fall menu.
 * 
 * This class implements the Abstract Factory pattern.
 * 
 * @author gouraya
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    /**
     * Creates an array of Drinks specific to the Fall menu.
     * 
     * @return An array of Drink objects containing Fall-themed drinks.
     */
    @Override
    public Drink[] createDrink() {
        // Creates drinks specific to the Fall menu
        return new Drink[] {
            new FallDrink("Margarita"),
            new FallDrink("Dark Rum"),
            new FallDrink("Orange Juice")
        };
    }

    /**
     * Creates an array of Main Courses specific to the Fall menu.
     * 
     * @return An array of MainCourse objects containing Fall-themed main courses.
     */
    @Override
    public MainCourse[] createMainCourse() {
        // Creates main courses specific to the Fall menu
        return new MainCourse[] {
            new FallMainCourse("Salmon Avocado Toast"),
            new FallMainCourse("Pesto Chicken Penne Asiago"),
            new FallMainCourse("Portobello Mushroom Chicken")
        };
    }

    /**
     * Creates an array of Entrees specific to the Fall menu.
     * 
     * @return An array of Entree objects containing Fall-themed entrees.
     */
    @Override    
    public Entree[] createEntree() {
        // Creates entrees specific to the Fall menu
        return new Entree[] {
            new FallEntree("Spinach and Artichoke Dip"),
            new FallEntree("Sesame Soy Tuna Tartare"),
            new FallEntree("Tuscan Bruschetta")
        };
    }

    /**
     * Creates an array of Desserts specific to the Fall menu.
     * 
     * @return An array of Dessert objects containing Fall-themed desserts.
     */
    @Override    
    public Dessert[] createDessert() {
        // Creates desserts specific to the Fall menu
        return new Dessert[] {
            new FallDessert("Carrot Cake"),
            new FallDessert("White Chocolate Cheesecake"),
            new FallDessert("Apple Pie")
        };
    }
}
