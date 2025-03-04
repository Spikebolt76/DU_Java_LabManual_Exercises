import java.util.*;

class TextString2
{
    int[] vowelCount = new int[5];

    public void countVowels(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            if (input.toLowerCase().charAt(i) == 'a')
                vowelCount[0]++;
            else if(input.toLowerCase().charAt(i) == 'e')
                vowelCount[1]++;
            else if(input.toLowerCase().charAt(i) == 'i')
                vowelCount[2]++;
            else if(input.toLowerCase().charAt(i) == 'o')
                vowelCount[3]++;
            else if(input.toLowerCase().charAt(i) == 'u')
                vowelCount[4]++;
        }
    }

    public void displayVowelCounts()
    {
        System.out.println("Vowel counts: ");
        System.out.println("number of 'a's = " + vowelCount[0]);
        System.out.println("number of 'e's = " + vowelCount[1]);
        System.out.println("number of 'i's = " + vowelCount[2]);
        System.out.println("number of 'o's = " + vowelCount[3]);
        System.out.println("number of 'u's = " + vowelCount[4]);
    }
}

public class CountVowels_usingClass_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TextString2 text = new TextString2();

        while (true)
        {
            System.out.println("Enter a sentence (type 'quit' to exit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            text.countVowels(input);
        }

        text.displayVowelCounts();
        sc.close();
    }
}