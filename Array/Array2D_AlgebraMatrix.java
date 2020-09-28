/*
  Author : Arnob Mahmud
  
  Mail : arnob.tech.me @ gmail.com
*/

package Array;
import java.util.Scanner;

public class Array2D_AlgebraMatrix {

	public static void main(final String[] args) {

		// @SuppressWarnings("resource")
		final Scanner input = new Scanner(System.in);

		final int[][] A = new int[3][3];
		final int[][] B = new int[3][3];
		final int[][] C = new int[3][3];
		
		int row,col = 0;
		      /// Inputting values of A Matrix ///
		System.out.println("Enter elements for A matrix : ");
		
		for ( row = 0; row < 3 ; row++)
		{
			for(col = 0; col < 3; col++)
			{
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = input.nextInt();
				
			}
		}
		
		      /// Inputting values of B Matrix ///
	
		System.out.println("Enter elements for B matrix : ");
		
		for ( row = 0; row < 3 ; row++)
		{
			for(col = 0; col < 3; col++)
			{
				System.out.printf("B[%d][%d] = ", row, col);
				B[row][col] = input.nextInt();
				
			}
		}
		
		      /// Printing of A Matrix ///
		
		System.out.print("A = ");
		for (row= 0;row < 3 ; row++)
		{
			for(col = 0; col < 3; col++)
			{	
				System.out.print("\t"+A[row][col]);	
			}
	    System.out.printf("\n");
	    }
		
	
	         /// Printing of B Matrix ///
	
	    System.out.println("B = ");
	    for (row = 0; row < 3 ; row++)
	    {
		for(col = 0; col < 3; col++)
		    {
			    System.out.print("\t"+B[row][col]);
		    }
	    System.out.printf("\n"); 
	    }
	    
	        /// Addition of two Matrix ///
	    
	    System.out.println("C = A + B : "); 
	    for (row = 0; row < 3 ; row++)
	    {
		for(col = 0; col < 3; col++)
		    {
			    C[row][col] =  A[row][col] + B[row][col];
			    System.out.print("\t" +C[row][col]);
		    }
	    System.out.printf("\n"); 
	    }
	         // Subtraction of two Matrix //
	    
	    System.out.println("C = A - B : "); 
	    for (row = 0; row < 3 ; row++)
	    {
		for(col = 0; col < 3; col++)
		    {
			    C[row][col] =  A[row][col] - B[row][col];
			    System.out.print("\t" +C[row][col]);
		    }
	    System.out.printf("\n"); 
	    }
	    
	       /// Multiplication of two Matrix ///
	    
	    System.out.println("C = A * B : "); 
	    for (row = 0; row < 3 ; row++)            // Theory for square Matrix: A(3X3) * B(3X3) = C(3X3) //
	    {
		for(col = 0; col < 3; col++)
		{
			    C[row][col] =  A[row][col] * B[row][col];
			    System.out.print("\t" +C[row][col]);
	    }
	    System.out.printf("\n"); 
	    
	  
        }
	       
	                       /* Arnob Mahmud suggests you to change
                      the row & column value and then multiply them */
                                       
//When the amount of fist matrix's column will be equaled to second matrix's row then two matrix will be able to multiplied ///
	    
	}             // Theory : A(iXj) * B(jXk) = C(iXk) // 
	
}
