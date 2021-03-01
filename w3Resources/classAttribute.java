package w3Resources;

public class classAttribute {

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {

        classAttribute myObj = new classAttribute();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }
}
