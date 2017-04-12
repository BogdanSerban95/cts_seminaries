package design_patterns.creationale.prototype;

import java.util.HashMap;

/**
 * Created by Serban on 08.03.2017.
 */
public class ContractPrototypeFactory {
    private static HashMap<String, AContract> prototypeList = new HashMap<>();

    static {
        System.out.println("ContractPrototypeFactory - HashMap loading.");
        AContract contractParty = new ContractParty();
        prototypeList.put("party", contractParty);

        AContract contractCorporate = new ContractCorporate();
        prototypeList.put("corporate", contractCorporate);
    }

    public static AContract getContract(String contractType) {
        AContract contract = null;
        AContract contractPrototype = prototypeList.get(contractType);

        if (contractPrototype != null) {
            try {
                contract = contractPrototype.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

        return contract;
    }
}
