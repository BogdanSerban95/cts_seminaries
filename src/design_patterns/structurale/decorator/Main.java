package design_patterns.structurale.decorator;

public class Main {

    public static void main(String[] args) {
        APizza pizzaSimpla = new PizzaSimpla();
        System.out.println("Ingrediente: " + pizzaSimpla.getIngrediente());
        System.out.println("Cost: " + pizzaSimpla.getCost());

        APizza pizzaPicanta = new PizzaPicanta(new PizzaSimpla());
        System.out.println("Ingrediente: " + pizzaPicanta.getIngrediente());
        System.out.println("Cost: " + pizzaPicanta.getCost());

        APizza pizzaCrownPicanta = new PizzaCrown(pizzaPicanta);
        System.out.println("Ingrediente: " + pizzaCrownPicanta.getIngrediente());
        System.out.println("Cost: " + pizzaCrownPicanta.getCost());

        APizza pizzaCrownPicanta2 = new PizzaPicanta(new PizzaCrown(new PizzaSimpla()));
        System.out.println("Ingrediente: " + pizzaCrownPicanta2.getIngrediente());
        System.out.println("Cost: " + pizzaCrownPicanta2.getCost());
    }
}
