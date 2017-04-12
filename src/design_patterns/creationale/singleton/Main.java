package design_patterns.creationale.singleton;

public class Main {

    public static void main(String[] args) {
        Waiter w1 = new Waiter("Ion");
        Waiter w2 = new Waiter("Marcel");

        System.out.println(w1);
        System.out.println(w2);

        w2.setTableOccupation(2);

        System.out.println(w1);
        System.out.println(w2);

        if (w1.getRestaurantTables() == w2.getRestaurantTables()) {
            System.out.println("One instance");
        } else {
            System.out.println("No!");
        }
    }
}
