package encapsulation1;

public class Student {
	private int rollNo;
	private String name;
	private double marks;
	
	public Student(int rollNo, String name, double marks) {
		setRollNo(rollNo);
		setName(name);
		setMarks(marks);
		
	}
	
	
	 public void setRollNo(int rollNo) {
	        if (rollNo > 0) {
	            this.rollNo = rollNo;
	        }
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setName(String name) {
	        if (name != null && !name.trim().isEmpty()) {
	            this.name = name;
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public void setMarks(double marks) {
	        if (marks >= 0 && marks <= 100) {
	            this.marks = marks;
	        } else {
	            System.out.println("Invalid marks!");
	        }
	    }

	    public double getMarks() {
	        return marks;
	    }

	    public void displayStudent() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }

	    public void checkResult() {
	        if (marks >= 40) {
	            System.out.println("Result: PASS");
	        } else {
	            System.out.println("Result: FAIL");
	        }
	    }
	
	

}
