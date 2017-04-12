package design_patterns.structurale.composite;

import java.util.ArrayList;

/**
 * Created by Serban on 15.03.2017.
 */
public class Structura extends ANod {
    //    atribute specifice nodurilor intermediare
    private String numeStructura;
    private ArrayList<ANod> listaDescendenti = new ArrayList<>();

    public Structura(String numeStructura) {
        this.numeStructura = numeStructura;
    }

    @Override
    String getDenumire() {
        throw new UnsupportedOperationException();
    }

    @Override
    int getPret() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numeStructura).append("\n");
        for (ANod nod : listaDescendenti) {
            stringBuilder.append("  ").append(nod.getInfo()).append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public void adaugareNod(ANod nod) {
        listaDescendenti.add(nod);
    }

    @Override
    public void eliminareNod(ANod nod) {
        if (listaDescendenti.contains(nod)) {
            listaDescendenti.remove(nod);
        }
    }

    @Override
    public ANod getNod(int i) {
        if (this.listaDescendenti.get(i) != null) {
            return this.listaDescendenti.get(i);
        }
        return null;
    }
}
