package OOP.SuperKeyword;

public class SubClass extends MyClass {
    
    public void Sum() {

        super.Sum();

        int x = 2;
        double y = 3;
        double z = x * y;
        System.out.println("Sum from Class "+ z);
    }
}
