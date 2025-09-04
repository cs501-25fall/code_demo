import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){ // what does String[] args mean here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        String age = sc.nextLine();

        System.out.println("Hello, " + name + ". You are " + age + " years old.");
        sc.close();
    }
}
