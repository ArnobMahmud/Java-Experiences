package OOP.ThisKeyword;

public class MyClass {
    public int a = 12;
    public int b = 17;
    public int c;

    public void multiply() {
        this.c = this.a * this.b;
        System.out.println(this.c);
    }
}
