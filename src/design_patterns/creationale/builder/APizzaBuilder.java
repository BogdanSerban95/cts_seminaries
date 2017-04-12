package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public abstract class APizzaBuilder {
    protected Pizza pizza;

    abstract void buildBlat();

    abstract void buildSos();

    abstract void buildIngrediente();
}
