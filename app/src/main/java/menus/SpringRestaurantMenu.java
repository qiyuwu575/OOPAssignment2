package menus;

import menu_factory.RestaurantMenuFactory;

public class SpringRestaurantMenu extends RestaurantMenu {

    RestaurantMenuFactory theFactory;

    public SpringRestaurantMenu(RestaurantMenuFactory factory) {
        this.theFactory = factory;
    }

    @Override
    public void populateMenu() {
        System.out.println("Populating Spring Menu");
        // Populate the menu items using the factory
        this.entrees = theFactory.createEntree();  // Create Spring entrees
        this.mainCourses = theFactory.createMainCourse();  // Create Spring main courses
        this.desserts = theFactory.createDessert();  // Create Spring desserts
        this.drinks = theFactory.createDrink();  // Create Spring drinks
    }
}
