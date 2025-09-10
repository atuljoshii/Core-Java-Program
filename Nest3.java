class Nest3
{
	int x = 20;
	static int y = 10;
	
	class inner 
	{
		int z = 5;
		static int a = 2;
		
		void show ()
		{
		    System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			System.out.println(a+y+x+z);
		}
	}
	
	public static void main (String args[])
	{ 
	    System.out.println("Main method se start hua hau "+y);
		
		Nest3 n1 = new Nest3();
		System.out.println(n1.x);
		
		Nest3.inner in =n1.new inner();
		in.show();
	}
}
/* non static ke ander main method nhai ban sakta . non static nested class ke andar main method
nahi ban sakta  non static ke andar static keyword ka use nahi kar sakte*/