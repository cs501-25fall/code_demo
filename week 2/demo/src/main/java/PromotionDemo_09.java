public class PromotionDemo_09 {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 10;

        int c = a + b; // byte + byte → promoted to int

        Object oa = a;       // autoboxes to Byte
        Object ob = b;       // autoboxes to Byte
        Object oSum = a + b; // int result autoboxed to Integer

        System.out.println(oa.getClass().getName());   // java.lang.Byte
        System.out.println(ob.getClass().getName());   // java.lang.Byte
        System.out.println(oSum.getClass().getName()); // java.lang.Integer
    }
}
