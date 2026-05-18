class numbers
{
	void fibonacci(int fib[])
	{
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<10;i++)
			fib[i]=fib[i-1]+fib[i-2];
	}
	
	void prime(int prime[])
	{
		int count=0;
		int flag=0;
		int n=1;
		while(count<10)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					flag++;
			}
			
			if(flag==2)
			{
				prime[count]=n;
				count++;
			}
			flag=0;
			n++;
		}
	}
}

class Main
{
	public static void main(String ar[])
	{
		numbers ob=new numbers();
		int fib[]=new int[10];
		int prime[]=new int[10];
		
		ob.fibonacci(fib);
		ob.prime(prime);

		for(int i=0;i<10;i++)
			System.out.print(fib[i]+" "+prime[i]+" ");
	}
}