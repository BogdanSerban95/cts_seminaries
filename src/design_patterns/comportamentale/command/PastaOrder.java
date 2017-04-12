package design_patterns.comportamentale.command;

/**
 * Created by Serban on 05.04.2017.
 */
public class PastaOrder implements IOrder {
    //specific attributes
    private String pastaType;

    //executor object
    private Chef chef;

    public PastaOrder(String pastaType, Chef chef) {
        this.pastaType = pastaType;
        this.chef = chef;
    }

    @Override
    public void doOrder() {
        chef.doPastaOrder(this.pastaType);
    }
}
