/*
    Author : Arnob Mahmud

    Mail : arnob.tech.me@gmail.com
*/

package Array;

import java.util.ArrayList;

public class ArrayListOperation {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(2);
        num.add(5);
        num.add(11);
        num.add(19);
        num.add(23);

        System.out.println(num);

        System.out.println(num.indexOf(23));

        boolean check1 = num.contains(20);
        System.out.println(check1);

        num.clear();
        System.out.println(num);

        boolean check2 = num.isEmpty();
        System.out.println(check2);

    }
}
