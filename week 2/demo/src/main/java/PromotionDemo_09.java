public class PromotionDemo_09 {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 10;

        int c = a + b; // byte + byte → promoted to int

        Object oa = a;
        Object ob = b;
        Object oSum = a + b;

        System.out.println(oa.getClass().getName());
        System.out.println(ob.getClass().getName());
        System.out.println(oSum.getClass().getName());
    }
}
