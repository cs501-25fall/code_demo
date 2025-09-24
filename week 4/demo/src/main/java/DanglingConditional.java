public class DangleingConditional {
    public static void main(String[] args) {
        int x = -5;
        int y = 10;
        if (x>0)
            if (y>0)
                System.out.println("Both positive");
        else
            System.out.println("x is not positive");
    }
}

