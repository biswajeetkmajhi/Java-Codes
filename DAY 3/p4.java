/*4.Write a program to overload subtract method with various parameters in a class in Java. Write the driver class to use the different subtract methods using object.*/

class Main
{
	public static void main(String args[])
	{
		subtractmethods ob=new subtractmethods();
		System.out.println("Subtract two integerbnumber :"+ob.subtract(10,5));
		System.out.println("Subtract three integer number :"+ob.subtract(10,7,5));
		System.out.println("Subtract two double :"+ob.subtract(10.1,5.2));
	}
}

class subtractmethods
{
	public int subtract(int a,int b)
	{
		return a-b;
	}
	
	public int subtract(int a,int b,int c)
	{
		return a-b-c;
	}
	
	public double subtract(double a,double b)
	{
		return a-b;
	}
}
		