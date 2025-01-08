//Write a java program to take user input
//i. through Command Line Argument.
//ii. through Scanner class.

public class User_Input_CommandLineArgs
{
    public static void main(String[] args)
    {
        System.out.println("What is your name? ");
        String str = args[0];
        System.out.println(str);

        System.out.println("What is your Roll Number? ");
        int rollNum = Integer.parseInt(args[1]);
        System.out.println(rollNum);
    }
}
