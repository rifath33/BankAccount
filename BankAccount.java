public class BankAccount{

  private static double balance;
  private static int accountID;
  private static String password;


//  1. A constructor: Should accept values for accountID and password, the
//  balance should be set to 0.

  public BankAccount(int accountID, String password){
    BankAccount.balance = 0;
    BankAccount.accountID = accountID;
    BankAccount.password = password;
  }


// 2. get methods for balance, accountID. (just return the value!)

  public double getBalance(){
    return BankAccount.balance;
  }

  public int getAccountID(){
    return BankAccount.accountID;
  }


// 3. set method for password

  public void setPassword(String newPass){
    BankAccount.password = newPass;
  }

  public String getPassword(){
    return BankAccount.password;
  }


// 4a. A method to deposit money into the account.
//   public boolean deposit(double amount){...}
//   It should accept an amount of money.
//
//  When the amount is non-negative increase the account balance by that much,
//  return true.
//
//  When the argument given is a negative you should leave the balance
//  unchanged and return false.

  public boolean deposit(double amount){
    if(amount >= 0){
      BankAccount.balance = BankAccount.balance + amount;
      return true;
    }
    else{
      return false;
    }
  }

/*
   4b. Method to withdraw money from the account.
   public boolean withdraw(double amount){... }

    This will not be successful if the balance is too low,
    or the amount is negative. In these cases do not change the balance.

    When the amount is non-negative subtract it from the balance and
    return true if it was successful,false otherwise.

    5. A toString() method that shows us the AccountID and balance
    in the format:   "ID\tBALANCE" e.g. "5213452\t99.423"

    6. A main method (in a separate driver file) to test your code.
*/

}

/*
  Since withdraw and deposit return booleans, we can use them as follows:
  (maybe add the balance so you see the updated value):

  if( var.withdraw(1000) ){
            println("Withdrawal success!");
       }else{
            println("Withdrawal failure");
       }

*/
