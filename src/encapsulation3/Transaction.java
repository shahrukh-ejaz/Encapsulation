package encapsulation3;

import java.time.LocalDateTime;

public class Transaction {
	private String transactionType;
	private double amount;
	private LocalDateTime transactionTime;
	
	
	public Transaction(String transactionType, double amount) {
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionTime = LocalDateTime.now();
	}
	
	public void displayTransaction() {
		System.out.println("Type: "+ transactionType);
		System.out.println("Amount: "+ amount);
		System.out.println("Time: "+ transactionTime);
		System.out.println("----------");
	}
	
}
