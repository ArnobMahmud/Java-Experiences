package OOP.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        MyClass object = new MyClass();

        object.setName("Arnob Mahmud");
        object.setAge(20);

        System.out.println("Name : " + object.getName());
        System.out.println("Age : " + object.getAge());
    }
}
