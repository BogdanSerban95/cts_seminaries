package design_patterns.comportamentale.command;

/**
 * Created by Serban on 05.04.2017.
 */
public class PizzaOrder implements IOrder {
    private String pizzaType;
    private String doughType;

    private Chef chef;

    public PizzaOrder(String pizzaType, String doughType, Chef chef) {
        this.pizzaType = pizzaType;
        this.doughType = doughType;
        this.chef = chef;
    }

    @Override
    public void doOrder() {
        this.chef.doPizzaOrder(this.pizzaType, this.doughType);
    }
}
