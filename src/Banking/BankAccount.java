package Banking;

public class BankAccount {

        private int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be greater than zero."
            );
        }

        balance = balance + amount;
        System.out.println("Deposit successful: Rs. " + amount);
    }

    public void withdraw(double amount)
        throws InsufficientBalanceException {

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Amount must be greater than zero."
                );
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                        "Your balance is insufficient!"
                );
            }

            balance = balance - amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }




}
