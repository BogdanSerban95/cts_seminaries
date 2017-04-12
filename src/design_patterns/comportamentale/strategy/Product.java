package design_patterns.comportamentale.strategy;

/**
 * Created by Serban on 12.04.2017.
 */
public class Product {
    private String name;
    private int caloriesCount;
    private int carbohydratesCount;

    public Product(String name, int caloriesCount, int carbohydratesCount) {
        this.name = name;
        this.caloriesCount = caloriesCount;
        this.carbohydratesCount = carbohydratesCount;
    }

    public String getName() {
        return name;
    }

    public int getCaloriesCount() {
        return caloriesCount;
    }

    public int getCarbohydratesCount() {
        return carbohydratesCount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", caloriesCount=" + caloriesCount +
                ", carbohydratesCount=" + carbohydratesCount +
                '}';
    }
}
