package BankAccount;

public class Account {
    // varaibles

    int number;
    int amount;
    String name;
    double withdraw;
    double accountno;
    double balance;
    double getbalance;

    public static void main(String[] args) { // objects or properties

        Account account1 = new Account(10000);
        account1.number = 10;
        account1.amount = 15000;
        account1.name = "rocky";
        account1.accountno = 9850768;
        account1.withdraw = 9000;

        System.out.println("accountno" + account1.number);

    }

    private double withdraw(int amount, String name) { // methods or behaviours

        return (amount - withdraw);

    }

    public double withdraw(int amount) { // constructor

        System.out.println("Total amount" + withdraw);
    }

    public Account(int getbalance) { // constructor

        System.out.println("Total balance" + getbalance);
    }

}
