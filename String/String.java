package String;

import java.util.Scanner;

/*
 * @author arnob mahmud
 *
 * mail : arnob.tech.me@gmail.com
*/

public class String {
    private static Scanner input;

    public static void main(final String[] args) {

        int n;
        System.out.print("N = ");

        String[] st;
        input = new Scanner(System.in);
        n = input.nextInt();

        st = new String[n];
        for (int i = 0; i < n; i++) {
            st[n] = input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(st[n]);
        }
    }

    public String() {
    }
}
