public class Tester{
  public static void main(String[] args){

    BankAccount Rifath = new BankAccount(218964815, "haha");

    System.out.println(Rifath.getBalance());

    System.out.println(Rifath.getAccountID());

    System.out.println(Rifath.getPassword());

    Rifath.setPassword("kutha");

    System.out.println(Rifath.getPassword());

    Rifath.deposit(1590);

    Rifath.withdraw(15.91);


    System.out.println(Rifath.toString());

  }
}
