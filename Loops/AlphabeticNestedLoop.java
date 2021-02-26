/* 
     Author : Arnob Mahmud
 
     Mail : arnob.tech.me @ gmail.com 
*/

package Loops;

import java.util.Scanner;

public class AlphabeticNestedLoop {
    private static Scanner input;

    public static void main(String[] args) {

        input = new Scanner(System.in);
        char c = input.next().charAt(0);

        for (char i = 'A'; i <= c; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
