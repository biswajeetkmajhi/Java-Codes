/*Write a program to print the week day for the given day no. of the current month using switch case statement*/
import java.util.*;
class p3
{
	public static void main(String ar[])
	{
		Scanner x = new Scanner (System.in);
		System.out.println("Enter no. for any week day : ");
		int n =x.nextInt();
		
		switch(n)
		{
			case 0: System.out.println("Sunday");
				break;
			case 1: System.out.println("Moday");
				break;
			case 2: System.out.println("Tuesday");
				break;
			case 3: System.out.println("Wednesday");
				break;
			case 4: System.out.println("Thursday");
				break;
			case 5: System.out.println("Friday");
				break;
			case 6: System.out.println("Saturday");
				break;
			default : System.out.println("Invalid Input!");
		}
	}
}






	