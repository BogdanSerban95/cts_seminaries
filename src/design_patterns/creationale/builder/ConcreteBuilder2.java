package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public class ConcreteBuilder2 extends APizzaBuilder {
    @Override
    void buildBlat() {
        pizza.setBlat("Blat dublu");
    }

    @Override
    void buildSos() {
        pizza.setSos("Sos de rosii si altceva");
    }

    @Override
    void buildIngrediente() {
        pizza.setIngrediente("Rosii, ciuperci, extra branza si multe altele");
    }
}
