package firstPackage;

import java.util.Scanner;

public class Conditionals{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    EvenOrOdd(scanner); // this is a much smarter approach for using scanners in multiple methods. Declare a main scanner in main method and provide parameters to provide which scanner to use and then in the method statement declare that u expect a scanner to be used and its name. 
    gradeSystem(scanner);
    days(scanner);
    scanner.close();
  }

  public static void EvenOrOdd(Scanner scanner){
    System.out.println("Enter the number you want to check if its odd or even: ");
    int input = scanner.nextInt();
    if (input%2 ==0){
      System.out.println("Given number is even");
    }
    else {
      System.out.println("Given number is odd");
    }
  }

  public static void gradeSystem(Scanner scanner){
    System.out.println("Enter your grade: ");
    int grade = scanner.nextInt();
    if (grade >= 35){
      if (grade > 85){
        System.out.println("Student secured first class");
      }
      if (grade > 70 && grade <= 85){
        System.out.println("Student secured second class");
      }
      if (grade > 35 && grade <= 70){
        System.out.println("Student secured third class");
      }
      if (grade == 35){
        System.out.println("Student passed");
      }
      else{
        System.out.println("Student failed");
      }
    }
    else{
      System.out.println("Student failed");
    }
  }

  public static void days(Scanner scanner){
    scanner.nextLine(); // This consumes the left /n from the previous nextInt
    System.out.println("Enter the day:");
    String day = scanner.nextLine();

    if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
      System.out.println("Yayy It's a weekend");
    }
    else {
      System.out.println("Uff, it's a weekday");
    }
  }
}



/* 
public class Conditionals {
  public static void main(String[] args) {
    int i = 10;
    if (i<0) {
      System.out.println("Given number is a negative number");
    }
    else{
      System.out.println("Given number is a positive number");
    }
  }
}
*/