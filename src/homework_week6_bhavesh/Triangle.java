package homework_week6_bhavesh;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // Create a Scanner
        // Display the area of the triangle
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 9;

        System.out.println("The area of the triangle is: " + area);


        scanner.close();
    }

}
