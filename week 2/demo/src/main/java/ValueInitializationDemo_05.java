public class ValueInitializationDemo_05 {

    // Example 1: Local variable (no default initialization)
    static void demo() {
        int x;
//        System.out.println(x);
    }

    // Example 2: Instance variable (default-initialized)
    int x; // instance variable, default = 0

    void show() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        ValueInitializationDemo_05 obj = new ValueInitializationDemo_05();
        obj.show();
    }
}
