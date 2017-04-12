package design_patterns.comportamentale.state;

/**
 * Created by Serban on 05.04.2017.
 */
public class WorkState implements IState {

    @Override
    public void receiveSMS(String message) {
        System.out.println("Employee is working. He will fix the problem immediately " + message);
    }
}
