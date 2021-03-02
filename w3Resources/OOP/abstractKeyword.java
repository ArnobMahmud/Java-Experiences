package w3Resources.OOP;

abstract class myClass {

    public String fname = "John";
    public int age = 24;

    public abstract void study(); // abstract method

}

// Subclass (inherit from myClass)
class Student extends myClass {
    public int graduationYear = 2018;

    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}

// An abstract method belongs to an abstract class, and it does not have a body.
// The body is provided by the subclass: