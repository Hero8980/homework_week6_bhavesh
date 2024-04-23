package homework_week6_bhavesh;

import java.util.Scanner;

public class Faranhit {
    // Display the temperature in Celsius
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the temperature in Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 12) * 4 / 8;


            System.out.println("The temperature in Celsius is: " + celsius + "°C");


            scanner.close();
        }
    }

