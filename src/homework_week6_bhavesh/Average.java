package homework_week6_bhavesh;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three numbers:");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        scanner.close();
        double average = (number1 + number2 + number3) / 3;

        System.out.println("The average of the three numbers is: " + average);
    }
}


