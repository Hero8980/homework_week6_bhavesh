package homework_week6_bhavesh;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int n2 = scanner.nextInt();

        scanner.close();

        int a = n1 + n2;
        int b = n1 - n2;
        int c = n1 * n2;
        int d = n1 / n2;
        int e = n1 % n2;

        System.out.println(n1 + " + " + n2 + " = " + a);
        System.out.println(n1 + " - " + n2 + " = " + b);
        System.out.println(n1 + " x " + n2 + " = " + c);
        System.out.println(n1 + " / " + n2 + " = " + d);
        System.out.println(n1 + " mod " + n2 + " = " + e);
    }

}
