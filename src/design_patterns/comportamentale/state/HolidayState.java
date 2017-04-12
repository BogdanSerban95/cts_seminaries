package design_patterns.comportamentale.state;

/**
 * Created by Serban on 05.04.2017.
 */
public class HolidayState implements IState {
    @Override
    public void receiveSMS(String message) {
        System.out.println("Employee is in holiday. He will not fix the problem too soon:" + message);
    }
}
