package design_patterns.structurale.flyweight;

import java.util.HashMap;

/**
 * Created by Serban on 29.03.2017.
 */
public class BonFlyweightFactory {
    private static HashMap<TipPrintare, Bon> listaBonuri = new HashMap<>();
    private static int nrBonuriPrintate = 0;

    public Bon getBon(TipPrintare tipPrintare) {
        nrBonuriPrintate++;
        Bon bon = listaBonuri.get(tipPrintare);
        if (bon == null) {
            bon = new Bon(tipPrintare);
            listaBonuri.put(tipPrintare, bon);
        }


        return bon;
    }

    public static int getNrBonuriCreate() {
        return listaBonuri.size();
    }

    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }
}
