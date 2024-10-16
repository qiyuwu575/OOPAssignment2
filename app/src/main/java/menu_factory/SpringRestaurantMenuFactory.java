/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SpringEntree;
import components.SpringDrink;
import components.SpringMainCourse;
import components.SpringDessert;
/**
 *
 * @author gouraya
 */
public class SpringRestaurantMenuFactory implements RestaurantMenuFactory {

     @Override
    public Drink[] createDrink() {
        // Creates drinks specific to the Spring menu
        return new Drink[] {
            new SpringDrink("Cucumber Smash"),
            new SpringDrink("Lime Juice"),
            new SpringDrink("Candy Apple Cider")
        };
    }

    @Override
    public MainCourse[] createMainCourse() {
        // Creates main courses specific to the Spring menu
        return new MainCourse[] {
            new SpringMainCourse("Sunny Rise Burger"),
            new SpringMainCourse("California Spring Salad"),
            new SpringMainCourse("Crispy Chicken Sandwich")
        };
    }

    @Override    
    public Entree[] createEntree() {
        // Creates entrees specific to the Spring menu
        return new Entree[] {
            new SpringEntree("Lobster Veracruzana"),
            new SpringEntree("Organic Ocean Halibut"),
            new SpringEntree("Mushroom Soup")
        };
    }

    @Override    
    public Dessert[] createDessert() {
        // Creates desserts specific to the Spring menu
        return new Dessert[] {
            new SpringDessert("Vanilla Creme Brulee"),
            new SpringDessert("White Chocolate Brownie"),
            new SpringDessert("Passion Fruit Fig Tart")
        };
    }
}