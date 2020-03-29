/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/


package main;
import java.util.Scanner;

public class NestedLoop {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m, n, i, sum = 0;
		
			System.out.println("Enter the initial value:");
			m = input.nextInt();
			
			System.out.println("Enter the terminal value:");
			n = input.nextInt();
			
			
			for( i = m; i<= n; i++)
			{
				if ( i % 2 == 0) {
					sum = sum + i;
				  System.out.println(" " + i);
				}
				
			}
			
		System.out.println("The sum of even numbers : " + sum);
	}

}
