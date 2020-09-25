/*
  Author : Arnob Mahmud
  
  Mail : arnob.tech.me @ gmail.com
*/

package main;
import java.util.Scanner;

public class ArrayMaxMin {

	private static final String UNUSED = "unused";

	@SuppressWarnings(UNUSED)
	private static Scanner input;
	
	@SuppressWarnings(UNUSED)
	private static int[] number;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		number = new int[5];
		
		@SuppressWarnings(UNUSED)
		int max, min;
		
		System.out.println("Enter 5 numbers : ");
		for ( int i = 0; i < number.length ; i++) 
		{
			number[i] = input.nextInt();
		}
		
		max = number[0];
			for ( int i = 1; i < number.length ; i++)
			{
			if( max < number[i]) 
			{
			   max = number[i];
			}	
		}
			
		System.out.println("The maximum number is : " +max);
		
		min = number[0];
		for ( int i = 1; i < number.length ; i++)
		{
			
		if( min > number[i]) 
		   {
		      min = number[i];
		   }	
		}	
		
	   System.out.println("The minimum number is : " +min);

	}

	public static String getUnused() {
		return UNUSED;
	}

}
