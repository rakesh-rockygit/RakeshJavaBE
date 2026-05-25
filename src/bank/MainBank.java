package bank;

import bank.BankingOperations;

public class MainBank {

    public static void main(String[] args) {

        BankingOperations bOperations = new BankingOperations();
        System.out.println("AccountBalance " + bOperations.getBalance(985));
        System.out.println("Deposit " + bOperations.deposit(9850, 9000));
        System.out.println("Withdraw " + bOperations.withdraw(98, 5000));
    }

}
