/*
  Author : Arnob Mahmud

  Mail : arnob.tech.me @ gmail.com
*/

package main;
import java.util.Scanner;

public class ArrayArithmetic {
    private static double[] number;
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		number = new double[6];
		double sum = 0;
		double average;
		
		System.out.println("Enter 6 numbers : ");
		for ( int i = 0 ; i < number.length; i++) 
		{
			number[i] = input.nextDouble();
		}
		
		int len = number.length;
		System.out.println("Array size is : " +len);
		
		for ( int i = 0 ; i < number.length; i++) 
		{
			sum = sum + number[i];
		}
		
		System.out.println("The sum is : " + sum);
		
		average = sum / number.length;
		System.out.println("The average is : " + average);
		
	} 

}
