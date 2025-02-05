import java.util.*;

class TextString1
{
    String str;
    Map<Character, Integer> vowelCount = new HashMap<>();

    public TextString1() {
        vowelCount.put('a', 0);
        vowelCount.put('e', 0);
        vowelCount.put('i', 0);
        vowelCount.put('o', 0);
        vowelCount.put('u', 0);
    }

    public void countVowels(String input)
    {
        for (char ch : input.toLowerCase().toCharArray())
        {
            if (vowelCount.containsKey(ch))
            {
                vowelCount.put(ch, vowelCount.get(ch) + 1);
            }
        }
    }

    public void displayVowelCounts() {
        System.out.println("Vowel counts: " + vowelCount);
    }
}

public class CountVowels_usingClass_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TextString1 text = new TextString1();

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
