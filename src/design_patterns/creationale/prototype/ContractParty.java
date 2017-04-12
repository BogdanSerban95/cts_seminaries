package design_patterns.creationale.prototype;

import java.util.ArrayList;

/**
 * Created by Serban on 08.03.2017.
 */
public class ContractParty extends AContract {

    public ContractParty() {
        System.out.println("ContractParty - constructor called.");
        this.setContractType("party");
        this.setClauseList(new ArrayList<>());

        this.addClause("Clause3");
        this.addClause("Clause4");
    }

    @Override
    void show() {
        System.out.println("Party contract done with " + this.getClientName());
    }

    @Override
    protected AContract clone() throws CloneNotSupportedException {
        AContract contract = super.clone();
        contract.setClauseList(new ArrayList<>());
        for (String clause : this.getClauseList()) {
            contract.addClause(clause);
        }
        return contract;
    }
}
