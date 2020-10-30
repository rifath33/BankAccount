public class Tester{
  public static void main(String[] args){

    BankAccount Rifath = new BankAccount(218964815, "haha");

    BankAccount Bekim = new BankAccount(54, "kutha");

    System.out.println(Rifath.transferTo(Bekim, 14, "haha"));

    Rifath.deposit(14);

    System.out.println(Rifath.toString());

    System.out.println(Rifath.transferTo(Bekim, 14, "haha"));

    System.out.println(Bekim.toString());

    System.out.println(Rifath.toString());



  }
}
