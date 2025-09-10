class Thread2 extends Thread
{
	Thread2 (String str)
	{
		super(str);
	}
	
	public void run()
	{
		for(int i = 1; i<=6; i++)
		{
			System.out.println(getName());
			try
			{
				Thread.sleep(2000); // thread sleep throw Exception thats why we use try catch
			}
			catch(Exception y){}
		}
		System.out.println("This thread is dead :"+getName());
	}
}

class Thread3 extends Thread
{
	Thread3 (String str)
	{
		super(str);
	}
	
	public void run()
	{
		for(int i = 1; i<=4; i++)
		{
			System.out.println(getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception y){}
		}
		System.out.println("This thread is dead :"+getName());
	}
}

class Thread4 extends Thread
{
	Thread4 (String str)
	{
		super(str);
	}
	
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(getName());
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception y){}
		}
		System.out.println("This thread is dead :"+getName());
	}
}

class ThreadJoinm
{
	public static void main (String args[])
	{
		Thread2 t2 =new Thread2("Atuljoshi2");
		Thread3 t3 =new Thread3("Atuljoshi3");
		Thread4 t4 =new Thread4("Atuljoshi4");
		
		t2.start();
		t3.start();
		t4.start();
		
		try
		{
			t4.join();
			t3.join();
			t2.join();
		}
		catch (Exception r){}
	}
}
