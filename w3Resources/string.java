package w3Resources;

public class string {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt1.length());

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase()); // Outputs "hello world"

        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));
    }
}


// Strings are used for storing text.

// A String variable contains a collection of characters surrounded by double quotes:

// A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
// For example, the length of a string can be found with the length() method.

// The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace).

// The + operator can be used between strings to combine them. This is called concatenation.
// You can also use the concat() method to concatenate two strings