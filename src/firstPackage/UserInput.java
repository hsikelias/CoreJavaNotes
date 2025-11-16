package firstPackage;

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int age = 0;
  try{
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.printf("Hey %s, How are you? \n", name);
    String status = scanner.nextLine();
    System.out.println("What is your age?");
    age = scanner.nextInt();
    System.out.println("Thank you for the information");
    } finally {
      System.out.println(age); //prints user entered number
      scanner.close(); // we can close scanner once its task is done. 
    }
  }
}
