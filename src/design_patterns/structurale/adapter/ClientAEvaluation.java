package design_patterns.structurale.adapter;

/**
 * Created by Serban on 05.04.2017.
 */
public class ClientAEvaluation implements IAClientEvaluation {
    @Override
    public double evaluateA(int orderTotal) {
        System.out.println("Evaluation method type A");
        double discount = 0.0;

        if (orderTotal >= 1000) {
            discount = 0.10;
        } else {
            if (orderTotal >= 500) {
                discount = 0.05;
            }
        }
        return discount;
    }
}
