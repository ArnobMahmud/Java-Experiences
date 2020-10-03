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
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
