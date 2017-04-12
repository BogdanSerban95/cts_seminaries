package design_patterns.comportamentale.command;

/**
 * Created by Serban on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Chef firstChef = new Chef("Gigel");
        Chef secondChef = new Chef("Ionel");
        Waiter waiter = new Waiter("Georgel");

        IOrder order1 = new PastaOrder("Carbonara", firstChef);
        IOrder order2 = new PizzaOrder("Margherita", "Simple", secondChef);
        IOrder order3 = new PizzaOrder("Diavola", "Philadelphia", firstChef);

        waiter.takeOrder(order1);
        waiter.takeOrder(order2);
        waiter.takeOrder(order3);

        waiter.giveOrders();
    }
}
