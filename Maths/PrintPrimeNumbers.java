/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;

import java.util.Scanner;

public class PrintPrimeNumbers {
    private static Scanner input;

    public static void main(String[] args) {

        int m, n, count = 0, totalPrimeNum = 0;
        input = new Scanner(System.in);

        System.out.print("Enter starting number : ");
        m = input.nextInt();

        System.out.print("Enter starting number : ");
        n = input.nextInt();

        for (int i = m; i < n; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                totalPrimeNum++;
                System.out.println(i);
            }
            count = 0;
        }
        System.out.println("Total prime numbers : " + totalPrimeNum);
    }
}