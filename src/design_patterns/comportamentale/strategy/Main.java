package design_patterns.comportamentale.strategy;

/**
 * Created by Serban on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 500, 70);
        Product p2 = new Product("P2", 600, 65);
        Product p3 = new Product("P3", 550, 67);

        RestaurantMenu menu = new RestaurantMenu();
        menu.addProduct(p1);
        menu.addProduct(p2);
        menu.addProduct(p3);

        menu.setPickerStrategy(new MinCaloriesStrategy());
        System.out.println("Low Calories Strategy:");
        System.out.println(menu.pickProduct());

        menu.setPickerStrategy(new MinCarbohydratesStrategy());
        System.out.println("Low Carbohydrates Strategy: ");
        System.out.println(menu.pickProduct());

    }
}
