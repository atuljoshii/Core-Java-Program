interface My 
{
	void show();
}

class inter3 implements My
{
	  public void show()
	{
		System.out.println(" show from inter3 class ");
	}
	
	
	public static void main (String args[])
	{
		My m = new inter3(); //upcasting
		m.show();
	}
}