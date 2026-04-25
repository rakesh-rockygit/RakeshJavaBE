package BankAccount;

public class Account {
    // varaibles

    int number;
    int amount;
    String name;
    double accountno;
    double getbalance;

    public static void main(String[] args) { // objects or properties

        Account account1 = new Account(10000);
        account1.number = 10;
        account1.amount = 15000;
        account1.name = "rocky";
        account1.accountno = 9850768;

    }

    private int getbalance(int amount) { // methods or behaviours

        return (amount);

    }

    public Account(int getbalance) { // constructor

        System.out.println("Total balance" + getbalance);
    }

}
