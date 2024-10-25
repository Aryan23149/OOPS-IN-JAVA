class BankAccount {
    // Private attributes
    private String accountHolder;
    private double balance;
    
    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }
    
    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    
    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    
    // Getter method to view balance
    public double getBalance() {
        return balance;
    }
    
    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }
}

public class twogpt {
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount("Alice", 1000);
        
        // Accessing balance through getter method
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());
        
        // Depositing money
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        // Withdrawing money
        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

