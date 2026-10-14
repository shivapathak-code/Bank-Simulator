import Banking.BankAccount;
import Banking.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, 1000);

        try {
            account.deposit(500);
            account.withdraw(2000);

        } catch (InsufficientBalanceException err) {
            System.out.println("Transaction failed: " + err.getMessage());
        } finally{
            System.out.println("Final Balance: Rs. " + account.getBalance());
            System.out.println("Transaction Process complete");
        }



    }
}
