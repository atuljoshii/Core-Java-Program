class strihan1
{
	//string class equal == method value cheaq karta hai 
	//object class ka equal == method referance id cheaq karta hai
	
	public static void main (String args[])
	{
		String a1 = "Hello";
		System.out.println(a1);
		System.out.println(a1.length());
		
		System.out.println();
		
		String a2 = "Hello";
		if(a1==a2)
		{
			System.out.println("Both are same jai bhole");
		}
		else
		{
			System.out.println("not same ");
		}
		
		System.out.println();
		
		String b2 = new String("Hello"); 
        System.out.println(b2);		
		System.out.println(b2.length());

	    System.out.println();
		
		String b3 =  new String ("Hello");
		//object class ka equal == method referance id cheaq karta hai
		if(b2==b3)
		{
			System.out.println("Both are same jai bhole");
		}
		else
		{
			System.out.println("not same ");
		}	
	}
}