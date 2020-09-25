/* 
   Author : Arnob Mahmud
 
   Mail : arnob.tech.me @ gmail.com
*/

package main;
import java.util.Scanner;     

public class ScannerInput{

	public static void main (String[] args) {
		
	  Scanner input = new Scanner (System.in);
		int number;
		
		System.out.println("Enter any number : ");
		
		
		number = input.nextInt();
		System.out.println("Number : " +number);
		
	}
 
}
