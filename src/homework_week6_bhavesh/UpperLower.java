package homework_week6_bhavesh;

import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        // Create a Scanner object
        // Convert the uppercase string to lowercase
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in uppercase: ");
        String uppercaseString = scanner.nextLine();


        String lowercaseString = uppercaseString.toLowerCase();


        System.out.println("String in lowercase: " + lowercaseString);


        scanner.close();
    }

}
