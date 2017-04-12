package design_patterns.structurale.composite;

/**
 * Created by Serban on 15.03.2017.
 */
public abstract class ANod {

    abstract String getDenumire();

    abstract int getPret();

    //  metoda este implementata pentru nodul frunza
    public String getInfo() {
        return "    " + this.getDenumire() + " " + this.getPret();
    }

    public void adaugareNod(ANod nod) {

    }

    public void eliminareNod(ANod nod) {

    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException();

    }
}
