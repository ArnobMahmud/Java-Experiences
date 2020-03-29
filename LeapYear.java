/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/

package main;
import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int year;
		
		
		System.out.print("Enter a year:");
		year = input.nextInt();
		
		if ( year % 4 == 0) 
		{
			System.out.print("This is a leap year.");
		}
		else
		{
			System.out.print("This is not leap year.");
		}
				
	}

}
