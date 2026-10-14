import Banking.BankAccount;
import Banking.InsufficientBalanceException;
import Banking.TransactionTask;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount(101, 10000);

        Thread t1 = new Thread(
                new TransactionTask(account, 7000),
                "Transaction-A"
        );

        Thread t2 = new Thread(
                new TransactionTask(account, 6000),
                "Transaction-B"
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(
                "Final Balance: Rs. " + account.getBalance()
        );



    }
}
