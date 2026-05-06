class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double p) {
        balance = balance + p;
    }

    public void withdraw(double p) {
        if (balance >= p) {
            balance = balance - p;
        } else {
            System.out.println("Balance insufficient");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String n) {
        ownerName = n;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public String toString() {
        return "Owner: " + ownerName + " Balance: " + balance;
    }
}

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount o = new BankAccount("moh", 1000);

        o.deposit(200);
        o.withdraw(100);

        o.setOwnerName("ali");

        System.out.println(o);
        System.out.println(o.getOwnerName());
        System.out.println(o.getBalance());
    }
}