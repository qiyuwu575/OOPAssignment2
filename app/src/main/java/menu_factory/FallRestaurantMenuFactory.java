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
 *
 * @author gouraya
 */
public class FallRestaurantMenuFactory implements RestaurantMenuFactory {

    @Override
    public Drink[] createDrink() {
        // Creates drinks specific to the Fall menu
        return new Drink[] {
            new FallDrink("Margarita"),
            new FallDrink("Dark Rum"),
            new FallDrink("Orange Juice")
        };
    }

    @Override
    public MainCourse[] createMainCourse() {
        // Creates main courses specific to the Fall menu
        return new MainCourse[] {
            new FallMainCourse("Salmon Avocado Toast"),
            new FallMainCourse("Pesto Chicken Penne Asiago"),
            new FallMainCourse("Portobello Mushroom Chicken")
        };
    }

    @Override    
    public Entree[] createEntree() {
        // Creates entrees specific to the Fall menu
        return new Entree[] {
            new FallEntree("Spinach and Artichoke Dip"),
            new FallEntree("Sesame Soy Tuna Tartare"),
            new FallEntree("Tuscan Bruschetta")
        };
    }

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
