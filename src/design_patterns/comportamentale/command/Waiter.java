package design_patterns.comportamentale.command;

import java.util.ArrayList;

/**
 * Created by Serban on 05.04.2017.
 */
public class Waiter {
    private String name;

    private ArrayList<IOrder> orderList;

    public Waiter(String name) {
        this.name = name;
        orderList = new ArrayList<>();
    }

    public void takeOrder(IOrder order) {
        this.orderList.add(order);
    }

    public void giveOrders() {
        for (IOrder order : orderList) {
            order.doOrder();
        }
        orderList.clear();
    }

}
