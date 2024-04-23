package homework_week6_bhavesh;

public class SwipeVariable {

    public static void main(String[] args) {

        //swipe variables
        int a = 53;
        int b = 65;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;
                   //after swipe
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
