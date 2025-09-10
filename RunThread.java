class Thread1 extends Thread
{
	Thread1 (String str)
	{
		super(str);    // super str is use to give name to the thread  
	}
	
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(getName());
		}
	}
}

//Thread class ---- we have run() method and start() method in thread class 
// for multipal class we can use thread 

class Thread2 extends Thread
{
	Thread2 (String str)
	{
		super(str);
	}
	
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(getName());
		}
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
		for(int i = 1; i<=15; i++)
		{
			System.out.println(getName());
		}
	}
}

class RunThread
{
	public static void main (String args[])
	{
		Thread1 t1 =new Thread1("Atuljoshi1");
		Thread2 t2 =new Thread2("Atuljoshi2");
		Thread3 t3 =new Thread3("Atuljoshi3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}