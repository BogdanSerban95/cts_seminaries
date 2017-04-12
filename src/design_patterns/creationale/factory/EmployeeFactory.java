package design_patterns.creationale.factory;

/**
 * Created by Serban on 01.03.2017.
 */
public class EmployeeFactory {
    public static AEmployee getEmployee(Employees employeeType, String name) {
        AEmployee employee = null;
        if (employeeType == Employees.WAITER) {
            employee = new Waiter();
            employee.setName(name);
        } else if (employeeType == Employees.CHEF) {
            employee = new Chef();
            employee.setName(name);
        }
        return employee;
    }
}
