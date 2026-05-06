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
        this.balance = amount;

    }

    public String withdraw(double amount){
        if (amount <= this.balance){
            return "enough balance";
        }
            else {
                return "error";

            }

    public String getSummary() {

        return " deposits received :" + deposit +
                "withdrawal amount :" + withdraw +
                "insufficient bal :" + insufficient;

    }

    public static void main(String[] args) {

        BankAccountClass ba1 = new BankAccountClass("raju", "10493", 50000);

        System.out.println(ba1.getSummary());

    }

}
