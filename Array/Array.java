/*
  Author : Arnob Mahmud
  
  Mail : arnob.tech.me @ gmail.com
*/

package Array;

public class Array {

	public static void main(String[] args) {

		int[] number = new int[10]; // Array declaration

		number[0] = 21;
		number[1] = 15;
		number[2] = 20;
		number[3] = 18;
		number[4] = 7;
		number[5] = 4;

		int len = number.length;
		System.out.println("Value :" + number[4]); // printing a value of array
		System.out.println("Array size :" + len); // size of an Array

		float sum = number[0] / number[3] * number[1];
		System.out.printf("Sum is : %.3f", sum); // sum of 3 index //

	}

}
