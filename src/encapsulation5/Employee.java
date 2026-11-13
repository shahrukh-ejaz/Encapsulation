package encapsulation5;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private Department department;
	
	public Employee(int employeeId, String employeeName, double salary, Department department) {
		
		this.employeeId = employeeId;
		setEmployeeName(employeeName);
		setSalary(salary);
		setDepartment(department);
	
}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setEmployeeName(String employeeName) {
		if(employeeName != null && !employeeName.trim().isEmpty()) {
			this.employeeName = employeeName;
		}
	}
	
	public void setSalary(double salary) {
		if(salary >= 10000) {
			this.salary = salary;
		}
	}
	
	
	public void setDepartment(Department department) {
		if(department != null) {
			this.department = department;
		}
	}
	
	public void displayEmployee() {
		System.out.println("ID: "+ employeeId);
		System.out.println("Name: "+ employeeName);
		System.out.println("Salary: "+ salary);
		System.out.println("Depatrtemnt: "+ department.getDepartment());
		System.out.println("---------");
	}
}