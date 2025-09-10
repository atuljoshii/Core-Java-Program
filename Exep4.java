class Exep4
{
	public static void main (String args[])
	//nasted try catch block 
 {
	try
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
    
	try	
	{
	int y [] = {10,20};
	y [4] = 9;
	System.out.println(y);
		
	}
	catch(ArrayIndexOutOfBoundsException bb)
	{
		System.out.println("limit se bhar jaa rahe ho");
	}
	}
	catch(Exception  vb)
	{
		System.out.println(vb);
	}
  } 
}