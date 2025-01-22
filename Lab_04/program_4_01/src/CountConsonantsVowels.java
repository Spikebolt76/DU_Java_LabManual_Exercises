import java.util.Scanner;

// Write a program to accept a line and check how many consonants and vowels are there in line.

public class CountConsonantsVowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Text String: ");
        String str = sc.nextLine().toLowerCase();
        int consonantCount = 0, vowelCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        sc.close();
    }
}
