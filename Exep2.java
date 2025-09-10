class Exep2
{
	public static void main (String args[])
 {
	try
	{
		int x = 10/0;
		
	    System.out.println(x);
		
		int y [] = {10,20};
		y [4] = 9;
		System.out.println(y);
		
	}
	
	catch(ArrayIndexOutOfBoundsException bb)
	{
		System.out.println("limit se bhar jaa rahe ho");
	}
	
	catch(ArithmeticException vb)
	{
		System.out.println("Zero allow nahi hai");
	}
	
	catch(Exception  vb)
	{
		System.out.println(vb);
	}
  } 
}