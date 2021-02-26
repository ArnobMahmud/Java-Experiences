/* 
     Author : Arnob Mahmud
 
     Mail : arnob.tech.me @ gmail.com 
*/

package Loops;

import java.util.Scanner;

public class ReverseRationalLoop {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        char n = input.next().charAt(0);

        for (char i = 'A'; i <= n; i++) {
            for (char j = 'A'; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
