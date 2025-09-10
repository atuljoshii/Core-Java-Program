class chain
{
	
	chain()
	{
		this(10);
		System.out.println("Defult constucter");
	}
	
	chain(int x)
	{
		this(10,20);
		System.out.println(x);
	}
	
	chain(int x,int y)
	{
		this(20,20,10);
		System.out.println(x+y);
	}
	
	chain(int x,int y,int z)
	{
		System.out.println(x+y-z);
	}
	
	
	public static void main (String args[])
	{
		new chain();
	}
	
	
}