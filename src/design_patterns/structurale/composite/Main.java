package design_patterns.structurale.composite;

/**
 * Created by Serban on 15.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ANod meniu = new Structura("Meniu");
        ANod bauturi = new Structura("Bauturi");
        ANod mancare = new Structura("Mancare");

        meniu.adaugareNod(bauturi);
        meniu.adaugareNod(mancare);

        bauturi.adaugareNod(new Produs("Pepsi", 15));
        bauturi.adaugareNod(new Produs("Cola", 10));
        bauturi.adaugareNod(new Produs("Fanta", 12));

        ANod paste = new Structura("Paste");
        paste.adaugareNod(new Produs("Carbonara", 25));
        paste.adaugareNod(new Produs("Spaghete", 15));
        mancare.adaugareNod(paste);

        ANod pizza = new Structura("Pizza");
        pizza.adaugareNod(new Produs("Simpla", 15));
        pizza.adaugareNod(new Produs("Carnivora", 20));
        mancare.adaugareNod(pizza);


        System.out.println(meniu.getInfo());


    }
}
