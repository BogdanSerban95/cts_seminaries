package design_patterns.comportamentale.memento;

import java.util.ArrayList;

/**
 * Created by Serban on 12.04.2017.
 */
public class ContractVersionManager {
    private ArrayList<ContractVersion> versionArrayList = new ArrayList<>();

    public ContractVersion getContractVersion(int i) {
        return this.versionArrayList.get(i);
    }

    public void addContractVersion(ContractVersion version) {
        this.versionArrayList.add(version);
    }
}
