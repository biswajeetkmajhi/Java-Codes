import java.util.*;
class numbers
{

	int minimum(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}

	int maximum(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	boolean pallindrome(int num)
	{
		int m=num;
		int sum=0;
		while(m>0)
		{
			int d=m%10;
			sum=sum*10+d;
			m=m/10;
		}
		
		if(sum == num)
			return true;
		else
			return false;
	}
}

class Main
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);

		System.out.print("Enter size of the numbers :");
		int n=x.nextInt();

		int arr[]=new int[n];

		for(int i=0;i<n;i++)
			arr[i]=x.nextInt();

		numbers ob=new numbers();
		int min =ob.minimum(arr);
		
		System.out.print("Minimum no. :"+min);
		if(ob.pallindrome(min))
			System.out.println(",Pallindrom No.");
		else
			System.out.println(",Not a Pallindrom No.");

		int max=ob.maximum(arr);
		System.out.print("Maximum no. :"+max);
		if(ob.pallindrome(max))
			System.out.println(",Pallindrom No.");
		else
			System.out.println(",Not a Pallindrom No.");
	}
}