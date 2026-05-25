package bank;

import bank.BankingOperations;

public class MainBank {

    public static void main(String[] args) {

        BankingOperations bOperations = new BankingOperations();
        System.out.println(bOperations.getBalance(985));
        System.out.println(bOperations.deposit(9850, 9000));
        System.out.println(bOperations.withdraw(98, 5000));
    }

}
