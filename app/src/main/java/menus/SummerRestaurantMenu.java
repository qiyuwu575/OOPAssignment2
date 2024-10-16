package menus;

import menu_factory.RestaurantMenuFactory;

public class SummerRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;

    public SummerRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    @Override
    public void populateMenu() {
        System.out.println("Populating Summer Menu");
        // Populate the menu items using the factory
        this.entrees = theFactory.createEntree();  // Create Summer entrees
        this.mainCourses = theFactory.createMainCourse();  // Create Summer main courses
        this.desserts = theFactory.createDessert();  // Create Summer desserts
        this.drinks = theFactory.createDrink();  // Create Summer drinks
    }
}
