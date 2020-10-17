/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;
import java.util.Scanner;

public class SeriesSquare {
    private static Scanner input;
    public static void main(String[] args) {
        int m, n, sum = 0;

        System.out.println("Enter initial number : ");
        input = new Scanner(System.in);
        m = input.nextInt();

        System.out.println("Enter terminal number : ");
        input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println("Sum is : " + sum);
    }
}