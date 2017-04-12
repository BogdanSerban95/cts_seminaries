package design_patterns.creationale.builder;

/**
 * Created by Serban on 22.03.2017.
 */
public class Pizza {
    private String blat;
    private String sos;
    private String ingrediente;

    public void setBlat(String blat) {
        this.blat = blat;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "blat='" + blat + '\'' +
                ", sos='" + sos + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                '}';
    }
}
