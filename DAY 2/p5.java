/*5.Find the no. of occurrence of each element in a user entered list of nos.*/
class p5
{
	public static void main(String args[])
	{
		int a[]=new int [args.length];
		for(int i=0;i<args.length;i++)
			a[i]=Integer.parseInt(args[i]);

		int count=0;
		int c=0;
		int b[]=new int [args.length];
		
		for(int i=0;i<args.length-1;i++)
		{
			for(int j=i;j<args.length;j++)
			{
				if(a[i]==a[j])
					count++;
			}

			int flag=0;

			for(int k=0;k<c;k++)
			{
				if (a[i]==b[k])
				{
					flag=1;
					break;
				} 
			}
			if(flag == 0)
			{
				b[c]=a[i];
				c++;
				System.out.println("Occurences of "+a[i]+"="+count);
			}	
			flag=0;
			count=0;
		}
	}
}