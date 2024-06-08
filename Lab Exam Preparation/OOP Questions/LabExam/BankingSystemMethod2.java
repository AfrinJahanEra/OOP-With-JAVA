import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// Define Account class (abstract)
abstract class Account {
    private String accountNumber;
    protected double balance;
    protected double interestRate;
    protected double minBalance;
    protected double transactionLimit;

    // Constructor
    public Account(String accountNumber, double initialBalance, double interestRate, double minBalance, double transactionLimit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
        this.minBalance = minBalance;
        this.transactionLimit = transactionLimit;
    }

    // Abstract methods
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }
}

// Define SavingsAccount class
class SavingsAccount extends Account {
    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance, 0.10, 1000, 5000);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minBalance && amount <= transactionLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds or Transaction Limit Exceeded");
        }
    }
}

// Define CurrentAccount class
class CurrentAccount extends Account {
    // Constructor
    public CurrentAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance, 0.05, 500, 2000);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= transactionLimit) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds or Transaction Limit Exceeded");
        }
    }
}

public class BankingSystemMethod2 {
    public static void main(String[] args) {
        // Create accounts for Bob and Alice
        SavingsAccount bobAccount = new SavingsAccount("SA1001", 1000);
        CurrentAccount aliceAccount = new CurrentAccount("CA2001", 500);

        // Perform transactions for Bob
        performTransaction(bobAccount, "Bob", "Deposit", 2000);
        performTransaction(bobAccount, "Bob", "Withdraw", 500);
        performTransaction(bobAccount, "Bob", "Deposit", 1000);
        performTransaction(bobAccount, "Bob", "Withdraw", 3000);
        performTransaction(bobAccount, "Bob", "Withdraw", 2000);

        // Perform transactions for Alice
        performTransaction(aliceAccount, "Alice", "Deposit", 5000);
        performTransaction(aliceAccount, "Alice", "Withdraw", 600);
        performTransaction(aliceAccount, "Alice", "Deposit", 1500);
        performTransaction(aliceAccount, "Alice", "Withdraw", 2500);

        // Calculate interest for Bob and Alice
        calculateInterest(bobAccount, "Bob");
        calculateInterest(aliceAccount, "Alice");
    }

    // Perform a transaction and log it
    private static void performTransaction(Account account, String name, String type, double amount) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Transactions.txt", true))) {
            if (type.equals("Deposit")) {
                account.deposit(amount);
                writer.write(name + " Deposit " + amount);
            } else if (type.equals("Withdraw")) {
                account.withdraw(amount);
                writer.write(name + " Withdraw " + amount);
            }
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Calculate and display interest earned
    private static void calculateInterest(Account account, String name) {
        double interestEarned = account.getBalance() * account.getInterestRate();
        System.out.println(name + "'s Interest Earned: $" + interestEarned);
    }
}
