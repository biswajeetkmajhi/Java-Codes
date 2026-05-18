/*1.Find the largest among 3 user entered nos. at the command prompt using Java*/

class p1
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		for(int i=0;i<3;i++)
			a[i]=Integer.parseInt(args[i]);

		if(a[0]>=a[1] && a[0]>=a[2])
			System.out.println(a[0]+" is greatest no.");

		else if(a[1]>=a[0] && a[1]>=a[2])
			System.out.println(a[1]+" is greatest no.");

		else 
			System.out.println(a[2]+" is greatest no.");
	}
}