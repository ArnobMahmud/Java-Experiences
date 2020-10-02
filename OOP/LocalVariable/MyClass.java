package OOP.LocalVariable;

public class MyClass {

    public double ins;
    public void sum() {
        double x = 12.7;
        double y = 45.6;
        this.ins = x;
        
        double sum = x / y;
        System.out.println(sum);
    }
}
