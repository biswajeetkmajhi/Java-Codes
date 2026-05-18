//5.wap to input a string and print each word of the string in the reverse order
import java.util.Scanner;

import java.util.Scanner;

public class p5
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
        
        System.out.println("\nWords in reverse order:");
        for (int i = 0; i < wordCount; i++)
        {
            System.out.println(reverse(words[i]));
        }
    }
    
    public static String reverse(String str)
    {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev += str.charAt(i);
        }
        return rev;
    }
}
