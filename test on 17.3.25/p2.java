//2.take list of string input and arrange them in descending order according to their length

import java.util.*;

class p2 
{
    public static void main(String args[]) 
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter no. of Names");
        int n = x.nextInt();
        x.nextLine(); 

        System.out.println("Enter Names");
        String s[] = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = x.nextLine();

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            { 
                if (s[i].length() < s[j].length()) 
                {
                    String s1 = s[i];
                    s[i] = s[j];
                    s[j] = s1;
                }
            }
        }

        System.out.println("Arranged Names");
        for (int i = 0; i < n; i++)
            System.out.print(s[i] + " ");

    }
}
