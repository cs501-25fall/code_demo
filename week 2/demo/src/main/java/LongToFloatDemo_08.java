public class LongToFloatDemo_08 {
    public static void main(String[] args) {
        long big = 1234567890123456789L;
        float f = big; // implicit cast from long to float
//        int a = 10;
//        double b = a;

        System.out.println("long: " + big);
        System.out.println("float: " + f);
//        System.out.println("double: " + b);
    }
}
