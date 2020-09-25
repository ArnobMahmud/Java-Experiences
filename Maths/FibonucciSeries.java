/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/

package main;
import java.util.Scanner;

public class FibonucciSeries {
private static Scanner input;

public class scanner {}

	public static void main(String[] args) {
	input = new Scanner (System.in);
		
		int first_num = 0;
		int second_num = 1;
		int i, n, fibo_num;
		
		System.out.print("How many numbers? : ");
		n = ((Scanner) input).nextInt();
		
		System.out.println("First two numbers : " + 0 + " " +1 +"\nNext :" );
		
		for ( i = 3 ; i <= n ; i++) {
			
			fibo_num = first_num + second_num;	
			System.out.print(" "+ fibo_num);
			
			
			first_num = second_num;
			second_num = fibo_num;
		}
	}

}
