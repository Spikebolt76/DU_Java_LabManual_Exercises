//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-32*5/9 )

import java.util.Scanner;

public class Fahrenheit_to_Celsius_conversion
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select a conversion :\n=> 1. Fahrenheit to Celsius \n=> 2. Celsius to Fahrenheit ");
        int choice = input.nextInt();

        double fahr, cels;

        switch (choice)
        {
            case 1:
                System.out.println("Enter the temperature in Fahrenheit :");
                fahr = input.nextDouble();
                cels = (fahr - 32.0) * (double) 5 / 9;
                System.out.printf("The temperature in Celsius is: %.2f°F\n", cels);
                break;

            case 2:
                System.out.println("Enter the temperature in Celsius :");
                cels = input.nextDouble();
                fahr = cels * (double) 9 / 5 + 32.0;
                System.out.printf("The temperature in Fahrenheit is: %.2f°F\n", fahr);
                break;

            default:
                System.out.println("Invalid input! please enter a numeric value. ");
                break;
        }

        input.close();
    }
}
