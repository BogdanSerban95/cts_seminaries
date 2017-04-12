package design_patterns.structurale.decorator;

/**
 * Created by Serban on 15.03.2017.
 */
public class DecoratorPizza extends APizza {
    protected APizza pizza;


    public DecoratorPizza(APizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getIngrediente() {
        return pizza.getIngrediente();
    }

    @Override
    int getCost() {
        return pizza.getCost();
    }
}
