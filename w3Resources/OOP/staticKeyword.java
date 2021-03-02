package w3Resources.OOP;

public class staticKeyword {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        staticKeyword myObj = new staticKeyword(); // Create an object of staticKeyword
        myObj.myPublicMethod(); // Call the public method
    }
}


// A static method means that it can be accessed without creating an object of the class, unlike public: