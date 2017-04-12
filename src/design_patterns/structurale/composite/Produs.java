package design_patterns.structurale.composite;

/**
 * Created by Serban on 15.03.2017.
 */
public class Produs extends ANod {
    private String denumire;
    private int pret;

    public Produs(String denumire, int pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    @Override
    String getDenumire() {
        return this.denumire;
    }

    @Override
    int getPret() {
        return this.pret;
    }
}
