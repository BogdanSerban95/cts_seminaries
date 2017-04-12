package design_patterns.creationale.prototype;

public class Main {

    public static void main(String[] args) {
//	    no prototype implementation
        AContract partyContract1 = new ContractParty();
        AContract partyContract2 = new ContractParty();

        if (partyContract1.getClauseList() == partyContract2.getClauseList()) {
            System.out.println("YUP");
        } else {
            System.out.println("NOPE");
        }


//        prototype implementation
        AContract partyContract3 = ContractPrototypeFactory.getContract("party");
        AContract partyContract4 = ContractPrototypeFactory.getContract("party");

        if (partyContract3.getClauseList() == partyContract4.getClauseList()) {
            System.out.println("YUP");
        } else {
            System.out.println("NOPE");
        }

        System.out.println(partyContract3.showClauses());
        System.out.println(partyContract4.showClauses());
        partyContract3.setClause("New Clause", 0);
        System.out.println(partyContract3.showClauses());
        System.out.println(partyContract4.showClauses());

    }
}
