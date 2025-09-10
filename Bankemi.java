class Bank 
{
	int Money;
	static int rate = 10;
	static int year = 5;
	synchronized  int Emi (int Money)
	{
		this.Money=Money;
		
		try
		{
	       Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return ((((Money*rate*year)/100)+Money)/60);
	}
}

class thread1  extends Thread
{
	Bank b;
	
	thread1 (Bank b , String str)
	{
		super (str);
		this.b=b;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread  1" +getName()+"  ---->"+b.Emi(50000));
	
	    try
		{
	       Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}	
}

class thread2  extends Thread
{
	Bank b;
	
	thread2 (Bank b , String str)
	{
		super (str);
		this.b=b;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread 2" +getName()+"  ---->"+b.Emi(60000));
	
	    try
		{
	       Thread.sleep(2000);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}	
}

class Bankemi
{
	public static void main (String args [])
	{
	
	Bank b = new Bank();
	
	thread1 t = new thread1 (b," per month Emi id ");
	thread2 t1 = new thread2(b," per month Emi id ");
	
	}
}
