import java.util.*;
class seventh_largest
{
	int largest(int arr[])
	{
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					flag=1;
				}
				if(flag==0)
					break;
			}
		}
		return arr[6];
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
		
		seventh_largest ob=new seventh_largest();
		int num=ob.largest(arr);
		System.out.print("7th largest number is :"+num);
		if(ob.pallindrome(num))
			System.out.println(",Pallindrom No.");
		else
			System.out.println(",Not a Pallindrom No.");
	}
}

