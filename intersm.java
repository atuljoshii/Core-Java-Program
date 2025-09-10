interface My 
{
	static void show()
	{
		System.out.println("Show from my Interface");
	}
		
}

interface My1 
{
	static void show()
	{
		System.out.println("Show from my(1) Interface");
	}
		
}

class intersm implements My,My1
{
	public static void main (String args[])
	{
		My.show();
		My1.show();
	}
}

