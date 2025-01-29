import javax.crypto.spec.PSource;
import java.util.Scanner;

public class pattern_02
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (MUST BE ODD) : ");

        while (true)
        {
            int rows = sc.nextInt();
            if (rows % 2 == 0)
            {
                System.out.println("Invalid input ! please enter an ODD number of rows.");
                continue;
            }

            for (int i = 1; i <= rows; i++)
            {
                for (int j = 1; j <= rows; j++)
                {
                    if (i == j || i + j == rows + 1)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.println("Do you want to continue ? : Y / N");
            if(("Y").equals(sc.nextLine("Y")))
            {

            }
        }

    }
}