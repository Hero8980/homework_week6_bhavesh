package homework_week6_bhavesh;

public class Static1 {
    static int a = 10;
    static String name = "Bhavesh";

    /**
     * static variable - static
     * scope- within the class
     * memory allocation- when class is loded
     * store-no heap
     */
    public static void m1() {
        System.out.println("a:"+ a);
        System.out.println("name:"+ name);
    }

    public static void main(String[] args) {
        m1();
    }
}

