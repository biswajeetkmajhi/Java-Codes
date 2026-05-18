//1.wap to input a sentence and print each word of the string along with its length in tabular form

import java.util.Scanner;

public class p1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        
        StringBuilder word = new StringBuilder();
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        
        for (int i = 0; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            if (ch != ' ')
            {
                word.append(ch);
            }
            else
            {
                printWord(word);
                word.setLength(0);
            }
        }
        printWord(word);
    }
    
    public static void printWord(StringBuilder word)
    {
        if (word.length() > 0)
        {
            System.out.println(word + "\t" + word.length());
        }
    }
}
