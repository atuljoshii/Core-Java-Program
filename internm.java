interface My 
{
	 default void show()
	{
		System.out.println("Show from my Interface");
	}
		
}

interface My1 
{
	 default void show()
	{
		System.out.println("Show from my(1) Interface");
	}
		
}

class internm implements My,My1
{
	 public void show()
	{
		System.out.println(" show from internm non-static class ");
	}
	
	public static void main (String args[])
	{
		My m = new internm();
		m.show();
		My1 n = new internm();
		n.show();
	}
}

//this is multipal inheritance which is only posibal by java 

