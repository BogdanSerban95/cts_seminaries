package design_patterns.comportamentale.chain_of_responsability;

/**
 * Created by Serban on 05.04.2017.
 */
public class Chef extends AHandler {
    @Override
    void doOrder(Order order) {
        if (order.getImportanceDegree() <= 10) {
            System.out.println("The chef has cooked the order: " + order.getProduct());
        } else {
            System.out.println("There is no one who can finish the order here. Try somewhere else.");
        }
    }
}
