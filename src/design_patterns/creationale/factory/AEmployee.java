package design_patterns.creationale.factory;

/**
 * Created by Serban on 01.03.2017.
 */
public abstract class AEmployee {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getType();

    public abstract void show();

}
