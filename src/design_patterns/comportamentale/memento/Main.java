package design_patterns.comportamentale.memento;

/**
 * Created by Serban on 12.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Contract contract = new Contract("Ionel");
        System.out.println(contract);

        ContractVersionManager versionManager = new ContractVersionManager();

        contract.addClauses("Clauza1");
        System.out.println(contract);
        versionManager.addContractVersion(contract.generateContractVersion());

        contract.addClauses("Clauza2");
        System.out.println(contract);

        contract.addClauses("Clauza3");
        System.out.println(contract);
        versionManager.addContractVersion(contract.generateContractVersion());

        contract.restoreContractVersion(versionManager.getContractVersion(0));
        System.out.println(contract);
    }
}
