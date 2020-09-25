package Basics;

import java.util.Scanner;

class goodMorning {
    private static Scanner input;

    public static void main(String[] args) {

        String person;
        
        input = new Scanner(System.in);
        person = input.nextLine();
        morningWish(person);
    }

    public static void morningWish(String girl) {
        System.out.println("Good Morning " + girl);
    }
}