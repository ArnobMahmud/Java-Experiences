package w3Resources.ClassFunctionalities;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);
    }
}

// To display the current time (hour, minute, second, and nanoseconds), import the java.time.LocalTime class, and use its now() method: