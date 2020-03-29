/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/

package main;
import java.util.Scanner;

public class EvenOddNumbers {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.print("Enter your number :");
		number = input.nextInt();
		
		if (number %2 == 0)
		{
			System.out.print("You have entered an Even number.");
		}
		else 
		{
			System.out.print("You have entered an Odd number.");
		}
		
	}

}
