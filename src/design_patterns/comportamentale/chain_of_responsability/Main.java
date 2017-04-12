package design_patterns.comportamentale.chain_of_responsability;

/**
 * Created by Serban on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Chef chef = new Chef();
        waiter.setSuccessor(chef);


        Order firstOrder = new Order("Coffee", 3, 3);
        Order secondOrder = new Order("Pizza", 20, 8);
        Order thirdOrder = new Order("A car", 3, 100);

        System.out.println("First Order:");
        waiter.doOrder(firstOrder);
        System.out.println("Second Order:");
        waiter.doOrder(secondOrder);
        System.out.println("Third Order:");
        waiter.doOrder(thirdOrder);
    }
}
