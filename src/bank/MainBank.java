package bank;

import bank.BankingOperations;

public class MainBank {

    public static void main(String[] args) {

        BankingOperations bOperations = new BankingOperations();
        System.out.println("AccountBalance " + bOperations.getBalance(9850));
        System.out.println("Deposit " + bOperations.deposit(9850, 1000));
        System.out.println("Withdraw " + bOperations.withdraw(9850, 9000));
        System.out.println(bOperations.isChequingAccount(9850));
    }

}
