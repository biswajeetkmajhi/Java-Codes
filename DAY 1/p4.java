/*Program to check a user entered number is palindrome or not*/

import java.util.*;
class p4
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner (System.in);
		int newn=0;
		System.out.println("Enter any integer no. : ");
		int n=x.nextInt();
		for(int i=n;i>0;i/=10)
		{
			int d=i%10;
			newn=newn*10+d;
		}
		if(n == newn)
			System.out.println("Pallindrome No.");
		else
			System.out.println("Not a Pallindrome No.");
	}
}
