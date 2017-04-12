package design_patterns.creationale.factory;

/**
 * Created by Serban on 01.03.2017.
 */
public class Waiter extends AEmployee {
    @Override
    public String getType() {
        return "Waiter";
    }

    @Override
    public void show() {
        System.out.println(this.name + " is a waiter!");
    }
}
