package design_patterns.creationale.singleton;

/**
 * Created by Serban on 01.03.2017.
 */
public class RestaurantTable {
    private static RestaurantTable instance;
    private int tableNumber = 10;
    private boolean occupiedTables[] = new boolean[tableNumber];

    private RestaurantTable() throws Exception {
        if (instance != null) {
            throw new Exception("Already instanced");
        }
    }

    public static RestaurantTable getInstance() throws Exception {
        if (instance == null) {
            instance = new RestaurantTable();
        }
        return instance;
    }

    public void setTableOccupation(int i) {
        if (i >= 0 && i < tableNumber && !occupiedTables[i]) {
            occupiedTables[i] = true;
        }
    }

    public void setFreeTable(int i) {
        if (i >= 0 && i < tableNumber && occupiedTables[i]) {
            occupiedTables[i] = false;
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < tableNumber; i++) {
            result += (i + 1) + " " + occupiedTables[i] + " ";
        }
        return result;
    }
}
