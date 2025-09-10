class consterprg
{
	void bum(int x ,int y)
	{
		System.out.println(x+y);
	}
	
	void bum(int x ,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	void bum(int a ,int b ,int c ,int d)
	{
		System.out.println((a+b)-(c+d));
	}
	
	public static void main (String args[])
	{
		
		consterprg o1 = new consterprg();
		
		o1.bum(20,30,23);
		o1.bum(20,30);
		//o1.bum(80,90,50,20);
		o1.bum(80,90,75,65);
		
	}
}