/* 
 
   Author : Arnob Mahmud
 
   Mail : arnob.tech.me @ gmail.com
   
 */
 

package main;

public class IfElseCondition {
    public static void main(String[] args) {
		
	    int x;
		x = 10;
		System.out.println("The value of 'x' is :" + x);
		
		
		if ( x % 5 == 0 &&  x < 10) {                          // if the both condition stands true then this declaration will be printed //
			
			System.out.println("Condition is false");
				
		}
		else if ( x < 15 || x % 3 == 0) {                    // if only one condition stands true then this declaration will be printed //  
			
			System.out.println("Condition is true");
			
		}
		else {
			System.out.println("Condition is false");
	 }
		
		
  }

}
