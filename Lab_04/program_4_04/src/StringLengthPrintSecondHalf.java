import java.util.Scanner;

//Write a program to find length of string and print second half of the string.

public class StringLengthPrintSecondHalf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        System.out.println("Length of the string = "+ str.length());

        System.out.println("Second Half of the string : "+ str.substring(str.length() / 2));

        sc.close();
    }
}
