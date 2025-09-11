public class BankAccountDemo_01 {
    public static void main(String[] args) {
        int balance = Integer.MAX_VALUE; // 2,147,483,647
        int deposit = 1000;

        System.out.println("Starting balance: " + balance);
        System.out.println("Depositing: " + deposit);

        int newBalance = balance + deposit;
        System.out.println("New balance: " + newBalance);
    }
}