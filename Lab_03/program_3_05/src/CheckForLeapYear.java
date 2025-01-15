//Write a program to check whether a year is leap year or not.

import java.util.Scanner;

public class CheckForLeapYear
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year : ");

        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("The input year IS a Leap Year. ");
        }
        else
        {
            System.out.println("The input year is NOT a Leap Year. ");
        }

        input.close();
    }

}
