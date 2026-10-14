package Banking;

public class TransactionTask implements Runnable{


        private BankAccount account;
        private double amount;

        public TransactionTask(BankAccount account, double amount) {
            this.account = account;
            this.amount = amount;
        }

        @Override
        public void run() {
            try {
                account.withdraw(amount);
            } catch (InsufficientBalanceException e) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " failed: " + e.getMessage()
                );
            } catch (IllegalArgumentException e) {
                System.out.println(
                        Thread.currentThread().getName()
                                + " failed: " + e.getMessage()
                );
            }
        }
    }

