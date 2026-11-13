
package encapsulation2;

public class EmployeeDriver {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Shahrukh", 30000);

        EmployeeService service = new EmployeeService();

        service.generateSalaryReport(emp1);

        System.out.println("\nUpdating employee salary...");

        service.updateEmployeeSalary(emp1, 40000);

        service.generateSalaryReport(emp1);

        System.out.println("\nTesting invalid salary...");

        service.updateEmployeeSalary(emp1, 5000);

        service.generateSalaryReport(emp1);
    }
}
