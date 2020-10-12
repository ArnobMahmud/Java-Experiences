package Array;
import java.util.Scanner;

public class ArrayLoop {
    private static Scanner input;
    public static void main(String[] args) {

        int sum = 0;

        input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter five numbers : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is :" + sum);
    }
}
