/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package main;
import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int radius; 
		float area;
		
		System.out.print("Enter the value of radius :");
		radius = input.nextInt();
		
		area = (float) (3.142 * radius * radius);      // Answer could be fractional //
		
		System.out.print("The area of circle is :" + area);
		
		
	}

}
