package homework_week6_bhavesh;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        double radius = scaner.nextDouble();
        double area = Math.PI * radius* radius;

        System.out.println("Area of the circle with radius"+ radius+"is:" +area);

        scaner.close();
    }

}
