import java.util.*;
abstract class p4
{
	abstract void armstrong(int num,int d);
}

class A extends p4
{
	int digit(int num)
	{
		int count=0;
		for(int i=num;i>0;i/=10)
		{
			count++;
		}
		return count;
	}
	
	void armstrong(int num,int d)
	{
		int sum=0;
		for(int i=num;i>0;i/=10)
		{
			int digit =i%10;
			sum=sum+(int)Math.pow(digit,d);
		}
		if(sum==num)
			System.out.println("Armstrong no.");
		else
			System.out.println("Not an Armstrong no.");
	}
}
	
class Main
{
	public static void main(String ar[])
	{
		Scanner x=new Scanner(System.in);
		System.out.println("Engter any digit no to check Armstrong :");
		int n=x.nextInt();
		
		A ob=new A();
		int d=ob.digit(n);
		ob.armstrong(n,d);
	}
}