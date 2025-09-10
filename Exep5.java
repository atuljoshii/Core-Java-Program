class Exep5
{
	public static void main (String args [])
	{
try
{
	int x = 10/2;
	System.out.println(x);
}
catch(ArithmeticException ee)
{
	System.out.println("Zero allowed nahi hai ");
}
finally 
{
	System.out.println("ye hamesha chale cahe try catch chale ya na chale");
}
	}
}