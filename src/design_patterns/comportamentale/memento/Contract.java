package design_patterns.comportamentale.memento;

/**
 * Created by Serban on 12.04.2017.
 */
public class Contract {
    private String clientName;

    private String contractClauses;

    public Contract(String clientName) {
        this.clientName = clientName;
        this.contractClauses = "Default clauses";
    }

    public void addClauses(String clause) {
        this.contractClauses += ", " + clause;
    }

    public ContractVersion generateContractVersion() {
        return new ContractVersion(this.contractClauses);
    }

    public void restoreContractVersion(ContractVersion version) {
        this.contractClauses = version.getContractClauses();
    }

    @Override
    public String toString() {
        return "Contract{" +
                "clientName='" + clientName + '\'' +
                ", contractClauses='" + contractClauses + '\'' +
                '}';
    }
}
