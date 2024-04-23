package homework_week6_bhavesh;

public class JavaInstance {
    /**
     * instance -object
     * scope- within class
     * memory allocated-when object is created
     * memory-heap
     */
     int a =10;
     String name = "Ram";

    public void m1() {
        System.out.println("a: " + a);
        System.out.println("name: "+ name);
    }
    public static void main(String[] args) {
        JavaInstance j= new JavaInstance();
        j.m1();
    }

}
