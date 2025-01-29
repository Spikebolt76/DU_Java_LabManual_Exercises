import java.util.Scanner;

public class pattern_01
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i ++)
        {
            for (int j = i; j < rows; j++)
            {
                System.out.print("  ");
            }

            int k;
            for (k = 1; k <= i; k ++)
            {
                System.out.print(k + " ");
            }

            for (k = k - 2; k >= 1; k--)
            {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
