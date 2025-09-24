public class StringFormattingAlignment_14 {
    public static void main(String[] args) {
        String item = "Laptop";
        int qty = 5;
        double price = 999.99;

        System.out.printf(
                "Item:\t%s%nQty:\t%d%nPrice:\t$%.2f%nPath:\tC:\\Store\\Inventory%nDiscount:\t%d%%%n",
                item, qty, price, 20
        );
    }
}
