class Exep
{
	public static void main (String args[])
 {
	try
	{
		int x = 10/0;
		
	    System.out.println(x);
	}
	
	catch(ArithmeticException vb)
	{
		System.out.println("Zero allow nahi hai");
	}
  } 
}