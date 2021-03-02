package w3Resources.ClassFunctionalities;

public class Enum {
    enum Level {
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}

// An enum is a special "class" that represents a group of constants
// (unchangeable variables, like final variables).

// To create an enum, use the enum keyword (instead of class or interface), and
// separate the constants with a comma. Note that they should be in uppercase
// letters: