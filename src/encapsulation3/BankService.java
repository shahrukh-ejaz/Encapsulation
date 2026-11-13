package encapsulation3;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    private List<Transaction> transactions = new ArrayList<>();

    public void deposit(BankAccount account, double amount) {

        if (amount > 0) {

            double newBalance = account.getBalance() + amount;

            account.setBalance(newBalance);

            Transaction transaction = new Transaction("DEPOSIT", amount);

            transactions.add(transaction);

            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(BankAccount account, double amount) {

        if (amount > 0 && amount <= account.getBalance()) {

            double newBalance = account.getBalance() - amount;

            account.setBalance(newBalance);

            Transaction transaction = new Transaction("WITHDRAW", amount);

            transactions.add(transaction);

            System.out.println("Withdrawal successful!");

        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance(BankAccount account) {

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: " + account.getBalance());
    }

    public void displayTransactions() {

        System.out.println("===== TRANSACTION HISTORY =====");

        for (Transaction transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}