package design_patterns.structurale.decorator;

/**
 * Created by Serban on 15.03.2017.
 */
public class PizzaPicanta extends DecoratorPizza {

    public PizzaPicanta(APizza pizza) {
        super(pizza);
    }

    @Override
    String getIngrediente() {
        return super.getIngrediente() + ", decorare picant";
    }

    @Override
    int getCost() {
        return super.getCost() + 15;
    }
}
