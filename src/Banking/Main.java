import Banking.BankAccount;
import Banking.InsufficientBalanceException;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(101, 1000);

        try {
            account.deposit(500);
            account.withdraw(500);

        } catch (InsufficientBalanceException err) {
            System.out.println("Transaction failed: " + err.getMessage());
        } finally{
            account.intrestwithWithdrow(500 , 360);
            System.out.println("Final Balance: Rs. " + account.getBalance());
            System.out.println("Transaction Process complete");
        }



    }
}
