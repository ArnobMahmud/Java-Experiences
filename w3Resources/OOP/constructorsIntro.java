package w3Resources.OOP;

public class ConstructorsIntro {
    int x; // Create a class attribute

    // Create a class constructor for the constructorsIntro class
    public ConstructorsIntro() {
        x = 7;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        ConstructorsIntro myObj = new ConstructorsIntro(); // Create an object of class constructorsIntro (This will call the constructor)
        System.out.println(myObj.x);  // Print the value of x
    }
}

// Outputs 7