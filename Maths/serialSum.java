/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;

import java.util.Scanner;

public class serialSum {
    private static Scanner input;

    public static void main(final String[] args) {
        int m, n;
        int sum = 0;

        input = new Scanner(System.in);

        System.out.println("Enter a starting number : ");
        m = input.nextInt();

        System.out.println("Enter a ending number : ");
        n = input.nextInt();

        for (int i = m; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is : " + sum);
    }
}
