public class BankAccount{

  private double balance;
  private int accountID;
  private String password;


  //  1. A constructor: Should accept values for accountID and password, the
  //  balance should be set to 0.

  public BankAccount(int ID, String pass){
    balance = 0;
    accountID = ID;
    password = pass;
  }

  // 2. get methods for balance, accountID. (just return the value!)

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  // 3. set method for password

  public void setPassword(String newPass){
    password = newPass;
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
      balance += amount;
      return (amount >= 0);
    }
    else{
      return (amount >= 0);
    }
  }

   // 4b. Method to withdraw money from the account.
   // public boolean withdraw(double amount){... }

   // DISPUTED RULES:

   // When the amount is non-negative subtract it from the balance and
   // return true if it was successful,false otherwise.

   // /*Only when amount is positive and the amount does not exceed the balance

   public boolean withdraw(double amount){
     if( (getBalance() >= amount) && (amount>=0) ){
       double reference = getBalance() - amount;
       balance = getBalance() - amount;
       return(balance == reference);
     }
     else{
         return false;
       }
   }

   // 5. A toString() method that shows us the AccountID and balance
   // in the format:   "ID\tBALANCE" e.g. "5213452\t99.423"

   // /*Return a String to be used to display the account data. "ACCOUNT\tBALANCE" */
   //  public String toString(){...}
   //

   public String toString(){
     return (
     accountID + "\t" + Double.toString(balance)
     );
   }

   /////////////////////////////////////////////////////////////////////////////
   // 2020-10-29

  // This private method will allow internal methods to check the password easily
  // Determine if the password in the object is the same as the parameter.
  // *@param password to be checked against the object's password (remember the distinction between this.x and x)
  // @return true if the passwords are the same, false otherwise.

  private boolean authenticate(String pass){
    return (this.password.equals(pass));
  }

  // *Transfer money from this BankAccount to the other only when the password matches, and the withdrawal succeeds.
  // *@param other which BankAccount to GIVE the money to
  // *@param amount how much money to transfer, negative amounts will make this operation fail.
  // *@param password to be checked against the source account, incorrect password will make this operation fail.
  // *@return true if money is successfully transfered, false otherwise.

  public boolean transferTo(BankAccount other, double amount, String password){
    if((withdraw(amount) == true) && (authenticate(password)==true) && (amount>=0)){
      other.balance = other.balance + amount;
      return true;
    }
    else return false;
  }

}
