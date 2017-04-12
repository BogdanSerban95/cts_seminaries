package design_patterns.structurale.facade;

/**
 * Created by Serban on 22.03.2017.
 */
public class Oven {
    private boolean isClosed = true;

    public void openOven() {
        System.out.println("Oven is open.");
        this.isClosed = false;
    }

    public void closeOven() {
        System.out.println("Oven is closed.");
        this.isClosed = true;
    }

}
