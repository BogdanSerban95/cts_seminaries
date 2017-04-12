package design_patterns.creationale.factory;

/**
 * Created by Serban on 01.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        AEmployee c = EmployeeFactory.getEmployee(Employees.CHEF, "Ionel");
        AEmployee w = EmployeeFactory.getEmployee(Employees.WAITER, "Gelu");

        c.show();
        w.show();
    }
}
