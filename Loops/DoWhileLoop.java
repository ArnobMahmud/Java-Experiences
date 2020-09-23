/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/


import java.util.Scanner;

public class DoWhileLoop {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		int i;
		
		i = 1;
		do {
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			i++;
		} while(i<=10);
		
	}

}
