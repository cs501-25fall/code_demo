public class DanglingConditional {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;
        int i = (int) 1e10;
        if (x>0)
            if (y>0)
                System.out.println("Both positive");
        else
            System.out.println("x is not positive");
        System.out.printf("i: %d", i);
    }
}

