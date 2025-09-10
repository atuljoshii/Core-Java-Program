class strihan3
{
	String cub;
	strihan3(String cub)
	{
		this.cub=cub;
	}
	public String toString()
	{
		return cub;
	}
	
	public static void main (String args[])
	{
		String a1 = new String("Good morning");
		String a2 = new String("Good morning");
		
		if(a1.equals(a2))
		{
			System.out.println("Both are same ");
		}
		else
		{
			System.out.println("not same ");
		}
		
		String d1 = new String("Good morning");
		String d2 = new String("Good Morning");
		
		if(d1.equals(d2))
		{
			System.out.println("Both are same ");
		}
		else
		{
			System.out.println("not same ");
		}
		
	}
	
}