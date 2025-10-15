class BankAccount {
    String owner;
    String password;
    double balance;
    boolean active;

    // 1) Open: owner + password + opening deposit
    BankAccount(String owner, String password, double opening) {
        this.owner = owner;
        this.password = password;
        this.balance = opening < 0 ? 0 : opening;
        this.active = true;
    }

    // 2) Open: owner + password (zero deposit)
    BankAccount(String owner, String password) {
        this(owner, password, 0.0);
    }

    // 3) Copy-with-changes: from existing, optionally close or change password
    BankAccount(BankAccount src, boolean closeAccount, String newPassword) {
        this.owner = src.owner;
        this.password = (newPassword != null ? newPassword : src.password);
        this.balance = src.balance;
        this.active  = closeAccount ? false : src.active;
        if (newPassword != null) {
            System.out.printf("%s password changed\n", this.owner);
        }
    }

    void deposit(double amt) {
        if (!active || amt <= 0) return;
        balance += amt;
    }

    void withdraw(double amt) {
        if (!active || amt <= 0 || amt > balance) return;
        balance -= amt;
    }

    void show() {
        System.out.println(owner + " | $" + balance + " | " + (active ? "ACTIVE" : "CLOSED"));
    }
}

public class ConstructorOverloadDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount("Alice", "a1!", 100); // open with deposit
        BankAccount b = new BankAccount("Bob", "b2!");        // open zero deposit

        a.deposit(50);
        b.deposit(20);
        b.withdraw(5);

        BankAccount c = new BankAccount(a, false, "new!"); // change password (copy)
        BankAccount d = new BankAccount(b, true, null);    // close account (copy)

        a.show();  // Alice | $150.0 | ACTIVE
        b.show();  // Bob   | $15.0  | ACTIVE
        c.show();  // Alice | $150.0 | ACTIVE  (password changed)
        d.show();  // Bob   | $15.0  | CLOSED
    }
}
