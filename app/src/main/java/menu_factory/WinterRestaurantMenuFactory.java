/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu_factory;
import components.Dessert;
import components.Drink;
import components.MainCourse;
import components.Entree;
import components.WinterDessert;
import components.WinterDrink;
import components.WinterMainCourse;
import components.WinterEntree;

/**
 *
 * @author gouraya
 */
public class WinterRestaurantMenuFactory implements RestaurantMenuFactory {
    
     @Override
    public Drink[] createDrink() {
        // Creates drinks specific to the Winter menu
        return new Drink[] {
            new WinterDrink("Mojito"),
            new WinterDrink("Alcohol Free Wine"),
            new WinterDrink("Tequila")
        };
    }

    @Override
    public MainCourse[] createMainCourse() {
        // Creates main courses specific to the Winter menu
        return new MainCourse[] {
            new WinterMainCourse("Sirloin"),
            new WinterMainCourse("Salmon Croquettes"),
            new WinterMainCourse("Steak and Fries")
        };
    }

    @Override    
    public Entree[] createEntree() {
        // Creates entrees specific to the Winter menu
        return new Entree[] {
            new WinterEntree("Sesame Soy Tartare"),
            new WinterEntree("Boston Clam Chowder"),
            new WinterEntree("Thai Soup")
        };
    }

    @Override    
    public Dessert[] createDessert() {
        // Creates desserts specific to the Winter menu
        return new Dessert[] {
            new WinterDessert("Chocolate Mousse"),
            new WinterDessert("Caramel Cheesecake"),
            new WinterDessert("Chocolate Sponge Cake")
        };
    }
}
    
