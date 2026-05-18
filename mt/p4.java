//static synchronized method

class a
{
	synchronized static void ptable(int n)
	{
		for(int i=1;i<=10;i++)
			System.out.println(n*i);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e){}
	}
}

class Thread1 extends Thread
{
	public void run()
	{
		a.ptable(5);
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		a.ptable(7);
	}
}

class p4 
{
	public static void main(String ar[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}
}
 