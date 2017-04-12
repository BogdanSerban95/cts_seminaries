package design_patterns.comportamentale.state;

/**
 * Created by Serban on 05.04.2017.
 */
public class Employee {
    private String nume;

    private IState state;

    public Employee(String nume) {
        this.nume = nume;
        this.state = new WorkState();
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void processRequest(String message) {
        this.state.receiveSMS(message);
    }
}
