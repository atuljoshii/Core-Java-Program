class Revision
{
	void now ()
	{
		int i = 20 ;
		int b = 30 ;
		
		System.out.println("This is the Adison of 20 and 30");
		System.out.println(i+b);
		
		System.out.println("This is the multiplaction of 20 and 30");
		System.out.println(i*b);
	}
	public static void main (String args [])
	{
		Revision r1 = new Revision();
		
		r1.now();
		
		int a = 30;  int b = 20; 
		if(a>b)   //> = greater then  < = less then
		{
			System.out.println("Yes a is greater then b");
			System.out.println(a*b);
		}
		else
		{
			System.out.println("Yes b is less then a");
			System.out.println(a+b);
		}			
	}
}