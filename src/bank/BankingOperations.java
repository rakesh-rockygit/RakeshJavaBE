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

  public double deposit(int account, double amount) { // addition to the current balance
    currentBalance = currentBalance + amount;
    return currentBalance;
  }

  public double withdraw(int account, double amount) { // substraction to the current balance
    // conditional statement
    if (isChequingAccount(account) || currentBalance <= (amount - 100)) {
      currentBalance = currentBalance - amount;
    } else {
      System.out.println("sufficient balance" + currentBalance);
    }
    return currentBalance;
  }

  public boolean isChequingAccount(int account) {
    return true;
  }

}
