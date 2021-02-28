package w3Resources;

public class array2D {
    public static void main(String[] args) {
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}

// Multidimensional Arrays
// A multidimensional array is an array containing one or more arrays.

// To create a two-dimensional array, add each array within its own set of curly
// braces:

// Example
// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
// myNumbers is now an array with two arrays as its elements.

// To access the elements of the myNumbers array, specify two indexes: one for
// the array, and one for the element inside that array. This example accesses
// the third element (2) in the second array (1) of myNumbers: