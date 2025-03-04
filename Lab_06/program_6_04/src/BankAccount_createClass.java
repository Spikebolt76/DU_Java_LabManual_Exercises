import java.util.Scanner;

// Create a class named Bank_Account with data members: accountNo, userName, email,
// accountType and accountBalance. Also create methods getAccountDetails() and displayAccountDetails().

class BankAccount
{

    long accountNo;
    String username;
    String emailID;
    String accountType;
    double accountBalance;

    public BankAccount()
    {
        System.out.println("New Account created. ");
        getAccountDetails();
        displayAccountDetails();
    }

    public void getAccountDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Account Details : ");

        System.out.println("    => Enter your Username : ");
        username = sc.nextLine();

        System.out.println("    => Enter your Email ID : ");
        emailID = sc.nextLine();

        System.out.println("Signed in successfully !");

        System.out.println("    => Enter your Account Type (From : Savings, Student, Salary, Joint): ");
        accountType = sc.nextLine();

        System.out.println("    => Enter your Account Number : ");
        accountNo = sc.nextLong();

        System.out.println("    => Deposit an amount of money :");
        accountBalance = sc.nextInt();

        System.out.println("Thank you for your patience! Please wait, processing *...\n");

    }

    public void displayAccountDetails()
    {
        System.out.println("||=> Your account details :");
        System.out.println("    Username : "+ username);
        System.out.println("    EmailID : "+ emailID);
        System.out.println("    Account Type :"+ accountType);
        System.out.println("    Account Number :"+ accountNo);
        System.out.println("    Your Current Balance :" + "$ " + accountBalance);

        System.out.println("\n");
    }
}

public class BankAccount_createClass
{
    public static void main(String[] args)
    {
        System.out.println("|| XYZ BANKS LTD. ||");
        System.out.println("||----------------||");

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
    }
}
