package encapsulation5;

public class Department {
	private int departmentId;
	private String departmentName;
	public Department(int departmentId, String departmentName) {
		//super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	public int getDepartment() {
		return departmentId;
	}

	public String getDepartmentId() {
		return departmentName;
	}

}
