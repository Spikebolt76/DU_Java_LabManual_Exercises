// Write a program to get 2 numbers from the user and print the sum of two numbers using Scanner class.

import java.util.Scanner;

public class add_2_nums_Scanner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.printf("num1 + num2 = %d", sum);
    }
}
