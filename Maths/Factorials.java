/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/

package  Maths;
import java.util.Scanner;

public class Factorials {
      @SuppressWarnings("resource")
	  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
			int i, m;
			int fact = 1;
			
			System.out.println("Enter a positive number:");
			m = input.nextInt();
			
			for (i = m; i >= 1; i--) {
				fact = fact * i;
			}
		
		System.out.println("Factorial of " + m + " is " +fact);	
	}

}
