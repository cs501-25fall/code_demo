public class PromotionDemo_10 {
    public static void main(String[] args) {
        byte x = 50;
        short y = 25;
        char z = 'A'; // Unicode 65

        // byte + short → int
        int sum1 = x + y;

        // short + char → int
        int sum2 = y + z;

        // Mixing different small types → still int
        Object result = x + y + z;

        System.out.println("sum1 (x + y): " + sum1);          // 75
        System.out.println("sum2 (y + z): " + sum2);          // 90
        System.out.println(result.getClass().getName());      // java.lang.Integer
    }
}
