package design_patterns.comportamentale.state;

/**
 * Created by Serban on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Gelu");

        employee.processRequest("Fa ceva.");

        employee.setState(new HolidayState());
        employee.processRequest("Fa altceva!");
    }
}
