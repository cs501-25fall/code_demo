public class DoubleOverflowDemo {
    public static void main(String[] args) {
        double bigA = 1e308;   // very large number
        double bigB = 10.0;    // multiplier

        double bigRes = bigA * bigB;

        boolean doubleOverflow =
                (bigRes == Double.POSITIVE_INFINITY) || (bigRes == Double.NEGATIVE_INFINITY);

        System.out.println("bigA = " + bigA);
        System.out.println("bigB = " + bigB);
        System.out.println("bigRes = " + bigRes);
        System.out.println("doubleOverflow = " + doubleOverflow);
    }
}
