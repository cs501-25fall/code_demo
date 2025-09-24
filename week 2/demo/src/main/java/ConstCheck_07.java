public class ConstCheck_07 {
    int SIZE = 5 + 3;
    int[] arr1 = new int[SIZE];

    int a = 5, b = 3;
    static int[] arr2 = new int[a + b];

    public static void main(String[] args) {
        ConstCheck_07 demo = new ConstCheck_07();
        System.out.println("arr1 length = " + demo.arr1.length);
        System.out.println("arr2 length = " + demo.arr2.length);
    }
}
