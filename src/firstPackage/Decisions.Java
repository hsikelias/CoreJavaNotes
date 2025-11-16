package firstPackage;
import java.util.Scanner;
public class Decisions{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    EvenOrOdd(input);
    input.close();
  }

  public static void EvenOrOdd(Scanner input){
    System.out.println("Enter a number to check if its odd or even");
    int number = input.nextInt();
    int answer = number%2;

    switch(answer){
      case 0:
        System.out.println("Entered number is even");
      break;

      case 1:
        System.out.println("Entered number is odd");
      break;
    }
  }
  
}


/*
    
public class Decisions {
  public static void main(String[]args){
    int i = 1;     // use switch when making decisions based on a value. s
    switch(i) {
      int j = 10;
      case 1:
        // statements
        System.out.println("This is the first statement");
      break; // this is needed to make individual value decisions without any errors, or you dont want to go further with verification. 

      case 2:
        System.out.println("This is the second statement");

      break;

      case 3:
        System.out.println("This is the third statement");
      break;

      default:    // If we dont include default we wont be able to decide what happens if something other than what we said happens. 
        System.out.println("This is the default statement");
      
      break;

      case 4:
      case 5:
      System.out.println("This is the fourth or fifth statement");
      break;
      // You can do this if your cases give same result. 
    }
  }
}
*/