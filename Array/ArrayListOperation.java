package Array;
import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList <Integer> num = new ArrayList <Integer> ();

        num.add(2);
        num.add(5);
        num.add(11);
        num.add(19);
        num.add(23);

        System.out.println(num);

        num.clear();
        System.out.println(num);
        
        boolean check = num.isEmpty();
        System.out.println(check);
    }
}
