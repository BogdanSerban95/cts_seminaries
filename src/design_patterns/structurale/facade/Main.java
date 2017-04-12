package design_patterns.structurale.facade;

public class Main {

    public static void main(String[] args) {
	    FrontDoor frontDoor = new FrontDoor();
	    Oven oven = new Oven();

	    RestaurantFacade restaurantFacade = new RestaurantFacade(frontDoor,oven);
	    restaurantFacade.openRestaurant();
	    restaurantFacade.closeRestaurant();
    }
}
