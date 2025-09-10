//we are 2023 students we are not form 2010 our brain dosen't work poraply 
// their is a run method inside start method.
class Runmethod
{
	void start()
	{
		run();
	}
	
	void run()
	{
		System.out.println("This is from run method");
	}
	
	public static void main (String args[])
	{
		Runmethod r1 = new Runmethod();
		
		r1.start();
	}
}