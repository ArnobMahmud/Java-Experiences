/*
    Author : Arnob Mahmud

    Mail : arnob.tech.me@gmail.com
*/

package String;
public class StringBuilderWork {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Arnob"); // changable string

        str.append(" Mahmud"); // joins two string
        System.out.println(str);

        System.out.println(str.reverse());
        System.out.println(str.delete(5, 9)); // M, " ", b, o will be deleted
    }
}
