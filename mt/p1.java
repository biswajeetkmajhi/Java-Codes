class Five extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(5*i);
	}
}

class Seven extends Thread
{
	public void run()
	{	
		for(int i=1;i<=10;i++)
			System.out.println(7*i);
	}
}	

class p1 
{
	public static void main(String ar[])
	{
		Five t1=new Five();
		Seven t2=new Seven();
		t1.start();
		t2.start();
	}
}	