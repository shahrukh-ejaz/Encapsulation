package encapsulation3;

public class BankDriver {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(10001, "Shahrukh", 10000);
		
		BankService  service = new BankService();
		
		service.displayBalance(account);
		
		System.out.println("\nDepoditing money..");
		service.deposit(account,  5000);
		
		System.out.println("\nWithdrawing money...");
		
		service.withdraw(account, 3000);
		
		System.out.println("\nTrying invalid withdrawal..");
		
		service.withdraw(account, 20000);
		
		System.out.println("\nFinal account details: ");
		
		service.displayBalance(account);
		
		service.displayTransactions();
		
		
		
	}
}
