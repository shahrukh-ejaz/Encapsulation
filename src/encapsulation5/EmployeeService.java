package encapsulation5;

import java.util.Map;

public class EmployeeService {

    private EmployeeRepository repository;

    public EmployeeService() {
        repository = new EmployeeRepository();
    }

    public void registerEmployee(Employee employee) {

        if (repository.addEmployee(employee)) {
            System.out.println("Employee registered successfully!");
        } else {
            System.out.println("Employee ID already exists!");
        }
    }

    public void searchEmployee(int employeeId) {

        Employee employee = repository.findEmployee(employeeId);

        if (employee != null) {
            employee.displayEmployee();
        } else {
            System.out.println("Employee not found!");
        }
    }

    public void updateSalary(int employeeId, double newSalary) {

        Employee employee = repository.findEmployee(employeeId);

        if (employee != null && newSalary >= 10000) {
            employee.setSalary(newSalary);
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Invalid employee or salary!");
        }
    }

    public void transferDepartment(int employeeId,
                                   Department newDepartment) {

        Employee employee = repository.findEmployee(employeeId);

        if (employee != null && newDepartment != null) {
            employee.setDepartment(newDepartment);
            System.out.println("Department transferred successfully!");
        } else {
            System.out.println("Transfer failed!");
        }
    }

    public void displayAllEmployees() {

        for (Map.Entry<Integer, Employee> entry :
                repository.getAllEmployees().entrySet()) {

            entry.getValue().displayEmployee();
        }
    }
}