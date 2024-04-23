package homework_week6_bhavesh;

public class Parameter {
    /**
     *
     * Using static
     * using instance
     * all program sub,division,multi,subs
     * create one object
     */
    public static String add(double n1, double n2) {
        double result = n1 + n2;
        return n1 + " + " + n2 + "=" + result;
    }

    public static String subtract(double n1, double n2) {
        double result = n1 - n2;
        return n1 + "-" + n2 + "=" + result;
    }

    public  String multiply(double n1, double n2) {
        double result = n1 * n2;
        return n1 + "*"+ n2 + "=" + result;

    }

    public String divide(double n1, double n2) {
        if (n2 == 0) {

            return "can not divide by zero";
        }
        double result = n1/ n2;
        return n1 + "/" + n2 +"=" + result;

    }

    public static void main(String[] args){
        System.out.println("Using static methods:");
        System.out.println("Addition: " + Parameter.add(10, 25));
        System.out.println("Substration: "+ Parameter.subtract(10,25));

        Parameter param = new Parameter();
        System.out.println("\nUsing instance methods:");
        System.out.println("Multiplcation: " + param.multiply(10,25));
        System.out.println("Division:"+ param.divide(10, 25));



    }
}
