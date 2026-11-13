package encapsulation3;

public class BankAccount {
	private long accountNumber;
	private String accountHolder;
	private double balance;
	
	public BankAccount(long accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
		if(balance >=0) {
			this.balance=balance;
		}
	}

	public long getAccountNumber() {
		return accountNumber;
	}


	public String getAccountHolder() {
		return accountHolder;
	}

	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance >=0) {
			this.balance=balance;
		}
	}



	
	

}
