package OOP.StaticKeyword;

public class MyClass {

    public static int a = 12;     // Needn't to create object
    public static int b = 14;
    public static int c;

    public static void sum() {
        c = a + b;
        System.out.println(c);
    }
}
