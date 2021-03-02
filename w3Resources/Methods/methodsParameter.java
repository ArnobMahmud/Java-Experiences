package w3Resources.Methods;

public class MethodsParameter {
    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }
}
