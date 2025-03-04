import java.util.*;

class Bank_Account {

    final String name;
    final int accountNo;
    private double accountBalance;

    public Bank_Account (String name, int accountNo) {
        this.name = name;
        this.accountNo = accountNo;
        System.out.println("New Account Created !");
    }

    public void deposit (double amount) {
        accountBalance += amount;
        System.out.println(amount +" successfully deposited to your balance.");
    }

    public void withdraw (double amount) {
        if (accountBalance - amount < 1000) {
            System.out.println("Sorry, You don't have enough balance! The total balance must be over 1000.");
        }
        else {
            accountBalance -= amount;
            System.out.println(amount + " Successfully withdrawn from your balance.");
        }
    }

    public void showBalance () {
        System.out.println("Account Details :");
        System.out.println("Holder's Name => "+ name);
        System.out.println("Account Number => "+ accountNo);
        System.out.println("Current Balance => "+ accountBalance);
    }
}

public class BankAccount_menuDriven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("||________XYZ BANKING SYSTEM________||");

        Bank_Account bank1 = new Bank_Account("Jinesh", 240101);

        while (true) {

            System.out.println("\nHello "+ bank1.name +" !");
            System.out.println("What service would you like to choose ? :");
            System.out.println("    => (1) Deposit an amount");
            System.out.println("    => (2) Withdraw an amount");
            System.out.println("    => (3) Check Your Balance and other details");
            System.out.println("Press the number to choose the service....");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the amount you want to deposit :");
                    bank1.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw :  ");
                    bank1.withdraw(sc.nextDouble());
                    break;
                case 3:
                    bank1.showBalance();
                    break;
            }

            System.out.println();
            System.out.println();
            sc.nextLine();

            System.out.println("Enter 'Y' If you want to continue the service, and 'N' to Quit the service. ");
            if (sc.nextLine().equals("Y")) {
                continue;
            }
            else {
                break;
            }

        }
    }
}
