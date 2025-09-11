public class FloatDoubleExample_06 {
    public static void main(String[] args) {
        // float without 'f' suffix → compile-time error
        float price = 19.123f; // ✅ added 'f' to make it a float
        System.out.println("Float price: " + price);

        // double with large value
        double balance = 998234252.45;
        System.out.println("Double balance: " + balance);
    }
}
