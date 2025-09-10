class Exep7
{
		int age;
		
		void validage (int age) throws Exception
		{
			if(age<18)
			{
				throw new AgeException("Now valid age ");
			}
			else 
				this.age=age;
			    System.out.println(age);
		}
		
	public static void main (String args[])
	{
		Exep7 d1 = new Exep7();
		try
		{
			d1.validage(14);
		}
		catch (Exception f)
		{
			System.out.println(f);
		}	
	}
}

class AgeException extends Exception
{
	AgeException(String str)
	{
		super(str);
	}
}
