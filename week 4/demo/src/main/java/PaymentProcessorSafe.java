enum PaymentMethod {
    CREDIT, PAYPAL, CASH
}

public class PaymentProcessorSafe {
    public static void processPayment(PaymentMethod method) {
        switch (method) {
            case CREDIT:
                System.out.println("Processing credit card payment...");
                break;
            case PAYPAL:
                System.out.println("Processing PayPal payment...");
                break;
            case CASH:
                System.out.println("Processing cash payment...");
                break;
        }
    }

    public static void main(String[] args) {
        PaymentMethod method = PaymentMethod.CREDIT;
        processPayment(method);
    }
}
