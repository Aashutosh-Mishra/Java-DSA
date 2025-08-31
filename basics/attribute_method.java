import java.util.*;

class BankAccount {
    private String name;     // attribute: name of account holder
    private double balance;  // attribute: balance amount

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to make a deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to make a withdrawal
    public boolean withdrawal(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient amount");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
        return true;
    }
}

public class attribute_method {
    public static void main(String[] args) {
        // Create an account
        BankAccount acc = new BankAccount("Alice", 5000);

        // Display initial details
        System.out.println("Account Holder: " + acc.getName());
        System.out.println("Initial Balance: " + acc.getBalance());

        // Deposit money
        acc.deposit(2000);

        // Withdraw money
        acc.withdrawal(3000);

        // Try withdrawing more than balance
        acc.withdrawal(5000);

        // Display final balance
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
