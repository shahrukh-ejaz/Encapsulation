package encapsulation5;

public class EmployeeDriver {
	
	public static void main(String[] args) {

		Department d1 = new Department(101, "IT");

		Department d2 = new Department(102, "IT");
		
		Employee e1 = new Employee(1, "Rahul", 30000, d1);
		Employee e2 = new Employee(2, "Aman", 40000, d2);
		Employee e3 = new Employee(3, "Rohit", 35000, d1);
		
		
		EmployeeService service = new EmployeeService();
		
		service.registerEmployee(e1);
		service.registerEmployee(e2);
		service.registerEmployee(e3);
		
		
		 // Duplicate employee ID
        service.registerEmployee(e1);

        System.out.println("\n===== SEARCH EMPLOYEE =====");

        service.searchEmployee(2);

        System.out.println("\n===== UPDATE SALARY =====");

        service.updateSalary(1, 45000);

        System.out.println("\n===== TRANSFER DEPARTMENT =====");

        service.transferDepartment(1, d2);

        System.out.println("\n===== FINAL EMPLOYEE LIST =====");

        service.displayAllEmployees();

		

	}

}
