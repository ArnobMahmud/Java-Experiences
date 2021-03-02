package w3Resources.OOP;

public class ClassAttribute {

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {

        ClassAttribute myObj = new ClassAttribute();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }
}
