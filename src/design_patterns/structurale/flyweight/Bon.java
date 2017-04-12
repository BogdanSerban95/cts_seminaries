package design_patterns.structurale.flyweight;

/**
 * Created by Serban on 29.03.2017.
 */
public class Bon implements IPrintable {
    //  zona partajabila
    private TipPrintare tipPrintare;
    //    zona nepartajata
    private int costTotal;

    public Bon(TipPrintare tipPrintare) {
        System.out.println("S-a creat un obiect de tip bon " + tipPrintare);
        this.tipPrintare = tipPrintare;
    }


    public void setCostTotal(int costTotal) {
        this.costTotal = costTotal;
    }

    @Override
    public void print() {
        System.out.println("Bon de format " + this.tipPrintare + " avand cost " + this.costTotal + " a fost printat!");
    }
}
