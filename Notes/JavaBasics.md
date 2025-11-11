## Java Background

### Who/What is Java?
Java is an object-oriented programming language designed to develop all 
kind of applications like mobile,web and desktop.

Java was invented in 1991 but the first version of java was released in 1996 by Sun MicroSystems.
James Gosling created Java and its currently being maintained by Oracle Corporation.
The name Java is inspired by the java coffee beans, strong coffee = strong programming language.

### Advantages/Disadvantages of Java
- Simple Language
- Object-Oriented, designed to develop any sort of application
- Platform-independent, no neet to worry about OS
- Distributed, you can divide between different servers etc
- Secure, you can give permissions to see which class can be seen or not.
- Robust, easy to extend an application in the future. 
- UI is the only problem with Java, proper logic and everything but lacks here

### Different technologies in Java

**Java SE**: Java Standard Edition, this edition can be used for building standalone applications

**Java EE**: Java Enterprise Edition, used a lot in e-commerce, banking

**Java SE**: Java Micro Edition, this is used to build mobile related, embedded system like bank/coffee machines.

### What is Core Java?
Just focused on CORE programming, it's the actual java programming ,and it is for any kind of 
application development. It is also used in software testing field, mostly in automation.

### What is the Java Development Kit?

Java Development Kit (JDK) is a cross-platform software development kit that provides tools and libraries needed to build Java-based applications and applets. It works together with the JVM (Java Virtual Machine) and JRE (Java Runtime Environment) as part of the core Java setup.

- The JDK includes everything required for Java development — compilers, debuggers, and other essential tools.
- Beginners often get confused between JRE and JDK.
- If you only want to run Java programs, installing JRE is enough.
- But if you want to develop Java applications, you’ll need the JDK, which includes the JRE and additional development tools.


A folder/package/container holds all the Java files, you can and you should have multiple packages as per the complexity of the project. A java package should be all **lowercase**. This is NOT a rule but it is a convention.

Inside the packages are our Java classes, Java classes start with a Upper case and don't have any spaces, because java does not allow it. `GrossPayCalculator`

```java
package gross_calculator;  //If our class is under a package, which it is we must first declare it

// Next is the class declaration with curly braces. 
public class GrossPayCalculator {  
}
```

{ } indicates a code block, anything inside these belong to that class

Inside the class, we must now declare a method. In order to run any code inside a java class, it must be inside a method.

```java
public static void main(String[] args) {  
  // the name of the method is main
}
```

```java 
package gross_calculator;  
  // So we have a java class that contains a method with one statement
public class GrossPayCalculator {  
    public static void main(String[] args) {  
        System.out.println("Hello World");  
    }
}
```

words like package, public, class, static are **reserved words**, we cannot name something with these names because they're reserved. There are many reserved words in Java.


## Creating Variables

Variables are like a memory location that stores all sorts of data; numbers, string, Boolean value
in Java you need to specify the data type when creating a variable.

##### Primitive data types:

- int (`int hours = 40;`)
- double (`double pay = 25.23;`)
- byte(`byte b = 100;`)
- short(`short s = 10000;`)
- long(`long l = 9999999`)
- float(`float f = 123.4f;`)
- boolean(`boolean b = true;`)
- char(`char c = 'C';`)

The difference between byte, short, int, long is their size. byte is 8-bit, short is 16-bit, int is 32-bit, long is 64-bit.  So, bytes largest number it can hold is 256, the long data type can hold a lot more than we usually need.

difference between float and double, when u use float for a  variable it can hold up to 7 decimal digits, whereas double is more precise because it can hold 16 decimal digits.


Java is a **static programming language** not **Dynamic**, in dynamically typed languages like JavaScript, Variable types are determined at runtime through context in the code, so you don't need to specify the data type to run a program. But, Java is the opposite, you need to declare the data type before the program can be compiled.

``` java
public class GrossPayCalculator {  
    public static void main(String[] args) {  
        int hours = 40;  
        double payRate = 25.50;  
        double salary = hours * payRate;  
        System.out.printf("Gross pay: "+salary);  
    }}
```

##  Local Variable Type Inference

Java although is a static programming language it offers this feature where we can declare a variable as `var` and Java will infer the data type based on what is assigned to it.
So, instead of using `boolean isWaterWet;`, we can use `var isWaterWet = true;`

But Type inferences do have limitations, like the type inferences can be used only for local variables.
Local variables are variables that are declared within a method. You can NOT declare it in the global level, meaning under a class it should be under its method.

## Variable Naming

Best practice is to always start with lower case and use camelCase,
Some hard rules in naming variables are:
- No spaces
- Can contain numbers but can't start with one(1hour is not ok but hour1 is)
- Can contain special characters like _ but not -
- Cannot use reserved words like class

## Modifying  Variables:

Instead of hard coding our variables we can make the user change it based on their needs,  
to read data from the user we need to use a scanner class.

```java
import scanner //importing scanner class
Scanner scanner = new Scanner(System.in); //declaring scanner class
scanner close(); //exiting scanner 
```

## Arithmetic Operators

+  + to add two numeric values
+ - to subtract one numeric from another
+ * multiply two numeric values
+ / divides one numeric value by another
+ % returns the remainder of dividing one numerator by another


## Decision Statements

**If-Statements**
