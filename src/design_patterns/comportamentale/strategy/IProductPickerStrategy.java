package design_patterns.comportamentale.strategy;

import java.util.ArrayList;

/**
 * Created by Serban on 12.04.2017.
 */
public interface IProductPickerStrategy {
    Product pickProduct(ArrayList<Product> productArrayList);
}
