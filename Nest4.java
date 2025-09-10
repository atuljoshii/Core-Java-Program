class Nest4
{
	int x = 10;
	static int y = 8;
	
	// this is a local inner class this is created under display method
	
	void display()
	{
		class inner 
		{
			void show ()
			{
				System.out.println("this is a local inner class this is created under display method");
				System.out.println(x);
				System.out.println(y);
			}
		}
		inner in = new inner();
		in.show();
	}
	
	public static void main (String args[])
	{
		Nest4 n1 = new Nest4();
		n1.display();
	}
}