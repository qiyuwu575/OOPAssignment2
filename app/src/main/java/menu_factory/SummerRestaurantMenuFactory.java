/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.SummerDessert;
import components.SummerDrink;
import components.SummerMainCourse;
import components.SummerEntree;



/**
 *
 * @author gouraya
 */
public class SummerRestaurantMenuFactory implements RestaurantMenuFactory {
   
   @Override
    public Drink[] createDrink() {
        // Creates drinks specific to the Summer menu
        return new Drink[] {
            new SummerDrink("Lemonade"),
            new SummerDrink("Sangria"),
            new SummerDrink("Rum Punch")
        };
    }

    @Override
    public MainCourse[] createMainCourse() {
        // Creates main courses specific to the Summer menu
        return new MainCourse[] {
            new SummerMainCourse("Beef Tartare"),
            new SummerMainCourse("Spiced Cauliflower"),
            new SummerMainCourse("Chinook Salmon")
        };
    }

    @Override    
    public Entree[] createEntree() {
        // Creates entrees specific to the Summer menu
        return new Entree[] {
            new SummerEntree("Avocado Scramble"),
            new SummerEntree("Little Gem Salad"),
            new SummerEntree("Miso Cauliflower Soup")
        };
    }

    @Override    
    public Dessert[] createDessert() {
        // Creates desserts specific to the Summer menu
        return new Dessert[] {
            new SummerDessert("Lime Pie"),
            new SummerDessert("Ultimate Cookie"),
            new SummerDessert("Churro Ice Cream Sandwich")
        };
    }
}