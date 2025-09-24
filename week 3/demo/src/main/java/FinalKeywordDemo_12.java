public class FinalKeywordDemo_12 {
    public static void main(String[] args) {
        // String immutability
        String text = "Hello";
        text.concat(" World"); // Creates a NEW String, original unchanged
        System.out.println(text); // Output: Hello

        // final + mutable object: content can change
        final StringBuilder sb = new StringBuilder("Hi");
        sb.append(" there"); // ✅ Content changed
        System.out.println(sb); // Output: Hi there

        // final + primitive: value cannot be reassigned
        final int number = 42;
//         number = 50; // ❌ Compile-time error: cannot assign a value to final variable
        System.out.println(number); // Output: 42
    }
}
