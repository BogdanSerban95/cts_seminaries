package design_patterns.comportamentale.chain_of_responsability;

/**
 * Created by Serban on 05.04.2017.
 */
public abstract class AHandler {
    protected AHandler successor;

    public void setSuccessor(AHandler successor) {
        this.successor = successor;
    }

    abstract void doOrder(Order order);
}
