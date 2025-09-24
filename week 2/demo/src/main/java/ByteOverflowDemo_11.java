public class ByteOverflowDemo_11 {
    public static void main(String[] args) {
//        byte qty = 120, unit = 3;
        byte qty = 120;
        var unit = 3;
        byte total = (byte) (qty * unit);
        System.out.println(total);
    }
}
