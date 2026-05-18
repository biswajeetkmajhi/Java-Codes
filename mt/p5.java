//synchronized method

class A
{
	synchronized void ptable(int n)
	{
		for(int i=0;i<=10;i++)
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
	A t;
	Thread1(A p)
	{
		t=p;
	}

	public void run()
	{
		t.ptable(5);
	}
}

class Thread2 extends Thread
{
	A t;
	Thread2(A p)
	{
		t=p;
	}

	public void run()
	{
		t.ptable(7);
	}
}

class p5 
{
	public static void main(String ar[])
	{
		A ob=new A();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}
