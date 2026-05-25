package bank;

import bank.BankingOperations;

public class MainBank {

    public static void main(String[] args) {

        BankingOperations bOperations = new BankingOperations();
        System.out.println(bOperations.getBalance(9850));
    }

}
