// Write a program to print prime numbers between given range.

import java.util.Scanner;

public class PrintPrimesFromRangeOfNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the range of integers : ");

        System.out.println("==> Lower number : ");
        int low = input.nextInt();
        System.out.println("==> Higher number : ");
        int high = input.nextInt();

        for (int i = low; i <= high; i++)
        {
            int j = 0;
            for (j = 2; j * j <= i; j++)
            {
                if (i % j != 0)
                {
                    System.out.println( i );
                }
            }
        }

        input.close();
    }

}
