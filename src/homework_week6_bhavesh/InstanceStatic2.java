package homework_week6_bhavesh;

public class InstanceStatic2 {
    /**
     * instant variable
     * static variable
     * create object
     */
    int a = 20;
    int b = 40;
    static String surname = "Jani";
    static String name = "Bhavesh";

    public void m1() {

        System.out.println("A:=" + a);
        System.out.println("B:" + b);
        System.out.println("Surname:" + surname);
        System.out.println("Name:" + name);

    }

    public static void m2() {
        InstanceStatic2 a = new InstanceStatic2();
        System.out.println("A:=" + a.a);
        System.out.println("B:" + a.b);
        System.out.println("Surname:" + surname);
        System.out.println("Name:" + name);

    }

    public static void main(String[] args) {
        InstanceStatic2 a = new InstanceStatic2();
        m2();

    }
}
