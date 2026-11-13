
package encapsulation2;

public class EmployeeService {

    private SalaryCalculator calculator;

    public EmployeeService() {
        calculator = new SalaryCalculator();
    }

    public void generateSalaryReport(Employee employee) {

        System.out.println("===== EMPLOYEE SALARY REPORT =====");

        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());

        calculator.displaySalaryDetails(employee.getBasicSalary());

        System.out.println("==================================");
    }

    public void updateEmployeeSalary(Employee employee, double newSalary) {

        employee.setBasicSalary(newSalary);

        System.out.println("Salary update request completed.");
    }
}
