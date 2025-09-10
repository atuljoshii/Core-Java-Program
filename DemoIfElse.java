class DemoIfElse
{
	public static void main (String args[])
	{
		int age = 17;
		
		if(age>=18)
		{
			System.out.println("You are valid to vote");
		}
		else if (age==17)
		{
			System.out.println("You can wait for one year");
		}
		else{
						System.out.println("You are not valid to vote");
		}
	}
}