class aloochaat implements Runnable
{
	aloochaat (String str)
	{
		super(str);
		start();
	}
	public void run()
	{
		for (int i=1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName());
			try
			{
				Threadsleep(1000);
			}
			catch(Exception h){}
		}
	}
}

class runsleep
{
	aloochaat al = new aloochaat("dfghgfds");	
}