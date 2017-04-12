package design_patterns.structurale.proxy;

/**
 * Created by Serban on 29.03.2017.
 */
public class Proxy implements IPrintable {
    //   referinta la obiectul pe care il gestioneaza
    private Contract contract;
    //  "unele" atribute ale unui obiect real
    private String infoContract;

    public Proxy(String infoContract) {
        this.infoContract = infoContract;

    }

    @Override
    public void multiplicare() {
//        daca obiectul este null, contractul nu a mai fost cerut => il imprimam
        if (contract == null) {
            contract = new Contract(infoContract);
        }
        contract.multiplicare();
    }
}
