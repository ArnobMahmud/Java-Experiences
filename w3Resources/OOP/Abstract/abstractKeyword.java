package w3Resources.OOP.Abstract;

public class abstractKeyword {
    public static void main(String[] args) {

        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}


//An abstract method belongs to an abstract class, and it does not have a body. The body is provided by the subclass: