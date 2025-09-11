public class IntegerTypeExample_02 {
    public static void main(String[] args) {
        // byte: 8-bit, range -128 to 127
        byte b = 100;
        System.out.println("byte value: " + b);

        // short: 16-bit, range -32,768 to 32,767
        short s = 30000;
        System.out.println("short value: " + s);

        // int: 32-bit, range -2,147,483,648 to 2,147,483,647
        int i = 2_000_000_000;
        System.out.println("int value: " + i);

        // long: 64-bit, range -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 9_000_000_000L; // add 'L' for long literals
        System.out.println("long value: " + l);
    }
}