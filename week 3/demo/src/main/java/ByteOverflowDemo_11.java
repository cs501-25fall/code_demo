public class ByteOverflowDemo_11 {
    public static void main(String[] args) {
        byte qty = 120, unit = 3;
//        byte qty = 120;
//        var unit = 3;
        byte total = (byte) (qty * unit);
        double small = 1e-308;
        System.out.println(small/10);
        System.out.println(total);
    }
}
