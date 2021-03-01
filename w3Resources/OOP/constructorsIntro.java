package w3Resources.OOP;

public class constructorsIntro {
    int x; // Create a class attribute

    // Create a class constructor for the constructorsIntro class
    public constructorsIntro() {
        x = 7;  // Set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        constructorsIntro myObj = new constructorsIntro(); // Create an object of class constructorsIntro (This will call the constructor)
        System.out.println(myObj.x);  // Print the value of x
    }
}

// Outputs 7