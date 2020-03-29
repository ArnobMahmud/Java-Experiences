/* 
   Author : Arnob Mahmud
   Mail : arnob.tech.me @ gmail.com  
*/

package main;

import java.util.Scanner;
public class VowelConsonant {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		char ch;
		int arg0; 
		
		System.out.print("Enter a character :");
		
		ch = input.next().charAt(0);       //// "0" defines that only one character will be inputed ///
		
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
		{
		    System.out.print("Your character is a vowel.");
		}
		else
		{
			System.out.print("Your character is a consonant.");
		}
		
	}

}
