package w3Resources.Introduction;

public class operators {
    public static void main(String[] args) {

        int var1;
        int var2;
        int var3; // integer type data
        int var4;

        var1 = 200;
        System.out.println("var1 contains:\t" + var1);

        var2 = var1 / 2;
        System.out.println("var2 contains:\t" + var2);

        var3 = var1 / var2;
        System.out.println("Value of var3:\t" + var3);

        var4 = var1 - var2 * var1;
        System.out.println("Value of var3:\t" + var4);

        int x = 10;
        System.out.println(x += 5);

        int w = 5;
        int y = 3;
        System.out.println(w != y); // returns true because 5 is not equal to 3
    }

}

// Arithmetic operators are used to perform common mathematical operations.

// Operator	     Name	           Description                  	        Example	

// +	         Addition	       Adds together two values	                x + y	
// -	         Subtraction	  Subtracts one value from another	        x - y	
// *	         Multiplication	  Multiplies two values	                    x * y	
// /	         Division	      Divides one value by another	            x / y	
// %	         Modulus	      Returns the division remainder	        x % y	
// ++	         Increment        Increases the value of a variable by 1	++x	
// --	         Decrement	      Decreases the value of a variable by 1	--x

// A list of all assignment operators:

// Operator	    Example	        Same As	

// =	        x = 5	        x = 5	
// +=	        x += 3	        x = x + 3	
// -=	        x -= 3	        x = x - 3	
// *=	        x *= 3	        x = x * 3	
// /=	        x /= 3	        x = x / 3	
// %=	        x %= 3	        x = x % 3	
// &=	        x &= 3	        x = x & 3	
// |=	        x |= 3	        x = x | 3	
// ^=	        x ^= 3	        x = x ^ 3	
// >>=	        x >>= 3	        x = x >> 3	
// <<=	        x <<= 3	        x = x << 3



// Comparison operators are used to compare two values:

// Operator	    Name	                     Example

// ==	        Equal to	                 x == y	
// !=	        Not equal	                 x != y	
// >	        Greater than	             x > y	
// <	        Less than	                 x < y	
// >=	        Greater than or equal to	 x >= y	
// <=	        Less than or equal to	     x <= y



// Logical operators are used to determine the logic between variables or values:

// Operator	Name	            Description	                                                                Example

// && 	                        Logical and	Returns true if both statements are true	                    x < 5 &&  x < 10	
// || 	                        Logical or	Returns true if one of the statements is true	                x < 5 || x < 4	
// !	                        Logical not	Reverse the result, returns false if the result is true	        !(x < 5 && x < 10)