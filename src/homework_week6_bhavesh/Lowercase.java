package homework_week6_bhavesh;

import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
        // input string
        // Convert the string to lowercase
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";

        String lowercase = input.toLowerCase();
        System.out.println("Output: " + lowercase);
    }

    public static class Binary {
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner scanner = new Scanner(System.in);


            System.out.print("Input first binary number: ");
            String binary1 = scanner.nextLine();

            System.out.print("Input second binary number: ");
            String binary2 = scanner.nextLine();


            scanner.close();

            int num1 = Integer.parseInt(binary1, 2);
            int num2 = Integer.parseInt(binary2, 2);

            int sum = num1 + num2;

            String result = Integer.toBinaryString(sum);

            System.out.println("Sum of two binary numbers: " + result);
        }

    }

    public static class Decimal {
        public static void main(String[] args) {
            // Create a Scanner object
            Scanner scanner = new Scanner(System.in);

            // enter a decimal number
            System.out.print("Input a homework_week6_bhavesh.Lowercase.Decimal Number: ");
            int decimal = scanner.nextInt();

            scanner.close();

            String binary = Integer.toBinaryString(decimal);

            System.out.println("homework_week6_bhavesh.Lowercase.Binary number is: " + binary);
        }

    }
}
