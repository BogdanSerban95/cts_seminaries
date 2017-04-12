package design_patterns.structurale.decorator;

/**
 * Created by Serban on 15.03.2017.
 */
public class PizzaSimpla extends APizza {


    @Override
    String getIngrediente() {
        return "blat, sos, rosii, branza";
    }

    @Override
    int getCost() {
        return 20;
    }
}
