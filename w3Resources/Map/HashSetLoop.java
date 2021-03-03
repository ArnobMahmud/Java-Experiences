package w3Resources.Map;
import java.util.HashSet;

public class HashSetLoop {
    public static void main(String[] args) {
        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}


// Items in an HashSet are actually objects. 
//In the examples above, we created items (objects) of type "String". 
//Remember that a String in Java is an object (not a primitive type). 
//To use other types, such as int, you must specify an equivalent wrapper class: Integer.
//For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc: