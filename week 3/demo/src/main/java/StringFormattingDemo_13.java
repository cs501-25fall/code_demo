public class StringFormattingDemo_13 {
    public static void main(String[] args) {
        String name = "Shan";
        int age = 11;
        double gpa = 3.75;
        boolean admitted = true;

        String result = String.format("Name: %s, Age: %d, GPA: %.1f, Admitted: %b", name, age, gpa, admitted);
        System.out.println(result);
        // Output: Name: Shan, Age: 11, GPA: 3.8
    }
}
