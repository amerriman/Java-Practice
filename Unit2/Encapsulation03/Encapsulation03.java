// package galvanize;

import encapsulation03_lib.*;

class Encapsulation03 {
  public static void main(String[] args){
    Account sourceAccount = new Account();
    Account destinationAccount = new Account();

    // sourceAccount.balance = 500;
    sourceAccount.deposit(500);

    // destinationAccount.balance = 750;
    destinationAccount.deposit(750);

    System.out.println(sourceAccount.balance() + " Inital SA balance");
    System.out.println(destinationAccount.balance() + " Inital DA balace");

    Transfer t = new Transfer(sourceAccount, destinationAccount);
    t.transfer(250);

    System.out.println(sourceAccount.balance());
    System.out.println(destinationAccount.balance());
    // System.out.println(sourceAccount.transactions[0], sourceAccount.transactions[1]);
  }
}
