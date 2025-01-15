// Write a program to find maximum no from given 3 no.(without if-else).

import java.util.Scanner;

public class FindMaxNumFromThree
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maxNum = a > b ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("The Maximum of all three numbers is = " + maxNum);

        input.close();
    }

}
