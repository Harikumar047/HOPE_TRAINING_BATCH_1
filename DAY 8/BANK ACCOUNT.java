class Account {
    private int amount;
    private String pin;

    Account(int amount, String pin) {
        this.amount = amount;
        this.pin = pin;
    }

    boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    void getBalance() {
        System.out.println("Available Balance : " + amount);
    }

    void deposit(int deposit) {
        amount += deposit;
        System.out.println("Deposit successful");
    }

    void withdrawal(int withdraw) {
        if (withdraw > amount) {
            System.out.println("Insufficient funds");
        } else {
            amount -= withdraw;
            System.out.println("Withdrawal Successful");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial amount: ");
        int amount = sc.nextInt();

        System.out.println("Set your security PIN: ");
        String pin = sc.next();

        Account a1 = new Account(amount, pin);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    int amt = sc.nextInt();
                    a1.deposit(amt);
                    break;

                case 2:
                    System.out.println("Enter PIN: ");
                    String enteredPin = sc.next();

                    if (a1.checkPin(enteredPin)) {
                        System.out.println("Enter withdrawal amount: ");
                        int withdrawAmt = sc.nextInt();
                        a1.withdrawal(withdrawAmt);
                    } else {
                        System.out.println("Invalid PIN");
                    }
                    break;

                case 3:
                    a1.getBalance();
                    break;

                case 4:
                    System.out.println("Thank you! Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}