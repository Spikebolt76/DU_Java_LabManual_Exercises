// Write a program to create basic calculator by getting 2 numbers and 1 string (operation)
// from the user and apply the operation given in a string on the given numbers.

import java.util.Scanner;

public class basic_calculation_program
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Please select an operation (+ or - or * or / or %) :");
        String operation = input.nextLine();
        char sign = operation.charAt(0);

        System.out.println("==> Enter two integers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        switch (sign)
        {
            case '+':
                System.out.println("num1 + num2 = %d" + num1 + num2);
                break;
            case '-':
                System.out.println("num1 - num2 = " + (num1 - num2));
                break;
            case '*':
                System.out.println("num1 * num2 = " + num1 * num2);
                break;
            case '/':
                System.out.println("num1 / num2 = " + num1 / num2);
                break;
            case '%':
                System.out.println("num1 % num2 = " + num1 % num2);
                break;
            default:
                System.out.println("Invalid input ! please enter the sign of the operation ! ");
                break;
        }

        input.close();



    }
}
