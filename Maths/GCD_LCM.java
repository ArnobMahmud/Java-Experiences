/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/

package  Maths;
import java.util.Scanner;
import  java.lang.NullPointerException;

@SuppressWarnings("unused")
public class GCD_LCM {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
				
			int num1, num2, rem, GCD, LCM;
				
			System.out.println("Enter first numer :");
			num1 = input.nextInt();
				
			System.out.println("Enter second numer :");
			num2 = input.nextInt();
				
				while ( num2 != 0) 
				{
					rem = num1 % num2;
					num1 = num2;
					num2 = rem;
				}
				
				GCD = num1;
				LCM = num1 * num2 / GCD;
				
					
			System.out.println("GCD is = :" + GCD );
			System.out.println("LCM is = :" + LCM );
			
		}
	
}
