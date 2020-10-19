/*
    Author : Arnob Mahmud

    Mail : arnob.tech.me@gmail.com
*/

package String;

public class StringsFunction {
    public static void main(String[] args) {
        String name = new String("arnob mahmud");

        int n = name.length();
        System.out.println(n);

        String[] arr = name.split("a");
        for (String x : arr) {
            System.out.println(x);
        }
    }
}
