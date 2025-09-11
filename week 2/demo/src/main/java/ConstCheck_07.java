public class ConstCheck_07 {
//    final static int a = 5, b = 3;
    int a = 5, b = 3;

//    static int[] arr2 = new int[5 + 3];
    static int[] arr3 = new int[a + b];

    public static void main(String[] args) {
        ConstCheck_07 demo = new ConstCheck_07();
        System.out.println("arr length = " + demo.arr2.length);
    }
}
