
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menus;
import menu_factory.RestaurantMenuFactory;

/**
 *
 * @author gouraya
 */
public class FallRestaurantMenu extends RestaurantMenu {
    
    RestaurantMenuFactory theFactory;
    
    public FallRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }
    
    @Override
    public void populateMenu() {
        System.out.println("populating " + getName());
        // Insert code to assign menu items created
        this.entrees = theFactory.createEntree();
        this.mainCourses = theFactory.createMainCourse();
        this.desserts = theFactory.createDessert();
        this.drinks = theFactory.createDrink();
    }
}
