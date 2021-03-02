package w3Resources.OOP.Inheritance;

public class inheritClass extends myClass {

    private String modelName = "Mustang"; // Car attribute

    public static void main(String[] args) {

        // Create a myCar object
        inheritClass myCar = new inheritClass();

        // Call the honk() method (from the myClass class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the myClass class) and the
        // value of the modelName from the inherit class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

// Java Inheritance (Subclass and Superclass)
// In Java, it is possible to inherit attributes and methods from one class to
// another. We group the "inheritance concept" into two categories:

// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from
// To inherit from a class, use the extends keyword.

// In the example below, the Car class (subclass) inherits the attributes and
// methods from the Vehicle class (superclass):