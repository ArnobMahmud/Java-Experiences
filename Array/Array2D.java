/*
  Author : Arnob Mahmud

  Mail : arnob.tech.me @ gmail.com
*/

package main;
import java.util.Scanner;

public class Array2D {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int[][] A = new int[3][3];
		int[][] B = new int[3][3];
		int i, j = 0, m, n = 0, sum = 0;
		
		      // Inputting values of A matrix //
		
		System.out.println("Enter elements for A matrix : ");
		
		for ( i = 0; i < 3 ; i++)
		{
			for(j = 0; j < 3; j++)
			{
				System.out.printf("A[%d][%d] = ", i, j);
				A[i][j] = input.nextInt();
				
			}
		}
		
		      // Inputting values of B matrix //
	
		System.out.println("Enter elements for B matrix : ");
		
		for ( m = 0; m < 3 ; m++)
		{
			for(n = 0; n < 3; n++)
			{
				System.out.printf("B[%d][%d] = ", m, n);
				B[m][n] = input.nextInt();
				
			}
		}
		
		      // Printing of A matrix //
		
		System.out.print("A = ");
		for (i= 0;i < 3 ; i++)
		{
			for(j = 0; j < 3; j++)
			{	
				System.out.print("\t"+A[i][j]);	
			}
	    System.out.printf("\n");
	    }
		

	         // Printing of B matrix //
	
	    System.out.println("B = ");
	    for (m = 0; m < 3 ; m++)
	    {
		for(n = 0; n < 3; n++)
		    {
			    System.out.print("\t"+B[m][n]);
		    }
	    System.out.printf("\n"); 
	    }
	
  }
	
}
