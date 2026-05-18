/*2.Accept 10 numbers from command line and check how many of them are even and how many are odd.*/

class p2
{
	public static void main(String args[])
	{
		if(args.length!=10)
		{
			System.out.println("Invalid! 10 no. only");
			System.exit(0);
		}

		int a[]=new int[10];
		for(int i=0;i<10;i++)
			a[i]=Integer.parseInt(args[i]);

		int odd_count=0,even_count=0;
		
		for(int i=0;i<10;i++)
		{
			if(a[i]%2==0)
				even_count++;
			else
				odd_count++;
		}
		System.out.println("Even count : "+even_count);
		System.out.println("Odd count  : "+odd_count);
	}
}