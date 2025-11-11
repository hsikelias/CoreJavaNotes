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
        System.out.println(Short.SIZE/8); // 16 bits or 2 bytes of information
        System.out.println(Float.SIZE/8);
        System.out.println(Character.SIZE/8);

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}

