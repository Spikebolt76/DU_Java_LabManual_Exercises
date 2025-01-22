import java.util.Scanner;

// Write a program that creates and initializes a four integer element array. Calculate and display the average of its values

public class CalculateAverageArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter all the integers : ");
        for (int i = 0; i < size; i ++)
        {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : arr)
        {
            sum += num;
        }

        double avg = (double) sum / size;

        System.out.println("Average of given array is = "+ avg);
        sc.close();
    }
}
