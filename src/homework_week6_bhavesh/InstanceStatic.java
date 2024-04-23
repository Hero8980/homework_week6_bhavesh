package homework_week6_bhavesh;

public class InstanceStatic {
    int a =10;
    static String name ="Bhavesh";
    // instant and static variable

    public void m1() {
        System.out.println("A:" + a);
        System.out.println("Name:" + name);
    }

        public static void m2(){
            InstanceStatic i = new InstanceStatic();
            System.out.println("A:" + i.a);
            System.out.println("Name:"+ name);

        }


        public static void main(String[] args) {

            InstanceStatic i = new InstanceStatic();
            i.m1();
            m2();
        }
    }


