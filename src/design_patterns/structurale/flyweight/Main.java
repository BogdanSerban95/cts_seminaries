package design_patterns.structurale.flyweight;

/**
 * Created by Serban on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        BonFlyweightFactory flyweightFactory = new BonFlyweightFactory();
        TipPrintare[] tipuriPrintare = TipPrintare.values();
        int nrFormatePrintate = tipuriPrintare.length;
        int random;

        for (int i = 0; i < 30; i++) {
            random = (int) (Math.random() * nrFormatePrintate);
            Bon bon = flyweightFactory.getBon(tipuriPrintare[random]);
            bon.setCostTotal(50 + 2 * i);
            bon.print();
        }

        System.out.println("Bonuri create: " + BonFlyweightFactory.getNrBonuriCreate());
        System.out.println("Bonuri printate: " + BonFlyweightFactory.getNrBonuriPrintate());
    }
}
