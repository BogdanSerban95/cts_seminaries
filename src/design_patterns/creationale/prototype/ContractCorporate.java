package design_patterns.creationale.prototype;

import java.util.ArrayList;

/**
 * Created by Serban on 08.03.2017.
 */
public class ContractCorporate extends AContract {

    public ContractCorporate() {
        System.out.println("ContractCorporate - constructor called.");
        this.setContractType("corporate");
        this.setClauseList(new ArrayList<>());
    }

    @Override
    void show() {
        System.out.println("Corporate contract done with " + this.getClientName());
    }
}
