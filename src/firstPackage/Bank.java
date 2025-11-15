package firstPackage;

public class Bank {
  static int currentBalance = 1000;
  public static void main(String[] args) {
  Bank bank = new Bank();
  greetCustomer();
  System.out.println("current balance is: "+bank.getCurrentBalance());
  bank.deposit(500);
  System.out.println("current balance is: "+bank.getCurrentBalance());
  withdrawal(300);
  }

  public static void greetCustomer(){
  // use void when returning any data type
  // below is the method body
  System.out.println("Hello, How are you");
  }

  public void deposit(int amount){
  // here the customer inptus money amount to deposit, if any method works on an input we need to use parameters.
    currentBalance = currentBalance + amount;
    System.out.println("Amount deposited successfully!");

  }

  public static void withdrawal(int amount){
    currentBalance = currentBalance - amount;
    System.out.println("Amount withdrawn succesfully!");
  
  }

  public int getCurrentBalance(){
    // no inputs only returning values. 
    return currentBalance;

  }

}
