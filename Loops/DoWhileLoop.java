/* 
   Author : Arnob Mahmud
   
   Mail : arnob.tech.me @ gmail.com  
*/
package Loops;

import java.util.Scanner;

public class DoWhileLoop {

	private static Scanner input;

	public static void main(String[] args) {
		setInput(new Scanner(System.in));

		int i;

		i = 1;
		do {
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			i++;
		} while (i <= 10);

	}

	public static Scanner getInput() {
		return input;
	}

	public static void setInput(Scanner input) {
		DoWhileLoop.input = input;
	}

	public DoWhileLoop() {
	}

}
