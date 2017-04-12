package design_patterns.structurale.facade;

/**
 * Created by Serban on 22.03.2017.
 */
public class RestaurantFacade {
    private FrontDoor frontDoor;
    private Oven oven;


    public RestaurantFacade(FrontDoor frontDoor, Oven oven) {
        this.frontDoor = frontDoor;
        this.oven = oven;
    }

    public void openRestaurant() {
        System.out.println("Open restaurant");
        frontDoor.openDoor();
        oven.openOven();
    }

    public void closeRestaurant() {
        System.out.println("Close restaurant");
        oven.closeOven();
        frontDoor.closeDoor();
    }

}
