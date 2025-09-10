class apnabank
{
	int x;
	int y;
	
/*this progaram is with the  synchronized keyword it solve the progaram */
	
	synchronized int add (int a,int b)
	{
		x=a;
		y=b;
			
		try
		{
	       Thread.sleep(2000);
		}
		catch (Exception e){}
		
		return x+y;
	}
}

class thread1 extends Thread
{
	apnabank ab ;
	
	thread1 (apnabank ab , String str)
	{
		super (str);
		this.ab=ab;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread 1 addition" +getName()+"  ---->"+ab.add(20,30));
	}	
	
}

class thread2 extends Thread
{
	apnabank ab ;
	
	thread2 (apnabank ab , String str)
	{
		super (str);
		this.ab=ab;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread 2 addition" +getName()+"  ---->"+ab.add(30,30));
	 
	}	
	
}

class thread3 extends Thread
{
	apnabank ab ;
	
	thread3 (apnabank ab , String str)
	{
		super (str);
		this.ab=ab;
		start();
	}
	
	public void run()
	{
		System.out.println("Thread 3 addition" +getName()+"  ---->"+ab.add(50,30));
	}	
	
}

class Syncroniz2
{
	public static void main (String str [])
	{
		apnabank ab = new apnabank();
		
		thread1 t1 = new thread1(ab,"Coustmer1");
		thread2 t2 = new thread2(ab,"Coustmer2");
	    thread3 t3 = new thread3(ab,"Coustmer3");
	}
}