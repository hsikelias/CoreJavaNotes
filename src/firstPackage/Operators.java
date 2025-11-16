package firstPackage;

public class Operators {
  public static void main(String[]args){
    double i = 10;
    double j = 20;
    
    // Arithmetic Operators
    System.out.println(i + j);
    System.out.println(i - j);
    System.out.println(i * j);
    System.out.println(i / j);
    System.out.println(i % j);

    // Unary Operators
    System.out.println(i); //10
    System.out.println(++i); //Pre Increment, 11
    System.out.println(i++); //Post Increment 11
    System.out.print(i);  //12

    System.out.println(i); //10
    System.out.println(--i); //Pre Decrement, 11
    System.out.println(i--); //Post Decrement 11
    System.out.print(i);  //12

    // Relational Operators
    System.out.println(i==j);
    System.out.println(i!=j);
    System.out.println(i<j);
    System.out.println(i>j);
    System.out.println(i<=j);
    System.out.println(i>=j);

    // Conditional Operators

    System.out.println(i < j || i==j);
  } 
}
