package firstPackage;
public class Dog {
    public String breed = "German Shepard";  // This is how u can create a variable
    public int height = 30;
    public int weight = 35;

    public static void main(String[] args) { // shortcut is to use main and hit ctrl + space
        System.out.println("Hello World");
        // To access the variable we created we need to create objects.
        // First class name, variable name, new key word, Constructor(constructor name is class name with the ())
        Dog dog = new Dog();  // So now we have dog holding variables of the class Dog.. with help of object we can access these variables.
        // dog.breed, dog.height, dog.weight
        System.out.println(dog.breed);
    }
}
