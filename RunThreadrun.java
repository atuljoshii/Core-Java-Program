class Threadre implements Runnable
{
	public void run()
	{
		for(int i = 1; i<=5; i++)
		{
			System.out.println(Thread.currentThread().
			getName());
		}
	}
}

/*aagr apko ek hi class ke object ko defrent defrent thread pass karna or uske andar object
same dalna hai tho*/ 

class RunThreadrun
{
	public static void main (String args[])
	{
		Threadre t5 = new Threadre();
		
		Thread thread =new Thread (t5);
		Thread thread2 =new Thread(t5);
		Thread thread3 =new Thread(t5);
		
		thread.start();
		thread2.start();
		thread3.start();
	}
}

