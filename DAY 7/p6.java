//6.wap to input a string and check whether the string is palindrome or not
import java.util.Scanner;

import java.util.Scanner;

public class p6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        boolean isPalindrome = true;
        int length = str.length();
        
        for (int i = 0; i < length / 2; i++)
        {
            if (str.charAt(i) != str.charAt(length - i - 1))
            {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome)
            System.out.println("The string is a palindrome.");
        else
            System.out.println("The string is not a palindrome.");
    }
}
