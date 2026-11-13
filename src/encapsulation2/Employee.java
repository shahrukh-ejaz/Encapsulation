
package encapsulation2;

public class Employee {

    private int employeeId;
    private String name;
    private double basicSalary;

    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setBasicSalary(basicSalary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 10000) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Invalid basic salary");
        }
    }
}
