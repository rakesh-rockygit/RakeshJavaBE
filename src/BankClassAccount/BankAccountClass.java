package BankClassAccount;

public class BankAccountClass {
    String owner;
    String accountNumber;
    double balance;

    public BankAccountClass(String owner, String accountNumber, double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;

    }

    public void deposit(double amount) {
        this.balance += amount;

    }

    public String withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return "sufficient balance";
        } else {
            return "error : insufficient balance";
        }
    }

    public String getSummary() {

        return " owner name :" + owner +
                " account number is :" + accountNumber +
                "balance in account :" + balance;

    }

    public static void main(String[] args) {

        BankAccountClass ba1 = new BankAccountClass("raju", "10493", 50000);

        ba1.deposit(10000);
        System.out.println(ba1.getSummary());
        System.out.println(ba1.withdraw(70000));

    }

}