/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/


package main;
import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int CGPA;
		
		System.out.print("Enter your CGPA :");
		CGPA = input.nextInt();
		
		switch (CGPA) {
		
		case 4 :
		System.out.print("Excellent");
		break;
		
		
		case 3 :
		System.out.print("Good");
		break;
		
		
		case 2 :
		System.out.print("Average");
		break;
		
		
		case 1 :
		System.out.print("Poor");
		break;
		
		
		case 0 :
		System.out.print("Fail");
		break;
		
		
		default :
		System.out.print("Illegal CGPA");
		break;
		
		}	
		
	}

}
