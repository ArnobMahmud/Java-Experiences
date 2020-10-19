/*
    Author : Arnob Mahmud

    Mail : arnob.tech.me@gmail.com
*/

package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(28);
        arr.add(3);
        arr.add(107);
        arr.add(61);

        Collections.sort(arr);
        System.out.println(" After sorting in ascending order : " + arr); // ascending order

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(" After sorting in descending order : " + arr); // descending order
    }
}
