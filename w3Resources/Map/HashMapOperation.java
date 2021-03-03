package w3Resources.Map;
import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        // Access an Item
        // To access a value in the HashMap, use the get() method and refer to its key:

        System.out.println(capitalCities.get("England"));

        // Remove an Item
        // To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // HashMap Size
        // To find out how many items there are, use the size method:
        System.out.println(capitalCities.size());
        
        // To remove all items, use the clear() method:
        capitalCities.clear();
        System.out.println(capitalCities);
        
    }
}
