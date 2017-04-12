package design_patterns.structurale.adapter;

/**
 * Created by Serban on 05.04.2017.
 */
public class Client {
    private String name;
    private int orderNumber;
    private int[] orderValue;

    public Client(String name, int orderNumber, int[] orderValue) {
        this.name = name;
        this.orderNumber = orderNumber;
        this.orderValue = orderValue;
    }

    public String getName() {
        return name;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int[] getOrderValue() {
        return orderValue;
    }
}
