package design_patterns.creationale.singleton;

/**
 * Created by Serban on 01.03.2017.
 */
public class Waiter {
    private String name;
    private RestaurantTable restaurantTables;

    public Waiter(String name) {
        this.name = name;
        try {
            restaurantTables = RestaurantTable.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public RestaurantTable getRestaurantTables() {
        return restaurantTables;
    }

    public void setTableOccupation(int i) {
        //alte instructiuni specifice logicii implementarii
        restaurantTables.setTableOccupation(i);
    }

    public void setFreeTable(int i) {
        //alte instructiuni specifice logicii implementarii
        restaurantTables.setFreeTable(i);
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "name='" + name + '\'' +
                ", restaurantTables=" + restaurantTables +
                '}';
    }
}
