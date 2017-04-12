package design_patterns.structurale.facade;

/**
 * Created by Serban on 22.03.2017.
 */
public class FrontDoor {
    private boolean isClosed = true;

    public void openDoor() {
        System.out.println("Front door is open.");
        this.isClosed = false;
    }

    public void closeDoor() {
        System.out.println("Front door is closed.");
        this.isClosed = true;
    }

}
