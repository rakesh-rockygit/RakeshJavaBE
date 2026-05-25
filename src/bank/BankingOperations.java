package bank;

public class BankingOperations {

  /*
   * Account
   * Name
   * AccountNumber
   * Address
   * Balance
   * Branch
   * Name
   * Address
   * BranchCode
   * Credit
   * Debit
   * Withdrawals
   * Deposits
   */

  private double currentBalance = 10000.00;

  public double getBalance(int account) { // reading BankingOperations //
    return currentBalance;
  }

  public void deposit(int account, double amount) { // addition to the current balance
    currentBalance = currentBalance + amount;
  }

  public void withdraw(int account, double amount) { // substraction to the current balance
    currentBalance = currentBalance - amount;
  }
}
