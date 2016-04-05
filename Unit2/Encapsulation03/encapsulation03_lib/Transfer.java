package encapsulation03_lib;

public class Transfer {
  Account sourceAccount;
  Account destinationAccount;

  public Transfer(Account sourceAccount, Account destinationAccount) {
    this.sourceAccount = sourceAccount;
    this.destinationAccount = destinationAccount;
  }
//account deposit and withdraw
  public void transfer(int amount) {
    // sourceAccount.balance -= amount;
    sourceAccount.withdraw(amount);
    // destinationAccount.balance += amount;
    destinationAccount.deposit(amount);
  }
}
