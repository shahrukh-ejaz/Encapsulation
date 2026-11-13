package encapsulation5;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
	
	private Map<Integer, Employee> employees = new HashMap<>();
	
	public boolean addEmployee(Employee employee) {
		
		if(employees.containsKey(employee.getEmployeeId())){
			return false;
		}
		
		employees.put(employee.getEmployeeId(), employee);
		return true;
	}
	
	public Employee findEmployee(int employeeId) {
		return employees.get(employeeId);
	}
	
	public Map<Integer, Employee> getAllEmployees(){
		return employees;
	}
	
	
}
