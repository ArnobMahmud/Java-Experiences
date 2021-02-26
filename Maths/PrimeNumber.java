/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;
import java.util.Scanner;

public class PrimeNumber {
    private static Scanner input;

    public static void main(String[] args) {
        int number, count = 0;

        System.out.println("Enter a number to check is it prime or not : ");
        input = new Scanner(System.in);
        number = input.nextInt();

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It isn't a prime number");
        }
    }
}
