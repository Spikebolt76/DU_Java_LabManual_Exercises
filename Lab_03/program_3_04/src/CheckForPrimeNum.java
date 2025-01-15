// Write a program to check that the given number is prime or not.

import java.util.Scanner;

public class CheckForPrimeNum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer : ");

        int num = input.nextInt();
        int i;
        boolean isPrime = true;  // Suppose that the number IS Prime

        if (num <= 0)
        {
            isPrime = false;
        }
        else
        {
            for (i = 2; i * i <= num; i++)
            {
                if (num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println("The number IS Prime.");
        }
        else
        {
            System.out.println("The number is NOT Prime.");
        }

        input.close();
    }
}
