package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public class ConcreteBuilder1 extends APizzaBuilder {
    @Override
    void buildBlat() {
        pizza.setBlat("Blat simplu");
    }

    @Override
    void buildSos() {
        pizza.setSos("Sos de rosii");
    }

    @Override
    void buildIngrediente() {
        pizza.setIngrediente("Rosii, ciuperci, extra branza");
    }
}
