class Stringdemo1
{
	public static void main (String args [])
	{
		
		String s1 = "Hello";  //String is imuatable it cant change it store in string constant pool
		//garbadge collection is not done in string pool  string object does not contain dupclicate value
		String s2 = new String("Hello");//StringBuffer is mutabble it take memory in heap area and string constant pool 
		
		
		System.out.println(s1.length());
	    System.out.println(s2.length());
		
	//	intern method is kishi string class ke onject ko dusre object me insert karane ke liye use kaete hai
		
		String s3 = "kiseho";
		String s4 = "kiseho";
		
		System.out.println("With  diddrent string ==");
		if(s3==s4)
		{
		    System.out.println("equals"); 
		}
		else
		{
			System.out.println("not Equals"); 
		}
		
	}
}