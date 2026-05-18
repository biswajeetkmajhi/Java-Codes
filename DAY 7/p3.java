//3.wap to input a sentence and arrange words of the string in order of their lengths from shortest to longest

import java.util.Scanner;

public class p3
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
                if (words[i].length() > words[j].length())
                {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        System.out.println("\nWords sorted by length:");
        for (int i = 0; i < wordCount; i++)
        {
            System.out.println(words[i]);
        }
    }
}
