public class OutOfRangeDemo_04 {
    public static void main(String[] args) {
        // -------- Byte --------
//         byte b = 130; // ❌ out of range
        byte bFixed = 127; // ✅ max valid
        System.out.println("Byte fixed value: " + bFixed);

        // -------- Short --------
//         short s = 40000; // ❌ out of range
//        short sFixed = 32767; // ✅ max valid
//        System.out.println("Short fixed value: " + sFixed);

        // -------- Int --------
//         int i = 3000000000; // ❌ too large
//        int iFixed = 2147483647; // ✅ max valid
//        System.out.println("Int fixed value: " + iFixed);

        // -------- Long --------
//         long l = 3000000000; // ❌ missing L
//        long lFixed = 3000000000L; // ✅ correct
//        System.out.println("Long fixed value: " + lFixed);
    }
}