package design_patterns.comportamentale.memento;

/**
 * Created by Serban on 12.04.2017.
 */
public class ContractVersion {
    //equivalent to memento class from diagram
    private String contractClauses;

    public ContractVersion(String contractClauses) {
        this.contractClauses = contractClauses;
    }

    public String getContractClauses() {
        return contractClauses;
    }
}
