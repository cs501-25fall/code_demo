import java.util.Date; // explain the lib

public class HelloWorld {
    public static void main(String[] args) {
        String message = "Hello, Java!";
//        Date date = new Date(); // proper way of initializing a method
        System.out.println(message);
        System.out.println("Current time: " + new Date()); // shortcut like this is not recommended
    }
}
