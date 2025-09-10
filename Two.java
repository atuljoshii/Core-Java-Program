/*abstract class one 
{
	int x ;
	int y ;
	
	void show ()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
}

class Two extends one 
{
	void get (int x , int y )
	{
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args)
	{
		Two c1 = new Two();
		c1.get(10,30);
		c1.show();
		
	}
}*/

abstract class one 
{
	int x ;
	int y ;
	
	void show ()
	{
		System.out.println(x);
		System.out.println(y);
	}
	abstract void good();
}

class Two extends one 
{
	void get (int x , int y )
	{
		this.x=x;
		this.y=y;
	}
	
	void good()
	{
		 System.out.println("Good form Two");
	}
	
	public static void main(String[] args)
	{
		Two c1 = new Two();
		c1.get(10,30); 
		c1.show();
		c1.good();
		
	}
}