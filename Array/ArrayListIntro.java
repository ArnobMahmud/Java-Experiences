package Array;
import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println(num.size());

        num.add(10);
        num.add(20);
        num.add(50);
        num.add(70);
        num.add(90);
        num.add(100);

        for (Integer x : num) {
            System.out.println(x);
        }
    }
}
