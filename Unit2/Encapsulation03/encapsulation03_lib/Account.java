package encapsulation03_lib;

public class Account {
  private int balance;

  public int [] transactions = new int [10];
  private int index = -1;

  public int balance(){
    balance = 0;
    for (int i = 0; i < transactions.length; i++) {
      balance += transactions[i];
    }
    return balance;
  }

  public int deposit(int amount){
    index += 1;
    transactions[index] = amount;
    return balance;
  }

  public int withdraw(int amount){
    index += 1;
    amount = amount - amount * 2;
    transactions[index] = amount;
    return balance;
  }

}



// there's an internal private Array field called transactions
// NOTE: for now just hardcode it to be 10 items long
// deposit() should insert a positive integer
// NOTE: you can't push into an array, so keep track of the last index with a private index variable
// withdraw() should insert a negative integer
// balance() should return the sum of all of the elements in the array
