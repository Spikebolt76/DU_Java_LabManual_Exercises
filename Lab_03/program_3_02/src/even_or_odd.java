// Write a program to check whether a number is even or odd :

import java.util.Scanner;

public class even_or_odd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = input.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("The input number is EVEN.");
        } else {
            System.out.println("The input number is ODD.");
        }
        input.close();
    }

}