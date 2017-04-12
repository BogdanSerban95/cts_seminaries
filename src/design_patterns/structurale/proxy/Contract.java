package design_patterns.structurale.proxy;

/**
 * Created by Serban on 29.03.2017.
 */
public class Contract implements IPrintable{
    private String infoContract;

    public Contract(String infoContract) {
        this.infoContract = infoContract;

        print();
    }


    @Override
    public void multiplicare() {
        System.out.println("Contractul cu informatia " + this.infoContract + " a fost xeroxat!");

    }

    public void print(){
        System.out.println("Contractul cu informatia " + this.infoContract + " a fost imprimat!");
    }
}
