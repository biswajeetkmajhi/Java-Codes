//4.wap to input a string (any combination) and print the frequency of each character

import java.util.Scanner;

public class p4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        char[] characters = new char[256];
        int[] frequency = new int[256];
        int uniqueCount = 0;
        
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int index = -1;
            
            for (int j = 0; j < uniqueCount; j++)
            {
                if (characters[j] == ch)
                {
                    index = j;
                    break;
                }
            }
            
            if (index == -1)
            {
                characters[uniqueCount] = ch;
                frequency[uniqueCount] = 1;
                uniqueCount++;
            }
            else
            {
                frequency[index]++;
            }
        }
        
        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < uniqueCount; i++)
        {
            System.out.println(characters[i] + " : " + frequency[i]);
        }
    }
}
