package menus;

import menu_factory.RestaurantMenuFactory;

public class WinterRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;

    public WinterRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    @Override
    public void populateMenu() {
        System.out.println("Populating Winter Menu");
        // Populate the menu items using the factory
        this.entrees = theFactory.createEntree();  // Create Winter entrees
        this.mainCourses = theFactory.createMainCourse();  // Create Winter main courses
        this.desserts = theFactory.createDessert();  // Create Winter desserts
        this.drinks = theFactory.createDrink();  // Create Winter drinks
    }
}
