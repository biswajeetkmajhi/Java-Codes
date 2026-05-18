class p2
{
	public static void main(String ar[])
	{
		try
		{
			int a=20;
			int b=a%0;
			System.out.println("Value of b="+b);
		}
		catch(ArithmeticException e)
		{	
		}
		finally
		{
			System.out.println("ArithmeticException caught by try-catch-finally block");
		}
	}
}