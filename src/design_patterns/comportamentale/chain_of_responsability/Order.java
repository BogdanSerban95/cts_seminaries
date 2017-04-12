package design_patterns.comportamentale.chain_of_responsability;

/**
 * Created by Serban on 05.04.2017.
 */
public class Order {
    private String product;
    private int quantity;
    private int importanceDegree;

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getImportanceDegree() {
        return importanceDegree;
    }

    public Order(String product, int quantity, int importanceDegree) {
        this.product = product;
        this.quantity = quantity;
        this.importanceDegree = importanceDegree;
    }


}
