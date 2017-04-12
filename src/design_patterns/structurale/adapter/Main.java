package design_patterns.structurale.adapter;

/**
 * Created by Serban on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        IBClientEvaluation clientEvaluation = new ClientEvaluationAdapter();

        int[] orders = new int[]{1000, 50, 250};

        Client client = new Client("Ionel", 3, orders);

        System.out.println("Client evaluation: " + clientEvaluation.evaluateB(client));
    }
}
