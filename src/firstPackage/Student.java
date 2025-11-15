package firstPackage;

public class Student {
  // Instance variables( Non Static)
  int id = 101; // we call this as an instance variable because only if we create an object for it we can use it in methods. Else we can NOT make a static reference to the non-static field id

  static int id2 = 1001;
  public static void main(String[] args) {
  // class name variable name = new key word Constructor();  
    Student Student = new Student();
    System.out.println(Student.id);
    System.out.println(id2);
    test1(70, 79); //Initializing 
  }

  public static void test1(int height, int weight){
    height = 71;
    weight = 80;
    System.out.println(height + weight);
  }
}


