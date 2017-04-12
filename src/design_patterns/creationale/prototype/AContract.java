package design_patterns.creationale.prototype;

import java.util.ArrayList;

/**
 * Created by Serban on 08.03.2017.
 */
public abstract class AContract implements Cloneable {
    private String clientName;
    private String contractType;
    private ArrayList<String> clauseList;

    abstract void show();

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public ArrayList<String> getClauseList() {
        return clauseList;
    }

    public void setClauseList(ArrayList<String> clauseList) {
        this.clauseList = clauseList;
    }

    @Override
    protected AContract clone() throws CloneNotSupportedException {
        return (AContract) super.clone();
    }

    public String showClauses() {
        StringBuilder clauses = new StringBuilder();
        for (String clause : clauseList) {
            clauses.append(clause).append(", ");
        }
        return clauses.toString();
    }

    public void addClause(String clause) {
        clauseList.add(clause);
    }

    public void setClause(String clause, int position) {
        clauseList.set(position, clause);
    }

    @Override
    public String toString() {
        return "AContract{" +
                "clientName='" + clientName + '\'' +
                ", contractType='" + contractType + '\'' +
                '}';
    }
}
