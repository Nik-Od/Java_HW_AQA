package HW8.Task2;

class Bank {
    private static final int MAX_ACCOUNTS = 10;
    private Account[] accounts = new Account[MAX_ACCOUNTS];
    private int totalAccounts = 0;

    // Внутрішній клас Account
    private class Account {
        private String accountNumber;
        private double balance;

        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                Transactions.createTransaction("Deposit", accountNumber, amount);
            } else {
                System.out.println("Invalid deposit amount!");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                Transactions.createTransaction("Withdrawal", accountNumber, amount);
            } else {
                System.out.println("Invalid withdrawal amount or insufficient funds!");
            }
        }
    }

    // Внутрішній клас Transactions
    private static class Transactions {
        private static String type;
        private static String accountNumber;
        private static double amount;

        public static void createTransaction(String type, String accountNumber, double amount) {
            Transactions.type = type;
            Transactions.accountNumber = accountNumber;
            Transactions.amount = amount;

            // Друкуємо деталі транзакції
            System.out.println("Transaction Details: ");
            System.out.println("Type: " + type);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Amount: " + amount);
            System.out.println("-----------------------------");
        }
    }

    public void createAccount(String accountNumber, double balance) {
        if (totalAccounts < MAX_ACCOUNTS) {
            accounts[totalAccounts++] = new Account(accountNumber, balance);
            System.out.println("Account created with number: " + accountNumber);
        } else {
            System.out.println("Maximum accounts limit reached!");
        }
    }

    public void depositToAccount(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdrawFromAccount(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    private Account findAccount(String accountNumber) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // Створення рахунків
        bank.createAccount("12345", 1000);
        bank.createAccount("67890", 2000);

        // Проводимо транзакції
        bank.depositToAccount("12345", 500);
        bank.withdrawFromAccount("12345", 300);
        bank.withdrawFromAccount("67890", 1000);
    }
}

