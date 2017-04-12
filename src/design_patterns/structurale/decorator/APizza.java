package design_patterns.structurale.decorator;

/**
 * Created by Serban on 15.03.2017.
 */
public abstract class APizza {
    private String nume;
    private int cost;

    abstract String getIngrediente();

    abstract int getCost();
}
