package design_patterns.comportamentale.command;

/**
 * Created by Serban on 05.04.2017.
 */
public class Chef {
    private String name;

    public Chef(String name) {
        this.name = name;
    }

    void doPastaOrder(String pastaType) {
        System.out.println("Chef " + this.name + " has finished the pasta order: " + pastaType);
    }

    void doPizzaOrder(String pizzaType, String doughType) {
        System.out.println("Chef " + this.name + " has finished the pizza order: " + pizzaType + " with dough type: " + doughType);
    }
}
