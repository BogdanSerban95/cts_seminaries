package design_patterns.comportamentale.strategy;

import java.util.ArrayList;

/**
 * Created by Serban on 12.04.2017.
 */
public class RestaurantMenu {
    private ArrayList<Product> productList = new ArrayList<>();

    private IProductPickerStrategy pickerStrategy;

    public void setPickerStrategy(IProductPickerStrategy strategy) {
        this.pickerStrategy = strategy;
    }

    public Product pickProduct() {
        return pickerStrategy.pickProduct(productList);
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }
}
