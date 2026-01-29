public class Bank {
    public static void main(String[] args) {
        int balance = 1000;   // initial balance
        System.out.println("Initial Balance: " + balance);

        int deposit = 500;
        balance += deposit;
        System.out.println("Deposited: " + deposit);
        System.out.println("Balance after deposit: " + balance);

        int withdraw = 200;
        balance -= withdraw;
        System.out.println("Withdrawn: " + withdraw);
        System.out.println("Balance after withdrawal: " + balance);
    }
}
