package design_patterns.structurale.proxy;

public class Main {

    public static void main(String[] args) {
        IPrintable contract = new Proxy("text");
        contract.multiplicare();
        contract.multiplicare();
        contract.multiplicare();
        contract.multiplicare();
        contract.multiplicare();
    }
}
