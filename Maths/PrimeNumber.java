/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/


package main;
import java.util.Scanner;

public class PrimeNumber {
	
	private static final String UNUSED = "unused";
    @SuppressWarnings(UNUSED)
    
	public static void main(String[] args) {
	@SuppressWarnings("resource")
		
		Scanner input =new Scanner(System.in);
		int m, n, i, count = 0, totalPrime = 0;
		
		System.out.println("Enter a starting number : ");
		m = input.nextInt();
		
		System.out.println("Enter a ending number : ");
		n = input.nextInt();
		
		for ( i = m ; i <=n ; i++)
		{
			for ( int j = 2 ; j <= i-1; j++)  
			{
			  if ( i % j == 0)
				{
				  count ++;
				  break;  
				}	
			}
			  if ( count == 0)
			{
				System.out.println(i);
				totalPrime++;
			}
			count = 0;                    /* After checking one number we have to
			                                       reset count to 0 again */			
		}
		System.out.println("Total prime number :" +totalPrime);
		
	}
	public static String getUnused() {
		return UNUSED;
	}

}
