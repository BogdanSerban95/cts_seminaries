package design_patterns.creationale.factory;

/**
 * Created by Serban on 01.03.2017.
 */
public class Chef extends AEmployee {
    @Override
    public String getType() {
        return "Chef";
    }

    @Override
    public void show() {
        System.out.println(this.name + " is a chef!");
    }
}
