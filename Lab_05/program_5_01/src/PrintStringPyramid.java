import java.util.Scanner;

public class PrintStringPyramid
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 1; i <= input.length(); i++)
        {
            System.out.println(input.substring(0, i));
        }

        scanner.close();
    }
}
