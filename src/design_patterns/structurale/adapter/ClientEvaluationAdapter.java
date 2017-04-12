package design_patterns.structurale.adapter;

/**
 * Created by Serban on 05.04.2017.
 */
public class ClientEvaluationAdapter extends ClientAEvaluation implements IBClientEvaluation {
    @Override
    public double evaluateB(Client client) {
        System.out.println("Evaluation method type B");
        return this.evaluateA(inputTransformation(client));
    }

    public int inputTransformation(Client client) {
        System.out.println("Transformation method.");
        int orderTotal = 0;
        for (int i = 0; i < client.getOrderNumber(); i++) {
            orderTotal += client.getOrderValue()[i];
        }
        return orderTotal;
    }


}
