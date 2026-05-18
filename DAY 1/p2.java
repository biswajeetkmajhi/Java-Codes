/*2.Write a program to print the corresponding grade for the given
mark using if..else statement in Java*/

import java.util.*;
class p2
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the marks score out of 100: ");
		int n=x.nextInt();
		
		if(n>=90)
		System.out.println("Grade : O");

		else if(n>=80 && n<=89)
		System.out.println("Grade : E");

		else if(n>=70 && n<=79)
		System.out.println("Grade : A");

		else if(n>=60 && n<=69)
		System.out.println("Grade : B");

		else System.out.println("Grade : C");
	}
}


		