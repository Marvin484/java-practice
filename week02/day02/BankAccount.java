package week02.day02;

public class BankAccount {
    private double balance;
    private String owner;

    public BankAccount() {
        this.balance = 0;
        this.owner = "";
    }

    public BankAccount(String owner, double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
        this.owner = owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount cannot be negative.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bob", 500.0);

        System.out.println("");
        System.out.println("Owner: " + account.getOwner());
        System.out.println("Account balance: " + account.getBalance());

        account.deposit(200.0);
        System.out.println("Account balance: " + account.getBalance());

        account.withdraw(30.0);
        System.out.println("Account balance: " + account.getBalance());

        account.withdraw(2000.0);

        System.out.println("Account balance: " + account.getBalance());
        System.out.println("");
    }

}
