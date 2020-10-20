package OOP.MathMethod;
import java.util.Scanner;

class MyClass{
    private static Scanner input;
    public static void main(String[] args) {

        double length, width;
        input = new Scanner(System.in);

        System.out.println("enter the value of length : ");
        length = input.nextDouble();

        System.out.println("enter the value of width : ");
        width = input.nextDouble();

        Rectangle r = new Rectangle(length,  width);
        r.returnArea();
        r.returnCircumference();

        System.out.println("Area is : " + r.returnArea());
        System.out.println("Circumference is : " + r.returnCircumference());
    }
}