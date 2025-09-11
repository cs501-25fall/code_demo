public class DetectTypeDemo {
    public static void main(String[] args) {
        // Test different data types to see overflow behavior

        // Test with byte type
        byte byteValue = 120;
        System.out.println("Byte test:");
        System.out.println("byteValue + 8 = " + (byte)(byteValue + 8)); // Should overflow to negative

        // Test with short type
        short shortValue = 120;
        System.out.println("\nShort test:");
        System.out.println("shortValue + 32648 = " + (short)(shortValue + 32648)); // Should overflow to negative

        // Test with int type
        int intValue = 120;
        System.out.println("\nInt test:");
        System.out.println("intValue + 2147483528 = " + (intValue + 2147483528)); // Should overflow to negative

//        // Test with long type
//        long longValue = 9223372036854775800L;
//        System.out.println("\nLong test:");
//        System.out.println("longValue + 8 = " + (longValue + 8)); // Should overflow to negative

        // Alternative approach: detect type by checking bounds
//        System.out.println("\n--- Type Detection Example ---");
//        var unknownValue = 120; // This will be inferred as int
//
//        if (unknownValue <= Byte.MAX_VALUE && unknownValue >= Byte.MIN_VALUE) {
//            System.out.println("Value " + unknownValue + " can fit in byte");
//        }
//        if (unknownValue <= Short.MAX_VALUE && unknownValue >= Short.MIN_VALUE) {
//            System.out.println("Value " + unknownValue + " can fit in short");
//        }
//        if (unknownValue <= Integer.MAX_VALUE && unknownValue >= Integer.MIN_VALUE) {
//            System.out.println("Value " + unknownValue + " can fit in int");
//        }
//        System.out.println("Actual type of unknownValue: " + ((Object)unknownValue).getClass().getSimpleName());
    }
}