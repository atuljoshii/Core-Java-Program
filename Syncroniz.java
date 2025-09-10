class apnabank
{
	int x;
	int y;
	
/* without sincroziaton the program is solved  kyuki x and y local vriable hai or local tho 
   object me jata hi nhai hai or global or local ka nam same hai ies wjh se kuch prblm nahi aari*/
	
	int add (int x,int y)
	{
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
		
		try
		{
	       Thread.sleep(1000);
		}
		catch (Exception e){}
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
		
		try
		{
	       Thread.sleep(1000);
		}
		catch (Exception e){}
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
		
		try
		{
	       Thread.sleep(1000);
		}
		catch (Exception e){}
	}	
	
}

class Syncroniz
{
	public static void main (String str [])
	{
		apnabank ab = new apnabank();
		
		thread1 t1 = new thread1(ab,"Coustmer1");
		thread2 t2 = new thread2(ab,"Coustmer2");
	    thread3 t3 = new thread3(ab,"Coustmer3");
	}
}