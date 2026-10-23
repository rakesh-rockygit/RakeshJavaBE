package bank;

import bank.BankingOperations;

public class MainBank {

    public static void main(String[] args) {

        BankingOperations b1Operations = new BankingOperations();
        System.out.println("AccountBalance " + b1Operations.getBalance(9851));
        System.out.println("Deposit " + b1Operations.deposit(9851, 1000));
        System.out.println("Withdraw " + b1Operations.withdraw(9851, 9000));
        System.out.println(b1Operations.isChequingAccount(9851));

    }

}
