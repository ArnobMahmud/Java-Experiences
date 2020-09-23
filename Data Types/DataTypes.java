/* 
 
   Author : Arnob Mahmud
 
   Mail : arnob.tech.me @ gmail.com
   
 */
 

package main;

public class DataTypes {
	
	public static void main(String[] args) {
		
		boolean b;      // boolean always stores "true or false" type data //
		char c;         //char stores "character" types data //
		int x;         // int always stores "integer" types data //
		float f;       // float sotres "floating(fractional)" type data //
		double d;      // "double" type data stored by it//
           
		
	  b = true;   
	  System.out.println("b is = " + b);
	  
	  c = 'a';
	  System.out.println("c is = " + c);
	  
	  x = 123456;
	  System.out.println("x is = " + x);
	  
	  f = 12.567890f;
	  System.out.println("f is = " + f);
	  
	  d = 12.4;
	  System.out.println("d is = " + d);
	  
	  
	     // Dynamic Initialization //
	  
	  
	  short s = 12345;                      // short data types are stored by it //
	  System.out.println("s is = " + s);
	  
	  
	     // Using Format Specifier & Printf //
	  
	  System.out.printf("f is = %.3f ", f);
	  
	}

}
