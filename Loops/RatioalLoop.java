package Loops;
import java.util.Scanner;

public class RatioalLoop {
    private static Scanner input;
    public static void main(String[] args) {

        input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
