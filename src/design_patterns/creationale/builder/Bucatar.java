package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public class Bucatar {
    //referinta la tehnica de creare (AbstractBuilder)

    private APizzaBuilder pizzaBuilder;

    //setare reteta creare obiect
    public void setPizzaBuilder(APizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    //metoda ce reuneste crearile componentelor obiectelor
    public void buildPizza() {
        pizzaBuilder.pizza = new Pizza();
        pizzaBuilder.buildBlat();
        pizzaBuilder.buildIngrediente();
        pizzaBuilder.buildSos();
    }

    public Pizza getPizza() {
        return this.pizzaBuilder.pizza;
    }
}
