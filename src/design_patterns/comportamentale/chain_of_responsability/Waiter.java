package design_patterns.comportamentale.chain_of_responsability;

/**
 * Created by Serban on 05.04.2017.
 */
public class Waiter extends AHandler {
    @Override
    void doOrder(Order order) {
        if (order.getImportanceDegree() <= 5) {
            System.out.println("Waiter has finished the order: " + order.getProduct());
        } else {
            System.out.println("Waiter cannot finish the order.");
            if (this.successor != null) {
                this.successor.doOrder(order);
            }
        }
    }
}
