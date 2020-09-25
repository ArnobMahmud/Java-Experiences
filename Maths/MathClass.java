/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/


package main;
import java.util.Scanner;

public class MathClass {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y, max, min;
		
		
		System.out.println("Enter a value of x:" );
		x = input.nextInt();
		
		System.out.println("Enter a value of y:" );
		y = input.nextInt();
			
		
		
		max = Math.max(x, y);
		System.out.println("The maximum value is  :" + max);
		
		
		min = Math.min(x, y);
		System.out.println("The minimum value is  :" + min);
		
		
		
		Scanner var = new Scanner(System.in);       // A new variable we have to choose here for 2nd time input // 
		                                               
		double a, b, power, sqrt_sqxy;
		
		
		System.out.println("Enter a value of a:" );
		a = var.nextDouble();
		
		
		System.out.println("Enter a value of b:" );
		b = var.nextDouble();
			
		
		power = Math.pow(a, b);
		System.out.println("After squaring the value is  :" + power);
		
		
		sqrt_sqxy = Math.hypot(a, b);
		System.out.println("After squaring the value is  :" + sqrt_sqxy);
		
		
		
		/* There are a lot of stores of math-class. Arnob Mahmud suggests 
        	    you kindly to google them and practice them  */
		
	}

}
