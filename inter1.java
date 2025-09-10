interface My 
{
	static void show()
	{
		System.out.println("Show from my Interface");
	}
		
}

class inter1 implements My
{
	public static void main (String args[])
	{
		My.show();
	}
}


// THis interface is by Static Method 
// and we have to implements interface by implement like extends 