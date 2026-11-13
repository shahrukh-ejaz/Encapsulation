package encapsulation1;

public class StudentDriver {
	public static void main(String[] args) {
		
	Student s1 = new Student(101, "Rahul", 85);
	
	Student s2 = new Student(102, "srk", 35);
	
	
	
	 s1.displayStudent();
     s1.checkResult();

     System.out.println("----------------");

     s2.displayStudent();
     s2.checkResult();

     System.out.println("----------------");

     s1.setMarks(150);

     System.out.println("After updating marks:");

     s1.displayStudent();
 }
}



