package w3Resources.Map;
import java.util.HashSet;

public class HashSetOperation {
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

        // Check If an Item Exists
        // To check whether an item exists in a HashSet, use the contains() method:
        System.out.println(cars.contains("Mazda")); // will return true

        
        // Remove an Item
        // To remove an item, use the remove() method:
        System.out.println(cars.remove("Volvo"));
        System.out.println(cars);

        // HashSet Size
        // To find out how many items there are, use the size method:
        System.out.println(cars.size());
        
        // To remove all items, use the clear() method:
        cars.clear();
        System.out.println(cars);
    }
}
