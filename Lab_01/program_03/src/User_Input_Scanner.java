//Write a java program to take user input
//i. through Command Line Argument.
//ii. through Scanner class.

import java.util.Scanner;

public class User_Input_Scanner
{
    public static void main(String[] args)
    {
        System.out.println("Please enter a username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        System.out.println("Welcome " + username +"!");

        scanner.close();
    }
}
