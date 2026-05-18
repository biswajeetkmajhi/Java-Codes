/*5.Write a program in Java to take first name and last name from user and print
both in one line as last name followed by first name*/

import java.util.*;
class p5
{
	public static void main(String ar[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your first name");
		String fa=in.nextLine();
		System.out.println("Enter your last name");
		String la=in.nextLine();
		System.out.print(la+" "+fa);	

	}
}	
	