import java.util.Scanner;

//Write a program to print given array in reverse order.

public class PrintArrayInReverseOrder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter all the elements ;");
        for (int i = 0; i < size; i ++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array : ");
        for (int num : arr)
        {
            System.out.print(num +", ");
        }

        System.out.println();

        System.out.println("Array in Reverse order :");
        for (int i = size - 1; i >= 0; i--)
        {
            System.out.print(arr[i] +", ");
        }

        sc.close();
    }
}
