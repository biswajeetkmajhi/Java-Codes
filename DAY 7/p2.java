//2.wap to input a sentence and arrange its word of the string in alphabetical order (ascending order)

import java.util.Scanner;

public class p2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        String words[] = new String[100];
        int wordCount = 0;
        String word = "";
        
        for (int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if (ch != ' ')
            {
                word += ch;
            }
            else
            {
                words[wordCount++] = word;
                word = "";
            }
        }
        if (!word.equals(""))
        {
            words[wordCount++] = word;
        }
        
        for (int i = 0; i < wordCount - 1; i++)
        {
            for (int j = i + 1; j < wordCount; j++)
            {
                if (compare(words[i], words[j]) > 0)
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.println("\nWords in alphabetical order:");
        for (int i = 0; i < wordCount; i++)
        {
            System.out.println(words[i]);
        }
    }
    
    public static int compare(String a, String b)
    {
        int len = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < len; i++)
        {
            if (a.charAt(i) != b.charAt(i))
            {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }
}
