package design_patterns.comportamentale.strategy;

import java.util.ArrayList;

/**
 * Created by Serban on 12.04.2017.
 */
public class MinCaloriesStrategy implements IProductPickerStrategy {
    @Override
    public Product pickProduct(ArrayList<Product> productArrayList) {
        Product minProd = productArrayList.get(0);
        for (Product p : productArrayList) {
            if (minProd.getCaloriesCount() >= p.getCaloriesCount()) {
                minProd = p;
            }
        }
        return minProd;
    }
}
