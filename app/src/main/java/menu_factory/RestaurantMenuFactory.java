package menu_factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;

/**
 * RestaurantMenuFactory is an interface for creating different types of menu items 
 * (Drinks, Main Courses, Entrees, and Desserts). 
 * 
 * This interface defines the contract for any concrete factory class that will
 * implement methods to create these items for specific seasons (e.g., Fall, Winter).
 * 
 * Each implementing class will define how to create these menu items specific to 
 * the corresponding season, following the Abstract Factory pattern.
 * 
 * @author gouraya
 */
public interface RestaurantMenuFactory {

    /**
     * Creates an array of Drink objects.
     * Implementing classes will return drinks specific to the season.
     * 
     * @return An array of Drink objects.
     */
    public Drink[] createDrink();

    /**
     * Creates an array of Main Course objects.
     * Implementing classes will return main courses specific to the season.
     * 
     * @return An array of MainCourse objects.
     */
    public MainCourse[] createMainCourse();

    /**
     * Creates an array of Entree objects.
     * Implementing classes will return entrees specific to the season.
     * 
     * @return An array of Entree objects.
     */
    public Entree[] createEntree();

    /**
     * Creates an array of Dessert objects.
     * Implementing classes will return desserts specific to the season.
     * 
     * @return An array of Dessert objects.
     */
    public Dessert[] createDessert();
}
