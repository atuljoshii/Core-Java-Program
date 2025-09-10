class Nest1
{
	int x = 10;
	static int i = 20;
	
	static class inner
	{
		static void you()
		{
			System.out.println(i);
		}
	}
	
	public static void main (String args [])
	{
		System.out.println("From main method ");
		inner.you();
	}
}