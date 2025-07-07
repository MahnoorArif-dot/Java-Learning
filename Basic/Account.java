import java.util.*;

public class Account {

    public double balance;

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
			return amount;
        } else {
            return 0.0;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Account my_account = new Account();

        System.out.println("Enter the amount you want to deposit:");
        double deposit_am = in.nextDouble();
        my_account.deposit(deposit_am);

        System.out.println("Enter the amount you want to withdraw:");
        double withdraw_am = in.nextDouble();
        double withdrawn = my_account.withdraw(withdraw_am);
		
        System.out.println("The current balance in your account is: " + my_account.getBalance());
    }
}
