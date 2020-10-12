/* 
   Author : Arnob Mahmud
 
   Mail : arnob.tech.me @ gmail.com
 */

package Conditions;
import java.util.Scanner;

class SwitchWork {
  private static Scanner input;
  public static void main(String[] args) {
    int num;

    System.out.println("Enter a digit between 1 to 5");
    input = new Scanner(System.in);
    num = input.nextInt();

    switch (num) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      case 4:
        System.out.println("Four");
        break;
      default:
      System.out.println("Five");
        break;
    }
  }
}