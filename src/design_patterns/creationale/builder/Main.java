package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        APizzaBuilder pizzaBuilder1 = new ConcreteBuilder1();
        APizzaBuilder pizzaBuilder2 = new ConcreteBuilder2();

        Bucatar bucatar = new Bucatar();
        bucatar.setPizzaBuilder(pizzaBuilder1);

        bucatar.buildPizza();
        Pizza pizza1 = bucatar.getPizza();

        bucatar.setPizzaBuilder(pizzaBuilder2);
        bucatar.buildPizza();
        Pizza pizza2 = bucatar.getPizza();

        System.out.println(pizza1.toString());
        System.out.println(pizza2.toString());


    }
}
