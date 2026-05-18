class Five implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
			System.out.println(5*i);
	}
}

class Seven implements Runnable
{
	public void run()
	{	
		for(int i=1;i<=10;i++)
			System.out.println(7*i);
	}
}	

class p2
{
	public static void main(String ar[])
	{
		Five f=new Five();
		Seven s=new Seven();
		Thread t1=new Thread(f);
		Thread t2=new Thread(s);

		t1.start();
		t2.start();
	}
}