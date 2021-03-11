package w3Resources.Threads;

interface StringFunction {
    String run(String str);
}

public class Lambda {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}

//Java Lambda Expressions

//Lambda Expressions were added in Java 8.
//A lambda expression is a short block of code which takes in parameters and returns a value.
//Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.