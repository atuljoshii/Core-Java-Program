class strihan4
{
	String cub;
	strihan4(String cub)
	{
		this.cub=cub;
	}
	public String toString()
	{
		
		return cub;
	}
	
	public boolean equals (strihan4 cub)
	{
		if(this.cub==cub.cub)
		{
			return true ;
		}
		else 
		{
			return false ;
		}
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
	}	
}