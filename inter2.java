interface My 
{
	 default void show()
	{
		System.out.println("Show from my Interface");
	}
		
}

class inter2 implements My
{
	  public void show()
	{
		System.out.println(" show from inter2 class ");
	}
	
	
	public static void main (String args[])
	{
		My m = new inter2(); //upcasting
		m.show();
	}
}

//Defult keywors is use to assign non static metode
