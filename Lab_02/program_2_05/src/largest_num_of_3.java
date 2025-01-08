//Write a program that prompts the user to enter three numbers. Find the largest number:

import java.util.Scanner;

public class largest_num_of_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int largestNum = num1 > num2 ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        int largestNum_ = num1 > num2 ? Math.max(num1, num3) : Math.max(num2, num3);

        System.out.println("The largest number of three inputs is = "+ largestNum);

        input.close();

    }
}
