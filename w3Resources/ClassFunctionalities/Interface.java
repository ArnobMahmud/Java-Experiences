package w3Resources.ClassFunctionalities;

// Interface
interface Animal {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Cat "implements" the Animal interface
class Cat implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The cat says: mew mew");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Interface {
    public static void main(String[] args) {
        Cat myCat = new Cat(); // Create a Pig object
        myCat.animalSound();
        myCat.sleep();
    }
}

// Another way to achieve abstraction in Java, is with interfaces.

// An interface is a completely "abstract class" that is used to group related
// methods with empty bodies: