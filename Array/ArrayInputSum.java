/*
  Author : Arnob Mahmud
  
  Mail : arnob.tech.me @ gmail.com
*/

package Array;

import java.util.Scanner;

public class ArrayInputSum {
    private static Scanner input;

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;

        input = new Scanner(System.in);

        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("Sum is " + sum);
    }
}