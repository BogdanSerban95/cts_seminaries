package design_patterns.structurale.decorator;

/**
 * Created by Serban on 15.03.2017.
 */
public class PizzaCrown extends DecoratorPizza {

    public PizzaCrown(APizza pizza) {
        super(pizza);
    }

    //adaugare functionalitati/atribute noi

    @Override
    String getIngrediente() {
        return super.getIngrediente() + ", decorare crown";
    }

    @Override
    int getCost() {
        return super.getCost() + 10;
    }
}
