package encapsulation2;

public class SalaryCalculator {
	public double calculateHRA(double basicSalary) {
		return basicSalary * 0.20;
		
	}
	
	 public double calculateDA(double basicSalary) {
	        return basicSalary * 0.10;
	    }

	    public double calculateBonus(double basicSalary) {
	        return basicSalary * 0.05;

}
	    
	    public double calculteMonthlySalary(double basicSalary) {
	    	double hra = calculateHRA(basicSalary);
	    	double da = calculateDA(basicSalary);
	        double bonus = calculateBonus(basicSalary);
	        
	        return basicSalary + hra + da + bonus;
	    }
	    
	    private double calculateAnnualSalary(double monthlySalary) {
	    	return monthlySalary*12;
	    }
	    
	    public void displaySalaryDetails(double basicSalary) {
	    	double hra = calculateHRA(basicSalary);
	        double da = calculateDA(basicSalary);
	        double bonus = calculateBonus(basicSalary);

	        double monthlySalary = calculteMonthlySalary(basicSalary);
	        double annualSalary = calculateAnnualSalary(monthlySalary);
	        
	        System.out.println("Basic Salary: " + basicSalary);
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("Bonus: " + bonus);
	        System.out.println("Monthly Salary: " + monthlySalary);
	        System.out.println("Annual Salary: " + annualSalary);
	    	
	    }
}