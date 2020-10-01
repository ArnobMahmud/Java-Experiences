/* 
   Author : Arnob Mahmud
 
   Mail : arnob.tech.me @ gmail.com
*/

package DataTypes;
import java.util.Scanner;     

public class ScannerInput{

	private static Scanner input;

	public static void main (String[] args) {
		
	  input = new Scanner (System.in);
		int number;
		
		System.out.println("Enter any number : ");
		
		
		number = input.nextInt();
		System.out.println("Number : " +number);
		
	}
 
}
