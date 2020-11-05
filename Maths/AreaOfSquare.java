/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;
import java.util.Scanner;

public class AreaOfSquare {

    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        double a, sum = 0;

        System.out.println("Enter the value of one side : ");
        a = input.nextDouble();

        sum = a * a;
        System.out.println("Area of square is : " + sum);

    }
}
