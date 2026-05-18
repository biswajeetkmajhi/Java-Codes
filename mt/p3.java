//1.synchronized block
class Share extends Thread
{
	static String msg[]={"1","2","3","4"};
	Share(String Threadname)
	{
		super(Threadname);
	}
		
	public void run()
	{
		display(getName());
	}
	public void display(String ThreadN)
	{
		synchronized(this)
		{
			for(int i=0;i<4;i++)
				System.out.println(ThreadN+" "+msg[i]);
		}
	}
}

class p3
{
	public static void main(String ar[])
	{
		Share t1=new Share("Thread 1:");
		t1.start();
		Share t2=new Share("Thread 2:");
		t2.start();
	}
}